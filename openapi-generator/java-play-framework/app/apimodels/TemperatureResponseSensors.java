package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * TemperatureResponseSensors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TemperatureResponseSensors   {
  @JsonProperty("probeTemperature")
  private Integer probeTemperature;

  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("ambientTemperature")
  private Integer ambientTemperature;

  public TemperatureResponseSensors probeTemperature(Integer probeTemperature) {
    this.probeTemperature = probeTemperature;
    return this;
  }

   /**
   * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
   * @return probeTemperature
  **/
    public Integer getProbeTemperature() {
    return probeTemperature;
  }

  public void setProbeTemperature(Integer probeTemperature) {
    this.probeTemperature = probeTemperature;
  }

  public TemperatureResponseSensors name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the sensor.
   * @return name
  **/
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TemperatureResponseSensors id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the sensor.
   * @return id
  **/
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TemperatureResponseSensors ambientTemperature(Integer ambientTemperature) {
    this.ambientTemperature = ambientTemperature;
    return this;
  }

   /**
   * Currently reported ambient temperature in millidegrees celsius.
   * @return ambientTemperature
  **/
    public Integer getAmbientTemperature() {
    return ambientTemperature;
  }

  public void setAmbientTemperature(Integer ambientTemperature) {
    this.ambientTemperature = ambientTemperature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemperatureResponseSensors temperatureResponseSensors = (TemperatureResponseSensors) o;
    return Objects.equals(probeTemperature, temperatureResponseSensors.probeTemperature) &&
        Objects.equals(name, temperatureResponseSensors.name) &&
        Objects.equals(id, temperatureResponseSensors.id) &&
        Objects.equals(ambientTemperature, temperatureResponseSensors.ambientTemperature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(probeTemperature, name, id, ambientTemperature);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemperatureResponseSensors {\n");
    
    sb.append("    probeTemperature: ").append(toIndentedString(probeTemperature)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ambientTemperature: ").append(toIndentedString(ambientTemperature)).append("\n");
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

