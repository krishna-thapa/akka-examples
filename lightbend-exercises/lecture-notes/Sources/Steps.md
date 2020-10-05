## Body Shop

1. The bulk of our car is assembled in one area of the factory and then sent on to our area. Therefore we are not building from scratch but rather from a partially complete car that has been assembled at the BodyShop.
2. Create a class called BodyShop with a constructor parameter buildTime of type FiniteDuration.
3. Create a val in BodyShop named cars that returns a Source[UnfinishedCar, Cancellable].
4. Implement the cars such that it emits a new UnfinishedCar on a schedule. Each time the buildTime elapses it should emit a new UnfinishedCar using the default values. It should delay according to the buildTime before emitting the first UnfinishedCar.

## Wheel Shop
1. Wheels are produced in a section of the factory called the WheelShop. Here the tires are put onto the rims and then loaded on to the assembly line.
2. Create a class called WheelShop with an empty constructor.
3. Create a val in WheelShop named wheels that returns a Source[Wheel, NotUsed].
4. Implement the wheels such that it emits a repeating series of identical wheels.

## Paint Shop
1. Once a car is ready to be painted, it is sent to the PaintShop. The PaintShop has a set of pre-defined colors that it can use to paint our cars. For the time being we are just going to evenly distribute the paint colors.
2. Create a class called PaintShop with a constructor parameter colorSet of type Set[Color].
3. Create a val in PaintShop named colors that returns a Source[Color, NotUsed].
4. Implement the colors such that it repeatedly cycles through each color in the colorSet.

## Engine Shop
1. Engines for the car are assembled in a different factory altogether. They are then delivered to us in shipments. The engines are brought into the EngineShop where they are installed into cars on the assembly line.
2. Create a class called EngineShop with a constructor parameter shipmentSize of type Int.
3. Create a val in EngineShop named shipments that returns a Source[Shipment, NotUsed].
4. Implement the shipments such that it continually iterates through an infinite series of Shipments.
5. Each shipment will contain a sequence of engines. Fill the shipment with a number of Engines equal to the shipmentSize.
6. Each engine in the shipment must have a unique serial number.
    - HINT SerialNumber has a default value that will automatically generate a random SerialNumber for you.
    - HINT Lookup Iterator.continually in the Scala API
    - http://www.scala-lang.org/api/current/scala/collection/Iterator$.html
    - HINT Lookup Seq.fill in the Scala API
    - http://www.scala-lang.org/api/current/scala/collection/Seq$.html
7. Use the test command to verify the solution works as expected.
8. Use the nextExercise command to move to the next exercise.