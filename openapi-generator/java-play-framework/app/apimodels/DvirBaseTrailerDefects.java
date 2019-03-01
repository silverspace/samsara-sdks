package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DvirBaseTrailerDefects
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DvirBaseTrailerDefects   {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("defectType")
  private String defectType;

  public DvirBaseTrailerDefects comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * The comment describing the type of DVIR defect
   * @return comment
  **/
    public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public DvirBaseTrailerDefects defectType(String defectType) {
    this.defectType = defectType;
    return this;
  }

   /**
   * The type of DVIR defect
   * @return defectType
  **/
    public String getDefectType() {
    return defectType;
  }

  public void setDefectType(String defectType) {
    this.defectType = defectType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvirBaseTrailerDefects dvirBaseTrailerDefects = (DvirBaseTrailerDefects) o;
    return Objects.equals(comment, dvirBaseTrailerDefects.comment) &&
        Objects.equals(defectType, dvirBaseTrailerDefects.defectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, defectType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirBaseTrailerDefects {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    defectType: ").append(toIndentedString(defectType)).append("\n");
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

