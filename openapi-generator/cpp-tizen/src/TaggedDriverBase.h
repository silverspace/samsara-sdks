/*
 * TaggedDriverBase.h
 *
 * 
 */

#ifndef _TaggedDriverBase_H_
#define _TaggedDriverBase_H_


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

class TaggedDriverBase : public Object {
public:
	/*! \brief Constructor.
	 */
	TaggedDriverBase();
	TaggedDriverBase(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TaggedDriverBase();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the Driver being tagged.
	 */
	long long getId();

	/*! \brief Set The ID of the Driver being tagged.
	 */
	void setId(long long  id);

private:
	long long id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TaggedDriverBase_H_ */
