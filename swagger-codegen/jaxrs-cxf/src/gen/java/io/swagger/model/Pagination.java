package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination  {
  
  @ApiModelProperty(example = "MTU5MTEzNjA2OTU0MzQ3", required = true, value = "Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.")
 /**
   * Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
  **/
  private String endCursor = null;

  @ApiModelProperty(required = true, value = "True if there are more pages of results after this response.")
 /**
   * True if there are more pages of results after this response.
  **/
  private Boolean hasNextPage = null;

  @ApiModelProperty(required = true, value = "True if there are more pages of results before this response.")
 /**
   * True if there are more pages of results before this response.
  **/
  private Boolean hasPrevPage = null;

  @ApiModelProperty(example = "MTU5MTEzNjA2OTU0MzQ3", required = true, value = "Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.")
 /**
   * Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
  **/
  private String startCursor = null;
 /**
   * Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter.
   * @return endCursor
  **/
  @JsonProperty("endCursor")
  @NotNull
  public String getEndCursor() {
    return endCursor;
  }

  public void setEndCursor(String endCursor) {
    this.endCursor = endCursor;
  }

  public Pagination endCursor(String endCursor) {
    this.endCursor = endCursor;
    return this;
  }

 /**
   * True if there are more pages of results after this response.
   * @return hasNextPage
  **/
  @JsonProperty("hasNextPage")
  @NotNull
  public Boolean isHasNextPage() {
    return hasNextPage;
  }

  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  public Pagination hasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }

 /**
   * True if there are more pages of results before this response.
   * @return hasPrevPage
  **/
  @JsonProperty("hasPrevPage")
  @NotNull
  public Boolean isHasPrevPage() {
    return hasPrevPage;
  }

  public void setHasPrevPage(Boolean hasPrevPage) {
    this.hasPrevPage = hasPrevPage;
  }

  public Pagination hasPrevPage(Boolean hasPrevPage) {
    this.hasPrevPage = hasPrevPage;
    return this;
  }

 /**
   * Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter.
   * @return startCursor
  **/
  @JsonProperty("startCursor")
  @NotNull
  public String getStartCursor() {
    return startCursor;
  }

  public void setStartCursor(String startCursor) {
    this.startCursor = startCursor;
  }

  public Pagination startCursor(String startCursor) {
    this.startCursor = startCursor;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

