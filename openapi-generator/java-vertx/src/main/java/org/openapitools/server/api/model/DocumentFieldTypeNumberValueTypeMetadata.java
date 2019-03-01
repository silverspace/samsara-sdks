package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DocumentFieldTypeNumberValueTypeMetadata   {
  
  private Long numDecimalPlaces;

  public DocumentFieldTypeNumberValueTypeMetadata () {

  }

  public DocumentFieldTypeNumberValueTypeMetadata (Long numDecimalPlaces) {
    this.numDecimalPlaces = numDecimalPlaces;
  }

    
  @JsonProperty("numDecimalPlaces")
  public Long getNumDecimalPlaces() {
    return numDecimalPlaces;
  }
  public void setNumDecimalPlaces(Long numDecimalPlaces) {
    this.numDecimalPlaces = numDecimalPlaces;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
