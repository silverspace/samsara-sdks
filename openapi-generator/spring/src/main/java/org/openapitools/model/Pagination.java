package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pagination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

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
  */
  @ApiModelProperty(example = "MTU5MTEzNjA2OTU0MzQ3", required = true, value = "Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.")
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
  */
  @ApiModelProperty(required = true, value = "True if there are more pages of results after this response.")
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
  */
  @ApiModelProperty(required = true, value = "True if there are more pages of results before this response.")
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
  */
  @ApiModelProperty(example = "MTU5MTEzNjA2OTU0MzQ3", required = true, value = "Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.")
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
    return Objects.equals(this.endCursor, pagination.endCursor) &&
        Objects.equals(this.hasNextPage, pagination.hasNextPage) &&
        Objects.equals(this.hasPrevPage, pagination.hasPrevPage) &&
        Objects.equals(this.startCursor, pagination.startCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endCursor, hasNextPage, hasPrevPage, startCursor);
  }

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

