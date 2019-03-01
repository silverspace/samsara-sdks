package controllers;

import apimodels.AllRouteJobUpdates;
import apimodels.DispatchRoute;
import apimodels.DispatchRouteCreate;
import apimodels.DispatchRouteHistory;

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

public class RoutesApiController extends Controller {

    private final RoutesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private RoutesApiController(Configuration configuration, RoutesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result createDispatchRoute() throws Exception {
        JsonNode nodecreateDispatchRouteParams = request().body().asJson();
        DispatchRouteCreate createDispatchRouteParams;
        if (nodecreateDispatchRouteParams != null) {
            createDispatchRouteParams = mapper.readValue(nodecreateDispatchRouteParams.toString(), DispatchRouteCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createDispatchRouteParams);
            }
        } else {
            throw new IllegalArgumentException("'createDispatchRouteParams' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        DispatchRoute obj = imp.createDispatchRoute(accessToken, createDispatchRouteParams);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result createDriverDispatchRoute(Long driverId) throws Exception {
        JsonNode nodecreateDispatchRouteParams = request().body().asJson();
        DispatchRouteCreate createDispatchRouteParams;
        if (nodecreateDispatchRouteParams != null) {
            createDispatchRouteParams = mapper.readValue(nodecreateDispatchRouteParams.toString(), DispatchRouteCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createDispatchRouteParams);
            }
        } else {
            throw new IllegalArgumentException("'createDispatchRouteParams' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        DispatchRoute obj = imp.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result createVehicleDispatchRoute(Long vehicleId) throws Exception {
        JsonNode nodecreateDispatchRouteParams = request().body().asJson();
        DispatchRouteCreate createDispatchRouteParams;
        if (nodecreateDispatchRouteParams != null) {
            createDispatchRouteParams = mapper.readValue(nodecreateDispatchRouteParams.toString(), DispatchRouteCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createDispatchRouteParams);
            }
        } else {
            throw new IllegalArgumentException("'createDispatchRouteParams' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        DispatchRoute obj = imp.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result deleteDispatchRouteById(Long routeId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        imp.deleteDispatchRouteById(accessToken, routeId);
        return ok();
    }

    @ApiAction
    public Result fetchAllDispatchRoutes() throws Exception {
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
        String valueendTime = request().getQueryString("end_time");
        Long endTime;
        if (valueendTime != null) {
            endTime = Long.parseLong(valueendTime);
        } else {
            endTime = null;
        }
        String valueduration = request().getQueryString("duration");
        Long duration;
        if (valueduration != null) {
            duration = Long.parseLong(valueduration);
        } else {
            duration = null;
        }
        List<DispatchRoute> obj = imp.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (DispatchRoute curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result fetchAllRouteJobUpdates() throws Exception {
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
        String valuesequenceId = request().getQueryString("sequence_id");
        String sequenceId;
        if (valuesequenceId != null) {
            sequenceId = valuesequenceId;
        } else {
            sequenceId = null;
        }
        String valueinclude = request().getQueryString("include");
        String include;
        if (valueinclude != null) {
            include = valueinclude;
        } else {
            include = null;
        }
        AllRouteJobUpdates obj = imp.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getDispatchRouteById(Long routeId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        DispatchRoute obj = imp.getDispatchRouteById(accessToken, routeId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getDispatchRouteHistory(Long routeId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valuestartTime = request().getQueryString("start_time");
        Long startTime;
        if (valuestartTime != null) {
            startTime = Long.parseLong(valuestartTime);
        } else {
            startTime = null;
        }
        String valueendTime = request().getQueryString("end_time");
        Long endTime;
        if (valueendTime != null) {
            endTime = Long.parseLong(valueendTime);
        } else {
            endTime = null;
        }
        DispatchRouteHistory obj = imp.getDispatchRouteHistory(accessToken, routeId, startTime, endTime);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getDispatchRoutesByDriverId(Long driverId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valueendTime = request().getQueryString("end_time");
        Long endTime;
        if (valueendTime != null) {
            endTime = Long.parseLong(valueendTime);
        } else {
            endTime = null;
        }
        String valueduration = request().getQueryString("duration");
        Long duration;
        if (valueduration != null) {
            duration = Long.parseLong(valueduration);
        } else {
            duration = null;
        }
        List<DispatchRoute> obj = imp.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (DispatchRoute curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getDispatchRoutesByVehicleId(Long vehicleId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valueendTime = request().getQueryString("end_time");
        Long endTime;
        if (valueendTime != null) {
            endTime = Long.parseLong(valueendTime);
        } else {
            endTime = null;
        }
        String valueduration = request().getQueryString("duration");
        Long duration;
        if (valueduration != null) {
            duration = Long.parseLong(valueduration);
        } else {
            duration = null;
        }
        List<DispatchRoute> obj = imp.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (DispatchRoute curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result updateDispatchRouteById(Long routeId) throws Exception {
        JsonNode nodeupdateDispatchRouteParams = request().body().asJson();
        DispatchRoute updateDispatchRouteParams;
        if (nodeupdateDispatchRouteParams != null) {
            updateDispatchRouteParams = mapper.readValue(nodeupdateDispatchRouteParams.toString(), DispatchRoute.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateDispatchRouteParams);
            }
        } else {
            throw new IllegalArgumentException("'updateDispatchRouteParams' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        DispatchRoute obj = imp.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
