/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class Tag1Builder {
    //the instance to build
    private Tag1 tag1;

    /**
     * Default constructor to initialize the instance
     */
    public Tag1Builder() {
        tag1 = new Tag1();
    }

    /**
     * The ID of this tag.
     */
    public Tag1Builder id(long id) {
        tag1.setId(id);
        return this;
    }

    /**
     * Name of this tag.
     */
    public Tag1Builder name(String name) {
        tag1.setName(name);
        return this;
    }

    /**
     * The ID of this tag.
     */
    public Tag1Builder parentTagId(Long parentTagId) {
        tag1.setParentTagId(parentTagId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Tag1 build() {
        return tag1;
    }
}