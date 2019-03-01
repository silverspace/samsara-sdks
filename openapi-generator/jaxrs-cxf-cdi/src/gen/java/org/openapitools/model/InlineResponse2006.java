package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DataInputHistoryResponse;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class InlineResponse2006   {
  
  private List<DataInputHistoryResponse> dataInputs = null;


  /**
   **/
  public InlineResponse2006 dataInputs(List<DataInputHistoryResponse> dataInputs) {
    this.dataInputs = dataInputs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dataInputs")
  public List<DataInputHistoryResponse> getDataInputs() {
    return dataInputs;
  }
  public void setDataInputs(List<DataInputHistoryResponse> dataInputs) {
    this.dataInputs = dataInputs;
  }

  public InlineResponse2006 addDataInputsItem(DataInputHistoryResponse dataInputsItem) {
    if (this.dataInputs == null) {
      this.dataInputs = new ArrayList<DataInputHistoryResponse>();
    }
    this.dataInputs.add(dataInputsItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(dataInputs, inlineResponse2006.dataInputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataInputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    dataInputs: ").append(toIndentedString(dataInputs)).append("\n");
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

