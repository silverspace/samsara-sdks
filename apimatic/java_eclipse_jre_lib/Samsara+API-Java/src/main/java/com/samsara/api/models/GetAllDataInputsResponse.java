/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetAllDataInputsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -38129966459464015L;
    private List<DataInputHistoryResponse> dataInputs;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("dataInputs")
    public List<DataInputHistoryResponse> getDataInputs ( ) { 
        return this.dataInputs;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("dataInputs")
    public void setDataInputs (List<DataInputHistoryResponse> value) { 
        this.dataInputs = value;
    }
 
}
