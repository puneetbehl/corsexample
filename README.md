# corsexample

This demonstrates the problem with Grails due to https://github.com/spring-projects/spring-boot/issues/6180. We have a following bean:

https://github.com/puneetbehl/corsexample/blob/1b2570cfa8b284ae0857445bbae23cc75e68e6dc/src/main/groovy/corsmapping/MyCorsConfiguration.groovy#L1-L9

It should correctly bind the values to field `mappings` from the following YAML configurations as `['/words/googleOnly':['allowedOrigins': ['https://www.google.com']]]` but in actual it is bound as: `['/words/googleOnly':['allowedOrigins[0]': 'https://www.google.com']]`:

https://github.com/puneetbehl/corsexample/blob/1b2570cfa8b284ae0857445bbae23cc75e68e6dc/grails-app/conf/application.yml#L48-L62

### Testing

# Run the Grails application using command `./gradlew bootRun`.
# The following `assertion` in Bootstrap.groovy is failing:

https://github.com/puneetbehl/corsexample/blob/1b2570cfa8b284ae0857445bbae23cc75e68e6dc/grails-app/init/corsmapping/BootStrap.groovy#L1-L10
