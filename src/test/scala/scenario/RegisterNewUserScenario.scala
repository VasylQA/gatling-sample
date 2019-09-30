package scenario

import requests._
import io.gatling.core.Predef._
import scala.util.Random

object RegisterNewUserScenario {
  val orderRefs = Iterator.continually(
    // Random number will be accessible in session under variable "OrderRef"
    Map("OrderRef" -> Random.nextInt(Integer.MAX_VALUE))
  )

  val createUserScenario = scenario("Create User Scenario")
    .feed(orderRefs)
    .exec(GetFormKeyRequest.getFormKey)
    .exec(RegisterNewUserRequest.registerNewUser)
}
