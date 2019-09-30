package scenario

import io.gatling.core.Predef._
import requests._

import scala.util.Random

object OpenCategoryPageScenario {
  val openCategoryPage = scenario("Open Category page")
    .exec(OpenCategoryPageRequest.openCategoryPage)
}
