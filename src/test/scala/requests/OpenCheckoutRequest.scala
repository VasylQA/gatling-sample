package requests

import config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object OpenCheckoutRequest {
    val openCheckout = group("Open Checkout page") {
        exec(http("Open Checkout page") // A scenario is a chain of requests and pauses
          .get(app_url + "/checkout")
          .check(regex("""entity_id":"(.*?)"""").saveAs("entity_id")))
          .pause(2)
    }
}

