package corsmapping

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "grails.cors")
class MyCorsConfiguration {

    Map<String, Map<String, List<String>>> mappings
}
