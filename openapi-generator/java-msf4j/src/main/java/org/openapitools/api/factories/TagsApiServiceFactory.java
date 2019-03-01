package org.openapitools.api.factories;

import org.openapitools.api.TagsApiService;
import org.openapitools.api.impl.TagsApiServiceImpl;

public class TagsApiServiceFactory {
    private final static TagsApiService service = new TagsApiServiceImpl();

    public static TagsApiService getTagsApi() {
        return service;
    }
}
