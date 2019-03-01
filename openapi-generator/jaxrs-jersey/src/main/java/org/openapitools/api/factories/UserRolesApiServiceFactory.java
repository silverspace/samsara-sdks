package org.openapitools.api.factories;

import org.openapitools.api.UserRolesApiService;
import org.openapitools.api.impl.UserRolesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class UserRolesApiServiceFactory {
    private final static UserRolesApiService service = new UserRolesApiServiceImpl();

    public static UserRolesApiService getUserRolesApi() {
        return service;
    }
}
