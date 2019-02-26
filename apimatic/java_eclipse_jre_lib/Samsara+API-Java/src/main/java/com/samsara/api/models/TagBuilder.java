/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class TagBuilder {
    //the instance to build
    private Tag tag;

    /**
     * Default constructor to initialize the instance
     */
    public TagBuilder() {
        tag = new Tag();
    }

    /**
     * The addresses that belong to this tag.
     */
    public TagBuilder addresses(List<TaggedAddress> addresses) {
        tag.setAddresses(addresses);
        return this;
    }

    /**
     * The assets that belong to this tag.
     */
    public TagBuilder assets(List<TaggedAsset> assets) {
        tag.setAssets(assets);
        return this;
    }

    /**
     * The drivers that belong to this tag.
     */
    public TagBuilder drivers(List<TaggedDriver> drivers) {
        tag.setDrivers(drivers);
        return this;
    }

    /**
     * The GroupID that this tag belongs to.
     */
    public TagBuilder groupId(Long groupId) {
        tag.setGroupId(groupId);
        return this;
    }

    /**
     * The ID of this tag.
     */
    public TagBuilder id(long id) {
        tag.setId(id);
        return this;
    }

    /**
     * The machines that belong to this tag.
     */
    public TagBuilder machines(List<TaggedMachine> machines) {
        tag.setMachines(machines);
        return this;
    }

    /**
     * Name of this tag.
     */
    public TagBuilder name(String name) {
        tag.setName(name);
        return this;
    }

    /**
     * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
     */
    public TagBuilder parentTagId(Long parentTagId) {
        tag.setParentTagId(parentTagId);
        return this;
    }

    /**
     * The sensors that belong to this tag.
     */
    public TagBuilder sensors(List<TaggedSensor> sensors) {
        tag.setSensors(sensors);
        return this;
    }

    /**
     * The vehicles that belong to this tag.
     */
    public TagBuilder vehicles(List<TaggedVehicle> vehicles) {
        tag.setVehicles(vehicles);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Tag build() {
        return tag;
    }
}