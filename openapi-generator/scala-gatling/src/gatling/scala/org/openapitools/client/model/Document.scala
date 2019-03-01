
package org.openapitools.client.model


case class Document (
    /* ID of the Samsara dispatch job for which the document is submitted */
    _dispatchJobId: Option[Long],
    /* Notes submitted with this document. */
    _notes: Option[String],
    /* Descriptive name of this type of document. */
    _documentType: String,
    /* The time in Unix epoch milliseconds that the document is created. */
    _driverCreatedAtMs: Long,
    /* ID of the driver for whom the document is submitted */
    _driverId: Long,
    /* The fields associated with this document. */
    _fields: List[DocumentField],
    /* VehicleID of the driver at document creation. */
    _vehicleId: Option[Long]
)
object Document {
    def toStringBody(var_dispatchJobId: Object, var_notes: Object, var_documentType: Object, var_driverCreatedAtMs: Object, var_driverId: Object, var_fields: Object, var_vehicleId: Object) =
        s"""
        | {
        | "dispatchJobId":$var_dispatchJobId,"notes":$var_notes,"documentType":$var_documentType,"driverCreatedAtMs":$var_driverCreatedAtMs,"driverId":$var_driverId,"fields":$var_fields,"vehicleId":$var_vehicleId
        | }
        """.stripMargin
}
