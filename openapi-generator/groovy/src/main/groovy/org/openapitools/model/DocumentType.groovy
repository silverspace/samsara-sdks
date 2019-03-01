package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DocumentFieldType;

@Canonical
class DocumentType {
    /* The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have. */
    List<List> fieldTypes = new ArrayList<List>()

    /* Name of the document type. */
    String name

    /* ID for the organization this document belongs to. */
    Long orgId

    /* Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type. */
    String uuid

}
