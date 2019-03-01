package org.openapitools.api

import org.openapitools.model.DataInputHistoryResponse
import org.openapitools.model.InlineObject17
import org.openapitools.model.InlineObject18
import org.openapitools.model.InlineResponse2006
import org.openapitools.model.InlineResponse2007
import org.openapitools.model.MachineHistoryResponse
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
class IndustrialApiController() {


    @RequestMapping(
            value = ["/industrial/data"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getAllDataInputs(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @RequestParam(value = "group_id", required = false, defaultValue="null") groupId: Long, @RequestParam(value = "startMs", required = false, defaultValue="null") startMs: Long, @RequestParam(value = "endMs", required = false, defaultValue="null") endMs: Long): ResponseEntity<InlineResponse2006> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/industrial/data/{data_input_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDataInput(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("data_input_id") dataInputId: Long, @RequestParam(value = "startMs", required = false, defaultValue="null") startMs: Long, @RequestParam(value = "endMs", required = false, defaultValue="null") endMs: Long): ResponseEntity<DataInputHistoryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/machines/list"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getMachines(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody groupParam: InlineObject18): ResponseEntity<InlineResponse2007> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/machines/history"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getMachinesHistory(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody historyParam: InlineObject17): ResponseEntity<MachineHistoryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
