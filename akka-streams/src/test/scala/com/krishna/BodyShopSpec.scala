package com.krishna

import akka.stream.scaladsl.Sink
import com.krishna.lightbent.akkaStream.AkkaSpec
import org.scalatest.freespec.AnyFreeSpec

import scala.concurrent.duration._

class BodyShopSpec extends AnyFreeSpec with AkkaSpec {
  "cars" - {
    "should return cars at the expected rate" in {
      val bodyShop = new BodyShop(buildTime = 200.millis)

      val cars = bodyShop.cars
        .takeWithin(1100.millis)
        .runWith(Sink.seq)
        .futureValue

      assert(cars.size == 5)
    }
  }
}
