/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DocumentBase 
        implements java.io.Serializable {
    private static final long serialVersionUID = -8693731797397664569L;
    private Long dispatchJobId;
    private String notes;
    /** GETTER
     * ID of the Samsara dispatch job for which the document is submitted
     */
    @JsonGetter("dispatchJobId")
    public Long getDispatchJobId ( ) { 
        return this.dispatchJobId;
    }
    
    /** SETTER
     * ID of the Samsara dispatch job for which the document is submitted
     */
    @JsonSetter("dispatchJobId")
    public void setDispatchJobId (Long value) { 
        this.dispatchJobId = value;
    }
 
    /** GETTER
     * Notes submitted with this document.
     */
    @JsonGetter("notes")
    public String getNotes ( ) { 
        return this.notes;
    }
    
    /** SETTER
     * Notes submitted with this document.
     */
    @JsonSetter("notes")
    public void setNotes (String value) { 
        this.notes = value;
    }
 
}
