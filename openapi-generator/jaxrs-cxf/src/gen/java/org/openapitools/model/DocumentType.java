package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DocumentFieldType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentType  {
  
  @ApiModelProperty(value = "The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.")
  @Valid
 /**
   * The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
  **/
  private List<List> fieldTypes = null;

  @ApiModelProperty(example = "Fuel Receipt", required = true, value = "Name of the document type.")
 /**
   * Name of the document type.
  **/
  private String name;

  @ApiModelProperty(example = "773", required = true, value = "ID for the organization this document belongs to.")
 /**
   * ID for the organization this document belongs to.
  **/
  private Long orgId;

  @ApiModelProperty(example = "4aff772c-a7bb-45e6-8e41-6a53e34feb83", required = true, value = "Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.")
 /**
   * Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
  **/
  private String uuid;
 /**
   * The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
   * @return fieldTypes
  **/
  @JsonProperty("fieldTypes")
  public List<List> getFieldTypes() {
    return fieldTypes;
  }

  public void setFieldTypes(List<List> fieldTypes) {
    this.fieldTypes = fieldTypes;
  }

  public DocumentType fieldTypes(List<List> fieldTypes) {
    this.fieldTypes = fieldTypes;
    return this;
  }

  public DocumentType addFieldTypesItem(List<DocumentFieldType> fieldTypesItem) {
    this.fieldTypes.add(fieldTypesItem);
    return this;
  }

 /**
   * Name of the document type.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentType name(String name) {
    this.name = name;
    return this;
  }

 /**
   * ID for the organization this document belongs to.
   * @return orgId
  **/
  @JsonProperty("orgId")
  @NotNull
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public DocumentType orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

 /**
   * Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
   * @return uuid
  **/
  @JsonProperty("uuid")
  @NotNull
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public DocumentType uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentType {\n");
    
    sb.append("    fieldTypes: ").append(toIndentedString(fieldTypes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

