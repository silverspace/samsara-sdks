/*
 * Inline_response_200_5_vehicleStats.h
 *
 * 
 */

#ifndef _Inline_response_200_5_vehicleStats_H_
#define _Inline_response_200_5_vehicleStats_H_


#include <string>
#include "AuxInputSeries.h"
#include "EngineState.h"
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

class Inline_response_200_5_vehicleStats : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_response_200_5_vehicleStats();
	Inline_response_200_5_vehicleStats(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_response_200_5_vehicleStats();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<EngineState> getEngineState();

	/*! \brief Set 
	 */
	void setEngineState(std::list <EngineState> engineState);
	/*! \brief Get 
	 */
	AuxInputSeries getAuxInput2();

	/*! \brief Set 
	 */
	void setAuxInput2(AuxInputSeries  auxInput2);
	/*! \brief Get ID of the vehicle.
	 */
	long long getVehicleId();

	/*! \brief Set ID of the vehicle.
	 */
	void setVehicleId(long long  vehicleId);
	/*! \brief Get 
	 */
	AuxInputSeries getAuxInput1();

	/*! \brief Set 
	 */
	void setAuxInput1(AuxInputSeries  auxInput1);

private:
	std::list <EngineState>engineState;
	AuxInputSeries auxInput2;
	long long vehicleId;
	AuxInputSeries auxInput1;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_response_200_5_vehicleStats_H_ */
