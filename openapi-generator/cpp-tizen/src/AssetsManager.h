#ifndef _AssetsManager_H_
#define _AssetsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AssetReeferResponse.h"
#include "Inline_response_200.h"
#include "Inline_response_200_1.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Assets Assets
 * \ingroup Operations
 *  @{
 */
class AssetsManager {
public:
	AssetsManager();
	virtual ~AssetsManager();

/*! \brief /fleet/assets/locations. *Synchronous*
 *
 * Fetch current locations of all assets for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllAssetCurrentLocationsSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_1, Error, void* )
	, void* userData);

/*! \brief /fleet/assets/locations. *Asynchronous*
 *
 * Fetch current locations of all assets for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllAssetCurrentLocationsAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_1, Error, void* )
	, void* userData);


/*! \brief /fleet/assets. *Synchronous*
 *
 * Fetch all of the assets for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllAssetsSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData);

/*! \brief /fleet/assets. *Asynchronous*
 *
 * Fetch all of the assets for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllAssetsAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData);


/*! \brief /fleet/assets/{assetId:[0-9]+}/locations. *Synchronous*
 *
 * Fetch the historical locations for the asset.
 * \param accessToken Samsara API access token. *Required*
 * \param assetId ID of the asset *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAssetLocationSync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);

/*! \brief /fleet/assets/{assetId:[0-9]+}/locations. *Asynchronous*
 *
 * Fetch the historical locations for the asset.
 * \param accessToken Samsara API access token. *Required*
 * \param assetId ID of the asset *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAssetLocationAsync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);


/*! \brief /fleet/assets/{assetId:[0-9]+}/reefer. *Synchronous*
 *
 * Fetch the reefer-specific stats of an asset.
 * \param accessToken Samsara API access token. *Required*
 * \param assetId ID of the asset *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAssetReeferSync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(AssetReeferResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/assets/{assetId:[0-9]+}/reefer. *Asynchronous*
 *
 * Fetch the reefer-specific stats of an asset.
 * \param accessToken Samsara API access token. *Required*
 * \param assetId ID of the asset *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAssetReeferAsync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(AssetReeferResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.samsara.com/v1";
	}
};
/** @}*/

}
}
#endif /* AssetsManager_H_ */
