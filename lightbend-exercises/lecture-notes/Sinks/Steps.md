## Auditor
In order to ensure the factory is meeting it's quotas, we need to count how many of a particular item is being produced. This job falls to the Auditor who will monitor the flow of the assembly line and perform random counts on the production floor.

1. Create a class called Auditor with an empty constructor.
2. Create a val in Auditor named count that returns a Sink[Any, Future[Int]].
3. Implement the count such that it counts the number of elements in a stream and materializes the result.
4. Create a def in Auditor named log with an implicit parameter for LoggingAdapter that returns a Sink[Any, Future[Done]].
5. Implement the log such that it logs each element in the stream to the LoggingAdapter at DEBUG.
6. Use the test command to verify the solution works as expected.
7. Use the nextExercise command to move to the next exercise.