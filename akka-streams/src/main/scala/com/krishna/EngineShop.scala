package com.krishna

import akka.NotUsed
import akka.stream.scaladsl.Source
import com.krishna.lightbent.akkaStream.{ Engine, Shipment }

class EngineShop(shipmentSize: Int) {
  val shipments: Source[Shipment, NotUsed] = Source.fromIterator(() =>
    Iterator.continually {
      Shipment(
        Seq.fill(shipmentSize)(Engine())
      )
    }
  )
}
