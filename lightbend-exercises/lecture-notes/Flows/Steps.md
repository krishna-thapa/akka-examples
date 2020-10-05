## Auditor
Our Auditor needs to know how many Cars are being produced by the assembly line within the a specified time period.

1. Create a def in Auditor named sample with a parameter sampleSize of type FiniteDuration and returns a Flow[Car, Car, NotUsed].
2. Implement sample such that it takes all elements that are emitted within the time period defined by sampleSize.

##Paint Shop
When a car arrives from the BodyShop we will want to paint it the appropriate color.

1. Create a val in PaintShop named paint that returns a Flow[UnfinishedCar, UnfinishedCar, NotUsed].
2. Implement the paint such that it creates a new Flow of UnfinishedCar, combines it with the Colors from the colors and then transforms the result, applying the paint color to the UnfinishedCar.
    - HINT Use zip to combine your Flow with your Source.

## Wheel Shop
Similar to how we apply paint Color in the PaintShop we also want to install Wheels in the WheelShop. However unlike Color, each UnfinishedCar will need four Wheels instead of just one.

1. Create a val in WheelShop named installWheels that returns a Flow[UnfinishedCar, UnfinishedCar, NotUsed].
2. Implement the installWheels such that it combines a group of four Wheels with the incoming UnfinishedCar and then installs the Wheels onto the UnfinishedCar.

## Engine Shop
When shipments of Engines enter the assembly line they need to be installed into the UnfinishedCars. This will be handled in the EngineShop.

1. Create a val in EngineShop named engines that returns a Source[Engine, NotUsed].
2. Implement the engines such that it takes Engines from the shipments and concatenates them into a Source of Engine.
    - HINT You can perform Flow operations on a Source directly, or using via. This will return a transformed Source.
3. Create a val in EngineShop named installEngine that returns a Flow[UnfinishedCar, UnfinishedCar, NotUsed].
4. Implement the installEngine such that it combines an Engine with the incoming UnfinishedCar and then installs the Engine into the UnfinishedCar

## Quality Assurance
Once all necessary steps have been performed on the car, we will need to inspect it to ensure it meets standards. If it passes inspection then it can be considered to be a completed car. At this point we can assign it a SerialNumber and it can be ready for sale.

1. Create a class called QualityAssurance with an empty constructor.
2. Create a val in QualityAssurance named inspect that returns a Flow[UnfinishedCar, Car, NotUsed].
3. Implement inspect such that it takes in an UnfinishedCar, collects all completed cars and filters out any cars that lack an engine, paint color, or have an incorrect number of wheels. It will then convert the UnfinishedCar to a Car, giving it a new SerialNumber.
4. Use the test command to verify the solution works as expected.
5. Use the nextExercise command to move to the next exercise.