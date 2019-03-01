package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DriverDailyLogResponseDays;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DriverDailyLogResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<DriverDailyLogResponseDays> days = null;
 /**
   * Get days
   * @return days
  **/
  @JsonProperty("days")
  public List<DriverDailyLogResponseDays> getDays() {
    return days;
  }

  public void setDays(List<DriverDailyLogResponseDays> days) {
    this.days = days;
  }

  public DriverDailyLogResponse days(List<DriverDailyLogResponseDays> days) {
    this.days = days;
    return this;
  }

  public DriverDailyLogResponse addDaysItem(DriverDailyLogResponseDays daysItem) {
    this.days.add(daysItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverDailyLogResponse {\n");
    
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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

