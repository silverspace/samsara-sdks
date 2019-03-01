package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DocumentFieldCreatePhotoValue;

@Canonical
class DocumentFieldCreate {
    /* Value of this field if this document field has valueType: ValueType_Number. */
    Double numberValue

    /* Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. */
    List<DocumentFieldCreatePhotoValue> photoValue = new ArrayList<DocumentFieldCreatePhotoValue>()

    /* Value of this field if this document field has valueType: ValueType_String. */
    String stringValue

    /* Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
    String valueType

}
