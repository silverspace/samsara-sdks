/*
 * MachineHistoryResponse_vibrations.h
 *
 * 
 */

#ifndef _MachineHistoryResponse_vibrations_H_
#define _MachineHistoryResponse_vibrations_H_


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

class MachineHistoryResponse_vibrations : public Object {
public:
	/*! \brief Constructor.
	 */
	MachineHistoryResponse_vibrations();
	MachineHistoryResponse_vibrations(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MachineHistoryResponse_vibrations();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	double getX();

	/*! \brief Set 
	 */
	void setX(double  x);
	/*! \brief Get 
	 */
	double getY();

	/*! \brief Set 
	 */
	void setY(double  y);
	/*! \brief Get 
	 */
	double getZ();

	/*! \brief Set 
	 */
	void setZ(double  z);
	/*! \brief Get 
	 */
	long long getTime();

	/*! \brief Set 
	 */
	void setTime(long long  time);

private:
	double x;
	double y;
	double z;
	long long time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MachineHistoryResponse_vibrations_H_ */
