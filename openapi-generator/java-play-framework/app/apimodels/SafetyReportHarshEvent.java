package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * List of harsh events
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SafetyReportHarshEvent   {
  @JsonProperty("harshEventType")
  private String harshEventType;

  @JsonProperty("timestampMs")
  private Integer timestampMs;

  @JsonProperty("vehicleId")
  private Integer vehicleId;

  public SafetyReportHarshEvent harshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
    return this;
  }

   /**
   * Type of the harsh event
   * @return harshEventType
  **/
    public String getHarshEventType() {
    return harshEventType;
  }

  public void setHarshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
  }

  public SafetyReportHarshEvent timestampMs(Integer timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

   /**
   * Timestamp that the harsh event occurred in Unix milliseconds since epoch
   * @return timestampMs
  **/
    public Integer getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(Integer timestampMs) {
    this.timestampMs = timestampMs;
  }

  public SafetyReportHarshEvent vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Vehicle associated with the harsh event
   * @return vehicleId
  **/
    public Integer getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Integer vehicleId) {
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
    SafetyReportHarshEvent safetyReportHarshEvent = (SafetyReportHarshEvent) o;
    return Objects.equals(harshEventType, safetyReportHarshEvent.harshEventType) &&
        Objects.equals(timestampMs, safetyReportHarshEvent.timestampMs) &&
        Objects.equals(vehicleId, safetyReportHarshEvent.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(harshEventType, timestampMs, vehicleId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SafetyReportHarshEvent {\n");
    
    sb.append("    harshEventType: ").append(toIndentedString(harshEventType)).append("\n");
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
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

