package com.krishna

import akka.actor.Cancellable
import akka.stream.scaladsl.Source
import com.krishna.lightbent.akkaStream.UnfinishedCar

import scala.concurrent.duration.FiniteDuration

class BodyShop(buildTime: FiniteDuration) {
  var cars: Source[UnfinishedCar, Cancellable] = Source.tick(buildTime, buildTime, UnfinishedCar())
}
