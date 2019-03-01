package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DvirBaseTrailerDefects
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class DvirBaseTrailerDefects   {
  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("defectType")
  private String defectType = null;

  public DvirBaseTrailerDefects comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * The comment describing the type of DVIR defect
   * @return comment
  **/
  @ApiModelProperty(example = "Air Compressor not working", value = "The comment describing the type of DVIR defect")


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public DvirBaseTrailerDefects defectType(String defectType) {
    this.defectType = defectType;
    return this;
  }

  /**
   * The type of DVIR defect
   * @return defectType
  **/
  @ApiModelProperty(example = "Air Compressor", value = "The type of DVIR defect")


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
    return Objects.equals(this.comment, dvirBaseTrailerDefects.comment) &&
        Objects.equals(this.defectType, dvirBaseTrailerDefects.defectType);
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

