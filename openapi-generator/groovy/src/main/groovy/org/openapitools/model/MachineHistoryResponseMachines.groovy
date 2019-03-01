package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.MachineHistoryResponseVibrations;

@Canonical
class MachineHistoryResponseMachines {
    /* Machine name */
    String name

    /* Machine ID */
    Integer id

    /* List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s */
    List<MachineHistoryResponseVibrations> vibrations = new ArrayList<MachineHistoryResponseVibrations>()

}
