package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DocumentFieldCreate;
import io.swagger.model.DocumentFieldCreatePhotoValue;
import io.swagger.model.ERRORUNKNOWN;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DocumentField
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class DocumentField   {
  @JsonProperty("numberValue")
  private Double numberValue = null;

  @JsonProperty("photoValue")
  @Valid
  private List<DocumentFieldCreatePhotoValue> photoValue = null;

  @JsonProperty("stringValue")
  private String stringValue = null;

  @JsonProperty("valueType")
  private String valueType = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("value")
  private ERRORUNKNOWN value = null;

  public DocumentField numberValue(Double numberValue) {
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

  public DocumentField photoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
    return this;
  }

  public DocumentField addPhotoValueItem(DocumentFieldCreatePhotoValue photoValueItem) {
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
  @ApiModelProperty(example = "[{\"url\":\"https://www.samsara.com/photo1\"},{\"url\":\"https://www.samsara.com/photo2\"}]", value = "Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.")

  @Valid

  public List<DocumentFieldCreatePhotoValue> getPhotoValue() {
    return photoValue;
  }

  public void setPhotoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
  }

  public DocumentField stringValue(String stringValue) {
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

  public DocumentField valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
   * @return valueType
  **/
  @ApiModelProperty(example = "ValueType_Number", required = true, value = "Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.")
  @NotNull


  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public DocumentField label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Descriptive name of this field.
   * @return label
  **/
  @ApiModelProperty(example = "Fuel Cost ($)", required = true, value = "Descriptive name of this field.")
  @NotNull


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DocumentField value(ERRORUNKNOWN value) {
    this.value = value;
    return this;
  }

  /**
   * DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
   * @return value
  **/
  @ApiModelProperty(example = "23.45", value = "DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.")

  @Valid

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
    return Objects.equals(this.numberValue, documentField.numberValue) &&
        Objects.equals(this.photoValue, documentField.photoValue) &&
        Objects.equals(this.stringValue, documentField.stringValue) &&
        Objects.equals(this.valueType, documentField.valueType) &&
        Objects.equals(this.label, documentField.label) &&
        Objects.equals(this.value, documentField.value);
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

