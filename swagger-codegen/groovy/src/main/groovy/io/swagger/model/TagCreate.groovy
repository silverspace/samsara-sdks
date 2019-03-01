package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.TaggedAssetBase;
import io.swagger.model.TaggedDriverBase;
import io.swagger.model.TaggedMachineBase;
import io.swagger.model.TaggedSensorBase;
import io.swagger.model.TaggedVehicleBase;
import java.util.List;
@Canonical
class TagCreate {

  /* The assets that belong to this tag. */
  List<TaggedAssetBase> assets = new ArrayList<TaggedAssetBase>()

  /* The drivers that belong to this tag. */
  List<TaggedDriverBase> drivers = new ArrayList<TaggedDriverBase>()

  /* The machines that belong to this tag. */
  List<TaggedMachineBase> machines = new ArrayList<TaggedMachineBase>()

  /* Name of this tag. */
  String name = null

  /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  Long parentTagId = null

  /* The sensors that belong to this tag. */
  List<TaggedSensorBase> sensors = new ArrayList<TaggedSensorBase>()

  /* The vehicles that belong to this tag. */
  List<TaggedVehicleBase> vehicles = new ArrayList<TaggedVehicleBase>()
  

}

