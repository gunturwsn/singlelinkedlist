# Parkee Test - Single Linked List

Utilities for a coding interview exercise that covers basic linked-list operations (`parkee_test.App`). The project is a standard Maven project so it can be built and tested with a single command.

## Prerequisites
- Java Development Kit (JDK) 17
- Apache Maven 3.8+

Ensure `java -version` and `mvn -version` resolve to the expected tools before building.

## Build
```bash
mvn clean package
```
The compiled jar is written to `target/parkee_test-1.0-SNAPSHOT.jar`.

## Run
Run the linked-list demo:
```bash
java -cp target/parkee_test-1.0-SNAPSHOT.jar parkee_test.App
```

## Test
Execute the unit tests (JUnit 4):
```bash
mvn test
```

## Project Structure
- `src/main/java/parkee_test/App.java` – linked-list implementation and demo.
- `src/test/java/parkee_test/AppTest.java` – unit tests for the linked-list operations.

Feel free to include this README when sharing the project so reviewers know how to build and run it quickly.
