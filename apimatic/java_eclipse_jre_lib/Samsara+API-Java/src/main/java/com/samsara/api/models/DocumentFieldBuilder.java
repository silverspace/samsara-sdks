/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DocumentFieldBuilder {
    //the instance to build
    private DocumentField documentField;

    /**
     * Default constructor to initialize the instance
     */
    public DocumentFieldBuilder() {
        documentField = new DocumentField();
    }

    /**
     * Descriptive name of this field.
     */
    public DocumentFieldBuilder label(String label) {
        documentField.setLabel(label);
        return this;
    }

    /**
     * DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
     */
    public DocumentFieldBuilder value(Object value) {
        documentField.setValue(value);
        return this;
    }

    /**
     * Value of this field if this document field has valueType: ValueType_Number.
     */
    public DocumentFieldBuilder numberValue(Double numberValue) {
        documentField.setNumberValue(numberValue);
        return this;
    }

    /**
     * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
     */
    public DocumentFieldBuilder photoValue(List<PhotoValue> photoValue) {
        documentField.setPhotoValue(photoValue);
        return this;
    }

    /**
     * Value of this field if this document field has valueType: ValueType_String.
     */
    public DocumentFieldBuilder stringValue(String stringValue) {
        documentField.setStringValue(stringValue);
        return this;
    }

    /**
     * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
     */
    public DocumentFieldBuilder valueType(String valueType) {
        documentField.setValueType(valueType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DocumentField build() {
        return documentField;
    }
}