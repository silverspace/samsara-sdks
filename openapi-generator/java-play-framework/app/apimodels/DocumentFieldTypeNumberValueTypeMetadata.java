package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DocumentFieldTypeNumberValueTypeMetadata   {
  @JsonProperty("numDecimalPlaces")
  private Long numDecimalPlaces;

  public DocumentFieldTypeNumberValueTypeMetadata numDecimalPlaces(Long numDecimalPlaces) {
    this.numDecimalPlaces = numDecimalPlaces;
    return this;
  }

   /**
   * Number of decimal places that values for this field type can have.
   * @return numDecimalPlaces
  **/
    public Long getNumDecimalPlaces() {
    return numDecimalPlaces;
  }

  public void setNumDecimalPlaces(Long numDecimalPlaces) {
    this.numDecimalPlaces = numDecimalPlaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentFieldTypeNumberValueTypeMetadata documentFieldTypeNumberValueTypeMetadata = (DocumentFieldTypeNumberValueTypeMetadata) o;
    return Objects.equals(numDecimalPlaces, documentFieldTypeNumberValueTypeMetadata.numDecimalPlaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numDecimalPlaces);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentFieldTypeNumberValueTypeMetadata {\n");
    
    sb.append("    numDecimalPlaces: ").append(toIndentedString(numDecimalPlaces)).append("\n");
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

