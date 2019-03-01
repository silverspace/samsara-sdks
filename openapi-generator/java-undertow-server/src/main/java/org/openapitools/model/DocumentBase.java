package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-03-01T05:34:49.851Z[GMT]")
public class DocumentBase   {
  
  private Long dispatchJobId;
  private String notes;

  /**
   * ID of the Samsara dispatch job for which the document is submitted
   **/
  public DocumentBase dispatchJobId(Long dispatchJobId) {
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
  public DocumentBase notes(String notes) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBase documentBase = (DocumentBase) o;
    return Objects.equals(dispatchJobId, documentBase.dispatchJobId) &&
        Objects.equals(notes, documentBase.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispatchJobId, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBase {\n");
    
    sb.append("    dispatchJobId: ").append(toIndentedString(dispatchJobId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

