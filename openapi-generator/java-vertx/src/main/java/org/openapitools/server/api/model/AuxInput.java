package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Digital value of an aux input.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AuxInput   {
  
  private Object timeMs;
  private Boolean value;

  public AuxInput () {

  }

  public AuxInput (Object timeMs, Boolean value) {
    this.timeMs = timeMs;
    this.value = value;
  }

    
  @JsonProperty("timeMs")
  public Object getTimeMs() {
    return timeMs;
  }
  public void setTimeMs(Object timeMs) {
    this.timeMs = timeMs;
  }

    
  @JsonProperty("value")
  public Boolean getValue() {
    return value;
  }
  public void setValue(Boolean value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuxInput auxInput = (AuxInput) o;
    return Objects.equals(timeMs, auxInput.timeMs) &&
        Objects.equals(value, auxInput.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeMs, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuxInput {\n");
    
    sb.append("    timeMs: ").append(toIndentedString(timeMs)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
