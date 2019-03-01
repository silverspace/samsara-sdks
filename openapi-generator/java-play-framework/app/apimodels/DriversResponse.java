package apimodels;

import apimodels.Driver;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DriversResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DriversResponse   {
  @JsonProperty("drivers")
  private List<Driver> drivers = null;

  public DriversResponse drivers(List<Driver> drivers) {
    this.drivers = drivers;
    return this;
  }

  public DriversResponse addDriversItem(Driver driversItem) {
    if (drivers == null) {
      drivers = new ArrayList<>();
    }
    drivers.add(driversItem);
    return this;
  }

   /**
   * Get drivers
   * @return drivers
  **/
  @Valid
  public List<Driver> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<Driver> drivers) {
    this.drivers = drivers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

