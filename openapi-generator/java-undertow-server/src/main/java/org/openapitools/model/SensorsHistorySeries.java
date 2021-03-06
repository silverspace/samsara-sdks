package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Sensor ID and field to query.
 **/

@ApiModel(description = "Sensor ID and field to query.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-03-01T05:34:49.851Z[GMT]")
public class SensorsHistorySeries   {
  


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

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FieldEnum field;
  private Long widgetId;

  /**
   * Field to query.
   **/
  public SensorsHistorySeries field(FieldEnum field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(example = "ambientTemperature", required = true, value = "Field to query.")
  @JsonProperty("field")
  public FieldEnum getField() {
    return field;
  }
  public void setField(FieldEnum field) {
    this.field = field;
  }

  /**
   * Sensor ID to query.
   **/
  public SensorsHistorySeries widgetId(Long widgetId) {
    this.widgetId = widgetId;
    return this;
  }

  
  @ApiModelProperty(example = "1", required = true, value = "Sensor ID to query.")
  @JsonProperty("widgetId")
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

