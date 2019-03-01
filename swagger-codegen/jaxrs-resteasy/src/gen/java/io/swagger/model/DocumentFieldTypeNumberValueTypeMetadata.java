package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class DocumentFieldTypeNumberValueTypeMetadata   {
  
  private Long numDecimalPlaces = null;

  /**
   * Number of decimal places that values for this field type can have.
   **/
  
  @ApiModelProperty(example = "2", value = "Number of decimal places that values for this field type can have.")
  @JsonProperty("numDecimalPlaces")
  public Long getNumDecimalPlaces() {
    return numDecimalPlaces;
  }
  public void setNumDecimalPlaces(Long numDecimalPlaces) {
    this.numDecimalPlaces = numDecimalPlaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentFieldTypeNumberValueTypeMetadata documentFieldTypeNumberValueTypeMetadata = (DocumentFieldTypeNumberValueTypeMetadata) o;
    return Objects.equals(numDecimalPlaces, documentFieldTypeNumberValueTypeMetadata.numDecimalPlaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numDecimalPlaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentFieldTypeNumberValueTypeMetadata {\n");
    
    sb.append("    numDecimalPlaces: ").append(toIndentedString(numDecimalPlaces)).append("\n");
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

