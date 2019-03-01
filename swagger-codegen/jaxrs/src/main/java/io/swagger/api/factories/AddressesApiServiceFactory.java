package io.swagger.api.factories;

import io.swagger.api.AddressesApiService;
import io.swagger.api.impl.AddressesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public class AddressesApiServiceFactory {
    private final static AddressesApiService service = new AddressesApiServiceImpl();

    public static AddressesApiService getAddressesApi() {
        return service;
    }
}
