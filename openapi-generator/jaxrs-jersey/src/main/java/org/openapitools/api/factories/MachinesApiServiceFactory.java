package org.openapitools.api.factories;

import org.openapitools.api.MachinesApiService;
import org.openapitools.api.impl.MachinesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class MachinesApiServiceFactory {
    private final static MachinesApiService service = new MachinesApiServiceImpl();

    public static MachinesApiService getMachinesApi() {
        return service;
    }
}
