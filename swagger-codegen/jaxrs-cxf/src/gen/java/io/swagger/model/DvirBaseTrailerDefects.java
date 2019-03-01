package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DvirBaseTrailerDefects  {
  
  @ApiModelProperty(example = "Air Compressor not working", value = "The comment describing the type of DVIR defect")
 /**
   * The comment describing the type of DVIR defect
  **/
  private String comment = null;

  @ApiModelProperty(example = "Air Compressor", value = "The type of DVIR defect")
 /**
   * The type of DVIR defect
  **/
  private String defectType = null;
 /**
   * The comment describing the type of DVIR defect
   * @return comment
  **/
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public DvirBaseTrailerDefects comment(String comment) {
    this.comment = comment;
    return this;
  }

 /**
   * The type of DVIR defect
   * @return defectType
  **/
  @JsonProperty("defectType")
  public String getDefectType() {
    return defectType;
  }

  public void setDefectType(String defectType) {
    this.defectType = defectType;
  }

  public DvirBaseTrailerDefects defectType(String defectType) {
    this.defectType = defectType;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

