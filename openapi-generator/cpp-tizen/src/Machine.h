/*
 * Machine.h
 *
 * Contains information about a machine.
 */

#ifndef _Machine_H_
#define _Machine_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains information about a machine.
 *
 *  \ingroup Models
 *
 */

class Machine : public Object {
public:
	/*! \brief Constructor.
	 */
	Machine();
	Machine(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Machine();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the machine.
	 */
	long long getId();

	/*! \brief Set ID of the machine.
	 */
	void setId(long long  id);
	/*! \brief Get Name of the machine.
	 */
	std::string getName();

	/*! \brief Set Name of the machine.
	 */
	void setName(std::string  name);
	/*! \brief Get Notes about the machine
	 */
	std::string getNotes();

	/*! \brief Set Notes about the machine
	 */
	void setNotes(std::string  notes);

private:
	long long id;
	std::string name;
	std::string notes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Machine_H_ */
