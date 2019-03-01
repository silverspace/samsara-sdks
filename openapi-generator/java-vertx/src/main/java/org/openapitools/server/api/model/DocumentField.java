package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.DocumentFieldCreate;
import org.openapitools.server.api.model.DocumentFieldCreatePhotoValue;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DocumentField   {
  
  private Double numberValue;
  private List<DocumentFieldCreatePhotoValue> photoValue = new ArrayList<>();
  private String stringValue;
  private String valueType;
  private String label;
  private Object value = null;

  public DocumentField () {

  }

  public DocumentField (Double numberValue, List<DocumentFieldCreatePhotoValue> photoValue, String stringValue, String valueType, String label, Object value) {
    this.numberValue = numberValue;
    this.photoValue = photoValue;
    this.stringValue = stringValue;
    this.valueType = valueType;
    this.label = label;
    this.value = value;
  }

    
  @JsonProperty("numberValue")
  public Double getNumberValue() {
    return numberValue;
  }
  public void setNumberValue(Double numberValue) {
    this.numberValue = numberValue;
  }

    
  @JsonProperty("photoValue")
  public List<DocumentFieldCreatePhotoValue> getPhotoValue() {
    return photoValue;
  }
  public void setPhotoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
  }

    
  @JsonProperty("stringValue")
  public String getStringValue() {
    return stringValue;
  }
  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

    
  @JsonProperty("valueType")
  public String getValueType() {
    return valueType;
  }
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

    
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

    
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }
  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
