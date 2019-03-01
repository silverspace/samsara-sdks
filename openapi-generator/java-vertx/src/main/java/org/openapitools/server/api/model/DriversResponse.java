package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.Driver;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DriversResponse   {
  
  private List<Driver> drivers = new ArrayList<>();

  public DriversResponse () {

  }

  public DriversResponse (List<Driver> drivers) {
    this.drivers = drivers;
  }

    
  @JsonProperty("drivers")
  public List<Driver> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<Driver> drivers) {
    this.drivers = drivers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriversResponse driversResponse = (DriversResponse) o;
    return Objects.equals(drivers, driversResponse.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriversResponse {\n");
    
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
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
