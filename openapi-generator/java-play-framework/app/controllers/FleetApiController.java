package controllers;

import apimodels.Address;
import apimodels.AllRouteJobUpdates;
import apimodels.AssetReeferResponse;
import apimodels.Contact;
import apimodels.DispatchRoute;
import apimodels.DispatchRouteCreate;
import apimodels.DispatchRouteHistory;
import apimodels.Document;
import apimodels.DocumentCreate;
import apimodels.DocumentType;
import apimodels.Driver;
import apimodels.DriverDailyLogResponse;
import apimodels.DriverForCreate;
import apimodels.DriverSafetyScoreResponse;
import apimodels.DriversResponse;
import apimodels.DriversSummaryResponse;
import apimodels.DvirBase;
import apimodels.DvirListResponse;
import apimodels.FleetVehicleLocation;
import apimodels.FleetVehicleResponse;
import apimodels.HosAuthenticationLogsResponse;
import apimodels.HosLogsResponse;
import apimodels.HosLogsSummaryResponse;
import apimodels.InlineObject;
import apimodels.InlineObject1;
import apimodels.InlineObject10;
import apimodels.InlineObject11;
import apimodels.InlineObject12;
import apimodels.InlineObject13;
import apimodels.InlineObject14;
import apimodels.InlineObject15;
import apimodels.InlineObject16;
import apimodels.InlineObject2;
import apimodels.InlineObject3;
import apimodels.InlineObject4;
import apimodels.InlineObject5;
import apimodels.InlineObject6;
import apimodels.InlineObject7;
import apimodels.InlineObject8;
import apimodels.InlineObject9;
import apimodels.InlineResponse200;
import apimodels.InlineResponse2001;
import apimodels.InlineResponse2002;
import apimodels.InlineResponse2003;
import apimodels.InlineResponse2004;
import apimodels.InlineResponse2005;
import apimodels.TripResponse;
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

public class FleetApiController extends Controller {

    private final FleetApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private FleetApiController(Configuration configuration, FleetApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result addFleetAddress() throws Exception {
        JsonNode nodeaddressParam = request().body().asJson();
        InlineObject2 addressParam;
        if (nodeaddressParam != null) {
            addressParam = mapper.readValue(nodeaddressParam.toString(), InlineObject2.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(addressParam);
            }
        } else {
            throw new IllegalArgumentException("'addressParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        imp.addFleetAddress(accessToken, addressParam);
        return ok();
    }

    @ApiAction
    public Result addOrganizationAddresses() throws Exception {
        JsonNode nodeaddresses = request().body().asJson();
        InlineObject addresses;
        if (nodeaddresses != null) {
            addresses = mapper.readValue(nodeaddresses.toString(), InlineObject.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(addresses);
            }
        } else {
            throw new IllegalArgumentException("'addresses' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        List<Address> obj = imp.addOrganizationAddresses(accessToken, addresses);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Address curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
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
    public Result createDriverDocument(Long driverId) throws Exception {
        JsonNode nodecreateDocumentParams = request().body().asJson();
        DocumentCreate createDocumentParams;
        if (nodecreateDocumentParams != null) {
            createDocumentParams = mapper.readValue(nodecreateDocumentParams.toString(), DocumentCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createDocumentParams);
            }
        } else {
            throw new IllegalArgumentException("'createDocumentParams' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        Document obj = imp.createDriverDocument(accessToken, driverId, createDocumentParams);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result createDvir() throws Exception {
        JsonNode nodecreateDvirParam = request().body().asJson();
        InlineObject12 createDvirParam;
        if (nodecreateDvirParam != null) {
            createDvirParam = mapper.readValue(nodecreateDvirParam.toString(), InlineObject12.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createDvirParam);
            }
        } else {
            throw new IllegalArgumentException("'createDvirParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        DvirBase obj = imp.createDvir(accessToken, createDvirParam);
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
    public Result deleteOrganizationAddress(Long addressId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        imp.deleteOrganizationAddress(accessToken, addressId);
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
    public Result getDriverDocumentTypesByOrgId() throws Exception {
        List<DocumentType> obj = imp.getDriverDocumentTypesByOrgId();
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (DocumentType curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getDriverDocumentsByOrgId() throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valueendMs = request().getQueryString("endMs");
        Long endMs;
        if (valueendMs != null) {
            endMs = Long.parseLong(valueendMs);
        } else {
            endMs = null;
        }
        String valuedurationMs = request().getQueryString("durationMs");
        Long durationMs;
        if (valuedurationMs != null) {
            durationMs = Long.parseLong(valuedurationMs);
        } else {
            durationMs = null;
        }
        List<Document> obj = imp.getDriverDocumentsByOrgId(accessToken, endMs, durationMs);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Document curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
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
    public Result getDvirs() throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valueendMs = request().getQueryString("end_ms");
        Integer endMs;
        if (valueendMs != null) {
            endMs = Integer.parseInt(valueendMs);
        } else {
            throw new IllegalArgumentException("'end_ms' parameter is required");
        }
        String valuedurationMs = request().getQueryString("duration_ms");
        Integer durationMs;
        if (valuedurationMs != null) {
            durationMs = Integer.parseInt(valuedurationMs);
        } else {
            throw new IllegalArgumentException("'duration_ms' parameter is required");
        }
        String valuegroupId = request().getQueryString("group_id");
        Integer groupId;
        if (valuegroupId != null) {
            groupId = Integer.parseInt(valuegroupId);
        } else {
            groupId = null;
        }
        DvirListResponse obj = imp.getDvirs(accessToken, endMs, durationMs, groupId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getFleetDrivers() throws Exception {
        JsonNode nodegroupDriversParam = request().body().asJson();
        InlineObject3 groupDriversParam;
        if (nodegroupDriversParam != null) {
            groupDriversParam = mapper.readValue(nodegroupDriversParam.toString(), InlineObject3.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(groupDriversParam);
            }
        } else {
            throw new IllegalArgumentException("'groupDriversParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        DriversResponse obj = imp.getFleetDrivers(accessToken, groupDriversParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getFleetDriversHosDailyLogs(Long driverId) throws Exception {
        JsonNode nodehosLogsParam = request().body().asJson();
        InlineObject6 hosLogsParam;
        if (nodehosLogsParam != null) {
            hosLogsParam = mapper.readValue(nodehosLogsParam.toString(), InlineObject6.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(hosLogsParam);
            }
        } else {
            throw new IllegalArgumentException("'hosLogsParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        DriverDailyLogResponse obj = imp.getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getFleetDriversSummary() throws Exception {
        JsonNode nodedriversSummaryParam = request().body().asJson();
        InlineObject5 driversSummaryParam;
        if (nodedriversSummaryParam != null) {
            driversSummaryParam = mapper.readValue(nodedriversSummaryParam.toString(), InlineObject5.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(driversSummaryParam);
            }
        } else {
            throw new IllegalArgumentException("'driversSummaryParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valuesnapToDayBounds = request().getQueryString("snap_to_day_bounds");
        Boolean snapToDayBounds;
        if (valuesnapToDayBounds != null) {
            snapToDayBounds = Boolean.valueOf(valuesnapToDayBounds);
        } else {
            snapToDayBounds = null;
        }
        DriversSummaryResponse obj = imp.getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getFleetHosAuthenticationLogs() throws Exception {
        JsonNode nodehosAuthenticationLogsParam = request().body().asJson();
        InlineObject7 hosAuthenticationLogsParam;
        if (nodehosAuthenticationLogsParam != null) {
            hosAuthenticationLogsParam = mapper.readValue(nodehosAuthenticationLogsParam.toString(), InlineObject7.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(hosAuthenticationLogsParam);
            }
        } else {
            throw new IllegalArgumentException("'hosAuthenticationLogsParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        HosAuthenticationLogsResponse obj = imp.getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getFleetHosLogs() throws Exception {
        JsonNode nodehosLogsParam = request().body().asJson();
        InlineObject8 hosLogsParam;
        if (nodehosLogsParam != null) {
            hosLogsParam = mapper.readValue(nodehosLogsParam.toString(), InlineObject8.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(hosLogsParam);
            }
        } else {
            throw new IllegalArgumentException("'hosLogsParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        HosLogsResponse obj = imp.getFleetHosLogs(accessToken, hosLogsParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getFleetHosLogsSummary() throws Exception {
        JsonNode nodehosLogsParam = request().body().asJson();
        InlineObject9 hosLogsParam;
        if (nodehosLogsParam != null) {
            hosLogsParam = mapper.readValue(nodehosLogsParam.toString(), InlineObject9.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(hosLogsParam);
            }
        } else {
            throw new IllegalArgumentException("'hosLogsParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        HosLogsSummaryResponse obj = imp.getFleetHosLogsSummary(accessToken, hosLogsParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getFleetLocations() throws Exception {
        JsonNode nodegroupParam = request().body().asJson();
        InlineObject11 groupParam;
        if (nodegroupParam != null) {
            groupParam = mapper.readValue(nodegroupParam.toString(), InlineObject11.class);
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
        InlineResponse2003 obj = imp.getFleetLocations(accessToken, groupParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getFleetMaintenanceList() throws Exception {
        JsonNode nodegroupParam = request().body().asJson();
        InlineObject13 groupParam;
        if (nodegroupParam != null) {
            groupParam = mapper.readValue(nodegroupParam.toString(), InlineObject13.class);
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
        InlineResponse2004 obj = imp.getFleetMaintenanceList(accessToken, groupParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getFleetTrips() throws Exception {
        JsonNode nodetripsParam = request().body().asJson();
        InlineObject15 tripsParam;
        if (nodetripsParam != null) {
            tripsParam = mapper.readValue(nodetripsParam.toString(), InlineObject15.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(tripsParam);
            }
        } else {
            throw new IllegalArgumentException("'tripsParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        TripResponse obj = imp.getFleetTrips(accessToken, tripsParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getFleetVehicle(String vehicleIdOrExternalId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        FleetVehicleResponse obj = imp.getFleetVehicle(accessToken, vehicleIdOrExternalId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getOrganizationAddress(Long addressId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        Address obj = imp.getOrganizationAddress(accessToken, addressId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getOrganizationAddresses() throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        List<Address> obj = imp.getOrganizationAddresses(accessToken);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Address curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getOrganizationContact(Long contactId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        Contact obj = imp.getOrganizationContact(accessToken, contactId);
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
    public Result getVehicleLocations(Long vehicleId) throws Exception {
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
        List<FleetVehicleLocation> obj = imp.getVehicleLocations(accessToken, vehicleId, startMs, endMs);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (FleetVehicleLocation curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
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

    @ApiAction
    public Result getVehicleStats() throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valuestartMs = request().getQueryString("startMs");
        Integer startMs;
        if (valuestartMs != null) {
            startMs = Integer.parseInt(valuestartMs);
        } else {
            throw new IllegalArgumentException("'startMs' parameter is required");
        }
        String valueendMs = request().getQueryString("endMs");
        Integer endMs;
        if (valueendMs != null) {
            endMs = Integer.parseInt(valueendMs);
        } else {
            throw new IllegalArgumentException("'endMs' parameter is required");
        }
        String valueseries = request().getQueryString("series");
        String series;
        if (valueseries != null) {
            series = valueseries;
        } else {
            series = null;
        }
        String valuetagIds = request().getQueryString("tagIds");
        String tagIds;
        if (valuetagIds != null) {
            tagIds = valuetagIds;
        } else {
            tagIds = null;
        }
        String valuestartingAfter = request().getQueryString("startingAfter");
        String startingAfter;
        if (valuestartingAfter != null) {
            startingAfter = valuestartingAfter;
        } else {
            startingAfter = null;
        }
        String valueendingBefore = request().getQueryString("endingBefore");
        String endingBefore;
        if (valueendingBefore != null) {
            endingBefore = valueendingBefore;
        } else {
            endingBefore = null;
        }
        String valuelimit = request().getQueryString("limit");
        Long limit;
        if (valuelimit != null) {
            limit = Long.parseLong(valuelimit);
        } else {
            limit = null;
        }
        InlineResponse2005 obj = imp.getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getVehiclesLocations() throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        String valuestartMs = request().getQueryString("startMs");
        Integer startMs;
        if (valuestartMs != null) {
            startMs = Integer.parseInt(valuestartMs);
        } else {
            throw new IllegalArgumentException("'startMs' parameter is required");
        }
        String valueendMs = request().getQueryString("endMs");
        Integer endMs;
        if (valueendMs != null) {
            endMs = Integer.parseInt(valueendMs);
        } else {
            throw new IllegalArgumentException("'endMs' parameter is required");
        }
        List<Object> obj = imp.getVehiclesLocations(accessToken, startMs, endMs);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result listContacts() throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        List<Contact> obj = imp.listContacts(accessToken);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Contact curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result listFleet() throws Exception {
        JsonNode nodegroupParam = request().body().asJson();
        InlineObject10 groupParam;
        if (nodegroupParam != null) {
            groupParam = mapper.readValue(nodegroupParam.toString(), InlineObject10.class);
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
        String valuestartingAfter = request().getQueryString("startingAfter");
        String startingAfter;
        if (valuestartingAfter != null) {
            startingAfter = valuestartingAfter;
        } else {
            startingAfter = null;
        }
        String valueendingBefore = request().getQueryString("endingBefore");
        String endingBefore;
        if (valueendingBefore != null) {
            endingBefore = valueendingBefore;
        } else {
            endingBefore = null;
        }
        String valuelimit = request().getQueryString("limit");
        Long limit;
        if (valuelimit != null) {
            limit = Long.parseLong(valuelimit);
        } else {
            limit = null;
        }
        InlineResponse2002 obj = imp.listFleet(accessToken, groupParam, startingAfter, endingBefore, limit);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result patchFleetVehicle(String vehicleIdOrExternalId) throws Exception {
        JsonNode nodedata = request().body().asJson();
        InlineObject16 data;
        if (nodedata != null) {
            data = mapper.readValue(nodedata.toString(), InlineObject16.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(data);
            }
        } else {
            throw new IllegalArgumentException("'data' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        FleetVehicleResponse obj = imp.patchFleetVehicle(accessToken, vehicleIdOrExternalId, data);
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

    @ApiAction
    public Result updateOrganizationAddress(Long addressId) throws Exception {
        JsonNode nodeaddress = request().body().asJson();
        InlineObject1 address;
        if (nodeaddress != null) {
            address = mapper.readValue(nodeaddress.toString(), InlineObject1.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(address);
            }
        } else {
            throw new IllegalArgumentException("'address' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        imp.updateOrganizationAddress(accessToken, addressId, address);
        return ok();
    }

    @ApiAction
    public Result updateVehicles() throws Exception {
        JsonNode nodevehicleUpdateParam = request().body().asJson();
        InlineObject14 vehicleUpdateParam;
        if (nodevehicleUpdateParam != null) {
            vehicleUpdateParam = mapper.readValue(nodevehicleUpdateParam.toString(), InlineObject14.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(vehicleUpdateParam);
            }
        } else {
            throw new IllegalArgumentException("'vehicleUpdateParam' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        imp.updateVehicles(accessToken, vehicleUpdateParam);
        return ok();
    }
}
