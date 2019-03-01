/*
 * Asset.h
 *
 * Basic information of an asset
 */

#ifndef _Asset_H_
#define _Asset_H_


#include <string>
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

class Asset : public Object {
public:
	/*! \brief Constructor.
	 */
	Asset();
	Asset(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Asset();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Serial number of the host asset
	 */
	std::string getAssetSerialNumber();

	/*! \brief Set Serial number of the host asset
	 */
	void setAssetSerialNumber(std::string  assetSerialNumber);
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
	/*! \brief Get Asset name
	 */
	std::string getName();

	/*! \brief Set Asset name
	 */
	void setName(std::string  name);

private:
	std::string assetSerialNumber;
	std::list <Asset_cable>cable;
	int engineHours;
	long long id;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Asset_H_ */
