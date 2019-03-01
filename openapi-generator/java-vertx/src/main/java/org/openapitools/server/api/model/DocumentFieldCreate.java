package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.DocumentFieldCreatePhotoValue;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DocumentFieldCreate   {
  
  private Double numberValue;
  private List<DocumentFieldCreatePhotoValue> photoValue = new ArrayList<>();
  private String stringValue;
  private String valueType;

  public DocumentFieldCreate () {

  }

  public DocumentFieldCreate (Double numberValue, List<DocumentFieldCreatePhotoValue> photoValue, String stringValue, String valueType) {
    this.numberValue = numberValue;
    this.photoValue = photoValue;
    this.stringValue = stringValue;
    this.valueType = valueType;
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


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
