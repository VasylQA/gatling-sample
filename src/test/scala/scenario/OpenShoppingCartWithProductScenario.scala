package scenario

import io.gatling.core.Predef._
import requests._

object OpenShoppingCartWithProductScenario {
  val openShoppingCartScenario = scenario("Add product and open Shopping Cart")
    .exec(GetFormKeyRequest.getFormKey)
    .exec(GetUencRequest.getUenc)
    .exec(AddProductToCartRequest.addProductToCart)
    .exec(OpenCartRequest.openCart)
}
