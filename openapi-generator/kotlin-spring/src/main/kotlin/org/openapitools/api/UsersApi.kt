package org.openapitools.api

import org.openapitools.model.User
import org.openapitools.model.UserRole
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
class UsersApiController() {


    @RequestMapping(
            value = ["/users/{userId}"],
            produces = ["application/json"], 
            method = [RequestMethod.DELETE])
    fun deleteUserById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("userId") userId: Long): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/users/{userId}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getUserById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("userId") userId: Long): ResponseEntity<User> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/user_roles"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun listUserRoles(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String): ResponseEntity<List<UserRole>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/users"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun listUsers(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String): ResponseEntity<List<User>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
