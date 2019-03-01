/*
 * DvirBase.h
 *
 * 
 */

#ifndef _DvirBase_H_
#define _DvirBase_H_


#include <string>
#include "DvirBase_authorSignature.h"
#include "DvirBase_mechanicOrAgentSignature.h"
#include "DvirBase_nextDriverSignature.h"
#include "DvirBase_trailerDefects.h"
#include "DvirBase_vehicle.h"
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

class DvirBase : public Object {
public:
	/*! \brief Constructor.
	 */
	DvirBase();
	DvirBase(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DvirBase();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	DvirBase_authorSignature getAuthorSignature();

	/*! \brief Set 
	 */
	void setAuthorSignature(DvirBase_authorSignature  authorSignature);
	/*! \brief Get Signifies if the defects on the vehicle corrected after the DVIR is done.
	 */
	bool getDefectsCorrected();

	/*! \brief Set Signifies if the defects on the vehicle corrected after the DVIR is done.
	 */
	void setDefectsCorrected(bool  defectsCorrected);
	/*! \brief Get Signifies if the defects on this vehicle can be ignored.
	 */
	bool getDefectsNeedNotBeCorrected();

	/*! \brief Set Signifies if the defects on this vehicle can be ignored.
	 */
	void setDefectsNeedNotBeCorrected(bool  defectsNeedNotBeCorrected);
	/*! \brief Get The id of this DVIR record.
	 */
	long long getId();

	/*! \brief Set The id of this DVIR record.
	 */
	void setId(long long  id);
	/*! \brief Get Inspection type of the DVIR.
	 */
	std::string getInspectionType();

	/*! \brief Set Inspection type of the DVIR.
	 */
	void setInspectionType(std::string  inspectionType);
	/*! \brief Get The mechanics notes on the DVIR.
	 */
	std::string getMechanicNotes();

	/*! \brief Set The mechanics notes on the DVIR.
	 */
	void setMechanicNotes(std::string  mechanicNotes);
	/*! \brief Get 
	 */
	DvirBase_mechanicOrAgentSignature getMechanicOrAgentSignature();

	/*! \brief Set 
	 */
	void setMechanicOrAgentSignature(DvirBase_mechanicOrAgentSignature  mechanicOrAgentSignature);
	/*! \brief Get 
	 */
	DvirBase_nextDriverSignature getNextDriverSignature();

	/*! \brief Set 
	 */
	void setNextDriverSignature(DvirBase_nextDriverSignature  nextDriverSignature);
	/*! \brief Get The odometer reading in miles for the vehicle when the DVIR was done.
	 */
	long long getOdometerMiles();

	/*! \brief Set The odometer reading in miles for the vehicle when the DVIR was done.
	 */
	void setOdometerMiles(long long  odometerMiles);
	/*! \brief Get Timestamp of this DVIR in UNIX milliseconds.
	 */
	long long getTimeMs();

	/*! \brief Set Timestamp of this DVIR in UNIX milliseconds.
	 */
	void setTimeMs(long long  timeMs);
	/*! \brief Get Defects registered for the trailer which was part of the DVIR.
	 */
	std::list<DvirBase_trailerDefects> getTrailerDefects();

	/*! \brief Set Defects registered for the trailer which was part of the DVIR.
	 */
	void setTrailerDefects(std::list <DvirBase_trailerDefects> trailerDefects);
	/*! \brief Get The id of the trailer which was part of the DVIR.
	 */
	int getTrailerId();

	/*! \brief Set The id of the trailer which was part of the DVIR.
	 */
	void setTrailerId(int  trailerId);
	/*! \brief Get The name of the trailer which was part of the DVIR.
	 */
	std::string getTrailerName();

	/*! \brief Set The name of the trailer which was part of the DVIR.
	 */
	void setTrailerName(std::string  trailerName);
	/*! \brief Get 
	 */
	DvirBase_vehicle getVehicle();

	/*! \brief Set 
	 */
	void setVehicle(DvirBase_vehicle  vehicle);
	/*! \brief Get The condition of vechile on which DVIR was done.
	 */
	std::string getVehicleCondition();

	/*! \brief Set The condition of vechile on which DVIR was done.
	 */
	void setVehicleCondition(std::string  vehicleCondition);
	/*! \brief Get Defects registered for the vehicle which was part of the DVIR.
	 */
	std::list<DvirBase_trailerDefects> getVehicleDefects();

	/*! \brief Set Defects registered for the vehicle which was part of the DVIR.
	 */
	void setVehicleDefects(std::list <DvirBase_trailerDefects> vehicleDefects);

private:
	DvirBase_authorSignature authorSignature;
	bool defectsCorrected;
	bool defectsNeedNotBeCorrected;
	long long id;
	std::string inspectionType;
	std::string mechanicNotes;
	DvirBase_mechanicOrAgentSignature mechanicOrAgentSignature;
	DvirBase_nextDriverSignature nextDriverSignature;
	long long odometerMiles;
	long long timeMs;
	std::list <DvirBase_trailerDefects>trailerDefects;
	int trailerId;
	std::string trailerName;
	DvirBase_vehicle vehicle;
	std::string vehicleCondition;
	std::list <DvirBase_trailerDefects>vehicleDefects;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DvirBase_H_ */
