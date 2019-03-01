
package org.openapitools.client.model


case class InlineResponse2005VehicleStats (
    _engineState: Option[List[EngineState]],
    _auxInput2: Option[AuxInputSeries],
    /* ID of the vehicle. */
    _vehicleId: Long,
    _auxInput1: Option[AuxInputSeries]
)
object InlineResponse2005VehicleStats {
    def toStringBody(var_engineState: Object, var_auxInput2: Object, var_vehicleId: Object, var_auxInput1: Object) =
        s"""
        | {
        | "engineState":$var_engineState,"auxInput2":$var_auxInput2,"vehicleId":$var_vehicleId,"auxInput1":$var_auxInput1
        | }
        """.stripMargin
}
