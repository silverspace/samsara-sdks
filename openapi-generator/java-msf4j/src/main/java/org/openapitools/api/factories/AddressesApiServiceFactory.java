package org.openapitools.api.factories;

import org.openapitools.api.AddressesApiService;
import org.openapitools.api.impl.AddressesApiServiceImpl;

public class AddressesApiServiceFactory {
    private final static AddressesApiService service = new AddressesApiServiceImpl();

    public static AddressesApiService getAddressesApi() {
        return service;
    }
}
