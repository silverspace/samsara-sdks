package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sensor ID and field to query.
 */
@ApiModel(description = "Sensor ID and field to query.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class SensorshistorySeries   {
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

    private String value;

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
      return null;
    }
  }

  @JsonProperty("field")
  private FieldEnum field = null;

  @JsonProperty("widgetId")
  private Long widgetId = null;

  public SensorshistorySeries field(FieldEnum field) {
    this.field = field;
    return this;
  }

  /**
   * Field to query.
   * @return field
  **/
  @ApiModelProperty(example = "ambientTemperature", required = true, value = "Field to query.")
  @NotNull


  public FieldEnum getField() {
    return field;
  }

  public void setField(FieldEnum field) {
    this.field = field;
  }

  public SensorshistorySeries widgetId(Long widgetId) {
    this.widgetId = widgetId;
    return this;
  }

  /**
   * Sensor ID to query.
   * @return widgetId
  **/
  @ApiModelProperty(example = "1", required = true, value = "Sensor ID to query.")
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
    SensorshistorySeries sensorshistorySeries = (SensorshistorySeries) o;
    return Objects.equals(this.field, sensorshistorySeries.field) &&
        Objects.equals(this.widgetId, sensorshistorySeries.widgetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, widgetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensorshistorySeries {\n");
    
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

