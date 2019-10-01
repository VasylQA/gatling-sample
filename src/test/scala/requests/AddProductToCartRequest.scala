package requests

import config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object AddProductToCartRequest {
  val addProductToCart = group("Add product to Cart") {
      exec(http("Add product to Cart") // A scenario is a chain of requests and pauses
        .post(app_url + """/checkout/cart/add/uenc/${uenc}/product/3449/""")
        .formParam("""product""", "3449")
        .formParam("""item""", """3449""") // Note the triple double quotes: used in Scala for protecting a whole chain of characters (no need for backslash)
        .formParam("""form_key""", "${form_key}")
        .formParam("""super_attribute[142]""", "168")
        .formParam("""super_attribute[93]""", """53""")
        .formParam("""qty""", """1"""))
        .pause(2)
    }
}

