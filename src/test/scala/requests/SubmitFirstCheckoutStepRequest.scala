package requests

import config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object SubmitFirstCheckoutStepRequest {
  val submitFirstCheckoutStep = group("Submit first checkout step") {
    exec(http("Submit first checkout step")
      .post(app_url + """/rest/default/V1/guest-carts/${entity_id}/estimate-shipping-methods""")
      .body(StringBody(
        """{"address":
          {"street":["test"],"city":"tst",
          "region_id":"2",
          "region":"Alaska",
          "country_id":"US",
          "postcode":"71602",
          "firstname":"test",
          "lastname":"test",
          "company":"",
          "telephone":"123123123123123"}}""".stripMargin)).asJson)
  }
}