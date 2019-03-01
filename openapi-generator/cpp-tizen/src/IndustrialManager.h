#ifndef _IndustrialManager_H_
#define _IndustrialManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "DataInputHistoryResponse.h"
#include "Inline_object_17.h"
#include "Inline_object_18.h"
#include "Inline_response_200_6.h"
#include "Inline_response_200_7.h"
#include "MachineHistoryResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Industrial Industrial
 * \ingroup Operations
 *  @{
 */
class IndustrialManager {
public:
	IndustrialManager();
	virtual ~IndustrialManager();

/*! \brief /industrial/data. *Synchronous*
 *
 * Fetch all of the data inputs for a group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
 * \param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllDataInputsSync(char * accessToken,
	std::string accessToken, long long groupId, long long startMs, long long endMs, 
	void(* handler)(Inline_response_200_6, Error, void* )
	, void* userData);

/*! \brief /industrial/data. *Asynchronous*
 *
 * Fetch all of the data inputs for a group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
 * \param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllDataInputsAsync(char * accessToken,
	std::string accessToken, long long groupId, long long startMs, long long endMs, 
	void(* handler)(Inline_response_200_6, Error, void* )
	, void* userData);


/*! \brief /industrial/data/{data_input_id:[0-9]+}. *Synchronous*
 *
 * Fetch datapoints from a given data input.
 * \param accessToken Samsara API access token. *Required*
 * \param dataInputId ID of the data input *Required*
 * \param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
 * \param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDataInputSync(char * accessToken,
	std::string accessToken, long long dataInputId, long long startMs, long long endMs, 
	void(* handler)(DataInputHistoryResponse, Error, void* )
	, void* userData);

/*! \brief /industrial/data/{data_input_id:[0-9]+}. *Asynchronous*
 *
 * Fetch datapoints from a given data input.
 * \param accessToken Samsara API access token. *Required*
 * \param dataInputId ID of the data input *Required*
 * \param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
 * \param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDataInputAsync(char * accessToken,
	std::string accessToken, long long dataInputId, long long startMs, long long endMs, 
	void(* handler)(DataInputHistoryResponse, Error, void* )
	, void* userData);


/*! \brief /machines/list. *Synchronous*
 *
 * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
 * \param accessToken Samsara API access token. *Required*
 * \param groupParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getMachinesSync(char * accessToken,
	std::string accessToken, Inline_object_18 groupParam, 
	void(* handler)(Inline_response_200_7, Error, void* )
	, void* userData);

/*! \brief /machines/list. *Asynchronous*
 *
 * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
 * \param accessToken Samsara API access token. *Required*
 * \param groupParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getMachinesAsync(char * accessToken,
	std::string accessToken, Inline_object_18 groupParam, 
	void(* handler)(Inline_response_200_7, Error, void* )
	, void* userData);


/*! \brief /machines/history. *Synchronous*
 *
 * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
 * \param accessToken Samsara API access token. *Required*
 * \param historyParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getMachinesHistorySync(char * accessToken,
	std::string accessToken, Inline_object_17 historyParam, 
	void(* handler)(MachineHistoryResponse, Error, void* )
	, void* userData);

/*! \brief /machines/history. *Asynchronous*
 *
 * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
 * \param accessToken Samsara API access token. *Required*
 * \param historyParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getMachinesHistoryAsync(char * accessToken,
	std::string accessToken, Inline_object_17 historyParam, 
	void(* handler)(MachineHistoryResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.samsara.com/v1";
	}
};
/** @}*/

}
}
#endif /* IndustrialManager_H_ */
