package controllers;

import apimodels.AssetReeferResponse;
import apimodels.InlineResponse200;
import apimodels.InlineResponse2001;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface AssetsApiControllerImpInterface {
    InlineResponse2001 getAllAssetCurrentLocations( @NotNull String accessToken, Long groupId) throws Exception;

    InlineResponse200 getAllAssets( @NotNull String accessToken, Long groupId) throws Exception;

    List<Object> getAssetLocation( @NotNull String accessToken, Long assetId,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception;

    AssetReeferResponse getAssetReefer( @NotNull String accessToken, Long assetId,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception;

}
