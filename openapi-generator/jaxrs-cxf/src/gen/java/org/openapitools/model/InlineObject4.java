package org.openapitools.model;

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

public class InlineObject4  {
  
  @ApiModelProperty(required = true, value = "True indicates that this driver should be reactivated.")
 /**
   * True indicates that this driver should be reactivated.
  **/
  private Boolean reactivate;
 /**
   * True indicates that this driver should be reactivated.
   * @return reactivate
  **/
  @JsonProperty("reactivate")
  @NotNull
  public Boolean getReactivate() {
    return reactivate;
  }

  public void setReactivate(Boolean reactivate) {
    this.reactivate = reactivate;
  }

  public InlineObject4 reactivate(Boolean reactivate) {
    this.reactivate = reactivate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject4 {\n");
    
    sb.append("    reactivate: ").append(toIndentedString(reactivate)).append("\n");
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

