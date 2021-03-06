/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.InlineResponse2009;
import org.openapitools.model.Tag;
import org.openapitools.model.TagCreate;
import org.openapitools.model.TagModify;
import org.openapitools.model.TagUpdate;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

@Validated
@Api(value = "tags", description = "the tags API")
public interface TagsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "/tags", nickname = "createTag", notes = "Create a new tag for the group.", response = Tag.class, tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Newly created tag object, including the new tag ID.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/tags",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Tag> createTag(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody TagCreate tagCreateParams) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"addresses\" : [ null, null ],  \"assets\" : [ null, null ],  \"sensors\" : [ null, null ],  \"parentTagId\" : 8389,  \"groupId\" : 2348,  \"name\" : \"Broken Vehicles\",  \"vehicles\" : [ null, null ],  \"id\" : 12345,  \"machines\" : [ null, null ],  \"drivers\" : [ null, null ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", nickname = "deleteTagById", notes = "Permanently deletes a tag.", tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deleted the tag. No response body is returned."),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/tags/{tag_id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteTagById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the tag.",required=true) @PathVariable("tag_id") Long tagId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/tags", nickname = "getAllTags", notes = "Fetch all of the tags for a group.", response = InlineResponse2009.class, tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of tags.", response = InlineResponse2009.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/tags",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse2009> getAllTags(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @Valid @RequestParam(value = "group_id", required = false) Long groupId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"tags\" : [ {    \"addresses\" : [ null, null ],    \"assets\" : [ null, null ],    \"sensors\" : [ null, null ],    \"parentTagId\" : 8389,    \"groupId\" : 2348,    \"name\" : \"Broken Vehicles\",    \"vehicles\" : [ null, null ],    \"id\" : 12345,    \"machines\" : [ null, null ],    \"drivers\" : [ null, null ]  }, {    \"addresses\" : [ null, null ],    \"assets\" : [ null, null ],    \"sensors\" : [ null, null ],    \"parentTagId\" : 8389,    \"groupId\" : 2348,    \"name\" : \"Broken Vehicles\",    \"vehicles\" : [ null, null ],    \"id\" : 12345,    \"machines\" : [ null, null ],    \"drivers\" : [ null, null ]  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", nickname = "getTagById", notes = "Fetch a tag by id.", response = Tag.class, tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The tag corresponding to tag_id.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/tags/{tag_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Tag> getTagById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the tag.",required=true) @PathVariable("tag_id") Long tagId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"addresses\" : [ null, null ],  \"assets\" : [ null, null ],  \"sensors\" : [ null, null ],  \"parentTagId\" : 8389,  \"groupId\" : 2348,  \"name\" : \"Broken Vehicles\",  \"vehicles\" : [ null, null ],  \"id\" : 12345,  \"machines\" : [ null, null ],  \"drivers\" : [ null, null ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", nickname = "modifyTagById", notes = "Add or delete specific members from a tag, or modify the name of a tag.", response = Tag.class, tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated tag data.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/tags/{tag_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<Tag> modifyTagById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the tag.",required=true) @PathVariable("tag_id") Long tagId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody TagModify tagModifyParams) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"addresses\" : [ null, null ],  \"assets\" : [ null, null ],  \"sensors\" : [ null, null ],  \"parentTagId\" : 8389,  \"groupId\" : 2348,  \"name\" : \"Broken Vehicles\",  \"vehicles\" : [ null, null ],  \"id\" : 12345,  \"machines\" : [ null, null ],  \"drivers\" : [ null, null ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", nickname = "updateTagById", notes = "Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.", response = Tag.class, tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated tag data.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/tags/{tag_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Tag> updateTagById(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the tag.",required=true) @PathVariable("tag_id") Long tagId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody TagUpdate updateTagParams) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"addresses\" : [ null, null ],  \"assets\" : [ null, null ],  \"sensors\" : [ null, null ],  \"parentTagId\" : 8389,  \"groupId\" : 2348,  \"name\" : \"Broken Vehicles\",  \"vehicles\" : [ null, null ],  \"id\" : 12345,  \"machines\" : [ null, null ],  \"drivers\" : [ null, null ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
