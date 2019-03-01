package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DvirBase;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DvirListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class DvirListResponse   {
  @JsonProperty("dvirs")
  @Valid
  private List<DvirBase> dvirs = null;

  public DvirListResponse dvirs(List<DvirBase> dvirs) {
    this.dvirs = dvirs;
    return this;
  }

  public DvirListResponse addDvirsItem(DvirBase dvirsItem) {
    if (this.dvirs == null) {
      this.dvirs = new ArrayList<>();
    }
    this.dvirs.add(dvirsItem);
    return this;
  }

  /**
   * Get dvirs
   * @return dvirs
  */
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.dvirs, dvirListResponse.dvirs);
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

