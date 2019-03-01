package org.openapitools.api.factories;

import org.openapitools.api.SensorsApiService;
import org.openapitools.api.impl.SensorsApiServiceImpl;

public class SensorsApiServiceFactory {
    private final static SensorsApiService service = new SensorsApiServiceImpl();

    public static SensorsApiService getSensorsApi() {
        return service;
    }
}
