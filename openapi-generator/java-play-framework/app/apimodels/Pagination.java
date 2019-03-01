package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Pagination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Pagination   {
  @JsonProperty("endCursor")
  private String endCursor;

  @JsonProperty("hasNextPage")
  private Boolean hasNextPage;

  @JsonProperty("hasPrevPage")
  private Boolean hasPrevPage;

  @JsonProperty("startCursor")
  private String startCursor;

  public Pagination endCursor(String endCursor) {
    this.endCursor = endCursor;
    return this;
  }

   /**
   * Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
   * @return endCursor
  **/
  @NotNull
  public String getEndCursor() {
    return endCursor;
  }

  public void setEndCursor(String endCursor) {
    this.endCursor = endCursor;
  }

  public Pagination hasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }

   /**
   * True if there are more pages of results after this response.
   * @return hasNextPage
  **/
  @NotNull
  public Boolean getHasNextPage() {
    return hasNextPage;
  }

  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  public Pagination hasPrevPage(Boolean hasPrevPage) {
    this.hasPrevPage = hasPrevPage;
    return this;
  }

   /**
   * True if there are more pages of results before this response.
   * @return hasPrevPage
  **/
  @NotNull
  public Boolean getHasPrevPage() {
    return hasPrevPage;
  }

  public void setHasPrevPage(Boolean hasPrevPage) {
    this.hasPrevPage = hasPrevPage;
  }

  public Pagination startCursor(String startCursor) {
    this.startCursor = startCursor;
    return this;
  }

   /**
   * Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
   * @return startCursor
  **/
  @NotNull
  public String getStartCursor() {
    return startCursor;
  }

  public void setStartCursor(String startCursor) {
    this.startCursor = startCursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(endCursor, pagination.endCursor) &&
        Objects.equals(hasNextPage, pagination.hasNextPage) &&
        Objects.equals(hasPrevPage, pagination.hasPrevPage) &&
        Objects.equals(startCursor, pagination.startCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endCursor, hasNextPage, hasPrevPage, startCursor);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    endCursor: ").append(toIndentedString(endCursor)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    hasPrevPage: ").append(toIndentedString(hasPrevPage)).append("\n");
    sb.append("    startCursor: ").append(toIndentedString(startCursor)).append("\n");
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

