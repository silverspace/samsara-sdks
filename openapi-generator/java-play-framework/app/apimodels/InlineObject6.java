package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineObject6
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineObject6   {
  @JsonProperty("driverId")
  private Long driverId;

  @JsonProperty("endMs")
  private Integer endMs;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("startMs")
  private Integer startMs;

  public InlineObject6 driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * Driver ID to query.
   * @return driverId
  **/
  @NotNull
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public InlineObject6 endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

   /**
   * End of the time range, specified in milliseconds UNIX time.
   * @return endMs
  **/
  @NotNull
  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public InlineObject6 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group ID to query.
   * @return groupId
  **/
  @NotNull
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public InlineObject6 startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

   /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   * @return startMs
  **/
  @NotNull
  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
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
    InlineObject6 inlineObject6 = (InlineObject6) o;
    return Objects.equals(driverId, inlineObject6.driverId) &&
        Objects.equals(endMs, inlineObject6.endMs) &&
        Objects.equals(groupId, inlineObject6.groupId) &&
        Objects.equals(startMs, inlineObject6.startMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, endMs, groupId, startMs);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject6 {\n");
    
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

