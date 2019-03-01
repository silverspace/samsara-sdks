package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DocumentFieldCreatePhotoValue;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class DocumentFieldCreate   {
  
  private Double numberValue;

  private List<DocumentFieldCreatePhotoValue> photoValue = null;

  private String stringValue;

  private String valueType;


  /**
   * Value of this field if this document field has valueType: ValueType_Number.
   **/
  public DocumentFieldCreate numberValue(Double numberValue) {
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
  public DocumentFieldCreate photoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
    return this;
  }

  
  @ApiModelProperty(example = "[{url=https://www.samsara.com/photo1}, {url=https://www.samsara.com/photo2}]", value = "Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.")
  @JsonProperty("photoValue")
  public List<DocumentFieldCreatePhotoValue> getPhotoValue() {
    return photoValue;
  }
  public void setPhotoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
  }

  public DocumentFieldCreate addPhotoValueItem(DocumentFieldCreatePhotoValue photoValueItem) {
    if (this.photoValue == null) {
      this.photoValue = new ArrayList<DocumentFieldCreatePhotoValue>();
    }
    this.photoValue.add(photoValueItem);
    return this;
  }


  /**
   * Value of this field if this document field has valueType: ValueType_String.
   **/
  public DocumentFieldCreate stringValue(String stringValue) {
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
  public DocumentFieldCreate valueType(String valueType) {
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



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentFieldCreate documentFieldCreate = (DocumentFieldCreate) o;
    return Objects.equals(numberValue, documentFieldCreate.numberValue) &&
        Objects.equals(photoValue, documentFieldCreate.photoValue) &&
        Objects.equals(stringValue, documentFieldCreate.stringValue) &&
        Objects.equals(valueType, documentFieldCreate.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberValue, photoValue, stringValue, valueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentFieldCreate {\n");
    
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    photoValue: ").append(toIndentedString(photoValue)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
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

