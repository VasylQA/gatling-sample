package simulations

import io.gatling.core.Predef._
import _root_.scenario._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import config.Config

class MagentoStoreSimulation extends Simulation {
  val httpProtocol = http
    .proxy(Proxy("localhost", 8080).httpsPort(8080))
    .inferHtmlResources()
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .check(status is 200)

  private val createUserExec = RegisterNewUserScenario.createUserScenario.inject(atOnceUsers(Config.users), rampUsers(Config.rampUp) during (20 seconds)) // example of ramp-up
  private val visitCategoryExec = OpenCategoryPageScenario.openCategoryPage.inject(heavisideUsers(10) during (1 minutes)) // example of smooth adding of users
  private val addProductExec = AddProductToCartScenario.addProductScenario.inject(atOnceUsers(Config.users)) // example of adding a number of users at once
  private val openCartWithProductExec = OpenShoppingCartWithProductScenario.openShoppingCartScenario.inject(atOnceUsers(Config.users))
  private val performCheckoutExec = PerformCheckoutActionScenario.performCheckoutAction.inject(atOnceUsers(Config.users))

  setUp(performCheckoutExec.protocols(httpProtocol)).maxDuration(21 minutes)
}
