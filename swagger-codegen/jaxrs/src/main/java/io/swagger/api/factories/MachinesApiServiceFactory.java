package io.swagger.api.factories;

import io.swagger.api.MachinesApiService;
import io.swagger.api.impl.MachinesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public class MachinesApiServiceFactory {
    private final static MachinesApiService service = new MachinesApiServiceImpl();

    public static MachinesApiService getMachinesApi() {
        return service;
    }
}
