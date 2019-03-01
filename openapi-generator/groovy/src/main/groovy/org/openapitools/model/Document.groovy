package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DocumentBase;
import org.openapitools.model.DocumentField;

@Canonical
class Document {
    /* ID of the Samsara dispatch job for which the document is submitted */
    Long dispatchJobId

    /* Notes submitted with this document. */
    String notes

    /* Descriptive name of this type of document. */
    String documentType

    /* The time in Unix epoch milliseconds that the document is created. */
    Long driverCreatedAtMs

    /* ID of the driver for whom the document is submitted */
    Long driverId

    /* The fields associated with this document. */
    List<DocumentField> fields = new ArrayList<DocumentField>()

    /* VehicleID of the driver at document creation. */
    Long vehicleId

}
