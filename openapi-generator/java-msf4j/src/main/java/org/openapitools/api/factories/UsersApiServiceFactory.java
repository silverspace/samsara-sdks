package org.openapitools.api.factories;

import org.openapitools.api.UsersApiService;
import org.openapitools.api.impl.UsersApiServiceImpl;

public class UsersApiServiceFactory {
    private final static UsersApiService service = new UsersApiServiceImpl();

    public static UsersApiService getUsersApi() {
        return service;
    }
}
