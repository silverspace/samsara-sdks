/*
 * MachineHistoryResponse.h
 *
 * Contains the results for a machine history request
 */

#ifndef _MachineHistoryResponse_H_
#define _MachineHistoryResponse_H_


#include <string>
#include "MachineHistoryResponse_machines.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains the results for a machine history request
 *
 *  \ingroup Models
 *
 */

class MachineHistoryResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	MachineHistoryResponse();
	MachineHistoryResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MachineHistoryResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<MachineHistoryResponse_machines> getMachines();

	/*! \brief Set 
	 */
	void setMachines(std::list <MachineHistoryResponse_machines> machines);

private:
	std::list <MachineHistoryResponse_machines>machines;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MachineHistoryResponse_H_ */
