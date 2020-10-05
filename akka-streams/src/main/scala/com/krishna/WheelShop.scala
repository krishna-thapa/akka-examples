package com.krishna

import akka.NotUsed
import akka.stream.scaladsl.Source
import com.krishna.lightbent.akkaStream.Wheel

class WheelShop {
  val wheels: Source[Wheel, NotUsed] = {
    Source.repeat(Wheel())
  }
}
