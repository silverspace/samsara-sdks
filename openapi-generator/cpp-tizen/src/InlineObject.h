/*
 * Inline_object.h
 *
 * 
 */

#ifndef _Inline_object_H_
#define _Inline_object_H_


#include <string>
#include "_addresses_addresses.h"
#include <list>
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

class Inline_object : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object();
	Inline_object(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<_addresses_addresses> getAddresses();

	/*! \brief Set 
	 */
	void setAddresses(std::list <_addresses_addresses> addresses);

private:
	std::list <_addresses_addresses>addresses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_H_ */
