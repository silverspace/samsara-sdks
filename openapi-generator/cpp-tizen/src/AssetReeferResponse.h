/*
 * AssetReeferResponse.h
 *
 * Reefer-specific asset details
 */

#ifndef _AssetReeferResponse_H_
#define _AssetReeferResponse_H_


#include <string>
#include "AssetReeferResponse_reeferStats.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Reefer-specific asset details
 *
 *  \ingroup Models
 *
 */

class AssetReeferResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetReeferResponse();
	AssetReeferResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetReeferResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Asset type
	 */
	std::string getAssetType();

	/*! \brief Set Asset type
	 */
	void setAssetType(std::string  assetType);
	/*! \brief Get Asset ID
	 */
	int getId();

	/*! \brief Set Asset ID
	 */
	void setId(int  id);
	/*! \brief Get Asset name
	 */
	std::string getName();

	/*! \brief Set Asset name
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	AssetReeferResponse_reeferStats getReeferStats();

	/*! \brief Set 
	 */
	void setReeferStats(AssetReeferResponse_reeferStats  reeferStats);

private:
	std::string assetType;
	int id;
	std::string name;
	AssetReeferResponse_reeferStats reeferStats;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetReeferResponse_H_ */
