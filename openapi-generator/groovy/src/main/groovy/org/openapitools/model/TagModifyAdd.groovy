package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TaggedAssetBase;
import org.openapitools.model.TaggedDriverBase;
import org.openapitools.model.TaggedMachineBase;
import org.openapitools.model.TaggedSensorBase;
import org.openapitools.model.TaggedVehicleBase;

@Canonical
class TagModifyAdd {
    /* The assets to be added to this tag. */
    List<TaggedAssetBase> assets = new ArrayList<TaggedAssetBase>()

    /* The sensors to be added to this tag. */
    List<TaggedSensorBase> sensors = new ArrayList<TaggedSensorBase>()

    /* The vehicles to be added to this tag. */
    List<TaggedVehicleBase> vehicles = new ArrayList<TaggedVehicleBase>()

    /* The machines to be added to this tag. */
    List<TaggedMachineBase> machines = new ArrayList<TaggedMachineBase>()

    /* The drivers to be added to this tag. */
    List<TaggedDriverBase> drivers = new ArrayList<TaggedDriverBase>()

}
