package org.openapitools.api

import org.openapitools.model.InlineResponse2009
import org.openapitools.model.Tag
import org.openapitools.model.TagCreate
import org.openapitools.model.TagModify
import org.openapitools.model.TagUpdate
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.web.multipart.MultipartFile
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.*

import kotlin.collections.List
import kotlin.collections.Map

@Controller
@Validated
@RequestMapping("\${api.base-path:/v1}")
class TagsApiController() {


    @RequestMapping(
            value = ["/tags"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun createTag(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody tagCreateParams: TagCreate): ResponseEntity<Tag> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/tags/{tag_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.DELETE])
    fun deleteTagById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("tag_id") tagId: Long): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/tags"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getAllTags(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @RequestParam(value = "group_id", required = false, defaultValue="null") groupId: Long): ResponseEntity<InlineResponse2009> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/tags/{tag_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getTagById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("tag_id") tagId: Long): ResponseEntity<Tag> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/tags/{tag_id}"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.PATCH])
    fun modifyTagById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("tag_id") tagId: Long, @Valid @RequestBody tagModifyParams: TagModify): ResponseEntity<Tag> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/tags/{tag_id}"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.PUT])
    fun updateTagById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("tag_id") tagId: Long, @Valid @RequestBody updateTagParams: TagUpdate): ResponseEntity<Tag> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
