/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class TaggedVehicleBaseBuilder {
    //the instance to build
    private TaggedVehicleBase taggedVehicleBase;

    /**
     * Default constructor to initialize the instance
     */
    public TaggedVehicleBaseBuilder() {
        taggedVehicleBase = new TaggedVehicleBase();
    }

    /**
     * The ID of the Vehicle being tagged.
     */
    public TaggedVehicleBaseBuilder id(long id) {
        taggedVehicleBase.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TaggedVehicleBase build() {
        return taggedVehicleBase;
    }
}