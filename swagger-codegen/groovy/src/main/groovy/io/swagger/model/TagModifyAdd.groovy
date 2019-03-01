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
class TagModifyAdd {

  /* The assets to be added to this tag. */
  List<TaggedAssetBase> assets = new ArrayList<TaggedAssetBase>()

  /* The drivers to be added to this tag. */
  List<TaggedDriverBase> drivers = new ArrayList<TaggedDriverBase>()

  /* The machines to be added to this tag. */
  List<TaggedMachineBase> machines = new ArrayList<TaggedMachineBase>()

  /* The sensors to be added to this tag. */
  List<TaggedSensorBase> sensors = new ArrayList<TaggedSensorBase>()

  /* The vehicles to be added to this tag. */
  List<TaggedVehicleBase> vehicles = new ArrayList<TaggedVehicleBase>()
  

}

