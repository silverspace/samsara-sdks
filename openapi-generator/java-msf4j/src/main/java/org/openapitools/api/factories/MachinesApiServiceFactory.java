package org.openapitools.api.factories;

import org.openapitools.api.MachinesApiService;
import org.openapitools.api.impl.MachinesApiServiceImpl;

public class MachinesApiServiceFactory {
    private final static MachinesApiService service = new MachinesApiServiceImpl();

    public static MachinesApiService getMachinesApi() {
        return service;
    }
}
