/*
 * TaggedAddress.h
 *
 * 
 */

#ifndef _TaggedAddress_H_
#define _TaggedAddress_H_


#include <string>
#include "TaggedAddressBase.h"
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

class TaggedAddress : public Object {
public:
	/*! \brief Constructor.
	 */
	TaggedAddress();
	TaggedAddress(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TaggedAddress();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the address being tagged.
	 */
	long long getId();

	/*! \brief Set The ID of the address being tagged.
	 */
	void setId(long long  id);
	/*! \brief Get Name of the address being tagged.
	 */
	std::string getName();

	/*! \brief Set Name of the address being tagged.
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

#endif /* _TaggedAddress_H_ */
