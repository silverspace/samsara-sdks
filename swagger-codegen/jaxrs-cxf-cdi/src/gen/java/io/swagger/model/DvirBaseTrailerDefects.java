package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class DvirBaseTrailerDefects   {
  
  private String comment = null;
  private String defectType = null;

  /**
   * The comment describing the type of DVIR defect
   **/
  public DvirBaseTrailerDefects comment(String comment) {
    this.comment = comment;
    return this;
  }

  
  @ApiModelProperty(example = "Air Compressor not working", value = "The comment describing the type of DVIR defect")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   * The type of DVIR defect
   **/
  public DvirBaseTrailerDefects defectType(String defectType) {
    this.defectType = defectType;
    return this;
  }

  
  @ApiModelProperty(example = "Air Compressor", value = "The type of DVIR defect")
  @JsonProperty("defectType")
  public String getDefectType() {
    return defectType;
  }
  public void setDefectType(String defectType) {
    this.defectType = defectType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

