package apimodels;

import apimodels.DocumentFieldTypeNumberValueTypeMetadata;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DocumentFieldType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @NotNull
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
  @Valid
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
    DocumentFieldType documentFieldType = (DocumentFieldType) o;
    return Objects.equals(label, documentFieldType.label) &&
        Objects.equals(numberValueTypeMetadata, documentFieldType.numberValueTypeMetadata) &&
        Objects.equals(valueType, documentFieldType.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, numberValueTypeMetadata, valueType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

