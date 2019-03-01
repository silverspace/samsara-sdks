package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * AssetReeferResponseReeferStatsSetPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssetReeferResponseReeferStatsSetPoint   {
  @JsonProperty("tempInMilliC")
  private Long tempInMilliC;

  @JsonProperty("changedAtMs")
  private Long changedAtMs;

  public AssetReeferResponseReeferStatsSetPoint tempInMilliC(Long tempInMilliC) {
    this.tempInMilliC = tempInMilliC;
    return this;
  }

   /**
   * Set point temperature in millidegree Celsius.
   * @return tempInMilliC
  **/
    public Long getTempInMilliC() {
    return tempInMilliC;
  }

  public void setTempInMilliC(Long tempInMilliC) {
    this.tempInMilliC = tempInMilliC;
  }

  public AssetReeferResponseReeferStatsSetPoint changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

   /**
   * Timestamp in Unix milliseconds since epoch.
   * @return changedAtMs
  **/
    public Long getChangedAtMs() {
    return changedAtMs;
  }

  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsSetPoint assetReeferResponseReeferStatsSetPoint = (AssetReeferResponseReeferStatsSetPoint) o;
    return Objects.equals(tempInMilliC, assetReeferResponseReeferStatsSetPoint.tempInMilliC) &&
        Objects.equals(changedAtMs, assetReeferResponseReeferStatsSetPoint.changedAtMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tempInMilliC, changedAtMs);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsSetPoint {\n");
    
    sb.append("    tempInMilliC: ").append(toIndentedString(tempInMilliC)).append("\n");
    sb.append("    changedAtMs: ").append(toIndentedString(changedAtMs)).append("\n");
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

