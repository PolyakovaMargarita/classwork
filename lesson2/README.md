### Excercise 1

There should be `Colors` bean which internally reads `resources/colors.properties` file
and provides interface similar to the one descibed in `spring-demo/src/test/java/AppTests.java`

Also feel free to add more unit-tests, e.g. to cover `PropertiesLoader` functionality

### Exercise 2

There should be a bean post processor which is responsible for injecting color code taken from `resources/colors.properties` into any field annotated with @ColorCode annotation in any registered bean 


