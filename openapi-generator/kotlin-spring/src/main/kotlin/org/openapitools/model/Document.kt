package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DocumentBase
import org.openapitools.model.DocumentField
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param dispatchJobId ID of the Samsara dispatch job for which the document is submitted
 * @param notes Notes submitted with this document.
 * @param documentType Descriptive name of this type of document.
 * @param driverCreatedAtMs The time in Unix epoch milliseconds that the document is created.
 * @param driverId ID of the driver for whom the document is submitted
 * @param fields The fields associated with this document.
 * @param vehicleId VehicleID of the driver at document creation.
 */
data class Document (

        @get:NotNull 
        @JsonProperty("documentType") val documentType: String,

        @get:NotNull 
        @JsonProperty("driverCreatedAtMs") val driverCreatedAtMs: Long,

        @get:NotNull 
        @JsonProperty("driverId") val driverId: Long,

        @get:NotNull 
        @JsonProperty("fields") val fields: List<DocumentField>,

        @JsonProperty("dispatchJobId") val dispatchJobId: Long? = null,

        @JsonProperty("notes") val notes: String? = null,

        @JsonProperty("vehicleId") val vehicleId: Long? = null
) {

}

