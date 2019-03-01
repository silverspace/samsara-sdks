package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DataInputHistoryResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2006
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class InlineResponse2006   {
  @JsonProperty("dataInputs")
  @Valid
  private List<DataInputHistoryResponse> dataInputs = null;

  public InlineResponse2006 dataInputs(List<DataInputHistoryResponse> dataInputs) {
    this.dataInputs = dataInputs;
    return this;
  }

  public InlineResponse2006 addDataInputsItem(DataInputHistoryResponse dataInputsItem) {
    if (this.dataInputs == null) {
      this.dataInputs = new ArrayList<DataInputHistoryResponse>();
    }
    this.dataInputs.add(dataInputsItem);
    return this;
  }

  /**
   * Get dataInputs
   * @return dataInputs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DataInputHistoryResponse> getDataInputs() {
    return dataInputs;
  }

  public void setDataInputs(List<DataInputHistoryResponse> dataInputs) {
    this.dataInputs = dataInputs;
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
    return Objects.equals(this.dataInputs, inlineResponse2006.dataInputs);
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

