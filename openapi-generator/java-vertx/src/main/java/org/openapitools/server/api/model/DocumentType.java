package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.DocumentFieldType;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DocumentType   {
  
  private List<List> fieldTypes = new ArrayList<>();
  private String name;
  private Long orgId;
  private String uuid;

  public DocumentType () {

  }

  public DocumentType (List<List> fieldTypes, String name, Long orgId, String uuid) {
    this.fieldTypes = fieldTypes;
    this.name = name;
    this.orgId = orgId;
    this.uuid = uuid;
  }

    
  @JsonProperty("fieldTypes")
  public List<List> getFieldTypes() {
    return fieldTypes;
  }
  public void setFieldTypes(List<List> fieldTypes) {
    this.fieldTypes = fieldTypes;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("orgId")
  public Long getOrgId() {
    return orgId;
  }
  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

    
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
