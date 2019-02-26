/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class TaggedDriverBuilder {
    //the instance to build
    private TaggedDriver taggedDriver;

    /**
     * Default constructor to initialize the instance
     */
    public TaggedDriverBuilder() {
        taggedDriver = new TaggedDriver();
    }

    /**
     * The ID of the Driver being tagged.
     */
    public TaggedDriverBuilder id(long id) {
        taggedDriver.setId(id);
        return this;
    }

    /**
     * Name of the Driver being tagged.
     */
    public TaggedDriverBuilder name(String name) {
        taggedDriver.setName(name);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TaggedDriver build() {
        return taggedDriver;
    }
}