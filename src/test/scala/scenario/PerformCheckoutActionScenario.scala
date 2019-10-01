package scenario

import io.gatling.core.Predef._
import requests._

object PerformCheckoutActionScenario {
  val performCheckoutAction = scenario("Perform Checkout")
    .exec(GetFormKeyRequest.getFormKey)
    .exec(GetUencRequest.getUenc)
    .exec(AddProductToCartRequest.addProductToCart)
    .exec(OpenCheckoutRequest.openCheckout)
    .exec(SubmitShippingEstimationDataRequest.submitShippingEstimationData)
    .exec(SubmitFirstCheckoutStepRequest.submitFirstCheckoutStep)
}
