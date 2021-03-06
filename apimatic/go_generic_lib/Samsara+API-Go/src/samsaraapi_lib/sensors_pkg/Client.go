/*
 * samsaraapi_lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package sensors_pkg


import(
	"errors"
	"fmt"
	"encoding/json"
	"samsaraapi_lib/models_pkg"
	"github.com/apimatic/unirest-go"
	"samsaraapi_lib/apihelper_pkg"
	"samsaraapi_lib/configuration_pkg"
)
/*
 * Client structure as interface implementation
 */
type SENSORS_IMPL struct {
     config configuration_pkg.CONFIGURATION
}

/**
 * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
 * @param    string                         accessToken      parameter: Required
 * @param    *models_pkg.SensorParam        sensorParam      parameter: Required
 * @return	Returns the *models_pkg.TemperatureResponse response from the API call
 */
func (me *SENSORS_IMPL) CreateGetSensorsTemperature (
            accessToken string,
            sensorParam *models_pkg.SensorParam) (*models_pkg.TemperatureResponse, error) {
    //the endpoint path uri
    _pathUrl := "/sensors/temperature"

    //variable to hold errors
    var err error = nil
    //the base uri for api requests
    _queryBuilder := configuration_pkg.BASEURI;

    //prepare query string for API call
   _queryBuilder = _queryBuilder + _pathUrl

    //process optional query parameters
    _queryBuilder, err = apihelper_pkg.AppendUrlWithQueryParameters(_queryBuilder, map[string]interface{} {
        "access_token" : accessToken,
        "access_token" : samsaraapi_lib.config.AccessToken,
    })
    if err != nil {
        //error in query param handling
        return nil, err
    }

    //validate and preprocess url
    _queryBuilder, err = apihelper_pkg.CleanUrl(_queryBuilder)
    if err != nil {
        //error in url validation or cleaning
        return nil, err
    }
    //prepare headers for the outgoing request
    headers := map[string]interface{} {
        "user-agent" : "APIMATIC 2.0",
        "accept" : "application/json",
        "content-type" : "application/json; charset=utf-8",
    }

    //prepare API request
    _request := unirest.Post(_queryBuilder, headers, sensorParam)
    //and invoke the API call request to fetch the response
    _response, err := unirest.AsString(_request,false);
    if err != nil {
        //error in API invocation
        return nil, err
    }

    //error handling using HTTP status codes
    if (_response.Code == 0) {
        err = apihelper_pkg.NewAPIError("Unexpected error.", _response.Code, _response.RawBody)
    } else if (_response.Code < 200) || (_response.Code > 206) { //[200,206] = HTTP OK
            err = apihelper_pkg.NewAPIError("HTTP Response Not OK", _response.Code, _response.RawBody)
    }
    if(err != nil) {
        //error detected in status code validation
        return nil, err
    }

    //returning the response
    var retVal *models_pkg.TemperatureResponse = &models_pkg.TemperatureResponse{}
    err = json.Unmarshal(_response.RawBody, &retVal)

    if err != nil {
        //error in parsing
        return nil, err
    }
    return retVal, nil

}

/**
 * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
 * @param    string                        accessToken      parameter: Required
 * @param    *models_pkg.GroupParam        groupParam       parameter: Required
 * @return	Returns the *models_pkg.GetSensorsResponse response from the API call
 */
func (me *SENSORS_IMPL) CreateGetSensors (
            accessToken string,
            groupParam *models_pkg.GroupParam) (*models_pkg.GetSensorsResponse, error) {
    //the endpoint path uri
    _pathUrl := "/sensors/list"

    //variable to hold errors
    var err error = nil
    //the base uri for api requests
    _queryBuilder := configuration_pkg.BASEURI;

    //prepare query string for API call
   _queryBuilder = _queryBuilder + _pathUrl

    //process optional query parameters
    _queryBuilder, err = apihelper_pkg.AppendUrlWithQueryParameters(_queryBuilder, map[string]interface{} {
        "access_token" : accessToken,
        "access_token" : samsaraapi_lib.config.AccessToken,
    })
    if err != nil {
        //error in query param handling
        return nil, err
    }

    //validate and preprocess url
    _queryBuilder, err = apihelper_pkg.CleanUrl(_queryBuilder)
    if err != nil {
        //error in url validation or cleaning
        return nil, err
    }
    //prepare headers for the outgoing request
    headers := map[string]interface{} {
        "user-agent" : "APIMATIC 2.0",
        "accept" : "application/json",
        "content-type" : "application/json; charset=utf-8",
    }

    //prepare API request
    _request := unirest.Post(_queryBuilder, headers, groupParam)
    //and invoke the API call request to fetch the response
    _response, err := unirest.AsString(_request,false);
    if err != nil {
        //error in API invocation
        return nil, err
    }

    //error handling using HTTP status codes
    if (_response.Code == 0) {
        err = apihelper_pkg.NewAPIError("Unexpected error.", _response.Code, _response.RawBody)
    } else if (_response.Code < 200) || (_response.Code > 206) { //[200,206] = HTTP OK
            err = apihelper_pkg.NewAPIError("HTTP Response Not OK", _response.Code, _response.RawBody)
    }
    if(err != nil) {
        //error detected in status code validation
        return nil, err
    }

    //returning the response
    var retVal *models_pkg.GetSensorsResponse = &models_pkg.GetSensorsResponse{}
    err = json.Unmarshal(_response.RawBody, &retVal)

    if err != nil {
        //error in parsing
        return nil, err
    }
    return retVal, nil

}

/**
 * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
 * @param    string                         accessToken      parameter: Required
 * @param    *models_pkg.SensorParam        sensorParam      parameter: Required
 * @return	Returns the *models_pkg.HumidityResponse response from the API call
 */
func (me *SENSORS_IMPL) CreateGetSensorsHumidity (
            accessToken string,
            sensorParam *models_pkg.SensorParam) (*models_pkg.HumidityResponse, error) {
    //the endpoint path uri
    _pathUrl := "/sensors/humidity"

    //variable to hold errors
    var err error = nil
    //the base uri for api requests
    _queryBuilder := configuration_pkg.BASEURI;

    //prepare query string for API call
   _queryBuilder = _queryBuilder + _pathUrl

    //process optional query parameters
    _queryBuilder, err = apihelper_pkg.AppendUrlWithQueryParameters(_queryBuilder, map[string]interface{} {
        "access_token" : accessToken,
        "access_token" : samsaraapi_lib.config.AccessToken,
    })
    if err != nil {
        //error in query param handling
        return nil, err
    }

    //validate and preprocess url
    _queryBuilder, err = apihelper_pkg.CleanUrl(_queryBuilder)
    if err != nil {
        //error in url validation or cleaning
        return nil, err
    }
    //prepare headers for the outgoing request
    headers := map[string]interface{} {
        "user-agent" : "APIMATIC 2.0",
        "accept" : "application/json",
        "content-type" : "application/json; charset=utf-8",
    }

    //prepare API request
    _request := unirest.Post(_queryBuilder, headers, sensorParam)
    //and invoke the API call request to fetch the response
    _response, err := unirest.AsString(_request,false);
    if err != nil {
        //error in API invocation
        return nil, err
    }

    //error handling using HTTP status codes
    if (_response.Code == 0) {
        err = apihelper_pkg.NewAPIError("Unexpected error.", _response.Code, _response.RawBody)
    } else if (_response.Code < 200) || (_response.Code > 206) { //[200,206] = HTTP OK
            err = apihelper_pkg.NewAPIError("HTTP Response Not OK", _response.Code, _response.RawBody)
    }
    if(err != nil) {
        //error detected in status code validation
        return nil, err
    }

    //returning the response
    var retVal *models_pkg.HumidityResponse = &models_pkg.HumidityResponse{}
    err = json.Unmarshal(_response.RawBody, &retVal)

    if err != nil {
        //error in parsing
        return nil, err
    }
    return retVal, nil

}

/**
 * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
 * @param    string                           accessToken      parameter: Required
 * @param    *models_pkg.HistoryParam1        historyParam     parameter: Required
 * @return	Returns the *models_pkg.SensorHistoryResponse response from the API call
 */
func (me *SENSORS_IMPL) CreateGetSensorsHistory (
            accessToken string,
            historyParam *models_pkg.HistoryParam1) (*models_pkg.SensorHistoryResponse, error) {
    //the endpoint path uri
    _pathUrl := "/sensors/history"

    //variable to hold errors
    var err error = nil
    //the base uri for api requests
    _queryBuilder := configuration_pkg.BASEURI;

    //prepare query string for API call
   _queryBuilder = _queryBuilder + _pathUrl

    //process optional query parameters
    _queryBuilder, err = apihelper_pkg.AppendUrlWithQueryParameters(_queryBuilder, map[string]interface{} {
        "access_token" : accessToken,
        "access_token" : samsaraapi_lib.config.AccessToken,
    })
    if err != nil {
        //error in query param handling
        return nil, err
    }

    //validate and preprocess url
    _queryBuilder, err = apihelper_pkg.CleanUrl(_queryBuilder)
    if err != nil {
        //error in url validation or cleaning
        return nil, err
    }
    //prepare headers for the outgoing request
    headers := map[string]interface{} {
        "user-agent" : "APIMATIC 2.0",
        "accept" : "application/json",
        "content-type" : "application/json; charset=utf-8",
    }

    //prepare API request
    _request := unirest.Post(_queryBuilder, headers, historyParam)
    //and invoke the API call request to fetch the response
    _response, err := unirest.AsString(_request,false);
    if err != nil {
        //error in API invocation
        return nil, err
    }

    //error handling using HTTP status codes
    if (_response.Code == 0) {
        err = apihelper_pkg.NewAPIError("Unexpected error.", _response.Code, _response.RawBody)
    } else if (_response.Code < 200) || (_response.Code > 206) { //[200,206] = HTTP OK
            err = apihelper_pkg.NewAPIError("HTTP Response Not OK", _response.Code, _response.RawBody)
    }
    if(err != nil) {
        //error detected in status code validation
        return nil, err
    }

    //returning the response
    var retVal *models_pkg.SensorHistoryResponse = &models_pkg.SensorHistoryResponse{}
    err = json.Unmarshal(_response.RawBody, &retVal)

    if err != nil {
        //error in parsing
        return nil, err
    }
    return retVal, nil

}

/**
 * Get door monitor status (closed / open) for requested sensors.
 * @param    string                         accessToken      parameter: Required
 * @param    *models_pkg.SensorParam        sensorParam      parameter: Required
 * @return	Returns the *models_pkg.DoorResponse response from the API call
 */
func (me *SENSORS_IMPL) CreateGetSensorsDoor (
            accessToken string,
            sensorParam *models_pkg.SensorParam) (*models_pkg.DoorResponse, error) {
    //the endpoint path uri
    _pathUrl := "/sensors/door"

    //variable to hold errors
    var err error = nil
    //the base uri for api requests
    _queryBuilder := configuration_pkg.BASEURI;

    //prepare query string for API call
   _queryBuilder = _queryBuilder + _pathUrl

    //process optional query parameters
    _queryBuilder, err = apihelper_pkg.AppendUrlWithQueryParameters(_queryBuilder, map[string]interface{} {
        "access_token" : accessToken,
        "access_token" : samsaraapi_lib.config.AccessToken,
    })
    if err != nil {
        //error in query param handling
        return nil, err
    }

    //validate and preprocess url
    _queryBuilder, err = apihelper_pkg.CleanUrl(_queryBuilder)
    if err != nil {
        //error in url validation or cleaning
        return nil, err
    }
    //prepare headers for the outgoing request
    headers := map[string]interface{} {
        "user-agent" : "APIMATIC 2.0",
        "accept" : "application/json",
        "content-type" : "application/json; charset=utf-8",
    }

    //prepare API request
    _request := unirest.Post(_queryBuilder, headers, sensorParam)
    //and invoke the API call request to fetch the response
    _response, err := unirest.AsString(_request,false);
    if err != nil {
        //error in API invocation
        return nil, err
    }

    //error handling using HTTP status codes
    if (_response.Code == 0) {
        err = apihelper_pkg.NewAPIError("Unexpected error.", _response.Code, _response.RawBody)
    } else if (_response.Code < 200) || (_response.Code > 206) { //[200,206] = HTTP OK
            err = apihelper_pkg.NewAPIError("HTTP Response Not OK", _response.Code, _response.RawBody)
    }
    if(err != nil) {
        //error detected in status code validation
        return nil, err
    }

    //returning the response
    var retVal *models_pkg.DoorResponse = &models_pkg.DoorResponse{}
    err = json.Unmarshal(_response.RawBody, &retVal)

    if err != nil {
        //error in parsing
        return nil, err
    }
    return retVal, nil

}

/**
 * Get cargo monitor status (empty / full) for requested sensors.
 * @param    string                         accessToken      parameter: Required
 * @param    *models_pkg.SensorParam        sensorParam      parameter: Required
 * @return	Returns the *models_pkg.CargoResponse response from the API call
 */
func (me *SENSORS_IMPL) CreateGetSensorsCargo (
            accessToken string,
            sensorParam *models_pkg.SensorParam) (*models_pkg.CargoResponse, error) {
    //the endpoint path uri
    _pathUrl := "/sensors/cargo"

    //variable to hold errors
    var err error = nil
    //the base uri for api requests
    _queryBuilder := configuration_pkg.BASEURI;

    //prepare query string for API call
   _queryBuilder = _queryBuilder + _pathUrl

    //process optional query parameters
    _queryBuilder, err = apihelper_pkg.AppendUrlWithQueryParameters(_queryBuilder, map[string]interface{} {
        "access_token" : accessToken,
        "access_token" : samsaraapi_lib.config.AccessToken,
    })
    if err != nil {
        //error in query param handling
        return nil, err
    }

    //validate and preprocess url
    _queryBuilder, err = apihelper_pkg.CleanUrl(_queryBuilder)
    if err != nil {
        //error in url validation or cleaning
        return nil, err
    }
    //prepare headers for the outgoing request
    headers := map[string]interface{} {
        "user-agent" : "APIMATIC 2.0",
        "accept" : "application/json",
        "content-type" : "application/json; charset=utf-8",
    }

    //prepare API request
    _request := unirest.Post(_queryBuilder, headers, sensorParam)
    //and invoke the API call request to fetch the response
    _response, err := unirest.AsString(_request,false);
    if err != nil {
        //error in API invocation
        return nil, err
    }

    //error handling using HTTP status codes
    if (_response.Code == 0) {
        err = apihelper_pkg.NewAPIError("Unexpected error.", _response.Code, _response.RawBody)
    } else if (_response.Code < 200) || (_response.Code > 206) { //[200,206] = HTTP OK
            err = apihelper_pkg.NewAPIError("HTTP Response Not OK", _response.Code, _response.RawBody)
    }
    if(err != nil) {
        //error detected in status code validation
        return nil, err
    }

    //returning the response
    var retVal *models_pkg.CargoResponse = &models_pkg.CargoResponse{}
    err = json.Unmarshal(_response.RawBody, &retVal)

    if err != nil {
        //error in parsing
        return nil, err
    }
    return retVal, nil

}

