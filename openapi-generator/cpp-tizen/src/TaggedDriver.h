/*
 * TaggedDriver.h
 *
 * 
 */

#ifndef _TaggedDriver_H_
#define _TaggedDriver_H_


#include <string>
#include "TaggedDriverBase.h"
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

class TaggedDriver : public Object {
public:
	/*! \brief Constructor.
	 */
	TaggedDriver();
	TaggedDriver(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TaggedDriver();

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
	/*! \brief Get Name of the Driver being tagged.
	 */
	std::string getName();

	/*! \brief Set Name of the Driver being tagged.
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

#endif /* _TaggedDriver_H_ */
