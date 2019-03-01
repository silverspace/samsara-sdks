package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DocumentFieldTypes;
import java.util.List;
@Canonical
class DocumentType {

  /* The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have. */
  List<DocumentFieldTypes> fieldTypes = new ArrayList<DocumentFieldTypes>()

  /* Name of the document type. */
  String name = null

  /* ID for the organization this document belongs to. */
  Long orgId = null

  /* Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type. */
  String uuid = null
  

}

