package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TaggedAddress;
import org.openapitools.model.TaggedAsset;
import org.openapitools.model.TaggedDriver;
import org.openapitools.model.TaggedMachine;
import org.openapitools.model.TaggedSensor;
import org.openapitools.model.TaggedVehicle;

@Canonical
class Tag {
    /* The addresses that belong to this tag. */
    List<TaggedAddress> addresses = new ArrayList<TaggedAddress>()

    /* The assets that belong to this tag. */
    List<TaggedAsset> assets = new ArrayList<TaggedAsset>()

    /* The drivers that belong to this tag. */
    List<TaggedDriver> drivers = new ArrayList<TaggedDriver>()

    /* The GroupID that this tag belongs to. */
    Long groupId

    /* The ID of this tag. */
    Long id

    /* The machines that belong to this tag. */
    List<TaggedMachine> machines = new ArrayList<TaggedMachine>()

    /* Name of this tag. */
    String name

    /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
    Long parentTagId

    /* The sensors that belong to this tag. */
    List<TaggedSensor> sensors = new ArrayList<TaggedSensor>()

    /* The vehicles that belong to this tag. */
    List<TaggedVehicle> vehicles = new ArrayList<TaggedVehicle>()

}
