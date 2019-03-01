package io.swagger.api.factories;

import io.swagger.api.FleetApiService;
import io.swagger.api.impl.FleetApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public class FleetApiServiceFactory {
    private final static FleetApiService service = new FleetApiServiceImpl();

    public static FleetApiService getFleetApi() {
        return service;
    }
}
