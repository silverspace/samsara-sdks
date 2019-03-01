/*
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SensorsHistorySeries;

/**
 * InlineObject21
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-01T05:34:00.976Z[GMT]")
public class InlineObject21 {
  public static final String SERIALIZED_NAME_END_MS = "endMs";
  @SerializedName(SERIALIZED_NAME_END_MS)
  private Integer endMs;

  /**
   * Gets or Sets fillMissing
   */
  @JsonAdapter(FillMissingEnum.Adapter.class)
  public enum FillMissingEnum {
    WITHNULL("withNull"),
    
    WITHPREVIOUS("withPrevious");

    private String value;

    FillMissingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FillMissingEnum fromValue(String text) {
      for (FillMissingEnum b : FillMissingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<FillMissingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FillMissingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FillMissingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FillMissingEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_FILL_MISSING = "fillMissing";
  @SerializedName(SERIALIZED_NAME_FILL_MISSING)
  private FillMissingEnum fillMissing = FillMissingEnum.WITHNULL;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_SERIES = "series";
  @SerializedName(SERIALIZED_NAME_SERIES)
  private List<SensorsHistorySeries> series = new ArrayList<SensorsHistorySeries>();

  public static final String SERIALIZED_NAME_START_MS = "startMs";
  @SerializedName(SERIALIZED_NAME_START_MS)
  private Integer startMs;

  public static final String SERIALIZED_NAME_STEP_MS = "stepMs";
  @SerializedName(SERIALIZED_NAME_STEP_MS)
  private Integer stepMs;

  public InlineObject21 endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

   /**
   * End of the time range, specified in milliseconds UNIX time.
   * @return endMs
  **/
  @ApiModelProperty(example = "1462881998034", required = true, value = "End of the time range, specified in milliseconds UNIX time.")
  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public InlineObject21 fillMissing(FillMissingEnum fillMissing) {
    this.fillMissing = fillMissing;
    return this;
  }

   /**
   * Get fillMissing
   * @return fillMissing
  **/
  @ApiModelProperty(value = "")
  public FillMissingEnum getFillMissing() {
    return fillMissing;
  }

  public void setFillMissing(FillMissingEnum fillMissing) {
    this.fillMissing = fillMissing;
  }

  public InlineObject21 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group ID to query.
   * @return groupId
  **/
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public InlineObject21 series(List<SensorsHistorySeries> series) {
    this.series = series;
    return this;
  }

  public InlineObject21 addSeriesItem(SensorsHistorySeries seriesItem) {
    this.series.add(seriesItem);
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @ApiModelProperty(required = true, value = "")
  public List<SensorsHistorySeries> getSeries() {
    return series;
  }

  public void setSeries(List<SensorsHistorySeries> series) {
    this.series = series;
  }

  public InlineObject21 startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

   /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   * @return startMs
  **/
  @ApiModelProperty(example = "1462878398034", required = true, value = "Beginning of the time range, specified in milliseconds UNIX time.")
  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  public InlineObject21 stepMs(Integer stepMs) {
    this.stepMs = stepMs;
    return this;
  }

   /**
   * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
   * @return stepMs
  **/
  @ApiModelProperty(example = "3600000", required = true, value = "Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.")
  public Integer getStepMs() {
    return stepMs;
  }

  public void setStepMs(Integer stepMs) {
    this.stepMs = stepMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject21 inlineObject21 = (InlineObject21) o;
    return Objects.equals(this.endMs, inlineObject21.endMs) &&
        Objects.equals(this.fillMissing, inlineObject21.fillMissing) &&
        Objects.equals(this.groupId, inlineObject21.groupId) &&
        Objects.equals(this.series, inlineObject21.series) &&
        Objects.equals(this.startMs, inlineObject21.startMs) &&
        Objects.equals(this.stepMs, inlineObject21.stepMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMs, fillMissing, groupId, series, startMs, stepMs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject21 {\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    fillMissing: ").append(toIndentedString(fillMissing)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    stepMs: ").append(toIndentedString(stepMs)).append("\n");
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

