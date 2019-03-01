/*
 * CurrentDriver.h
 *
 * 
 */

#ifndef _CurrentDriver_H_
#define _CurrentDriver_H_


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

class CurrentDriver : public Object {
public:
	/*! \brief Constructor.
	 */
	CurrentDriver();
	CurrentDriver(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CurrentDriver();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CurrentDriver_H_ */
