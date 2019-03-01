package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DvirBase;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class DvirListResponse   {
  
  private List<DvirBase> dvirs = new ArrayList<DvirBase>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dvirs")
  public List<DvirBase> getDvirs() {
    return dvirs;
  }
  public void setDvirs(List<DvirBase> dvirs) {
    this.dvirs = dvirs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvirListResponse dvirListResponse = (DvirListResponse) o;
    return Objects.equals(dvirs, dvirListResponse.dvirs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dvirs);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

