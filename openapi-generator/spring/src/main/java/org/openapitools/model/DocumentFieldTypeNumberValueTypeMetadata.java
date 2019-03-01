package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 */
@ApiModel(description = "Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class DocumentFieldTypeNumberValueTypeMetadata   {
  @JsonProperty("numDecimalPlaces")
  private Long numDecimalPlaces;

  public DocumentFieldTypeNumberValueTypeMetadata numDecimalPlaces(Long numDecimalPlaces) {
    this.numDecimalPlaces = numDecimalPlaces;
    return this;
  }

  /**
   * Number of decimal places that values for this field type can have.
   * @return numDecimalPlaces
  */
  @ApiModelProperty(example = "2", value = "Number of decimal places that values for this field type can have.")


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
    return Objects.equals(this.numDecimalPlaces, documentFieldTypeNumberValueTypeMetadata.numDecimalPlaces);
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

