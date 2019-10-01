package requests

import config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object SubmitShippingEstimationDataRequest {
  val submitShippingEstimationData = group("Submit shipping estimation data") {
    exec(http("Submit shipping estimation data")
      .post(app_url + """/rest/default/V1/guest-carts/${entity_id}/shipping-information""")
      .body(StringBody(
        """{"addressInformation":{"shipping_address":
          {"countryId":"US",
          "regionId":"2",
          "regionCode":"AK",
          "region":"Alaska","street":["test"],"company":"","telephone":"123123123123123",
          "postcode":"71602","city":"tst","firstname":"test","lastname":"test"},
          "billing_address":
          {"countryId":"US","regionId":"2","regionCode":"AK",
          "region":"Alaska","street":["test"],"company":"",
          "telephone":"123123123123123","postcode":"71602",
          "city":"tst","firstname":"test","lastname":"test","saveInAddressBook":null},
          "shipping_method_code":"flatrate","shipping_carrier_code":"flatrate",
          "extension_attributes":{}}}""".stripMargin)).asJson)
  }
}