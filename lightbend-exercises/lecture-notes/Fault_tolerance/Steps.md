## Quality Assurance
Previously, our Quality Assurance was implemented by inspecting and filtering out any cars that did not meet standards. We will modify this so that instead of applying a filter, it will throw an exception and then handle that exception with an appropriate supervisor strategy.

1. In QualityAssurance, create a companion object and add an Exception named CarFailedInspection with a single parameter car of type UnfinishedCar. Have the Exception extend IllegalStateException and include an appropriate error message
2. In QualityAssurance, modify the inspect flow. Rather than filtering, instead throw a CarFailedInspection Exception if the car does not meet the necessary criteria.
3. Add an appropriate supervisor strategy to the inspect flow so that it can continue to process messages when a failure occurs.
4. Use the test command to verify the solution works as expected.
5. Use the nextExercise command to move to the next exercise.