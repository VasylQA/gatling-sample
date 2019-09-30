package config

object Config {
  val app_url = "https://magento.nublue.co.uk"

  val users = Integer.getInteger("users", 1).toInt
  val rampUp = Integer.getInteger("rampup", 1).toInt
  val throughput = Integer.getInteger("throughput", 100).toInt
}