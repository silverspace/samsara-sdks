package apimodels;

import apimodels.DocumentBase;
import apimodels.DocumentField;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DocumentCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @NotNull
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
    fields.add(fieldsItem);
    return this;
  }

   /**
   * List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
   * @return fields
  **/
  @NotNull
@Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

