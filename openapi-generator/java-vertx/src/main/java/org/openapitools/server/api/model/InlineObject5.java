package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineObject5   {
  
  private Long endMs;
  private Long orgId;
  private Long startMs;

  public InlineObject5 () {

  }

  public InlineObject5 (Long endMs, Long orgId, Long startMs) {
    this.endMs = endMs;
    this.orgId = orgId;
    this.startMs = startMs;
  }

    
  @JsonProperty("endMs")
  public Long getEndMs() {
    return endMs;
  }
  public void setEndMs(Long endMs) {
    this.endMs = endMs;
  }

    
  @JsonProperty("orgId")
  public Long getOrgId() {
    return orgId;
  }
  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

    
  @JsonProperty("startMs")
  public Long getStartMs() {
    return startMs;
  }
  public void setStartMs(Long startMs) {
    this.startMs = startMs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject5 inlineObject5 = (InlineObject5) o;
    return Objects.equals(endMs, inlineObject5.endMs) &&
        Objects.equals(orgId, inlineObject5.orgId) &&
        Objects.equals(startMs, inlineObject5.startMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMs, orgId, startMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject5 {\n");
    
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
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
