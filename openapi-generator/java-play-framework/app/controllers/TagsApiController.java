package controllers;

import apimodels.InlineResponse2009;
import apimodels.Tag;
import apimodels.TagCreate;
import apimodels.TagModify;
import apimodels.TagUpdate;

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

public class TagsApiController extends Controller {

    private final TagsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private TagsApiController(Configuration configuration, TagsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result createTag() throws Exception {
        JsonNode nodetagCreateParams = request().body().asJson();
        TagCreate tagCreateParams;
        if (nodetagCreateParams != null) {
            tagCreateParams = mapper.readValue(nodetagCreateParams.toString(), TagCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(tagCreateParams);
            }
        } else {
            throw new IllegalArgumentException("'tagCreateParams' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        Tag obj = imp.createTag(accessToken, tagCreateParams);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result deleteTagById(Long tagId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        imp.deleteTagById(accessToken, tagId);
        return ok();
    }

    @ApiAction
    public Result getAllTags() throws Exception {
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
        InlineResponse2009 obj = imp.getAllTags(accessToken, groupId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getTagById(Long tagId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        Tag obj = imp.getTagById(accessToken, tagId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result modifyTagById(Long tagId) throws Exception {
        JsonNode nodetagModifyParams = request().body().asJson();
        TagModify tagModifyParams;
        if (nodetagModifyParams != null) {
            tagModifyParams = mapper.readValue(nodetagModifyParams.toString(), TagModify.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(tagModifyParams);
            }
        } else {
            throw new IllegalArgumentException("'tagModifyParams' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        Tag obj = imp.modifyTagById(accessToken, tagId, tagModifyParams);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result updateTagById(Long tagId) throws Exception {
        JsonNode nodeupdateTagParams = request().body().asJson();
        TagUpdate updateTagParams;
        if (nodeupdateTagParams != null) {
            updateTagParams = mapper.readValue(nodeupdateTagParams.toString(), TagUpdate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateTagParams);
            }
        } else {
            throw new IllegalArgumentException("'updateTagParams' parameter is required");
        }
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        Tag obj = imp.updateTagById(accessToken, tagId, updateTagParams);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
