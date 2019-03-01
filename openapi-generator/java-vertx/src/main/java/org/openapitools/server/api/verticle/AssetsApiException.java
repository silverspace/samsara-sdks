package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AssetReeferResponse;
import org.openapitools.server.api.model.InlineResponse200;
import org.openapitools.server.api.model.InlineResponse2001;
import org.openapitools.server.api.MainApiException;

public final class AssetsApiException extends MainApiException {
    public AssetsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final AssetsApiException Assets_getAllAssetCurrentLocations_0_Exception = new AssetsApiException(0, "Unexpected error.");
    public static final AssetsApiException Assets_getAllAssets_0_Exception = new AssetsApiException(0, "Unexpected error.");
    public static final AssetsApiException Assets_getAssetLocation_0_Exception = new AssetsApiException(0, "Unexpected error.");
    public static final AssetsApiException Assets_getAssetReefer_0_Exception = new AssetsApiException(0, "Unexpected error.");
    

}