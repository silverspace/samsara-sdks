/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DvirListResponseBuilder {
    //the instance to build
    private DvirListResponse dvirListResponse;

    /**
     * Default constructor to initialize the instance
     */
    public DvirListResponseBuilder() {
        dvirListResponse = new DvirListResponse();
    }

    public DvirListResponseBuilder dvirs(List<DvirBase> dvirs) {
        dvirListResponse.setDvirs(dvirs);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DvirListResponse build() {
        return dvirListResponse;
    }
}