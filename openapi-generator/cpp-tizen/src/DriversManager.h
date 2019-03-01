#ifndef _DriversManager_H_
#define _DriversManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Driver.h"
#include "DriverForCreate.h"
#include "Inline_object_4.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Drivers Drivers
 * \ingroup Operations
 *  @{
 */
class DriversManager {
public:
	DriversManager();
	virtual ~DriversManager();

/*! \brief /fleet/drivers/create. *Synchronous*
 *
 * Create a new driver.
 * \param accessToken Samsara API access token. *Required*
 * \param createDriverParam Driver creation body *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDriverSync(char * accessToken,
	std::string accessToken, DriverForCreate createDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/create. *Asynchronous*
 *
 * Create a new driver.
 * \param accessToken Samsara API access token. *Required*
 * \param createDriverParam Driver creation body *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDriverAsync(char * accessToken,
	std::string accessToken, DriverForCreate createDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Synchronous*
 *
 * Deactivate a driver with the given id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deactivateDriverSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Asynchronous*
 *
 * Deactivate a driver with the given id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deactivateDriverAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief /fleet/drivers/inactive. *Synchronous*
 *
 * Fetch all deactivated drivers for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllDeactivatedDriversSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(std::list<Driver>, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/inactive. *Asynchronous*
 *
 * Fetch all deactivated drivers for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllDeactivatedDriversAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(std::list<Driver>, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Synchronous*
 *
 * Fetch deactivated driver by id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDeactivatedDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Asynchronous*
 *
 * Fetch deactivated driver by id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDeactivatedDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Synchronous*
 *
 * Fetch driver by id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Asynchronous*
 *
 * Fetch driver by id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Synchronous*
 *
 * Reactivate the inactive driver having id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param reactivateDriverParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reactivateDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, Inline_object_4 reactivateDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Asynchronous*
 *
 * Reactivate the inactive driver having id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param reactivateDriverParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reactivateDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, Inline_object_4 reactivateDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.samsara.com/v1";
	}
};
/** @}*/

}
}
#endif /* DriversManager_H_ */
