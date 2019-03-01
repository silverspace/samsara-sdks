package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DocumentBase;
import org.openapitools.model.DocumentField;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-03-01T05:34:49.851Z[GMT]")
public class DocumentCreate   {
  
  private Long dispatchJobId;
  private String notes;
  private String documentTypeUuid;
  private List<DocumentField> fields = new ArrayList<DocumentField>();

  /**
   * ID of the Samsara dispatch job for which the document is submitted
   **/
  public DocumentCreate dispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
    return this;
  }

  
  @ApiModelProperty(example = "773", value = "ID of the Samsara dispatch job for which the document is submitted")
  @JsonProperty("dispatchJobId")
  public Long getDispatchJobId() {
    return dispatchJobId;
  }
  public void setDispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
  }

  /**
   * Notes submitted with this document.
   **/
  public DocumentCreate notes(String notes) {
    this.notes = notes;
    return this;
  }

  
  @ApiModelProperty(example = "Fueled up before delivery.", value = "Notes submitted with this document.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Universally unique identifier for the document type this document is being created for.
   **/
  public DocumentCreate documentTypeUuid(String documentTypeUuid) {
    this.documentTypeUuid = documentTypeUuid;
    return this;
  }

  
  @ApiModelProperty(example = "4aff772c-a7bb-45e6-8e41-6a53e34feb83", required = true, value = "Universally unique identifier for the document type this document is being created for.")
  @JsonProperty("documentTypeUuid")
  public String getDocumentTypeUuid() {
    return documentTypeUuid;
  }
  public void setDocumentTypeUuid(String documentTypeUuid) {
    this.documentTypeUuid = documentTypeUuid;
  }

  /**
   * List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
   **/
  public DocumentCreate fields(List<DocumentField> fields) {
    this.fields = fields;
    return this;
  }

  
  @ApiModelProperty(example = "[{label=Driver Photo, photoValue=[], valueType=ValueType_Photo}, {label=Gallons, numberValue=12.34, valueType=ValueType_Number}, {label=City, stringValue=San Francisco, CA, valueType=ValueType_String}]", required = true, value = "List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.")
  @JsonProperty("fields")
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
    return Objects.equals(dispatchJobId, documentCreate.dispatchJobId) &&
        Objects.equals(notes, documentCreate.notes) &&
        Objects.equals(documentTypeUuid, documentCreate.documentTypeUuid) &&
        Objects.equals(fields, documentCreate.fields);
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

