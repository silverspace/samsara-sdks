package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DocumentFieldCreatePhotoValue;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentFieldCreate  {
  
  @ApiModelProperty(example = "12.34", value = "Value of this field if this document field has valueType: ValueType_Number.")
 /**
   * Value of this field if this document field has valueType: ValueType_Number.
  **/
  private Double numberValue;

  @ApiModelProperty(example = "[{url=https://www.samsara.com/photo1}, {url=https://www.samsara.com/photo2}]", value = "Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.")
 /**
   * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
  **/
  private List<DocumentFieldCreatePhotoValue> photoValue = null;

  @ApiModelProperty(example = "This is a string.", value = "Value of this field if this document field has valueType: ValueType_String.")
 /**
   * Value of this field if this document field has valueType: ValueType_String.
  **/
  private String stringValue;

  @ApiModelProperty(example = "ValueType_Number", required = true, value = "Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.")
 /**
   * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
  **/
  private String valueType;
 /**
   * Value of this field if this document field has valueType: ValueType_Number.
   * @return numberValue
  **/
  @JsonProperty("numberValue")
  public Double getNumberValue() {
    return numberValue;
  }

  public void setNumberValue(Double numberValue) {
    this.numberValue = numberValue;
  }

  public DocumentFieldCreate numberValue(Double numberValue) {
    this.numberValue = numberValue;
    return this;
  }

 /**
   * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
   * @return photoValue
  **/
  @JsonProperty("photoValue")
  public List<DocumentFieldCreatePhotoValue> getPhotoValue() {
    return photoValue;
  }

  public void setPhotoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
  }

  public DocumentFieldCreate photoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
    return this;
  }

  public DocumentFieldCreate addPhotoValueItem(DocumentFieldCreatePhotoValue photoValueItem) {
    this.photoValue.add(photoValueItem);
    return this;
  }

 /**
   * Value of this field if this document field has valueType: ValueType_String.
   * @return stringValue
  **/
  @JsonProperty("stringValue")
  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  public DocumentFieldCreate stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

 /**
   * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
   * @return valueType
  **/
  @JsonProperty("valueType")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public DocumentFieldCreate valueType(String valueType) {
    this.valueType = valueType;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

