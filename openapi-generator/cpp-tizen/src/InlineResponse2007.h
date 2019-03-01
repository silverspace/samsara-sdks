/*
 * Inline_response_200_7.h
 *
 * 
 */

#ifndef _Inline_response_200_7_H_
#define _Inline_response_200_7_H_


#include <string>
#include "Machine.h"
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

class Inline_response_200_7 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_response_200_7();
	Inline_response_200_7(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_response_200_7();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Machine> getMachines();

	/*! \brief Set 
	 */
	void setMachines(std::list <Machine> machines);

private:
	std::list <Machine>machines;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_response_200_7_H_ */
