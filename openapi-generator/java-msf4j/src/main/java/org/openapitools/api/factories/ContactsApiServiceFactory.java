package org.openapitools.api.factories;

import org.openapitools.api.ContactsApiService;
import org.openapitools.api.impl.ContactsApiServiceImpl;

public class ContactsApiServiceFactory {
    private final static ContactsApiService service = new ContactsApiServiceImpl();

    public static ContactsApiService getContactsApi() {
        return service;
    }
}
