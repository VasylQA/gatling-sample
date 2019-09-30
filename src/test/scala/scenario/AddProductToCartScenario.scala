package scenario

import io.gatling.core.Predef._
import requests._

import scala.util.Random

object AddProductToCartScenario {
  val addProductScenario = scenario("Add Product to Cart")
    .exec(GetFormKeyRequest.getFormKey)
    .exec(GetUencRequest.getUenc)
    .exec(AddProductToCartRequest.addProductToCart)
}
