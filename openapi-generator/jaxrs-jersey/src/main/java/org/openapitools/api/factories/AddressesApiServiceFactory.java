package org.openapitools.api.factories;

import org.openapitools.api.AddressesApiService;
import org.openapitools.api.impl.AddressesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class AddressesApiServiceFactory {
    private final static AddressesApiService service = new AddressesApiServiceImpl();

    public static AddressesApiService getAddressesApi() {
        return service;
    }
}
