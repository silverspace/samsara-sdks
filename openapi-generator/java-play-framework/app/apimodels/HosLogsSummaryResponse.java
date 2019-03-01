package apimodels;

import apimodels.HosLogsSummaryResponseDrivers;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * HosLogsSummaryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class HosLogsSummaryResponse   {
  @JsonProperty("drivers")
  private List<HosLogsSummaryResponseDrivers> drivers = null;

  public HosLogsSummaryResponse drivers(List<HosLogsSummaryResponseDrivers> drivers) {
    this.drivers = drivers;
    return this;
  }

  public HosLogsSummaryResponse addDriversItem(HosLogsSummaryResponseDrivers driversItem) {
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
  public List<HosLogsSummaryResponseDrivers> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<HosLogsSummaryResponseDrivers> drivers) {
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
    HosLogsSummaryResponse hosLogsSummaryResponse = (HosLogsSummaryResponse) o;
    return Objects.equals(drivers, hosLogsSummaryResponse.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivers);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsSummaryResponse {\n");
    
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

