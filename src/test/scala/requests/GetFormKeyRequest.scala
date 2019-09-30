package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import config.Config.app_url

object GetFormKeyRequest {
  val getFormKey = group("Get form key") {
    exec(http("Get form key") // A scenario is a chain of requests and pauses
      .get(app_url + "/customer/account/create/")
      .check(regex("""name="form_key" type="hidden" value="(.*?)"""").saveAs("form_key")));
  }
}
