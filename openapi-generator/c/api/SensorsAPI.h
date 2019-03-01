#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/cargo_response.h"
#include "../model/door_response.h"
#include "../model/humidity_response.h"
#include "../model/inline_object_19.h"
#include "../model/inline_object_20.h"
#include "../model/inline_object_21.h"
#include "../model/inline_object_22.h"
#include "../model/inline_object_23.h"
#include "../model/inline_object_24.h"
#include "../model/inline_response_200_8.h"
#include "../model/sensor_history_response.h"
#include "../model/temperature_response.h"


// /sensors/list
//
// Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
//
inline_response_200_8_t*
SensorsAPI_getSensors(apiClient_t *apiClient,char* access_token ,inline_object_23_t* groupParam );



// /sensors/cargo
//
// Get cargo monitor status (empty / full) for requested sensors.
//
cargo_response_t*
SensorsAPI_getSensorsCargo(apiClient_t *apiClient,char* access_token ,inline_object_19_t* sensorParam );



// /sensors/door
//
// Get door monitor status (closed / open) for requested sensors.
//
door_response_t*
SensorsAPI_getSensorsDoor(apiClient_t *apiClient,char* access_token ,inline_object_20_t* sensorParam );



// /sensors/history
//
// Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
//
sensor_history_response_t*
SensorsAPI_getSensorsHistory(apiClient_t *apiClient,char* access_token ,inline_object_21_t* historyParam );



// /sensors/humidity
//
// Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
//
humidity_response_t*
SensorsAPI_getSensorsHumidity(apiClient_t *apiClient,char* access_token ,inline_object_22_t* sensorParam );



// /sensors/temperature
//
// Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
//
temperature_response_t*
SensorsAPI_getSensorsTemperature(apiClient_t *apiClient,char* access_token ,inline_object_24_t* sensorParam );



