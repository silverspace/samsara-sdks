package controllers;

import apimodels.CargoResponse;
import apimodels.DoorResponse;
import apimodels.HumidityResponse;
import apimodels.InlineObject19;
import apimodels.InlineObject20;
import apimodels.InlineObject21;
import apimodels.InlineObject22;
import apimodels.InlineObject23;
import apimodels.InlineObject24;
import apimodels.InlineResponse2008;
import apimodels.SensorHistoryResponse;
import apimodels.TemperatureResponse;

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

public class SensorsApiController extends Controller {

    private final SensorsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private SensorsApiController(Configuration configuration, SensorsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getSensors() throws Exception {
        JsonNode nodegroupParam = request().body().asJson();
        InlineObject23 groupParam;
        if (nodegroupParam != null) {
            groupParam = mapper.readValue(nodegroupParam.toString(), InlineObject23.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(groupParam);
            }
        } else {
            throw new IllegalArgumentException("'groupParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        InlineResponse2008 obj = imp.getSensors(accessToken, groupParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getSensorsCargo() throws Exception {
        JsonNode nodesensorParam = request().body().asJson();
        InlineObject19 sensorParam;
        if (nodesensorParam != null) {
            sensorParam = mapper.readValue(nodesensorParam.toString(), InlineObject19.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(sensorParam);
            }
        } else {
            throw new IllegalArgumentException("'sensorParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        CargoResponse obj = imp.getSensorsCargo(accessToken, sensorParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getSensorsDoor() throws Exception {
        JsonNode nodesensorParam = request().body().asJson();
        InlineObject20 sensorParam;
        if (nodesensorParam != null) {
            sensorParam = mapper.readValue(nodesensorParam.toString(), InlineObject20.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(sensorParam);
            }
        } else {
            throw new IllegalArgumentException("'sensorParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        DoorResponse obj = imp.getSensorsDoor(accessToken, sensorParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getSensorsHistory() throws Exception {
        JsonNode nodehistoryParam = request().body().asJson();
        InlineObject21 historyParam;
        if (nodehistoryParam != null) {
            historyParam = mapper.readValue(nodehistoryParam.toString(), InlineObject21.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(historyParam);
            }
        } else {
            throw new IllegalArgumentException("'historyParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        SensorHistoryResponse obj = imp.getSensorsHistory(accessToken, historyParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getSensorsHumidity() throws Exception {
        JsonNode nodesensorParam = request().body().asJson();
        InlineObject22 sensorParam;
        if (nodesensorParam != null) {
            sensorParam = mapper.readValue(nodesensorParam.toString(), InlineObject22.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(sensorParam);
            }
        } else {
            throw new IllegalArgumentException("'sensorParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        HumidityResponse obj = imp.getSensorsHumidity(accessToken, sensorParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getSensorsTemperature() throws Exception {
        JsonNode nodesensorParam = request().body().asJson();
        InlineObject24 sensorParam;
        if (nodesensorParam != null) {
            sensorParam = mapper.readValue(nodesensorParam.toString(), InlineObject24.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(sensorParam);
            }
        } else {
            throw new IllegalArgumentException("'sensorParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        TemperatureResponse obj = imp.getSensorsTemperature(accessToken, sensorParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
