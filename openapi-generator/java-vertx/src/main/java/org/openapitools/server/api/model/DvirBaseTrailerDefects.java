package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DvirBaseTrailerDefects   {
  
  private String comment;
  private String defectType;

  public DvirBaseTrailerDefects () {

  }

  public DvirBaseTrailerDefects (String comment, String defectType) {
    this.comment = comment;
    this.defectType = defectType;
  }

    
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

    
  @JsonProperty("defectType")
  public String getDefectType() {
    return defectType;
  }
  public void setDefectType(String defectType) {
    this.defectType = defectType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvirBaseTrailerDefects dvirBaseTrailerDefects = (DvirBaseTrailerDefects) o;
    return Objects.equals(comment, dvirBaseTrailerDefects.comment) &&
        Objects.equals(defectType, dvirBaseTrailerDefects.defectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, defectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirBaseTrailerDefects {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    defectType: ").append(toIndentedString(defectType)).append("\n");
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
