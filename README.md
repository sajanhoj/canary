
Compile and testing the application

Apache maven and Java JDK 8 must be correctly installed on the system.

To executes the clean build life cycle and the install build phase in the default build life cycle.
mvn clean install

In order to compile the application just run:
mvn clean package
To skip unit tests via command line during compilation just add the parameter -DskipTests=true:

mvn clean package -DskipTests=true 
Note: More details about the application tests can be found on section Unit Test and Integration Tests.

To run the application tests use the following command:
mvn test or mvn test -Dcucumber.options="src/test/groovy/features --tags @login"
