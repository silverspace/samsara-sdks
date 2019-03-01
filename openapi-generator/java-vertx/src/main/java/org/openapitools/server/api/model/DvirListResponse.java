package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.DvirBase;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DvirListResponse   {
  
  private List<DvirBase> dvirs = new ArrayList<>();

  public DvirListResponse () {

  }

  public DvirListResponse (List<DvirBase> dvirs) {
    this.dvirs = dvirs;
  }

    
  @JsonProperty("dvirs")
  public List<DvirBase> getDvirs() {
    return dvirs;
  }
  public void setDvirs(List<DvirBase> dvirs) {
    this.dvirs = dvirs;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
