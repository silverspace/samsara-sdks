/*
 * MachineHistoryResponse_machines.h
 *
 * 
 */

#ifndef _MachineHistoryResponse_machines_H_
#define _MachineHistoryResponse_machines_H_


#include <string>
#include "MachineHistoryResponse_vibrations.h"
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

class MachineHistoryResponse_machines : public Object {
public:
	/*! \brief Constructor.
	 */
	MachineHistoryResponse_machines();
	MachineHistoryResponse_machines(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MachineHistoryResponse_machines();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Machine name
	 */
	std::string getName();

	/*! \brief Set Machine name
	 */
	void setName(std::string  name);
	/*! \brief Get Machine ID
	 */
	int getId();

	/*! \brief Set Machine ID
	 */
	void setId(int  id);
	/*! \brief Get List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
	 */
	std::list<MachineHistoryResponse_vibrations> getVibrations();

	/*! \brief Set List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
	 */
	void setVibrations(std::list <MachineHistoryResponse_vibrations> vibrations);

private:
	std::string name;
	int id;
	std::list <MachineHistoryResponse_vibrations>vibrations;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MachineHistoryResponse_machines_H_ */
