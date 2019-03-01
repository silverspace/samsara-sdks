package controllers;

import apimodels.AssetReeferResponse;
import apimodels.InlineResponse200;
import apimodels.InlineResponse2001;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import play.Configuration;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

public class AssetsApiController extends Controller {

    private final AssetsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private AssetsApiController(Configuration configuration, AssetsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getAllAssetCurrentLocations() throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valuegroupId = request().getQueryString("group_id");
        Long groupId;
        if (valuegroupId != null) {
            groupId = Long.parseLong(valuegroupId);
        } else {
            groupId = null;
        }
        InlineResponse2001 obj = imp.getAllAssetCurrentLocations(accessToken, groupId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getAllAssets() throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valuegroupId = request().getQueryString("group_id");
        Long groupId;
        if (valuegroupId != null) {
            groupId = Long.parseLong(valuegroupId);
        } else {
            groupId = null;
        }
        InlineResponse200 obj = imp.getAllAssets(accessToken, groupId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getAssetLocation(Long assetId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valuestartMs = request().getQueryString("startMs");
        Long startMs;
        if (valuestartMs != null) {
            startMs = Long.parseLong(valuestartMs);
        } else {
            throw new IllegalArgumentException("'startMs' parameter is required");
        }
        String valueendMs = request().getQueryString("endMs");
        Long endMs;
        if (valueendMs != null) {
            endMs = Long.parseLong(valueendMs);
        } else {
            throw new IllegalArgumentException("'endMs' parameter is required");
        }
        List<Object> obj = imp.getAssetLocation(accessToken, assetId, startMs, endMs);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getAssetReefer(Long assetId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valuestartMs = request().getQueryString("startMs");
        Long startMs;
        if (valuestartMs != null) {
            startMs = Long.parseLong(valuestartMs);
        } else {
            throw new IllegalArgumentException("'startMs' parameter is required");
        }
        String valueendMs = request().getQueryString("endMs");
        Long endMs;
        if (valueendMs != null) {
            endMs = Long.parseLong(valueendMs);
        } else {
            throw new IllegalArgumentException("'endMs' parameter is required");
        }
        AssetReeferResponse obj = imp.getAssetReefer(accessToken, assetId, startMs, endMs);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
