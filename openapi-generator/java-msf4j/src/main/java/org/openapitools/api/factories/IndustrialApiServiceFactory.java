package org.openapitools.api.factories;

import org.openapitools.api.IndustrialApiService;
import org.openapitools.api.impl.IndustrialApiServiceImpl;

public class IndustrialApiServiceFactory {
    private final static IndustrialApiService service = new IndustrialApiServiceImpl();

    public static IndustrialApiService getIndustrialApi() {
        return service;
    }
}
