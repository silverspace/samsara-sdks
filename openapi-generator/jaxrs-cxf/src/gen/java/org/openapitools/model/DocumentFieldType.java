package org.openapitools.model;

import org.openapitools.model.DocumentFieldTypeNumberValueTypeMetadata;
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

public class DocumentFieldType  {
  
  @ApiModelProperty(example = "Fuel Cost ($)", required = true, value = "Descriptive name of this field type.")
 /**
   * Descriptive name of this field type.
  **/
  private String label;

  @ApiModelProperty(value = "")
  @Valid
  private DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata = null;

  @ApiModelProperty(example = "ValueType_Number", required = true, value = "The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.")
 /**
   * The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
  **/
  private String valueType;
 /**
   * Descriptive name of this field type.
   * @return label
  **/
  @JsonProperty("label")
  @NotNull
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DocumentFieldType label(String label) {
    this.label = label;
    return this;
  }

 /**
   * Get numberValueTypeMetadata
   * @return numberValueTypeMetadata
  **/
  @JsonProperty("numberValueTypeMetadata")
  public DocumentFieldTypeNumberValueTypeMetadata getNumberValueTypeMetadata() {
    return numberValueTypeMetadata;
  }

  public void setNumberValueTypeMetadata(DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata) {
    this.numberValueTypeMetadata = numberValueTypeMetadata;
  }

  public DocumentFieldType numberValueTypeMetadata(DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata) {
    this.numberValueTypeMetadata = numberValueTypeMetadata;
    return this;
  }

 /**
   * The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
   * @return valueType
  **/
  @JsonProperty("valueType")
  @NotNull
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public DocumentFieldType valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentFieldType {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    numberValueTypeMetadata: ").append(toIndentedString(numberValueTypeMetadata)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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

