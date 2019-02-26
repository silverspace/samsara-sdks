/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NextDriverSignature 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8373195737450577705L;
    private Long driverId;
    private String email;
    private String name;
    private Long signedAt;
    private String type;
    private String username;
    /** GETTER
     * ID of the driver who signed the DVIR
     */
    @JsonGetter("driverId")
    public Long getDriverId ( ) { 
        return this.driverId;
    }
    
    /** SETTER
     * ID of the driver who signed the DVIR
     */
    @JsonSetter("driverId")
    public void setDriverId (Long value) { 
        this.driverId = value;
    }
 
    /** GETTER
     * Email of the  driver who signed the next DVIR on this vehicle.
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Email of the  driver who signed the next DVIR on this vehicle.
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * The name of the driver who signed the next DVIR on this vehicle.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of the driver who signed the next DVIR on this vehicle.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The time in millis when the next driver signed the DVIR on this vehicle.
     */
    @JsonGetter("signedAt")
    public Long getSignedAt ( ) { 
        return this.signedAt;
    }
    
    /** SETTER
     * The time in millis when the next driver signed the DVIR on this vehicle.
     */
    @JsonSetter("signedAt")
    public void setSignedAt (Long value) { 
        this.signedAt = value;
    }
 
    /** GETTER
     * Type corresponds to driver.
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Type corresponds to driver.
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Username of the  driver who signed the next DVIR on this vehicle.
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * Username of the  driver who signed the next DVIR on this vehicle.
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
}