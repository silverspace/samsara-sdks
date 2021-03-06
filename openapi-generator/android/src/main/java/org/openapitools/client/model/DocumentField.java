/**
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

import java.util.*;
import org.openapitools.client.model.DocumentFieldCreate;
import org.openapitools.client.model.DocumentFieldCreatePhotoValue;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DocumentField {
  
  @SerializedName("numberValue")
  private Double numberValue = null;
  @SerializedName("photoValue")
  private List<DocumentFieldCreatePhotoValue> photoValue = null;
  @SerializedName("stringValue")
  private String stringValue = null;
  @SerializedName("valueType")
  private String valueType = null;
  @SerializedName("label")
  private String label = null;
  @SerializedName("value")
  private Object value = null;

  /**
   * Value of this field if this document field has valueType: ValueType_Number.
   **/
  @ApiModelProperty(value = "Value of this field if this document field has valueType: ValueType_Number.")
  public Double getNumberValue() {
    return numberValue;
  }
  public void setNumberValue(Double numberValue) {
    this.numberValue = numberValue;
  }

  /**
   * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
   **/
  @ApiModelProperty(value = "Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.")
  public List<DocumentFieldCreatePhotoValue> getPhotoValue() {
    return photoValue;
  }
  public void setPhotoValue(List<DocumentFieldCreatePhotoValue> photoValue) {
    this.photoValue = photoValue;
  }

  /**
   * Value of this field if this document field has valueType: ValueType_String.
   **/
  @ApiModelProperty(value = "Value of this field if this document field has valueType: ValueType_String.")
  public String getStringValue() {
    return stringValue;
  }
  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  /**
   * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
   **/
  @ApiModelProperty(required = true, value = "Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.")
  public String getValueType() {
    return valueType;
  }
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  /**
   * Descriptive name of this field.
   **/
  @ApiModelProperty(required = true, value = "Descriptive name of this field.")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
   **/
  @ApiModelProperty(value = "DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.")
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
    return (this.numberValue == null ? documentField.numberValue == null : this.numberValue.equals(documentField.numberValue)) &&
        (this.photoValue == null ? documentField.photoValue == null : this.photoValue.equals(documentField.photoValue)) &&
        (this.stringValue == null ? documentField.stringValue == null : this.stringValue.equals(documentField.stringValue)) &&
        (this.valueType == null ? documentField.valueType == null : this.valueType.equals(documentField.valueType)) &&
        (this.label == null ? documentField.label == null : this.label.equals(documentField.label)) &&
        (this.value == null ? documentField.value == null : this.value.equals(documentField.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.numberValue == null ? 0: this.numberValue.hashCode());
    result = 31 * result + (this.photoValue == null ? 0: this.photoValue.hashCode());
    result = 31 * result + (this.stringValue == null ? 0: this.stringValue.hashCode());
    result = 31 * result + (this.valueType == null ? 0: this.valueType.hashCode());
    result = 31 * result + (this.label == null ? 0: this.label.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentField {\n");
    
    sb.append("  numberValue: ").append(numberValue).append("\n");
    sb.append("  photoValue: ").append(photoValue).append("\n");
    sb.append("  stringValue: ").append(stringValue).append("\n");
    sb.append("  valueType: ").append(valueType).append("\n");
    sb.append("  label: ").append(label).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
