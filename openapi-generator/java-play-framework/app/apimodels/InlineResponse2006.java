package apimodels;

import apimodels.DataInputHistoryResponse;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineResponse2006
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineResponse2006   {
  @JsonProperty("dataInputs")
  private List<DataInputHistoryResponse> dataInputs = null;

  public InlineResponse2006 dataInputs(List<DataInputHistoryResponse> dataInputs) {
    this.dataInputs = dataInputs;
    return this;
  }

  public InlineResponse2006 addDataInputsItem(DataInputHistoryResponse dataInputsItem) {
    if (dataInputs == null) {
      dataInputs = new ArrayList<>();
    }
    dataInputs.add(dataInputsItem);
    return this;
  }

   /**
   * Get dataInputs
   * @return dataInputs
  **/
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
    return Objects.equals(dataInputs, inlineResponse2006.dataInputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataInputs);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

