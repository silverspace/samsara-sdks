package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AssetReeferResponse;
import org.openapitools.server.api.model.InlineResponse200;
import org.openapitools.server.api.model.InlineResponse2001;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AssetsApi  {
    //GetAllAssetCurrentLocations
    void getAllAssetCurrentLocations(String accessToken, Long groupId, Handler<AsyncResult<InlineResponse2001>> handler);
    
    //GetAllAssets
    void getAllAssets(String accessToken, Long groupId, Handler<AsyncResult<InlineResponse200>> handler);
    
    //GetAssetLocation
    void getAssetLocation(String accessToken, Long assetId, Long startMs, Long endMs, Handler<AsyncResult<List<Object>>> handler);
    
    //GetAssetReefer
    void getAssetReefer(String accessToken, Long assetId, Long startMs, Long endMs, Handler<AsyncResult<AssetReeferResponse>> handler);
    
}
