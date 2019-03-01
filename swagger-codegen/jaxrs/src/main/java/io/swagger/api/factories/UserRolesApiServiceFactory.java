package io.swagger.api.factories;

import io.swagger.api.UserRolesApiService;
import io.swagger.api.impl.UserRolesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public class UserRolesApiServiceFactory {
    private final static UserRolesApiService service = new UserRolesApiServiceImpl();

    public static UserRolesApiService getUserRolesApi() {
        return service;
    }
}
