/*
 * Inline_object_12.h
 *
 * 
 */

#ifndef _Inline_object_12_H_
#define _Inline_object_12_H_


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

class Inline_object_12 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_12();
	Inline_object_12(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_12();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Only type 'mechanic' is currently accepted.
	 */
	std::string getInspectionType();

	/*! \brief Set Only type 'mechanic' is currently accepted.
	 */
	void setInspectionType(std::string  inspectionType);
	/*! \brief Get Any notes from the mechanic.
	 */
	std::string getMechanicNotes();

	/*! \brief Set Any notes from the mechanic.
	 */
	void setMechanicNotes(std::string  mechanicNotes);
	/*! \brief Get The current odometer of the vehicle.
	 */
	int getOdometerMiles();

	/*! \brief Set The current odometer of the vehicle.
	 */
	void setOdometerMiles(int  odometerMiles);
	/*! \brief Get Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
	 */
	bool getPreviousDefectsCorrected();

	/*! \brief Set Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
	 */
	void setPreviousDefectsCorrected(bool  previousDefectsCorrected);
	/*! \brief Get Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
	 */
	bool getPreviousDefectsIgnored();

	/*! \brief Set Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
	 */
	void setPreviousDefectsIgnored(bool  previousDefectsIgnored);
	/*! \brief Get Whether or not this vehicle or trailer is safe to drive.
	 */
	std::string getSafe();

	/*! \brief Set Whether or not this vehicle or trailer is safe to drive.
	 */
	void setSafe(std::string  safe);
	/*! \brief Get Id of trailer being inspected. Either vehicleId or trailerId must be provided.
	 */
	int getTrailerId();

	/*! \brief Set Id of trailer being inspected. Either vehicleId or trailerId must be provided.
	 */
	void setTrailerId(int  trailerId);
	/*! \brief Get The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
	 */
	std::string getUserEmail();

	/*! \brief Set The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
	 */
	void setUserEmail(std::string  userEmail);
	/*! \brief Get Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
	 */
	int getVehicleId();

	/*! \brief Set Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
	 */
	void setVehicleId(int  vehicleId);

private:
	std::string inspectionType;
	std::string mechanicNotes;
	int odometerMiles;
	bool previousDefectsCorrected;
	bool previousDefectsIgnored;
	std::string safe;
	int trailerId;
	std::string userEmail;
	int vehicleId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_12_H_ */
