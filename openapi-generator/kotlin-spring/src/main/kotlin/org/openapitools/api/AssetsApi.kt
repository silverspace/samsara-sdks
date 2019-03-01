package org.openapitools.api

import org.openapitools.model.AssetReeferResponse
import org.openapitools.model.InlineResponse200
import org.openapitools.model.InlineResponse2001
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
class AssetsApiController() {


    @RequestMapping(
            value = ["/fleet/assets/locations"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getAllAssetCurrentLocations(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @RequestParam(value = "group_id", required = false, defaultValue="null") groupId: Long): ResponseEntity<InlineResponse2001> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/assets"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getAllAssets(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @RequestParam(value = "group_id", required = false, defaultValue="null") groupId: Long): ResponseEntity<InlineResponse200> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/assets/{asset_id}/locations"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getAssetLocation(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("asset_id") assetId: Long,@NotNull  @RequestParam(value = "startMs", required = true, defaultValue="null") startMs: Long,@NotNull  @RequestParam(value = "endMs", required = true, defaultValue="null") endMs: Long): ResponseEntity<List<Any>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/assets/{asset_id}/reefer"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getAssetReefer(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("asset_id") assetId: Long,@NotNull  @RequestParam(value = "startMs", required = true, defaultValue="null") startMs: Long,@NotNull  @RequestParam(value = "endMs", required = true, defaultValue="null") endMs: Long): ResponseEntity<AssetReeferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
