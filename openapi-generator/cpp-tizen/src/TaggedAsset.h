/*
 * TaggedAsset.h
 *
 * 
 */

#ifndef _TaggedAsset_H_
#define _TaggedAsset_H_


#include <string>
#include "TaggedAssetBase.h"
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

class TaggedAsset : public Object {
public:
	/*! \brief Constructor.
	 */
	TaggedAsset();
	TaggedAsset(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TaggedAsset();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the Asset being tagged.
	 */
	long long getId();

	/*! \brief Set The ID of the Asset being tagged.
	 */
	void setId(long long  id);
	/*! \brief Get Name of the Asset being tagged.
	 */
	std::string getName();

	/*! \brief Set Name of the Asset being tagged.
	 */
	void setName(std::string  name);

private:
	long long id;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TaggedAsset_H_ */
