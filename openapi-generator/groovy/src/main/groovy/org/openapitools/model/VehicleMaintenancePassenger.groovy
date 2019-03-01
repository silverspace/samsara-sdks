package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.VehicleMaintenancePassengerCheckEngineLight;
import org.openapitools.model.VehicleMaintenancePassengerDiagnosticTroubleCodes;

@Canonical
class VehicleMaintenancePassenger {
    VehicleMaintenancePassengerCheckEngineLight checkEngineLight = null

    /* Passenger vehicle DTCs. */
    List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes = new ArrayList<VehicleMaintenancePassengerDiagnosticTroubleCodes>()

}
