package requests

import config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object OpenCategoryPageRequest {
    val openCategoryPage = group("Open Category page") {
        exec(http("Open category page") // A scenario is a chain of requests and pauses
          .get(app_url + "/women/tops-women/jackets-women.html"))
          .pause(2)
    }
}

