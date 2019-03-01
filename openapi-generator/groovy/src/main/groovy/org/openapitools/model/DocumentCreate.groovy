package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DocumentBase;
import org.openapitools.model.DocumentField;

@Canonical
class DocumentCreate {
    /* ID of the Samsara dispatch job for which the document is submitted */
    Long dispatchJobId

    /* Notes submitted with this document. */
    String notes

    /* Universally unique identifier for the document type this document is being created for. */
    String documentTypeUuid

    /* List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. */
    List<DocumentField> fields = new ArrayList<DocumentField>()

}
