package corsmapping

class BootStrap {

    MyCorsConfiguration myCorsConfiguration

    def init = { servletContext ->
        assert myCorsConfiguration.mappings.size() == 3
        assert myCorsConfiguration.mappings['/word/googleOnly']['allowedOrigins']
    }
    def destroy = {
    }
}
