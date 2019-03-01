package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.DocumentFieldTypeNumberValueTypeMetadata;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DocumentFieldType   {
  
  private String label;
  private DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata = null;
  private String valueType;

  public DocumentFieldType () {

  }

  public DocumentFieldType (String label, DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata, String valueType) {
    this.label = label;
    this.numberValueTypeMetadata = numberValueTypeMetadata;
    this.valueType = valueType;
  }

    
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

    
  @JsonProperty("numberValueTypeMetadata")
  public DocumentFieldTypeNumberValueTypeMetadata getNumberValueTypeMetadata() {
    return numberValueTypeMetadata;
  }
  public void setNumberValueTypeMetadata(DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata) {
    this.numberValueTypeMetadata = numberValueTypeMetadata;
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
    DocumentFieldType documentFieldType = (DocumentFieldType) o;
    return Objects.equals(label, documentFieldType.label) &&
        Objects.equals(numberValueTypeMetadata, documentFieldType.numberValueTypeMetadata) &&
        Objects.equals(valueType, documentFieldType.valueType);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
