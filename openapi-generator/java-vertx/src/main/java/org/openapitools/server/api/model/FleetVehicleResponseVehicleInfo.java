package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class FleetVehicleResponseVehicleInfo   {
  
  private Long year;
  private String model;
  private String vin;
  private String make;

  public FleetVehicleResponseVehicleInfo () {

  }

  public FleetVehicleResponseVehicleInfo (Long year, String model, String vin, String make) {
    this.year = year;
    this.model = model;
    this.vin = vin;
    this.make = make;
  }

    
  @JsonProperty("year")
  public Long getYear() {
    return year;
  }
  public void setYear(Long year) {
    this.year = year;
  }

    
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

    
  @JsonProperty("vin")
  public String getVin() {
    return vin;
  }
  public void setVin(String vin) {
    this.vin = vin;
  }

    
  @JsonProperty("make")
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo = (FleetVehicleResponseVehicleInfo) o;
    return Objects.equals(year, fleetVehicleResponseVehicleInfo.year) &&
        Objects.equals(model, fleetVehicleResponseVehicleInfo.model) &&
        Objects.equals(vin, fleetVehicleResponseVehicleInfo.vin) &&
        Objects.equals(make, fleetVehicleResponseVehicleInfo.make);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, model, vin, make);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetVehicleResponseVehicleInfo {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
