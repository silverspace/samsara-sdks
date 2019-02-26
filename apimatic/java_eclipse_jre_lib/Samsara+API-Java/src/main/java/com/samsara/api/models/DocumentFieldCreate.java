/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DocumentFieldCreate 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8934098351287661659L;
    private Double numberValue;
    private List<PhotoValue> photoValue;
    private String stringValue;
    private String valueType;
    /** GETTER
     * Value of this field if this document field has valueType: ValueType_Number.
     */
    @JsonGetter("numberValue")
    public Double getNumberValue ( ) { 
        return this.numberValue;
    }
    
    /** SETTER
     * Value of this field if this document field has valueType: ValueType_Number.
     */
    @JsonSetter("numberValue")
    public void setNumberValue (Double value) { 
        this.numberValue = value;
    }
 
    /** GETTER
     * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
     */
    @JsonGetter("photoValue")
    public List<PhotoValue> getPhotoValue ( ) { 
        return this.photoValue;
    }
    
    /** SETTER
     * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
     */
    @JsonSetter("photoValue")
    public void setPhotoValue (List<PhotoValue> value) { 
        this.photoValue = value;
    }
 
    /** GETTER
     * Value of this field if this document field has valueType: ValueType_String.
     */
    @JsonGetter("stringValue")
    public String getStringValue ( ) { 
        return this.stringValue;
    }
    
    /** SETTER
     * Value of this field if this document field has valueType: ValueType_String.
     */
    @JsonSetter("stringValue")
    public void setStringValue (String value) { 
        this.stringValue = value;
    }
 
    /** GETTER
     * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
     */
    @JsonGetter("valueType")
    public String getValueType ( ) { 
        return this.valueType;
    }
    
    /** SETTER
     * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
     */
    @JsonSetter("valueType")
    public void setValueType (String value) { 
        this.valueType = value;
    }
 
}
