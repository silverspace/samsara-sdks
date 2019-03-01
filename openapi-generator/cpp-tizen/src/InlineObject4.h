/*
 * Inline_object_4.h
 *
 * 
 */

#ifndef _Inline_object_4_H_
#define _Inline_object_4_H_


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

class Inline_object_4 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_4();
	Inline_object_4(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_4();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get True indicates that this driver should be reactivated.
	 */
	bool getReactivate();

	/*! \brief Set True indicates that this driver should be reactivated.
	 */
	void setReactivate(bool  reactivate);

private:
	bool reactivate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_4_H_ */
