package apimodels;

import apimodels.DocumentFieldType;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DocumentType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DocumentType   {
  @JsonProperty("fieldTypes")
  private List<List> fieldTypes = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("orgId")
  private Long orgId;

  @JsonProperty("uuid")
  private String uuid;

  public DocumentType fieldTypes(List<List> fieldTypes) {
    this.fieldTypes = fieldTypes;
    return this;
  }

  public DocumentType addFieldTypesItem(List<DocumentFieldType> fieldTypesItem) {
    if (fieldTypes == null) {
      fieldTypes = new ArrayList<>();
    }
    fieldTypes.add(fieldTypesItem);
    return this;
  }

   /**
   * The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
   * @return fieldTypes
  **/
  @Valid
  public List<List> getFieldTypes() {
    return fieldTypes;
  }

  public void setFieldTypes(List<List> fieldTypes) {
    this.fieldTypes = fieldTypes;
  }

  public DocumentType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the document type.
   * @return name
  **/
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentType orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * ID for the organization this document belongs to.
   * @return orgId
  **/
  @NotNull
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public DocumentType uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
   * @return uuid
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

