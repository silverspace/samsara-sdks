package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineObject15
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineObject15   {
  @JsonProperty("endMs")
  private Integer endMs;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("startMs")
  private Integer startMs;

  @JsonProperty("vehicleId")
  private Long vehicleId;

  public InlineObject15 endMs(Integer endMs) {
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

  public InlineObject15 groupId(Long groupId) {
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

  public InlineObject15 startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

   /**
   * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
   * @return startMs
  **/
  @NotNull
  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  public InlineObject15 vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Vehicle ID to query.
   * @return vehicleId
  **/
  @NotNull
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject15 inlineObject15 = (InlineObject15) o;
    return Objects.equals(endMs, inlineObject15.endMs) &&
        Objects.equals(groupId, inlineObject15.groupId) &&
        Objects.equals(startMs, inlineObject15.startMs) &&
        Objects.equals(vehicleId, inlineObject15.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMs, groupId, startMs, vehicleId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject15 {\n");
    
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
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

