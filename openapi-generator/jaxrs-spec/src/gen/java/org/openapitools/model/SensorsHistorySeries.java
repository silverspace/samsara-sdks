package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Sensor ID and field to query.
 **/
@ApiModel(description = "Sensor ID and field to query.")
public class SensorsHistorySeries   {
  

public enum FieldEnum {

    AMBIENTTEMPERATURE(String.valueOf("ambientTemperature")), PROBETEMPERATURE(String.valueOf("probeTemperature")), CURRENTLOOP1RAW(String.valueOf("currentLoop1Raw")), CURRENTLOOP1MAPPED(String.valueOf("currentLoop1Mapped")), CURRENTLOOP2RAW(String.valueOf("currentLoop2Raw")), CURRENTLOOP2MAPPED(String.valueOf("currentLoop2Mapped")), PMPOWERTOTAL(String.valueOf("pmPowerTotal")), PMPHASE1POWER(String.valueOf("pmPhase1Power")), PMPHASE2POWER(String.valueOf("pmPhase2Power")), PMPHASE3POWER(String.valueOf("pmPhase3Power")), PMPHASE1POWERFACTOR(String.valueOf("pmPhase1PowerFactor")), PMPHASE2POWERFACTOR(String.valueOf("pmPhase2PowerFactor")), PMPHASE3POWERFACTOR(String.valueOf("pmPhase3PowerFactor"));


    private String value;

    FieldEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static FieldEnum fromValue(String v) {
        for (FieldEnum b : FieldEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  private @Valid FieldEnum field;
  private @Valid Long widgetId;

  /**
   * Field to query.
   **/
  public SensorsHistorySeries field(FieldEnum field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(example = "ambientTemperature", required = true, value = "Field to query.")
  @JsonProperty("field")
  @NotNull
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

