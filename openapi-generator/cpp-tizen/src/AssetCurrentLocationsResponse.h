/*
 * AssetCurrentLocationsResponse.h
 *
 * Basic information of an asset
 */

#ifndef _AssetCurrentLocationsResponse_H_
#define _AssetCurrentLocationsResponse_H_


#include <string>
#include "AssetCurrentLocation.h"
#include "Asset_cable.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Basic information of an asset
 *
 *  \ingroup Models
 *
 */

class AssetCurrentLocationsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetCurrentLocationsResponse();
	AssetCurrentLocationsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetCurrentLocationsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The cable connected to the asset
	 */
	std::list<Asset_cable> getCable();

	/*! \brief Set The cable connected to the asset
	 */
	void setCable(std::list <Asset_cable> cable);
	/*! \brief Get Engine hours
	 */
	int getEngineHours();

	/*! \brief Set Engine hours
	 */
	void setEngineHours(int  engineHours);
	/*! \brief Get Asset ID
	 */
	long long getId();

	/*! \brief Set Asset ID
	 */
	void setId(long long  id);
	/*! \brief Get Current location of an asset
	 */
	std::list<AssetCurrentLocation> getLocation();

	/*! \brief Set Current location of an asset
	 */
	void setLocation(std::list <AssetCurrentLocation> location);
	/*! \brief Get Asset name
	 */
	std::string getName();

	/*! \brief Set Asset name
	 */
	void setName(std::string  name);

private:
	std::list <Asset_cable>cable;
	int engineHours;
	long long id;
	std::list <AssetCurrentLocation>location;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetCurrentLocationsResponse_H_ */
