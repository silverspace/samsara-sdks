package io.swagger.api.factories;

import io.swagger.api.SensorsApiService;
import io.swagger.api.impl.SensorsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public class SensorsApiServiceFactory {
    private final static SensorsApiService service = new SensorsApiServiceImpl();

    public static SensorsApiService getSensorsApi() {
        return service;
    }
}
