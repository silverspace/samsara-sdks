package org.openapitools.api.factories;

import org.openapitools.api.UserRolesApiService;
import org.openapitools.api.impl.UserRolesApiServiceImpl;

public class UserRolesApiServiceFactory {
    private final static UserRolesApiService service = new UserRolesApiServiceImpl();

    public static UserRolesApiService getUserRolesApi() {
        return service;
    }
}
