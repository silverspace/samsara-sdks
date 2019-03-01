package org.openapitools.api.factories;

import org.openapitools.api.ContactsApiService;
import org.openapitools.api.impl.ContactsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class ContactsApiServiceFactory {
    private final static ContactsApiService service = new ContactsApiServiceImpl();

    public static ContactsApiService getContactsApi() {
        return service;
    }
}
