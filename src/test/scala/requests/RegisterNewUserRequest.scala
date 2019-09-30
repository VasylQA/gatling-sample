package requests

import config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object RegisterNewUserRequest {
  val registerNewUser = group("Register new user") {
    exec(http("Register a new user")
      .post(app_url + "/customer/account/createpost/")
      .formParam("""form_key""", "${form_key}")
      .formParam("""firstname""", """test""") // Note the triple double quotes: used in Scala for protecting a whole chain of characters (no need for backslash)
      .formParam("""lastname""", """test""")
      .formParam("""email""", "testerok+${OrderRef}@gmail.com")
      .formParam("""password""", """Dfcmrj13""")
      .formParam("""password_confirmation""", """Dfcmrj13"""))
  }
}