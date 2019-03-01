package apimodels;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineObject16
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineObject16   {
  @JsonProperty("externalIds")
  private Map<String, String> externalIds = null;

  @JsonProperty("harsh_accel_setting")
  private Integer harshAccelSetting;

  @JsonProperty("name")
  private String name;

  public InlineObject16 externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public InlineObject16 putExternalIdsItem(String key, String externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new HashMap<>();
    }
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

   /**
   * Get externalIds
   * @return externalIds
  **/
    public Map<String, String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  public InlineObject16 harshAccelSetting(Integer harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
    return this;
  }

   /**
   * Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
   * @return harshAccelSetting
  **/
    public Integer getHarshAccelSetting() {
    return harshAccelSetting;
  }

  public void setHarshAccelSetting(Integer harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
  }

  public InlineObject16 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject16 inlineObject16 = (InlineObject16) o;
    return Objects.equals(externalIds, inlineObject16.externalIds) &&
        Objects.equals(harshAccelSetting, inlineObject16.harshAccelSetting) &&
        Objects.equals(name, inlineObject16.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIds, harshAccelSetting, name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject16 {\n");
    
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    harshAccelSetting: ").append(toIndentedString(harshAccelSetting)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

