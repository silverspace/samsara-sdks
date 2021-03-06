/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.samsara.api.*;
import com.samsara.api.models.*;
import com.samsara.api.exceptions.*;
import com.samsara.api.http.client.HttpClient;
import com.samsara.api.http.client.HttpContext;
import com.samsara.api.http.request.HttpRequest;
import com.samsara.api.http.response.HttpResponse;
import com.samsara.api.http.response.HttpStringResponse;
import com.samsara.api.http.client.APICallBack;

public class SensorsController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static SensorsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the SensorsController class 
     */
    public static SensorsController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new SensorsController();
                }
            }
        }
        return instance;
    }

    /**
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @param    accessToken    Required parameter: Samsara API access token.
     * @param    sensorParam    Required parameter: Group ID and list of sensor IDs to query.
     * @return    Returns the void response from the API call 
     */
    public void createGetSensorsTemperatureAsync(
                final String accessToken,
                final SensorParam sensorParam,
                final APICallBack<TemperatureResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/sensors/temperature");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("access_token", accessToken);
                _queryParameters.put("access_token", Configuration.accessToken);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("user-agent", BaseController.userAgent);
                _headers.put("accept", "application/json");
                _headers.put("content-type", "application/json");


                //prepare and invoke the API call request to fetch the response
                String _bodyJson;
                HttpRequest _request;
                try {
                    _bodyJson = APIHelper.serialize(sensorParam);
                    _request = getClientInstance().postBody(_queryUrl, _headers, _bodyJson);
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if ((_responseCode < 200) || (_responseCode > 208))
                                throw new APIException("Unexpected error.", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            TemperatureResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<TemperatureResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @param    accessToken    Required parameter: Samsara API access token.
     * @param    groupParam    Required parameter: Group ID to query.
     * @return    Returns the void response from the API call 
     */
    public void createGetSensorsAsync(
                final String accessToken,
                final GroupParam groupParam,
                final APICallBack<GetSensorsResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/sensors/list");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("access_token", accessToken);
                _queryParameters.put("access_token", Configuration.accessToken);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("user-agent", BaseController.userAgent);
                _headers.put("accept", "application/json");
                _headers.put("content-type", "application/json");


                //prepare and invoke the API call request to fetch the response
                String _bodyJson;
                HttpRequest _request;
                try {
                    _bodyJson = APIHelper.serialize(groupParam);
                    _request = getClientInstance().postBody(_queryUrl, _headers, _bodyJson);
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if ((_responseCode < 200) || (_responseCode > 208))
                                throw new APIException("Unexpected error.", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetSensorsResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetSensorsResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @param    accessToken    Required parameter: Samsara API access token.
     * @param    sensorParam    Required parameter: Group ID and list of sensor IDs to query.
     * @return    Returns the void response from the API call 
     */
    public void createGetSensorsHumidityAsync(
                final String accessToken,
                final SensorParam sensorParam,
                final APICallBack<HumidityResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/sensors/humidity");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("access_token", accessToken);
                _queryParameters.put("access_token", Configuration.accessToken);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("user-agent", BaseController.userAgent);
                _headers.put("accept", "application/json");
                _headers.put("content-type", "application/json");


                //prepare and invoke the API call request to fetch the response
                String _bodyJson;
                HttpRequest _request;
                try {
                    _bodyJson = APIHelper.serialize(sensorParam);
                    _request = getClientInstance().postBody(_queryUrl, _headers, _bodyJson);
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if ((_responseCode < 200) || (_responseCode > 208))
                                throw new APIException("Unexpected error.", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            HumidityResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<HumidityResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @param    accessToken    Required parameter: Samsara API access token.
     * @param    historyParam    Required parameter: Group ID, time range and resolution, and list of sensor ID, field pairs to query.
     * @return    Returns the void response from the API call 
     */
    public void createGetSensorsHistoryAsync(
                final String accessToken,
                final HistoryParam1 historyParam,
                final APICallBack<SensorHistoryResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/sensors/history");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("access_token", accessToken);
                _queryParameters.put("access_token", Configuration.accessToken);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("user-agent", BaseController.userAgent);
                _headers.put("accept", "application/json");
                _headers.put("content-type", "application/json");


                //prepare and invoke the API call request to fetch the response
                String _bodyJson;
                HttpRequest _request;
                try {
                    _bodyJson = APIHelper.serialize(historyParam);
                    _request = getClientInstance().postBody(_queryUrl, _headers, _bodyJson);
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if ((_responseCode < 200) || (_responseCode > 208))
                                throw new APIException("Unexpected error.", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            SensorHistoryResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<SensorHistoryResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Get door monitor status (closed / open) for requested sensors.
     * @param    accessToken    Required parameter: Samsara API access token.
     * @param    sensorParam    Required parameter: Group ID and list of sensor IDs to query.
     * @return    Returns the void response from the API call 
     */
    public void createGetSensorsDoorAsync(
                final String accessToken,
                final SensorParam sensorParam,
                final APICallBack<DoorResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/sensors/door");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("access_token", accessToken);
                _queryParameters.put("access_token", Configuration.accessToken);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("user-agent", BaseController.userAgent);
                _headers.put("accept", "application/json");
                _headers.put("content-type", "application/json");


                //prepare and invoke the API call request to fetch the response
                String _bodyJson;
                HttpRequest _request;
                try {
                    _bodyJson = APIHelper.serialize(sensorParam);
                    _request = getClientInstance().postBody(_queryUrl, _headers, _bodyJson);
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if ((_responseCode < 200) || (_responseCode > 208))
                                throw new APIException("Unexpected error.", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            DoorResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<DoorResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Get cargo monitor status (empty / full) for requested sensors.
     * @param    accessToken    Required parameter: Samsara API access token.
     * @param    sensorParam    Required parameter: Group ID and list of sensor IDs to query.
     * @return    Returns the void response from the API call 
     */
    public void createGetSensorsCargoAsync(
                final String accessToken,
                final SensorParam sensorParam,
                final APICallBack<CargoResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/sensors/cargo");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("access_token", accessToken);
                _queryParameters.put("access_token", Configuration.accessToken);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("user-agent", BaseController.userAgent);
                _headers.put("accept", "application/json");
                _headers.put("content-type", "application/json");


                //prepare and invoke the API call request to fetch the response
                String _bodyJson;
                HttpRequest _request;
                try {
                    _bodyJson = APIHelper.serialize(sensorParam);
                    _request = getClientInstance().postBody(_queryUrl, _headers, _bodyJson);
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if ((_responseCode < 200) || (_responseCode > 208))
                                throw new APIException("Unexpected error.", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            CargoResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CargoResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}