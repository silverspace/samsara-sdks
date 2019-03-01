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
class TagUpdate {
    /* The assets that belong to this tag. */
    List<TaggedAssetBase> assets = new ArrayList<TaggedAssetBase>()

    /* The drivers that belong to this tag. */
    List<TaggedDriverBase> drivers = new ArrayList<TaggedDriverBase>()

    /* The machines that belong to this tag. */
    List<TaggedMachineBase> machines = new ArrayList<TaggedMachineBase>()

    /* Updated name of this tag. */
    String name

    /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
    Long parentTagId

    /* The sensors that belong to this tag. */
    List<TaggedSensorBase> sensors = new ArrayList<TaggedSensorBase>()

    /* The vehicles that belong to this tag. */
    List<TaggedVehicleBase> vehicles = new ArrayList<TaggedVehicleBase>()

}
