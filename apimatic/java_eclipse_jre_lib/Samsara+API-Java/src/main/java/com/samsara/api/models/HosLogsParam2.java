/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class HosLogsParam2 
        implements java.io.Serializable {
    private static final long serialVersionUID = 1436233037729682L;
    private long groupId;
    /** GETTER
     * Group ID to query.
     */
    @JsonGetter("groupId")
    public long getGroupId ( ) { 
        return this.groupId;
    }
    
    /** SETTER
     * Group ID to query.
     */
    @JsonSetter("groupId")
    public void setGroupId (long value) { 
        this.groupId = value;
    }
 
}
