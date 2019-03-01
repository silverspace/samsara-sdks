package io.swagger.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 **/
@ApiModel(description="Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.")
public class DocumentFieldTypeNumberValueTypeMetadata  {
  
  @ApiModelProperty(example = "2", value = "Number of decimal places that values for this field type can have.")
 /**
   * Number of decimal places that values for this field type can have.
  **/
  private Long numDecimalPlaces = null;
 /**
   * Number of decimal places that values for this field type can have.
   * @return numDecimalPlaces
  **/
  @JsonProperty("numDecimalPlaces")
  public Long getNumDecimalPlaces() {
    return numDecimalPlaces;
  }

  public void setNumDecimalPlaces(Long numDecimalPlaces) {
    this.numDecimalPlaces = numDecimalPlaces;
  }

  public DocumentFieldTypeNumberValueTypeMetadata numDecimalPlaces(Long numDecimalPlaces) {
    this.numDecimalPlaces = numDecimalPlaces;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

