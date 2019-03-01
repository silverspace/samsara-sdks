/*
 * Inline_response_200_8.h
 *
 * 
 */

#ifndef _Inline_response_200_8_H_
#define _Inline_response_200_8_H_


#include <string>
#include "Sensor.h"
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

class Inline_response_200_8 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_response_200_8();
	Inline_response_200_8(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_response_200_8();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Sensor> getSensors();

	/*! \brief Set 
	 */
	void setSensors(std::list <Sensor> sensors);

private:
	std::list <Sensor>sensors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_response_200_8_H_ */
