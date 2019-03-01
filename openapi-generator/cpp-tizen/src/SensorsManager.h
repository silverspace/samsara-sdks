#ifndef _SensorsManager_H_
#define _SensorsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CargoResponse.h"
#include "DoorResponse.h"
#include "HumidityResponse.h"
#include "Inline_object_19.h"
#include "Inline_object_20.h"
#include "Inline_object_21.h"
#include "Inline_object_22.h"
#include "Inline_object_23.h"
#include "Inline_object_24.h"
#include "Inline_response_200_8.h"
#include "SensorHistoryResponse.h"
#include "TemperatureResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Sensors Sensors
 * \ingroup Operations
 *  @{
 */
class SensorsManager {
public:
	SensorsManager();
	virtual ~SensorsManager();

/*! \brief /sensors/list. *Synchronous*
 *
 * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
 * \param accessToken Samsara API access token. *Required*
 * \param groupParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsSync(char * accessToken,
	std::string accessToken, Inline_object_23 groupParam, 
	void(* handler)(Inline_response_200_8, Error, void* )
	, void* userData);

/*! \brief /sensors/list. *Asynchronous*
 *
 * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
 * \param accessToken Samsara API access token. *Required*
 * \param groupParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsAsync(char * accessToken,
	std::string accessToken, Inline_object_23 groupParam, 
	void(* handler)(Inline_response_200_8, Error, void* )
	, void* userData);


/*! \brief /sensors/cargo. *Synchronous*
 *
 * Get cargo monitor status (empty / full) for requested sensors.
 * \param accessToken Samsara API access token. *Required*
 * \param sensorParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsCargoSync(char * accessToken,
	std::string accessToken, Inline_object_19 sensorParam, 
	void(* handler)(CargoResponse, Error, void* )
	, void* userData);

/*! \brief /sensors/cargo. *Asynchronous*
 *
 * Get cargo monitor status (empty / full) for requested sensors.
 * \param accessToken Samsara API access token. *Required*
 * \param sensorParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsCargoAsync(char * accessToken,
	std::string accessToken, Inline_object_19 sensorParam, 
	void(* handler)(CargoResponse, Error, void* )
	, void* userData);


/*! \brief /sensors/door. *Synchronous*
 *
 * Get door monitor status (closed / open) for requested sensors.
 * \param accessToken Samsara API access token. *Required*
 * \param sensorParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsDoorSync(char * accessToken,
	std::string accessToken, Inline_object_20 sensorParam, 
	void(* handler)(DoorResponse, Error, void* )
	, void* userData);

/*! \brief /sensors/door. *Asynchronous*
 *
 * Get door monitor status (closed / open) for requested sensors.
 * \param accessToken Samsara API access token. *Required*
 * \param sensorParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsDoorAsync(char * accessToken,
	std::string accessToken, Inline_object_20 sensorParam, 
	void(* handler)(DoorResponse, Error, void* )
	, void* userData);


/*! \brief /sensors/history. *Synchronous*
 *
 * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
 * \param accessToken Samsara API access token. *Required*
 * \param historyParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsHistorySync(char * accessToken,
	std::string accessToken, Inline_object_21 historyParam, 
	void(* handler)(SensorHistoryResponse, Error, void* )
	, void* userData);

/*! \brief /sensors/history. *Asynchronous*
 *
 * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
 * \param accessToken Samsara API access token. *Required*
 * \param historyParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsHistoryAsync(char * accessToken,
	std::string accessToken, Inline_object_21 historyParam, 
	void(* handler)(SensorHistoryResponse, Error, void* )
	, void* userData);


/*! \brief /sensors/humidity. *Synchronous*
 *
 * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
 * \param accessToken Samsara API access token. *Required*
 * \param sensorParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsHumiditySync(char * accessToken,
	std::string accessToken, Inline_object_22 sensorParam, 
	void(* handler)(HumidityResponse, Error, void* )
	, void* userData);

/*! \brief /sensors/humidity. *Asynchronous*
 *
 * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
 * \param accessToken Samsara API access token. *Required*
 * \param sensorParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsHumidityAsync(char * accessToken,
	std::string accessToken, Inline_object_22 sensorParam, 
	void(* handler)(HumidityResponse, Error, void* )
	, void* userData);


/*! \brief /sensors/temperature. *Synchronous*
 *
 * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
 * \param accessToken Samsara API access token. *Required*
 * \param sensorParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsTemperatureSync(char * accessToken,
	std::string accessToken, Inline_object_24 sensorParam, 
	void(* handler)(TemperatureResponse, Error, void* )
	, void* userData);

/*! \brief /sensors/temperature. *Asynchronous*
 *
 * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
 * \param accessToken Samsara API access token. *Required*
 * \param sensorParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSensorsTemperatureAsync(char * accessToken,
	std::string accessToken, Inline_object_24 sensorParam, 
	void(* handler)(TemperatureResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.samsara.com/v1";
	}
};
/** @}*/

}
}
#endif /* SensorsManager_H_ */
