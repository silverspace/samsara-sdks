package apimodels;

import apimodels.AssetReeferResponseReeferStatsAlarms;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * AssetReeferResponseReeferStatsAlarms1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssetReeferResponseReeferStatsAlarms1   {
  @JsonProperty("alarms")
  private List<AssetReeferResponseReeferStatsAlarms> alarms = null;

  @JsonProperty("changedAtMs")
  private Long changedAtMs;

  public AssetReeferResponseReeferStatsAlarms1 alarms(List<AssetReeferResponseReeferStatsAlarms> alarms) {
    this.alarms = alarms;
    return this;
  }

  public AssetReeferResponseReeferStatsAlarms1 addAlarmsItem(AssetReeferResponseReeferStatsAlarms alarmsItem) {
    if (alarms == null) {
      alarms = new ArrayList<>();
    }
    alarms.add(alarmsItem);
    return this;
  }

   /**
   * Get alarms
   * @return alarms
  **/
  @Valid
  public List<AssetReeferResponseReeferStatsAlarms> getAlarms() {
    return alarms;
  }

  public void setAlarms(List<AssetReeferResponseReeferStatsAlarms> alarms) {
    this.alarms = alarms;
  }

  public AssetReeferResponseReeferStatsAlarms1 changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

   /**
   * Timestamp when the alarms were reported, in Unix milliseconds since epoch
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
    AssetReeferResponseReeferStatsAlarms1 assetReeferResponseReeferStatsAlarms1 = (AssetReeferResponseReeferStatsAlarms1) o;
    return Objects.equals(alarms, assetReeferResponseReeferStatsAlarms1.alarms) &&
        Objects.equals(changedAtMs, assetReeferResponseReeferStatsAlarms1.changedAtMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarms, changedAtMs);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsAlarms1 {\n");
    
    sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
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

