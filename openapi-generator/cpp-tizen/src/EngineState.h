/*
 * EngineState.h
 *
 * The state of the vehicle over time. State can be Running, Off, or Idle.
 */

#ifndef _EngineState_H_
#define _EngineState_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The state of the vehicle over time. State can be Running, Off, or Idle.
 *
 *  \ingroup Models
 *
 */

class EngineState : public Object {
public:
	/*! \brief Constructor.
	 */
	EngineState();
	EngineState(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EngineState();

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
	/*! \brief Get 
	 */
	std::string getValue();

	/*! \brief Set 
	 */
	void setValue(std::string  value);

private:
	std::string timeMs;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EngineState_H_ */
