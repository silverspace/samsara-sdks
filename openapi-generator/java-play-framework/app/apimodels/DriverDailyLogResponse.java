package apimodels;

import apimodels.DriverDailyLogResponseDays;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DriverDailyLogResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DriverDailyLogResponse   {
  @JsonProperty("days")
  private List<DriverDailyLogResponseDays> days = null;

  public DriverDailyLogResponse days(List<DriverDailyLogResponseDays> days) {
    this.days = days;
    return this;
  }

  public DriverDailyLogResponse addDaysItem(DriverDailyLogResponseDays daysItem) {
    if (days == null) {
      days = new ArrayList<>();
    }
    days.add(daysItem);
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @Valid
  public List<DriverDailyLogResponseDays> getDays() {
    return days;
  }

  public void setDays(List<DriverDailyLogResponseDays> days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverDailyLogResponse driverDailyLogResponse = (DriverDailyLogResponse) o;
    return Objects.equals(days, driverDailyLogResponse.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

