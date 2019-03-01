package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DocumentBase;
import io.swagger.model.DocumentField;
import java.util.List;
@Canonical
class Document {

  /* ID of the Samsara dispatch job for which the document is submitted */
  Long dispatchJobId = null

  /* Notes submitted with this document. */
  String notes = null

  /* Descriptive name of this type of document. */
  String documentType = null

  /* The time in Unix epoch milliseconds that the document is created. */
  Long driverCreatedAtMs = null

  /* ID of the driver for whom the document is submitted */
  Long driverId = null

  /* The fields associated with this document. */
  List<DocumentField> fields = new ArrayList<DocumentField>()

  /* VehicleID of the driver at document creation. */
  Long vehicleId = null
  

}

