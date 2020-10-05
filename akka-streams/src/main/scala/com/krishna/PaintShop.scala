package com.krishna

import akka.NotUsed
import akka.stream.scaladsl.Source
import com.krishna.lightbent.akkaStream.Color

class PaintShop(colorSet: Set[Color]) {
  val colors: Source[Color, NotUsed] = Source.cycle(() => colorSet.iterator)
}
