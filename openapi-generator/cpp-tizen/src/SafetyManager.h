#ifndef _SafetyManager_H_
#define _SafetyManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "DriverSafetyScoreResponse.h"
#include "VehicleHarshEventResponse.h"
#include "VehicleSafetyScoreResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Safety Safety
 * \ingroup Operations
 *  @{
 */
class SafetyManager {
public:
	SafetyManager();
	virtual ~SafetyManager();

/*! \brief /fleet/drivers/{driverId:[0-9]+}/safety/score. *Synchronous*
 *
 * Fetch the safety score for the driver.
 * \param driverId ID of the driver *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverSafetyScoreSync(char * accessToken,
	long long driverId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(DriverSafetyScoreResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/{driverId:[0-9]+}/safety/score. *Asynchronous*
 *
 * Fetch the safety score for the driver.
 * \param driverId ID of the driver *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverSafetyScoreAsync(char * accessToken,
	long long driverId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(DriverSafetyScoreResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event. *Synchronous*
 *
 * Fetch harsh event details for a vehicle.
 * \param vehicleId ID of the vehicle *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleHarshEventSync(char * accessToken,
	long long vehicleId, std::string accessToken, long long timestamp, 
	void(* handler)(VehicleHarshEventResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event. *Asynchronous*
 *
 * Fetch harsh event details for a vehicle.
 * \param vehicleId ID of the vehicle *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleHarshEventAsync(char * accessToken,
	long long vehicleId, std::string accessToken, long long timestamp, 
	void(* handler)(VehicleHarshEventResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/vehicles/{vehicleId:[0-9]+}/safety/score. *Synchronous*
 *
 * Fetch the safety score for the vehicle.
 * \param vehicleId ID of the vehicle *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleSafetyScoreSync(char * accessToken,
	long long vehicleId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(VehicleSafetyScoreResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/vehicles/{vehicleId:[0-9]+}/safety/score. *Asynchronous*
 *
 * Fetch the safety score for the vehicle.
 * \param vehicleId ID of the vehicle *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleSafetyScoreAsync(char * accessToken,
	long long vehicleId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(VehicleSafetyScoreResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.samsara.com/v1";
	}
};
/** @}*/

}
}
#endif /* SafetyManager_H_ */
