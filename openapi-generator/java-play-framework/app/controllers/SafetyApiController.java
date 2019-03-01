package controllers;

import apimodels.DriverSafetyScoreResponse;
import apimodels.VehicleHarshEventResponse;
import apimodels.VehicleSafetyScoreResponse;

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

public class SafetyApiController extends Controller {

    private final SafetyApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private SafetyApiController(Configuration configuration, SafetyApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getDriverSafetyScore(Long driverId) throws Exception {
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
        DriverSafetyScoreResponse obj = imp.getDriverSafetyScore(driverId, accessToken, startMs, endMs);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getVehicleHarshEvent(Long vehicleId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valuetimestamp = request().getQueryString("timestamp");
        Long timestamp;
        if (valuetimestamp != null) {
            timestamp = Long.parseLong(valuetimestamp);
        } else {
            throw new IllegalArgumentException("'timestamp' parameter is required");
        }
        VehicleHarshEventResponse obj = imp.getVehicleHarshEvent(vehicleId, accessToken, timestamp);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getVehicleSafetyScore(Long vehicleId) throws Exception {
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
        VehicleSafetyScoreResponse obj = imp.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
