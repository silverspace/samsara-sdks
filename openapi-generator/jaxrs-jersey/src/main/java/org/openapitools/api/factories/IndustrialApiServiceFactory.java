package org.openapitools.api.factories;

import org.openapitools.api.IndustrialApiService;
import org.openapitools.api.impl.IndustrialApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class IndustrialApiServiceFactory {
    private final static IndustrialApiService service = new IndustrialApiServiceImpl();

    public static IndustrialApiService getIndustrialApi() {
        return service;
    }
}
