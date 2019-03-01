package org.openapitools.api.factories;

import org.openapitools.api.FleetApiService;
import org.openapitools.api.impl.FleetApiServiceImpl;

public class FleetApiServiceFactory {
    private final static FleetApiService service = new FleetApiServiceImpl();

    public static FleetApiService getFleetApi() {
        return service;
    }
}
