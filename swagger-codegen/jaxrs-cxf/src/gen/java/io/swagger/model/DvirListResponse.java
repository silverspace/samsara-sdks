package io.swagger.model;

import io.swagger.model.DvirBase;
import java.util.ArrayList;
import java.util.List;
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

public class DvirListResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<DvirBase> dvirs = null;
 /**
   * Get dvirs
   * @return dvirs
  **/
  @JsonProperty("dvirs")
  public List<DvirBase> getDvirs() {
    return dvirs;
  }

  public void setDvirs(List<DvirBase> dvirs) {
    this.dvirs = dvirs;
  }

  public DvirListResponse dvirs(List<DvirBase> dvirs) {
    this.dvirs = dvirs;
    return this;
  }

  public DvirListResponse addDvirsItem(DvirBase dvirsItem) {
    this.dvirs.add(dvirsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirListResponse {\n");
    
    sb.append("    dvirs: ").append(toIndentedString(dvirs)).append("\n");
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

