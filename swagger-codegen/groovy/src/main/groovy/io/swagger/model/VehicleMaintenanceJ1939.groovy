package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.VehicleMaintenanceJ1939CheckEngineLight;
import io.swagger.model.VehicleMaintenanceJ1939DiagnosticTroubleCodes;
import java.util.List;
@Canonical
class VehicleMaintenanceJ1939 {

    VehicleMaintenanceJ1939CheckEngineLight checkEngineLight = null

  /* J1939 DTCs. */
  List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes = new ArrayList<VehicleMaintenanceJ1939DiagnosticTroubleCodes>()
  

}

