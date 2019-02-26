/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DriversSummaryParam 
        implements java.io.Serializable {
    private static final long serialVersionUID = 309867881563559460L;
    private long endMs;
    private long orgId;
    private long startMs;
    /** GETTER
     * End time (ms) of queried time period.
     */
    @JsonGetter("endMs")
    public long getEndMs ( ) { 
        return this.endMs;
    }
    
    /** SETTER
     * End time (ms) of queried time period.
     */
    @JsonSetter("endMs")
    public void setEndMs (long value) { 
        this.endMs = value;
    }
 
    /** GETTER
     * Org ID to query.
     */
    @JsonGetter("orgId")
    public long getOrgId ( ) { 
        return this.orgId;
    }
    
    /** SETTER
     * Org ID to query.
     */
    @JsonSetter("orgId")
    public void setOrgId (long value) { 
        this.orgId = value;
    }
 
    /** GETTER
     * Start time (ms) of queried time period.
     */
    @JsonGetter("startMs")
    public long getStartMs ( ) { 
        return this.startMs;
    }
    
    /** SETTER
     * Start time (ms) of queried time period.
     */
    @JsonSetter("startMs")
    public void setStartMs (long value) { 
        this.startMs = value;
    }
 
}