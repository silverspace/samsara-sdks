/*
 * AuxInput.h
 *
 * Digital value of an aux input.
 */

#ifndef _AuxInput_H_
#define _AuxInput_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Digital value of an aux input.
 *
 *  \ingroup Models
 *
 */

class AuxInput : public Object {
public:
	/*! \brief Constructor.
	 */
	AuxInput();
	AuxInput(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuxInput();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Timestamp in Unix epoch milliseconds.
	 */
	std::string getTimeMs();

	/*! \brief Set Timestamp in Unix epoch milliseconds.
	 */
	void setTimeMs(std::string  timeMs);
	/*! \brief Get Boolean representing the digital value of the aux input.
	 */
	bool getValue();

	/*! \brief Set Boolean representing the digital value of the aux input.
	 */
	void setValue(bool  value);

private:
	std::string timeMs;
	bool value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuxInput_H_ */
