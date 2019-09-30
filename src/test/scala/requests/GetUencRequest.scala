package requests

import config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetUencRequest {
  val getUenc = group("Get UENC key") {
    exec(http("Get UENC key") // A scenario is a chain of requests and pauses
      .get(app_url + "/juno-jacket.html")
      .check(regex("""uenc":"(.*?)"""").saveAs("uenc")))
  }
}