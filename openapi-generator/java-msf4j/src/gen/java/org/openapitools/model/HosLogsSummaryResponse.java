package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.HosLogsSummaryResponseDrivers;

/**
 * HosLogsSummaryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class HosLogsSummaryResponse   {
  @JsonProperty("drivers")
  private List<HosLogsSummaryResponseDrivers> drivers = null;

  public HosLogsSummaryResponse drivers(List<HosLogsSummaryResponseDrivers> drivers) {
    this.drivers = drivers;
    return this;
  }

  public HosLogsSummaryResponse addDriversItem(HosLogsSummaryResponseDrivers driversItem) {
    if (this.drivers == null) {
      this.drivers = new ArrayList<HosLogsSummaryResponseDrivers>();
    }
    this.drivers.add(driversItem);
    return this;
  }

   /**
   * Get drivers
   * @return drivers
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.drivers, hosLogsSummaryResponse.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivers);
  }

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

