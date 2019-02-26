/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class TrailerDefectBuilder {
    //the instance to build
    private TrailerDefect trailerDefect;

    /**
     * Default constructor to initialize the instance
     */
    public TrailerDefectBuilder() {
        trailerDefect = new TrailerDefect();
    }

    /**
     * The comment describing the type of DVIR defect
     */
    public TrailerDefectBuilder comment(String comment) {
        trailerDefect.setComment(comment);
        return this;
    }

    /**
     * The type of DVIR defect
     */
    public TrailerDefectBuilder defectType(String defectType) {
        trailerDefect.setDefectType(defectType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TrailerDefect build() {
        return trailerDefect;
    }
}