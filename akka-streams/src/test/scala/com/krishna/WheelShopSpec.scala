package com.krishna

import akka.stream.testkit.scaladsl.TestSink
import com.krishna.lightbent.akkaStream.{ AkkaSpec, Wheel }
import org.scalatest.freespec.AnyFreeSpec

class WheelShopSpec extends AnyFreeSpec with AkkaSpec {

  "Wheels" - {
    "should return a series of wheels" in {
      val numberToRequest = 100
      val wheelShop       = new WheelShop

      val wheels: Seq[Wheel] = wheelShop.wheels
        .runWith(TestSink.probe[Wheel])
        .request(numberToRequest)
        .expectNextN(numberToRequest)

      assert(wheels.size == numberToRequest)
      assert(wheels.toSet == Set(Wheel()))
    }
  }
}
