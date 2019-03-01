package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.DocumentFieldTypeNumberValueTypeMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DocumentFieldType
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class DocumentFieldType   {
  @JsonProperty("label")
  private String label;

  @JsonProperty("numberValueTypeMetadata")
  private DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata = null;

  @JsonProperty("valueType")
  private String valueType;

  public DocumentFieldType label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Descriptive name of this field type.
   * @return label
  **/
  @ApiModelProperty(example = "Fuel Cost ($)", required = true, value = "Descriptive name of this field type.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DocumentFieldType numberValueTypeMetadata(DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata) {
    this.numberValueTypeMetadata = numberValueTypeMetadata;
    return this;
  }

   /**
   * Get numberValueTypeMetadata
   * @return numberValueTypeMetadata
  **/
  @ApiModelProperty(value = "")
  public DocumentFieldTypeNumberValueTypeMetadata getNumberValueTypeMetadata() {
    return numberValueTypeMetadata;
  }

  public void setNumberValueTypeMetadata(DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata) {
    this.numberValueTypeMetadata = numberValueTypeMetadata;
  }

  public DocumentFieldType valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
   * @return valueType
  **/
  @ApiModelProperty(example = "ValueType_Number", required = true, value = "The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentFieldType documentFieldType = (DocumentFieldType) o;
    return Objects.equals(this.label, documentFieldType.label) &&
        Objects.equals(this.numberValueTypeMetadata, documentFieldType.numberValueTypeMetadata) &&
        Objects.equals(this.valueType, documentFieldType.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, numberValueTypeMetadata, valueType);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

