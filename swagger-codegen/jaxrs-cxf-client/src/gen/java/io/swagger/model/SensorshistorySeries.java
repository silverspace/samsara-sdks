package io.swagger.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Sensor ID and field to query.
 **/
@ApiModel(description="Sensor ID and field to query.")
public class SensorshistorySeries  {
  

@XmlType(name="FieldEnum")
@XmlEnum(String.class)
public enum FieldEnum {

@XmlEnumValue("ambientTemperature") AMBIENTTEMPERATURE(String.valueOf("ambientTemperature")), @XmlEnumValue("probeTemperature") PROBETEMPERATURE(String.valueOf("probeTemperature")), @XmlEnumValue("currentLoop1Raw") CURRENTLOOP1RAW(String.valueOf("currentLoop1Raw")), @XmlEnumValue("currentLoop1Mapped") CURRENTLOOP1MAPPED(String.valueOf("currentLoop1Mapped")), @XmlEnumValue("currentLoop2Raw") CURRENTLOOP2RAW(String.valueOf("currentLoop2Raw")), @XmlEnumValue("currentLoop2Mapped") CURRENTLOOP2MAPPED(String.valueOf("currentLoop2Mapped")), @XmlEnumValue("pmPowerTotal") PMPOWERTOTAL(String.valueOf("pmPowerTotal")), @XmlEnumValue("pmPhase1Power") PMPHASE1POWER(String.valueOf("pmPhase1Power")), @XmlEnumValue("pmPhase2Power") PMPHASE2POWER(String.valueOf("pmPhase2Power")), @XmlEnumValue("pmPhase3Power") PMPHASE3POWER(String.valueOf("pmPhase3Power")), @XmlEnumValue("pmPhase1PowerFactor") PMPHASE1POWERFACTOR(String.valueOf("pmPhase1PowerFactor")), @XmlEnumValue("pmPhase2PowerFactor") PMPHASE2POWERFACTOR(String.valueOf("pmPhase2PowerFactor")), @XmlEnumValue("pmPhase3PowerFactor") PMPHASE3POWERFACTOR(String.valueOf("pmPhase3PowerFactor"));


    private String value;

    FieldEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FieldEnum fromValue(String v) {
        for (FieldEnum b : FieldEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "ambientTemperature", required = true, value = "Field to query.")
 /**
   * Field to query.
  **/
  private FieldEnum field = null;

  @ApiModelProperty(example = "1", required = true, value = "Sensor ID to query.")
 /**
   * Sensor ID to query.
  **/
  private Long widgetId = null;
 /**
   * Field to query.
   * @return field
  **/
  @JsonProperty("field")
  public String getField() {
    if (field == null) {
      return null;
    }
    return field.value();
  }

  public void setField(FieldEnum field) {
    this.field = field;
  }

  public SensorshistorySeries field(FieldEnum field) {
    this.field = field;
    return this;
  }

 /**
   * Sensor ID to query.
   * @return widgetId
  **/
  @JsonProperty("widgetId")
  public Long getWidgetId() {
    return widgetId;
  }

  public void setWidgetId(Long widgetId) {
    this.widgetId = widgetId;
  }

  public SensorshistorySeries widgetId(Long widgetId) {
    this.widgetId = widgetId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

