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
import org.openapitools.client.model.AssetReeferResponseReeferStatsAlarms1;
import org.openapitools.client.model.AssetReeferResponseReeferStatsEngineHours;
import org.openapitools.client.model.AssetReeferResponseReeferStatsFuelPercentage;
import org.openapitools.client.model.AssetReeferResponseReeferStatsPowerStatus;
import org.openapitools.client.model.AssetReeferResponseReeferStatsReturnAirTemp;
import org.openapitools.client.model.AssetReeferResponseReeferStatsSetPoint;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AssetReeferResponseReeferStats {
  
  @SerializedName("fuelPercentage")
  private List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage = null;
  @SerializedName("powerStatus")
  private List<AssetReeferResponseReeferStatsPowerStatus> powerStatus = null;
  @SerializedName("engineHours")
  private List<AssetReeferResponseReeferStatsEngineHours> engineHours = null;
  @SerializedName("setPoint")
  private List<AssetReeferResponseReeferStatsSetPoint> setPoint = null;
  @SerializedName("returnAirTemp")
  private List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp = null;
  @SerializedName("alarms")
  private List<AssetReeferResponseReeferStatsAlarms1> alarms = null;

  /**
   * Fuel percentage of the reefer
   **/
  @ApiModelProperty(value = "Fuel percentage of the reefer")
  public List<AssetReeferResponseReeferStatsFuelPercentage> getFuelPercentage() {
    return fuelPercentage;
  }
  public void setFuelPercentage(List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
  }

  /**
   * Power status of the reefer
   **/
  @ApiModelProperty(value = "Power status of the reefer")
  public List<AssetReeferResponseReeferStatsPowerStatus> getPowerStatus() {
    return powerStatus;
  }
  public void setPowerStatus(List<AssetReeferResponseReeferStatsPowerStatus> powerStatus) {
    this.powerStatus = powerStatus;
  }

  /**
   * Engine hours of the reefer
   **/
  @ApiModelProperty(value = "Engine hours of the reefer")
  public List<AssetReeferResponseReeferStatsEngineHours> getEngineHours() {
    return engineHours;
  }
  public void setEngineHours(List<AssetReeferResponseReeferStatsEngineHours> engineHours) {
    this.engineHours = engineHours;
  }

  /**
   * Set point temperature of the reefer
   **/
  @ApiModelProperty(value = "Set point temperature of the reefer")
  public List<AssetReeferResponseReeferStatsSetPoint> getSetPoint() {
    return setPoint;
  }
  public void setSetPoint(List<AssetReeferResponseReeferStatsSetPoint> setPoint) {
    this.setPoint = setPoint;
  }

  /**
   * Return air temperature of the reefer
   **/
  @ApiModelProperty(value = "Return air temperature of the reefer")
  public List<AssetReeferResponseReeferStatsReturnAirTemp> getReturnAirTemp() {
    return returnAirTemp;
  }
  public void setReturnAirTemp(List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp) {
    this.returnAirTemp = returnAirTemp;
  }

  /**
   * Reefer alarms
   **/
  @ApiModelProperty(value = "Reefer alarms")
  public List<AssetReeferResponseReeferStatsAlarms1> getAlarms() {
    return alarms;
  }
  public void setAlarms(List<AssetReeferResponseReeferStatsAlarms1> alarms) {
    this.alarms = alarms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStats assetReeferResponseReeferStats = (AssetReeferResponseReeferStats) o;
    return (this.fuelPercentage == null ? assetReeferResponseReeferStats.fuelPercentage == null : this.fuelPercentage.equals(assetReeferResponseReeferStats.fuelPercentage)) &&
        (this.powerStatus == null ? assetReeferResponseReeferStats.powerStatus == null : this.powerStatus.equals(assetReeferResponseReeferStats.powerStatus)) &&
        (this.engineHours == null ? assetReeferResponseReeferStats.engineHours == null : this.engineHours.equals(assetReeferResponseReeferStats.engineHours)) &&
        (this.setPoint == null ? assetReeferResponseReeferStats.setPoint == null : this.setPoint.equals(assetReeferResponseReeferStats.setPoint)) &&
        (this.returnAirTemp == null ? assetReeferResponseReeferStats.returnAirTemp == null : this.returnAirTemp.equals(assetReeferResponseReeferStats.returnAirTemp)) &&
        (this.alarms == null ? assetReeferResponseReeferStats.alarms == null : this.alarms.equals(assetReeferResponseReeferStats.alarms));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fuelPercentage == null ? 0: this.fuelPercentage.hashCode());
    result = 31 * result + (this.powerStatus == null ? 0: this.powerStatus.hashCode());
    result = 31 * result + (this.engineHours == null ? 0: this.engineHours.hashCode());
    result = 31 * result + (this.setPoint == null ? 0: this.setPoint.hashCode());
    result = 31 * result + (this.returnAirTemp == null ? 0: this.returnAirTemp.hashCode());
    result = 31 * result + (this.alarms == null ? 0: this.alarms.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStats {\n");
    
    sb.append("  fuelPercentage: ").append(fuelPercentage).append("\n");
    sb.append("  powerStatus: ").append(powerStatus).append("\n");
    sb.append("  engineHours: ").append(engineHours).append("\n");
    sb.append("  setPoint: ").append(setPoint).append("\n");
    sb.append("  returnAirTemp: ").append(returnAirTemp).append("\n");
    sb.append("  alarms: ").append(alarms).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
