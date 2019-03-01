package io.swagger.api;

import io.swagger.model.InlineResponse2009;
import io.swagger.model.Tag;
import io.swagger.model.TagCreate;
import io.swagger.model.TagModify;
import io.swagger.model.TagUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

@Controller
public class TagsApiController implements TagsApi {

    private static final Logger log = LoggerFactory.getLogger(TagsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TagsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Tag> createTag(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody TagCreate tagCreateParams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Tag>(objectMapper.readValue("{  \"sensors\" : [ \"\", \"\" ],  \"id\" : 12345,  \"drivers\" : [ \"\", \"\" ],  \"groupId\" : 2348,  \"assets\" : [ \"\", \"\" ],  \"parentTagId\" : 8389,  \"name\" : \"Broken Vehicles\",  \"vehicles\" : [ \"\", \"\" ],  \"addresses\" : [ \"\", \"\" ],  \"machines\" : [ \"\", \"\" ]}", Tag.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Tag>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Tag>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteTagById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the tag.",required=true) @PathVariable("tag_id") Long tagId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2009> getAllTags(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @Valid @RequestParam(value = "group_id", required = false) Long groupId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2009>(objectMapper.readValue("{  \"tags\" : [ {    \"sensors\" : [ \"\", \"\" ],    \"id\" : 12345,    \"drivers\" : [ \"\", \"\" ],    \"groupId\" : 2348,    \"assets\" : [ \"\", \"\" ],    \"parentTagId\" : 8389,    \"name\" : \"Broken Vehicles\",    \"vehicles\" : [ \"\", \"\" ],    \"addresses\" : [ \"\", \"\" ],    \"machines\" : [ \"\", \"\" ]  }, {    \"sensors\" : [ \"\", \"\" ],    \"id\" : 12345,    \"drivers\" : [ \"\", \"\" ],    \"groupId\" : 2348,    \"assets\" : [ \"\", \"\" ],    \"parentTagId\" : 8389,    \"name\" : \"Broken Vehicles\",    \"vehicles\" : [ \"\", \"\" ],    \"addresses\" : [ \"\", \"\" ],    \"machines\" : [ \"\", \"\" ]  } ]}", InlineResponse2009.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2009>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2009>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Tag> getTagById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the tag.",required=true) @PathVariable("tag_id") Long tagId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Tag>(objectMapper.readValue("{  \"sensors\" : [ \"\", \"\" ],  \"id\" : 12345,  \"drivers\" : [ \"\", \"\" ],  \"groupId\" : 2348,  \"assets\" : [ \"\", \"\" ],  \"parentTagId\" : 8389,  \"name\" : \"Broken Vehicles\",  \"vehicles\" : [ \"\", \"\" ],  \"addresses\" : [ \"\", \"\" ],  \"machines\" : [ \"\", \"\" ]}", Tag.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Tag>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Tag>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Tag> modifyTagById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the tag.",required=true) @PathVariable("tag_id") Long tagId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody TagModify tagModifyParams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Tag>(objectMapper.readValue("{  \"sensors\" : [ \"\", \"\" ],  \"id\" : 12345,  \"drivers\" : [ \"\", \"\" ],  \"groupId\" : 2348,  \"assets\" : [ \"\", \"\" ],  \"parentTagId\" : 8389,  \"name\" : \"Broken Vehicles\",  \"vehicles\" : [ \"\", \"\" ],  \"addresses\" : [ \"\", \"\" ],  \"machines\" : [ \"\", \"\" ]}", Tag.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Tag>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Tag>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Tag> updateTagById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the tag.",required=true) @PathVariable("tag_id") Long tagId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody TagUpdate updateTagParams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Tag>(objectMapper.readValue("{  \"sensors\" : [ \"\", \"\" ],  \"id\" : 12345,  \"drivers\" : [ \"\", \"\" ],  \"groupId\" : 2348,  \"assets\" : [ \"\", \"\" ],  \"parentTagId\" : 8389,  \"name\" : \"Broken Vehicles\",  \"vehicles\" : [ \"\", \"\" ],  \"addresses\" : [ \"\", \"\" ],  \"machines\" : [ \"\", \"\" ]}", Tag.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Tag>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Tag>(HttpStatus.NOT_IMPLEMENTED);
    }

}
