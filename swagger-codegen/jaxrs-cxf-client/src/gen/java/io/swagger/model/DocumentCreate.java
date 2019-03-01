package io.swagger.model;

import io.swagger.model.DocumentBase;
import io.swagger.model.DocumentField;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentCreate  {
  
  @ApiModelProperty(example = "773", value = "ID of the Samsara dispatch job for which the document is submitted")
 /**
   * ID of the Samsara dispatch job for which the document is submitted
  **/
  private Long dispatchJobId = null;

  @ApiModelProperty(example = "Fueled up before delivery.", value = "Notes submitted with this document.")
 /**
   * Notes submitted with this document.
  **/
  private String notes = null;

  @ApiModelProperty(example = "4aff772c-a7bb-45e6-8e41-6a53e34feb83", required = true, value = "Universally unique identifier for the document type this document is being created for.")
 /**
   * Universally unique identifier for the document type this document is being created for.
  **/
  private String documentTypeUuid = null;

  @ApiModelProperty(example = "[{\"label\":\"Driver Photo\",\"photoValue\":[],\"valueType\":\"ValueType_Photo\"},{\"label\":\"Gallons\",\"numberValue\":12.34,\"valueType\":\"ValueType_Number\"},{\"label\":\"City\",\"stringValue\":\"San Francisco, CA\",\"valueType\":\"ValueType_String\"}]", required = true, value = "List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.")
 /**
   * List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
  **/
  private List<DocumentField> fields = new ArrayList<DocumentField>();
 /**
   * ID of the Samsara dispatch job for which the document is submitted
   * @return dispatchJobId
  **/
  @JsonProperty("dispatchJobId")
  public Long getDispatchJobId() {
    return dispatchJobId;
  }

  public void setDispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
  }

  public DocumentCreate dispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
    return this;
  }

 /**
   * Notes submitted with this document.
   * @return notes
  **/
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DocumentCreate notes(String notes) {
    this.notes = notes;
    return this;
  }

 /**
   * Universally unique identifier for the document type this document is being created for.
   * @return documentTypeUuid
  **/
  @JsonProperty("documentTypeUuid")
  public String getDocumentTypeUuid() {
    return documentTypeUuid;
  }

  public void setDocumentTypeUuid(String documentTypeUuid) {
    this.documentTypeUuid = documentTypeUuid;
  }

  public DocumentCreate documentTypeUuid(String documentTypeUuid) {
    this.documentTypeUuid = documentTypeUuid;
    return this;
  }

 /**
   * List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
   * @return fields
  **/
  @JsonProperty("fields")
  public List<DocumentField> getFields() {
    return fields;
  }

  public void setFields(List<DocumentField> fields) {
    this.fields = fields;
  }

  public DocumentCreate fields(List<DocumentField> fields) {
    this.fields = fields;
    return this;
  }

  public DocumentCreate addFieldsItem(DocumentField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

