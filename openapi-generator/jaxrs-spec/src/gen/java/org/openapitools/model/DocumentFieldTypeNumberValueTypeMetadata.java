package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 **/
@ApiModel(description = "Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.")
public class DocumentFieldTypeNumberValueTypeMetadata   {
  
  private @Valid Long numDecimalPlaces;

  /**
   * Number of decimal places that values for this field type can have.
   **/
  public DocumentFieldTypeNumberValueTypeMetadata numDecimalPlaces(Long numDecimalPlaces) {
    this.numDecimalPlaces = numDecimalPlaces;
    return this;
  }

  
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

