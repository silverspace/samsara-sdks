package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.AssetReeferResponseReeferStatsAlarms1;
import io.swagger.model.AssetReeferResponseReeferStatsEngineHours;
import io.swagger.model.AssetReeferResponseReeferStatsFuelPercentage;
import io.swagger.model.AssetReeferResponseReeferStatsPowerStatus;
import io.swagger.model.AssetReeferResponseReeferStatsReturnAirTemp;
import io.swagger.model.AssetReeferResponseReeferStatsSetPoint;
import java.util.List;
@Canonical
class AssetReeferResponseReeferStats {

  /* Reefer alarms */
  List<AssetReeferResponseReeferStatsAlarms1> alarms = new ArrayList<AssetReeferResponseReeferStatsAlarms1>()

  /* Engine hours of the reefer */
  List<AssetReeferResponseReeferStatsEngineHours> engineHours = new ArrayList<AssetReeferResponseReeferStatsEngineHours>()

  /* Fuel percentage of the reefer */
  List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage = new ArrayList<AssetReeferResponseReeferStatsFuelPercentage>()

  /* Power status of the reefer */
  List<AssetReeferResponseReeferStatsPowerStatus> powerStatus = new ArrayList<AssetReeferResponseReeferStatsPowerStatus>()

  /* Return air temperature of the reefer */
  List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp = new ArrayList<AssetReeferResponseReeferStatsReturnAirTemp>()

  /* Set point temperature of the reefer */
  List<AssetReeferResponseReeferStatsSetPoint> setPoint = new ArrayList<AssetReeferResponseReeferStatsSetPoint>()
  

}

