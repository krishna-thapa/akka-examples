## Auditor
Now that our Auditor has all the tools in place to perform an Audit, it's time to start checking the numbers.

1. Add an implicit constructor parameter to Auditor of type Materializer
2. Create a method in Auditor called audit that takes a parameter cars of type Source[Car, NotUsed] and a parameter sampleSize of type FiniteDuration. It should return a Future[Int].
3. Implement audit such that it performs a count of the cars in the provided source within the sample duration provided and returns the result.
    - HINT Use the sample and count members defined previously.

## Factory
With all the components in place to build a car, it's time to start production.

1. Create a class called Factory that has constructor parameters for BodyShop, PaintShop, EngineShop, WheelShop, and QualityAssurance. It will also need an implicit constructor parameter of type Materializer
2. Create a method named orderCars with a single parameter quantity of type Int. It should return a Future[Seq[Car]]
3. Implement orderCars so that it takes the cars from the BodyShop and performs the following steps.
    - Paint the cars
    - Install an engine
    - Install wheels
    - Inspect the cars
    - take the requested quantity from the stream and return the resulting sequence of cars.
4. Use the test command to verify the solution works as expected.
5. Use the nextExercise command to move to the next exercise.