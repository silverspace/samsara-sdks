package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.InlineResponse2009;
import com.prokarma.pkmst.model.Tag;
import com.prokarma.pkmst.model.TagCreate;
import com.prokarma.pkmst.model.TagModify;
import com.prokarma.pkmst.model.TagUpdate;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

@Controller
public class TagsApiController implements TagsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public TagsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Tag> createTag(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "" ,required=true )   @RequestBody TagCreate tagCreateParams,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Tag>(objectMapper.readValue("", Tag.class), HttpStatus.OK);
        }

        return new ResponseEntity<Tag>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteTagById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the tag.",required=true ) @PathVariable("tag_id") Long tagId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2009> getAllTags(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @RequestParam(value = "group_id", required = false) Long groupId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InlineResponse2009>(objectMapper.readValue("", InlineResponse2009.class), HttpStatus.OK);
        }

        return new ResponseEntity<InlineResponse2009>(HttpStatus.OK);
    }

    public ResponseEntity<Tag> getTagById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the tag.",required=true ) @PathVariable("tag_id") Long tagId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Tag>(objectMapper.readValue("", Tag.class), HttpStatus.OK);
        }

        return new ResponseEntity<Tag>(HttpStatus.OK);
    }

    public ResponseEntity<Tag> modifyTagById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the tag.",required=true ) @PathVariable("tag_id") Long tagId,
        @ApiParam(value = "" ,required=true )   @RequestBody TagModify tagModifyParams,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Tag>(objectMapper.readValue("", Tag.class), HttpStatus.OK);
        }

        return new ResponseEntity<Tag>(HttpStatus.OK);
    }

    public ResponseEntity<Tag> updateTagById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the tag.",required=true ) @PathVariable("tag_id") Long tagId,
        @ApiParam(value = "" ,required=true )   @RequestBody TagUpdate updateTagParams,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Tag>(objectMapper.readValue("", Tag.class), HttpStatus.OK);
        }

        return new ResponseEntity<Tag>(HttpStatus.OK);
    }

}
