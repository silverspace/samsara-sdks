package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.TaggedAddress;
import io.swagger.model.TaggedAsset;
import io.swagger.model.TaggedDriver;
import io.swagger.model.TaggedMachine;
import io.swagger.model.TaggedSensor;
import io.swagger.model.TaggedVehicle;
import java.util.List;
@Canonical
class Tag {

  /* The addresses that belong to this tag. */
  List<TaggedAddress> addresses = new ArrayList<TaggedAddress>()

  /* The assets that belong to this tag. */
  List<TaggedAsset> assets = new ArrayList<TaggedAsset>()

  /* The drivers that belong to this tag. */
  List<TaggedDriver> drivers = new ArrayList<TaggedDriver>()

  /* The GroupID that this tag belongs to. */
  Long groupId = null

  /* The ID of this tag. */
  Long id = null

  /* The machines that belong to this tag. */
  List<TaggedMachine> machines = new ArrayList<TaggedMachine>()

  /* Name of this tag. */
  String name = null

  /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  Long parentTagId = null

  /* The sensors that belong to this tag. */
  List<TaggedSensor> sensors = new ArrayList<TaggedSensor>()

  /* The vehicles that belong to this tag. */
  List<TaggedVehicle> vehicles = new ArrayList<TaggedVehicle>()
  

}

