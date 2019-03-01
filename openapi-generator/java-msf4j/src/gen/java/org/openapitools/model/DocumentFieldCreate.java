package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DocumentFieldCreatePhotoValue;

/**
 * DocumentFieldCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class DocumentFieldCreate   {
  @JsonProperty("numberValue")
  private Double numberValue;

  @JsonProperty("photoValue")
  private List<DocumentFieldCreatePhotoValue> photoValue = null;

  @JsonProperty("stringValue")
  private String stringValue;

  @JsonProperty("valueType")
  private String valueType;

  public DocumentFieldCreate numberValue(Double numberValue) {
    this.numberValue = numberValue;
    return this;
  }

   /**
   * Value of this field if this document field has valueType: ValueType_Number.
   * @return numberValue
  **/
  @ApiModelProperty(example = "12.34", value = "Value of this field if this document field has valueType: ValueType_Number.")
  public Double getNumberValue() {
    return numberValue;
  }

  public void setNumberValue(Double numberValue) {
    this.numberValue = numberValue;
  }

  public DocumentFieldCreate photoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
    return this;
  }

  public DocumentFieldCreate addPhotoValueItem(DocumentFieldCreatePhotoValue photoValueItem) {
    if (this.photoValue == null) {
      this.photoValue = new ArrayList<DocumentFieldCreatePhotoValue>();
    }
    this.photoValue.add(photoValueItem);
    return this;
  }

   /**
   * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
   * @return photoValue
  **/
  @ApiModelProperty(example = "[{url=https://www.samsara.com/photo1}, {url=https://www.samsara.com/photo2}]", value = "Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.")
  public List<DocumentFieldCreatePhotoValue> getPhotoValue() {
    return photoValue;
  }

  public void setPhotoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
  }

  public DocumentFieldCreate stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

   /**
   * Value of this field if this document field has valueType: ValueType_String.
   * @return stringValue
  **/
  @ApiModelProperty(example = "This is a string.", value = "Value of this field if this document field has valueType: ValueType_String.")
  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  public DocumentFieldCreate valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
   * @return valueType
  **/
  @ApiModelProperty(example = "ValueType_Number", required = true, value = "Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.")
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
    return Objects.equals(this.numberValue, documentFieldCreate.numberValue) &&
        Objects.equals(this.photoValue, documentFieldCreate.photoValue) &&
        Objects.equals(this.stringValue, documentFieldCreate.stringValue) &&
        Objects.equals(this.valueType, documentFieldCreate.valueType);
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

