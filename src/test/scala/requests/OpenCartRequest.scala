package requests

import config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object OpenCartRequest {
    val openCart = group("Open Shopping Cart") {
        exec(http("Open Shopping Cart") // A scenario is a chain of requests and pauses
          .get(app_url + "/checkout/cart/"))
          .pause(2)
    }
}

