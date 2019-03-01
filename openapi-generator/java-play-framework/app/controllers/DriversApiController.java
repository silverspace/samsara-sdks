package controllers;

import apimodels.Driver;
import apimodels.DriverForCreate;
import apimodels.InlineObject4;

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

public class DriversApiController extends Controller {

    private final DriversApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private DriversApiController(Configuration configuration, DriversApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result createDriver() throws Exception {
        JsonNode nodecreateDriverParam = request().body().asJson();
        DriverForCreate createDriverParam;
        if (nodecreateDriverParam != null) {
            createDriverParam = mapper.readValue(nodecreateDriverParam.toString(), DriverForCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createDriverParam);
            }
        } else {
            throw new IllegalArgumentException("'createDriverParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        Driver obj = imp.createDriver(accessToken, createDriverParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result deactivateDriver(String driverIdOrExternalId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        imp.deactivateDriver(accessToken, driverIdOrExternalId);
        return ok();
    }

    @ApiAction
    public Result getAllDeactivatedDrivers() throws Exception {
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
        List<Driver> obj = imp.getAllDeactivatedDrivers(accessToken, groupId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Driver curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getDeactivatedDriverById(String driverIdOrExternalId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        Driver obj = imp.getDeactivatedDriverById(accessToken, driverIdOrExternalId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getDriverById(String driverIdOrExternalId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        Driver obj = imp.getDriverById(accessToken, driverIdOrExternalId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result reactivateDriverById(String driverIdOrExternalId) throws Exception {
        JsonNode nodereactivateDriverParam = request().body().asJson();
        InlineObject4 reactivateDriverParam;
        if (nodereactivateDriverParam != null) {
            reactivateDriverParam = mapper.readValue(nodereactivateDriverParam.toString(), InlineObject4.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(reactivateDriverParam);
            }
        } else {
            throw new IllegalArgumentException("'reactivateDriverParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        Driver obj = imp.reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
