package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.DocumentBase;
import com.prokarma.pkmst.model.DocumentField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DocumentCreate
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class DocumentCreate   {
  @JsonProperty("dispatchJobId")
  private Long dispatchJobId;

  @JsonProperty("notes")
  private String notes;

  @JsonProperty("documentTypeUuid")
  private String documentTypeUuid;

  @JsonProperty("fields")
  
  private List<DocumentField> fields = new ArrayList<>();

  public DocumentCreate dispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
    return this;
  }

   /**
   * ID of the Samsara dispatch job for which the document is submitted
   * @return dispatchJobId
  **/
  @ApiModelProperty(example = "773", value = "ID of the Samsara dispatch job for which the document is submitted")
  public Long getDispatchJobId() {
    return dispatchJobId;
  }

  public void setDispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
  }

  public DocumentCreate notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes submitted with this document.
   * @return notes
  **/
  @ApiModelProperty(example = "Fueled up before delivery.", value = "Notes submitted with this document.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DocumentCreate documentTypeUuid(String documentTypeUuid) {
    this.documentTypeUuid = documentTypeUuid;
    return this;
  }

   /**
   * Universally unique identifier for the document type this document is being created for.
   * @return documentTypeUuid
  **/
  @ApiModelProperty(example = "4aff772c-a7bb-45e6-8e41-6a53e34feb83", required = true, value = "Universally unique identifier for the document type this document is being created for.")
  public String getDocumentTypeUuid() {
    return documentTypeUuid;
  }

  public void setDocumentTypeUuid(String documentTypeUuid) {
    this.documentTypeUuid = documentTypeUuid;
  }

  public DocumentCreate fields(List<DocumentField> fields) {
    this.fields = fields;
    return this;
  }

  public DocumentCreate addFieldsItem(DocumentField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
   * @return fields
  **/
  @ApiModelProperty(example = "[{label=Driver Photo, photoValue=[], valueType=ValueType_Photo}, {label=Gallons, numberValue=12.34, valueType=ValueType_Number}, {label=City, stringValue=San Francisco, CA, valueType=ValueType_String}]", required = true, value = "List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.")
  public List<DocumentField> getFields() {
    return fields;
  }

  public void setFields(List<DocumentField> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCreate documentCreate = (DocumentCreate) o;
    return Objects.equals(this.dispatchJobId, documentCreate.dispatchJobId) &&
        Objects.equals(this.notes, documentCreate.notes) &&
        Objects.equals(this.documentTypeUuid, documentCreate.documentTypeUuid) &&
        Objects.equals(this.fields, documentCreate.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispatchJobId, notes, documentTypeUuid, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCreate {\n");
    
    sb.append("    dispatchJobId: ").append(toIndentedString(dispatchJobId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    documentTypeUuid: ").append(toIndentedString(documentTypeUuid)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

