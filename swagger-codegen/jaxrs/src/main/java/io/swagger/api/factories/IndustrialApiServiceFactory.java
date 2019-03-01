package io.swagger.api.factories;

import io.swagger.api.IndustrialApiService;
import io.swagger.api.impl.IndustrialApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public class IndustrialApiServiceFactory {
    private final static IndustrialApiService service = new IndustrialApiServiceImpl();

    public static IndustrialApiService getIndustrialApi() {
        return service;
    }
}
