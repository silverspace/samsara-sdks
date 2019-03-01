package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AuxInputSeries;
import org.openapitools.model.EngineState;

@Canonical
class InlineResponse2005VehicleStats {
    List<EngineState> engineState = new ArrayList<EngineState>()

    AuxInputSeries auxInput2 = null

    /* ID of the vehicle. */
    Long vehicleId

    AuxInputSeries auxInput1 = null

}
