package io.swagger.model;

import io.swagger.model.DocumentFieldTypes;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DocumentType   {
  
  private @Valid List<DocumentFieldTypes> fieldTypes = new ArrayList<DocumentFieldTypes>();
  private @Valid String name = null;
  private @Valid Long orgId = null;
  private @Valid String uuid = null;

  /**
   * The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
   **/
  public DocumentType fieldTypes(List<DocumentFieldTypes> fieldTypes) {
    this.fieldTypes = fieldTypes;
    return this;
  }

  
  @ApiModelProperty(value = "The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.")
  @JsonProperty("fieldTypes")
  public List<DocumentFieldTypes> getFieldTypes() {
    return fieldTypes;
  }
  public void setFieldTypes(List<DocumentFieldTypes> fieldTypes) {
    this.fieldTypes = fieldTypes;
  }

  /**
   * Name of the document type.
   **/
  public DocumentType name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Fuel Receipt", required = true, value = "Name of the document type.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * ID for the organization this document belongs to.
   **/
  public DocumentType orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  
  @ApiModelProperty(example = "773", required = true, value = "ID for the organization this document belongs to.")
  @JsonProperty("orgId")
  @NotNull
  public Long getOrgId() {
    return orgId;
  }
  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  /**
   * Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
   **/
  public DocumentType uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @ApiModelProperty(example = "4aff772c-a7bb-45e6-8e41-6a53e34feb83", required = true, value = "Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.")
  @JsonProperty("uuid")
  @NotNull
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentType documentType = (DocumentType) o;
    return Objects.equals(fieldTypes, documentType.fieldTypes) &&
        Objects.equals(name, documentType.name) &&
        Objects.equals(orgId, documentType.orgId) &&
        Objects.equals(uuid, documentType.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldTypes, name, orgId, uuid);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

