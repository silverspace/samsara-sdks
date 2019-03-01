package controllers;

import apimodels.DataInputHistoryResponse;
import apimodels.InlineObject17;
import apimodels.InlineObject18;
import apimodels.InlineResponse2006;
import apimodels.InlineResponse2007;
import apimodels.MachineHistoryResponse;

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

public class IndustrialApiController extends Controller {

    private final IndustrialApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private IndustrialApiController(Configuration configuration, IndustrialApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getAllDataInputs() throws Exception {
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
        String valuestartMs = request().getQueryString("startMs");
        Long startMs;
        if (valuestartMs != null) {
            startMs = Long.parseLong(valuestartMs);
        } else {
            startMs = null;
        }
        String valueendMs = request().getQueryString("endMs");
        Long endMs;
        if (valueendMs != null) {
            endMs = Long.parseLong(valueendMs);
        } else {
            endMs = null;
        }
        InlineResponse2006 obj = imp.getAllDataInputs(accessToken, groupId, startMs, endMs);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getDataInput(Long dataInputId) throws Exception {
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
            startMs = null;
        }
        String valueendMs = request().getQueryString("endMs");
        Long endMs;
        if (valueendMs != null) {
            endMs = Long.parseLong(valueendMs);
        } else {
            endMs = null;
        }
        DataInputHistoryResponse obj = imp.getDataInput(accessToken, dataInputId, startMs, endMs);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getMachines() throws Exception {
        JsonNode nodegroupParam = request().body().asJson();
        InlineObject18 groupParam;
        if (nodegroupParam != null) {
            groupParam = mapper.readValue(nodegroupParam.toString(), InlineObject18.class);
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
        InlineResponse2007 obj = imp.getMachines(accessToken, groupParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getMachinesHistory() throws Exception {
        JsonNode nodehistoryParam = request().body().asJson();
        InlineObject17 historyParam;
        if (nodehistoryParam != null) {
            historyParam = mapper.readValue(nodehistoryParam.toString(), InlineObject17.class);
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
        MachineHistoryResponse obj = imp.getMachinesHistory(accessToken, historyParam);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
