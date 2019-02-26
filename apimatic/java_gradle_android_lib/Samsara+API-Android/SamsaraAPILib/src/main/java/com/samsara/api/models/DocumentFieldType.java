/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DocumentFieldType 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -8116601494302820004L;
    private String label;
    private NumberValueTypeMetadata numberValueTypeMetadata;
    private String valueType;
    /** GETTER
     * Descriptive name of this field type.
     */
    @JsonGetter("label")
    public String getLabel ( ) { 
        return this.label;
    }
    
    /** SETTER
     * Descriptive name of this field type.
     */
    @JsonSetter("label")
    public void setLabel (String value) { 
        this.label = value;
        notifyObservers(this.label);
    }
 
    /** GETTER
     * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
     */
    @JsonGetter("numberValueTypeMetadata")
    public NumberValueTypeMetadata getNumberValueTypeMetadata ( ) { 
        return this.numberValueTypeMetadata;
    }
    
    /** SETTER
     * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
     */
    @JsonSetter("numberValueTypeMetadata")
    public void setNumberValueTypeMetadata (NumberValueTypeMetadata value) { 
        this.numberValueTypeMetadata = value;
        notifyObservers(this.numberValueTypeMetadata);
    }
 
    /** GETTER
     * The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
     */
    @JsonGetter("valueType")
    public String getValueType ( ) { 
        return this.valueType;
    }
    
    /** SETTER
     * The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
     */
    @JsonSetter("valueType")
    public void setValueType (String value) { 
        this.valueType = value;
        notifyObservers(this.valueType);
    }
 
}
