package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineObject5
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineObject5   {
  @JsonProperty("endMs")
  private Long endMs;

  @JsonProperty("orgId")
  private Long orgId;

  @JsonProperty("startMs")
  private Long startMs;

  public InlineObject5 endMs(Long endMs) {
    this.endMs = endMs;
    return this;
  }

   /**
   * End time (ms) of queried time period.
   * @return endMs
  **/
  @NotNull
  public Long getEndMs() {
    return endMs;
  }

  public void setEndMs(Long endMs) {
    this.endMs = endMs;
  }

  public InlineObject5 orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Org ID to query.
   * @return orgId
  **/
  @NotNull
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public InlineObject5 startMs(Long startMs) {
    this.startMs = startMs;
    return this;
  }

   /**
   * Start time (ms) of queried time period.
   * @return startMs
  **/
  @NotNull
  public Long getStartMs() {
    return startMs;
  }

  public void setStartMs(Long startMs) {
    this.startMs = startMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

