package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DocumentFieldCreate;
import io.swagger.model.DocumentFieldCreatePhotoValue;
import io.swagger.model.ERRORUNKNOWN;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class DocumentField   {
  
  private Double numberValue = null;
  private List<DocumentFieldCreatePhotoValue> photoValue = new ArrayList<DocumentFieldCreatePhotoValue>();
  private String stringValue = null;
  private String valueType = null;
  private String label = null;
  private ERRORUNKNOWN value = null;

  /**
   * Value of this field if this document field has valueType: ValueType_Number.
   **/
  public DocumentField numberValue(Double numberValue) {
    this.numberValue = numberValue;
    return this;
  }

  
  @ApiModelProperty(example = "12.34", value = "Value of this field if this document field has valueType: ValueType_Number.")
  @JsonProperty("numberValue")
  public Double getNumberValue() {
    return numberValue;
  }
  public void setNumberValue(Double numberValue) {
    this.numberValue = numberValue;
  }

  /**
   * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
   **/
  public DocumentField photoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"url\":\"https://www.samsara.com/photo1\"},{\"url\":\"https://www.samsara.com/photo2\"}]", value = "Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.")
  @JsonProperty("photoValue")
  public List<DocumentFieldCreatePhotoValue> getPhotoValue() {
    return photoValue;
  }
  public void setPhotoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
  }

  /**
   * Value of this field if this document field has valueType: ValueType_String.
   **/
  public DocumentField stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  
  @ApiModelProperty(example = "This is a string.", value = "Value of this field if this document field has valueType: ValueType_String.")
  @JsonProperty("stringValue")
  public String getStringValue() {
    return stringValue;
  }
  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  /**
   * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
   **/
  public DocumentField valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  
  @ApiModelProperty(example = "ValueType_Number", required = true, value = "Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.")
  @JsonProperty("valueType")
  @NotNull
  public String getValueType() {
    return valueType;
  }
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  /**
   * Descriptive name of this field.
   **/
  public DocumentField label(String label) {
    this.label = label;
    return this;
  }

  
  @ApiModelProperty(example = "Fuel Cost ($)", required = true, value = "Descriptive name of this field.")
  @JsonProperty("label")
  @NotNull
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
   **/
  public DocumentField value(ERRORUNKNOWN value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "23.45", value = "DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.")
  @JsonProperty("value")
  public ERRORUNKNOWN getValue() {
    return value;
  }
  public void setValue(ERRORUNKNOWN value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentField documentField = (DocumentField) o;
    return Objects.equals(numberValue, documentField.numberValue) &&
        Objects.equals(photoValue, documentField.photoValue) &&
        Objects.equals(stringValue, documentField.stringValue) &&
        Objects.equals(valueType, documentField.valueType) &&
        Objects.equals(label, documentField.label) &&
        Objects.equals(value, documentField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberValue, photoValue, stringValue, valueType, label, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentField {\n");
    
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    photoValue: ").append(toIndentedString(photoValue)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

