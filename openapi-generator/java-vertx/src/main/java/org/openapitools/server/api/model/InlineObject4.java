package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineObject4   {
  
  private Boolean reactivate;

  public InlineObject4 () {

  }

  public InlineObject4 (Boolean reactivate) {
    this.reactivate = reactivate;
  }

    
  @JsonProperty("reactivate")
  public Boolean getReactivate() {
    return reactivate;
  }
  public void setReactivate(Boolean reactivate) {
    this.reactivate = reactivate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject4 inlineObject4 = (InlineObject4) o;
    return Objects.equals(reactivate, inlineObject4.reactivate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reactivate);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
