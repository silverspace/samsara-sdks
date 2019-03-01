package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DocumentFieldTypeNumberValueTypeMetadata;

@Canonical
class DocumentFieldType {
    /* Descriptive name of this field type. */
    String label

    DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata = null

    /* The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
    String valueType

}
