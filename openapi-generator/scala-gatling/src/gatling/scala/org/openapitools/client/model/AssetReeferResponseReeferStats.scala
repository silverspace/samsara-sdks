
package org.openapitools.client.model


case class AssetReeferResponseReeferStats (
    /* Fuel percentage of the reefer */
    _fuelPercentage: Option[List[AssetReeferResponseReeferStatsFuelPercentage]],
    /* Power status of the reefer */
    _powerStatus: Option[List[AssetReeferResponseReeferStatsPowerStatus]],
    /* Engine hours of the reefer */
    _engineHours: Option[List[AssetReeferResponseReeferStatsEngineHours]],
    /* Set point temperature of the reefer */
    _setPoint: Option[List[AssetReeferResponseReeferStatsSetPoint]],
    /* Return air temperature of the reefer */
    _returnAirTemp: Option[List[AssetReeferResponseReeferStatsReturnAirTemp]],
    /* Reefer alarms */
    _alarms: Option[List[AssetReeferResponseReeferStatsAlarms1]]
)
object AssetReeferResponseReeferStats {
    def toStringBody(var_fuelPercentage: Object, var_powerStatus: Object, var_engineHours: Object, var_setPoint: Object, var_returnAirTemp: Object, var_alarms: Object) =
        s"""
        | {
        | "fuelPercentage":$var_fuelPercentage,"powerStatus":$var_powerStatus,"engineHours":$var_engineHours,"setPoint":$var_setPoint,"returnAirTemp":$var_returnAirTemp,"alarms":$var_alarms
        | }
        """.stripMargin
}
