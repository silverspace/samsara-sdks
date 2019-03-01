package org.openapitools.api.factories;

import org.openapitools.api.SensorsApiService;
import org.openapitools.api.impl.SensorsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class SensorsApiServiceFactory {
    private final static SensorsApiService service = new SensorsApiServiceImpl();

    public static SensorsApiService getSensorsApi() {
        return service;
    }
}
