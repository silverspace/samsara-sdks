package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AuxInput;



/**
 * A list of aux input values over a timerange.
 **/

@ApiModel(description = "A list of aux input values over a timerange.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class AuxInputSeries   {
  /**
   * The name of the aux input.
   */
  public enum NameEnum {
    EMERGENCY_LIGHTS("Emergency Lights"),
    
    EMERGENCY_ALARM("Emergency Alarm"),
    
    STOP_PADDLE("Stop Paddle"),
    
    POWER_TAKE_OFF("Power Take-Off"),
    
    PLOW("Plow"),
    
    SWEEPER("Sweeper"),
    
    SALTER("Salter"),
    
    BOOM("Boom");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("name")
  private NameEnum name;

  @JsonProperty("values")
  private List<AuxInput> values = new ArrayList<AuxInput>();

  /**
   * The name of the aux input.
   **/
  public AuxInputSeries name(NameEnum name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Boom", required = true, value = "The name of the aux input.")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }

  /**
   **/
  public AuxInputSeries values(List<AuxInput> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  public List<AuxInput> getValues() {
    return values;
  }
  public void setValues(List<AuxInput> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuxInputSeries auxInputSeries = (AuxInputSeries) o;
    return Objects.equals(name, auxInputSeries.name) &&
        Objects.equals(values, auxInputSeries.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuxInputSeries {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

