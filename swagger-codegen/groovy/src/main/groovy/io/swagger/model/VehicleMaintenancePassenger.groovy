package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.VehicleMaintenancePassengerCheckEngineLight;
import io.swagger.model.VehicleMaintenancePassengerDiagnosticTroubleCodes;
import java.util.List;
@Canonical
class VehicleMaintenancePassenger {

    VehicleMaintenancePassengerCheckEngineLight checkEngineLight = null

  /* Passenger vehicle DTCs. */
  List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes = new ArrayList<VehicleMaintenancePassengerDiagnosticTroubleCodes>()
  

}

