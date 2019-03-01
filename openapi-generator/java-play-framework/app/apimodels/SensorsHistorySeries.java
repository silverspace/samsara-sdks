package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Sensor ID and field to query.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SensorsHistorySeries   {
  /**
   * Field to query.
   */
  public enum FieldEnum {
    AMBIENTTEMPERATURE("ambientTemperature"),
    
    PROBETEMPERATURE("probeTemperature"),
    
    CURRENTLOOP1RAW("currentLoop1Raw"),
    
    CURRENTLOOP1MAPPED("currentLoop1Mapped"),
    
    CURRENTLOOP2RAW("currentLoop2Raw"),
    
    CURRENTLOOP2MAPPED("currentLoop2Mapped"),
    
    PMPOWERTOTAL("pmPowerTotal"),
    
    PMPHASE1POWER("pmPhase1Power"),
    
    PMPHASE2POWER("pmPhase2Power"),
    
    PMPHASE3POWER("pmPhase3Power"),
    
    PMPHASE1POWERFACTOR("pmPhase1PowerFactor"),
    
    PMPHASE2POWERFACTOR("pmPhase2PowerFactor"),
    
    PMPHASE3POWERFACTOR("pmPhase3PowerFactor");

    private final String value;

    FieldEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FieldEnum fromValue(String text) {
      for (FieldEnum b : FieldEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("field")
  private FieldEnum field;

  @JsonProperty("widgetId")
  private Long widgetId;

  public SensorsHistorySeries field(FieldEnum field) {
    this.field = field;
    return this;
  }

   /**
   * Field to query.
   * @return field
  **/
  @NotNull
  public FieldEnum getField() {
    return field;
  }

  public void setField(FieldEnum field) {
    this.field = field;
  }

  public SensorsHistorySeries widgetId(Long widgetId) {
    this.widgetId = widgetId;
    return this;
  }

   /**
   * Sensor ID to query.
   * @return widgetId
  **/
  @NotNull
  public Long getWidgetId() {
    return widgetId;
  }

  public void setWidgetId(Long widgetId) {
    this.widgetId = widgetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensorsHistorySeries sensorsHistorySeries = (SensorsHistorySeries) o;
    return Objects.equals(field, sensorsHistorySeries.field) &&
        Objects.equals(widgetId, sensorsHistorySeries.widgetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, widgetId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensorsHistorySeries {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    widgetId: ").append(toIndentedString(widgetId)).append("\n");
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

