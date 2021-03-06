/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class DocumentFieldCreateBuilder {
    //the instance to build
    private DocumentFieldCreate documentFieldCreate;

    /**
     * Default constructor to initialize the instance
     */
    public DocumentFieldCreateBuilder() {
        documentFieldCreate = new DocumentFieldCreate();
    }

    /**
     * Value of this field if this document field has valueType: ValueType_Number.
     */
    public DocumentFieldCreateBuilder numberValue(Double numberValue) {
        documentFieldCreate.setNumberValue(numberValue);
        return this;
    }

    /**
     * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
     */
    public DocumentFieldCreateBuilder photoValue(List<PhotoValue> photoValue) {
        documentFieldCreate.setPhotoValue(photoValue);
        return this;
    }

    /**
     * Value of this field if this document field has valueType: ValueType_String.
     */
    public DocumentFieldCreateBuilder stringValue(String stringValue) {
        documentFieldCreate.setStringValue(stringValue);
        return this;
    }

    /**
     * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
     */
    public DocumentFieldCreateBuilder valueType(String valueType) {
        documentFieldCreate.setValueType(valueType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DocumentFieldCreate build() {
        return documentFieldCreate;
    }
}