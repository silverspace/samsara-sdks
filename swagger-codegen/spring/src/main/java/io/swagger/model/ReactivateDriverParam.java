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
 * ReactivateDriverParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class ReactivateDriverParam   {
  @JsonProperty("reactivate")
  private Boolean reactivate = null;

  public ReactivateDriverParam reactivate(Boolean reactivate) {
    this.reactivate = reactivate;
    return this;
  }

  /**
   * True indicates that this driver should be reactivated.
   * @return reactivate
  **/
  @ApiModelProperty(required = true, value = "True indicates that this driver should be reactivated.")
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
    return Objects.equals(this.reactivate, reactivateDriverParam.reactivate);
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

