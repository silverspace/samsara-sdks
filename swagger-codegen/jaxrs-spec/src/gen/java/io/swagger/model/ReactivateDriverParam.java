package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ReactivateDriverParam   {
  
  private @Valid Boolean reactivate = null;

  /**
   * True indicates that this driver should be reactivated.
   **/
  public ReactivateDriverParam reactivate(Boolean reactivate) {
    this.reactivate = reactivate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "True indicates that this driver should be reactivated.")
  @JsonProperty("reactivate")
  @NotNull
  public Boolean isReactivate() {
    return reactivate;
  }
  public void setReactivate(Boolean reactivate) {
    this.reactivate = reactivate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReactivateDriverParam reactivateDriverParam = (ReactivateDriverParam) o;
    return Objects.equals(reactivate, reactivateDriverParam.reactivate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reactivate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReactivateDriverParam {\n");
    
    sb.append("    reactivate: ").append(toIndentedString(reactivate)).append("\n");
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

