/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DiagnosticTroubleCode 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 250048047694655056L;
    private Integer fmiId;
    private String fmiText;
    private Integer occurrenceCount;
    private String spnDescription;
    private Integer spnId;
    private Integer txId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("fmiId")
    public Integer getFmiId ( ) { 
        return this.fmiId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("fmiId")
    public void setFmiId (Integer value) { 
        this.fmiId = value;
        notifyObservers(this.fmiId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("fmiText")
    public String getFmiText ( ) { 
        return this.fmiText;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("fmiText")
    public void setFmiText (String value) { 
        this.fmiText = value;
        notifyObservers(this.fmiText);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("occurrenceCount")
    public Integer getOccurrenceCount ( ) { 
        return this.occurrenceCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("occurrenceCount")
    public void setOccurrenceCount (Integer value) { 
        this.occurrenceCount = value;
        notifyObservers(this.occurrenceCount);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("spnDescription")
    public String getSpnDescription ( ) { 
        return this.spnDescription;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("spnDescription")
    public void setSpnDescription (String value) { 
        this.spnDescription = value;
        notifyObservers(this.spnDescription);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("spnId")
    public Integer getSpnId ( ) { 
        return this.spnId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("spnId")
    public void setSpnId (Integer value) { 
        this.spnId = value;
        notifyObservers(this.spnId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("txId")
    public Integer getTxId ( ) { 
        return this.txId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("txId")
    public void setTxId (Integer value) { 
        this.txId = value;
        notifyObservers(this.txId);
    }
 
}