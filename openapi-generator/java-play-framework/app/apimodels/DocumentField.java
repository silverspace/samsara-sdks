package apimodels;

import apimodels.DocumentFieldCreate;
import apimodels.DocumentFieldCreatePhotoValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DocumentField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DocumentField   {
  @JsonProperty("numberValue")
  private Double numberValue;

  @JsonProperty("photoValue")
  private List<DocumentFieldCreatePhotoValue> photoValue = null;

  @JsonProperty("stringValue")
  private String stringValue;

  @JsonProperty("valueType")
  private String valueType;

  @JsonProperty("label")
  private String label;

  @JsonProperty("value")
  private Object value = null;

  public DocumentField numberValue(Double numberValue) {
    this.numberValue = numberValue;
    return this;
  }

   /**
   * Value of this field if this document field has valueType: ValueType_Number.
   * @return numberValue
  **/
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
    if (photoValue == null) {
      photoValue = new ArrayList<>();
    }
    photoValue.add(photoValueItem);
    return this;
  }

   /**
   * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
   * @return photoValue
  **/
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
  @NotNull
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DocumentField value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
   * @return value
  **/
  @Valid
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

