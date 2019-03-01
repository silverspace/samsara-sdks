/*
 * TaggedSensor.h
 *
 * 
 */

#ifndef _TaggedSensor_H_
#define _TaggedSensor_H_


#include <string>
#include "TaggedSensorBase.h"
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

class TaggedSensor : public Object {
public:
	/*! \brief Constructor.
	 */
	TaggedSensor();
	TaggedSensor(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TaggedSensor();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the Sensor being tagged.
	 */
	long long getId();

	/*! \brief Set The ID of the Sensor being tagged.
	 */
	void setId(long long  id);
	/*! \brief Get Name of the Sensor being tagged.
	 */
	std::string getName();

	/*! \brief Set Name of the Sensor being tagged.
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

#endif /* _TaggedSensor_H_ */
