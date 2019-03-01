package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.DocumentBase;
import org.openapitools.server.api.model.DocumentField;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DocumentCreate   {
  
  private Long dispatchJobId;
  private String notes;
  private String documentTypeUuid;
  private List<DocumentField> fields = new ArrayList<>();

  public DocumentCreate () {

  }

  public DocumentCreate (Long dispatchJobId, String notes, String documentTypeUuid, List<DocumentField> fields) {
    this.dispatchJobId = dispatchJobId;
    this.notes = notes;
    this.documentTypeUuid = documentTypeUuid;
    this.fields = fields;
  }

    
  @JsonProperty("dispatchJobId")
  public Long getDispatchJobId() {
    return dispatchJobId;
  }
  public void setDispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
  }

    
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

    
  @JsonProperty("documentTypeUuid")
  public String getDocumentTypeUuid() {
    return documentTypeUuid;
  }
  public void setDocumentTypeUuid(String documentTypeUuid) {
    this.documentTypeUuid = documentTypeUuid;
  }

    
  @JsonProperty("fields")
  public List<DocumentField> getFields() {
    return fields;
  }
  public void setFields(List<DocumentField> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
