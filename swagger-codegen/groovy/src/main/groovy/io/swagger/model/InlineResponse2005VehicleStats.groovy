package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.AuxInputSeries;
import io.swagger.model.EngineState;
import java.util.List;
@Canonical
class InlineResponse2005VehicleStats {

    AuxInputSeries auxInput1 = null

    AuxInputSeries auxInput2 = null

    List<EngineState> engineState = new ArrayList<EngineState>()

  /* ID of the vehicle. */
  Long vehicleId = null
  

}

