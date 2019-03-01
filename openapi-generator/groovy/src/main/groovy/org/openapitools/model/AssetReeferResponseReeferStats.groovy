package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AssetReeferResponseReeferStatsAlarms1;
import org.openapitools.model.AssetReeferResponseReeferStatsEngineHours;
import org.openapitools.model.AssetReeferResponseReeferStatsFuelPercentage;
import org.openapitools.model.AssetReeferResponseReeferStatsPowerStatus;
import org.openapitools.model.AssetReeferResponseReeferStatsReturnAirTemp;
import org.openapitools.model.AssetReeferResponseReeferStatsSetPoint;

@Canonical
class AssetReeferResponseReeferStats {
    /* Fuel percentage of the reefer */
    List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage = new ArrayList<AssetReeferResponseReeferStatsFuelPercentage>()

    /* Power status of the reefer */
    List<AssetReeferResponseReeferStatsPowerStatus> powerStatus = new ArrayList<AssetReeferResponseReeferStatsPowerStatus>()

    /* Engine hours of the reefer */
    List<AssetReeferResponseReeferStatsEngineHours> engineHours = new ArrayList<AssetReeferResponseReeferStatsEngineHours>()

    /* Set point temperature of the reefer */
    List<AssetReeferResponseReeferStatsSetPoint> setPoint = new ArrayList<AssetReeferResponseReeferStatsSetPoint>()

    /* Return air temperature of the reefer */
    List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp = new ArrayList<AssetReeferResponseReeferStatsReturnAirTemp>()

    /* Reefer alarms */
    List<AssetReeferResponseReeferStatsAlarms1> alarms = new ArrayList<AssetReeferResponseReeferStatsAlarms1>()

}
