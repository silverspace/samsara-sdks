package controllers;

import apimodels.AssetReeferResponse;
import apimodels.InlineResponse200;
import apimodels.InlineResponse2001;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

public class AssetsApiControllerImp implements AssetsApiControllerImpInterface {
    @Override
    public InlineResponse2001 getAllAssetCurrentLocations( @NotNull String accessToken, Long groupId) throws Exception {
        //Do your magic!!!
        return new InlineResponse2001();
    }

    @Override
    public InlineResponse200 getAllAssets( @NotNull String accessToken, Long groupId) throws Exception {
        //Do your magic!!!
        return new InlineResponse200();
    }

    @Override
    public List<Object> getAssetLocation( @NotNull String accessToken, Long assetId,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception {
        //Do your magic!!!
        return new ArrayList<Object>();
    }

    @Override
    public AssetReeferResponse getAssetReefer( @NotNull String accessToken, Long assetId,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception {
        //Do your magic!!!
        return new AssetReeferResponse();
    }

}
