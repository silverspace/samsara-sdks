package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.MachineHistoryResponseVibrations;
import java.util.List;
@Canonical
class MachineHistoryResponseMachines {

  /* Machine ID */
  Integer id = null

  /* Machine name */
  String name = null

  /* List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s */
  List<MachineHistoryResponseVibrations> vibrations = new ArrayList<MachineHistoryResponseVibrations>()
  

}

