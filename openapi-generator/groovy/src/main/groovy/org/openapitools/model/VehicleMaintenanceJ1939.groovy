package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.VehicleMaintenanceJ1939CheckEngineLight;
import org.openapitools.model.VehicleMaintenanceJ1939DiagnosticTroubleCodes;

@Canonical
class VehicleMaintenanceJ1939 {
    VehicleMaintenanceJ1939CheckEngineLight checkEngineLight = null

    /* J1939 DTCs. */
    List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes = new ArrayList<VehicleMaintenanceJ1939DiagnosticTroubleCodes>()

}
