package org.openapitools.api.factories;

import org.openapitools.api.FleetApiService;
import org.openapitools.api.impl.FleetApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class FleetApiServiceFactory {
    private final static FleetApiService service = new FleetApiServiceImpl();

    public static FleetApiService getFleetApi() {
        return service;
    }
}
