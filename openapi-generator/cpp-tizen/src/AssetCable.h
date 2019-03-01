/*
 * Asset_cable.h
 *
 * 
 */

#ifndef _Asset_cable_H_
#define _Asset_cable_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Asset_cable : public Object {
public:
	/*! \brief Constructor.
	 */
	Asset_cable();
	Asset_cable(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Asset_cable();

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

private:
	std::string assetType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Asset_cable_H_ */
