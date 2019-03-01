package io.swagger.model;

import io.swagger.model.DriversSummaryResponseSummaries;
import java.util.ArrayList;
import java.util.List;
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

public class DriversSummaryResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<DriversSummaryResponseSummaries> summaries = null;
 /**
   * Get summaries
   * @return summaries
  **/
  @JsonProperty("Summaries")
  public List<DriversSummaryResponseSummaries> getSummaries() {
    return summaries;
  }

  public void setSummaries(List<DriversSummaryResponseSummaries> summaries) {
    this.summaries = summaries;
  }

  public DriversSummaryResponse summaries(List<DriversSummaryResponseSummaries> summaries) {
    this.summaries = summaries;
    return this;
  }

  public DriversSummaryResponse addSummariesItem(DriversSummaryResponseSummaries summariesItem) {
    this.summaries.add(summariesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriversSummaryResponse {\n");
    
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
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

