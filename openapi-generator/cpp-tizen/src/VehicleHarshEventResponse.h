/*
 * VehicleHarshEventResponse.h
 *
 * Harsh event details for a vehicle
 */

#ifndef _VehicleHarshEventResponse_H_
#define _VehicleHarshEventResponse_H_


#include <string>
#include "VehicleHarshEventResponse_location.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Harsh event details for a vehicle
 *
 *  \ingroup Models
 *
 */

class VehicleHarshEventResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	VehicleHarshEventResponse();
	VehicleHarshEventResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VehicleHarshEventResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get URL for downloading the forward facing video
	 */
	std::string getDownloadForwardVideoUrl();

	/*! \brief Set URL for downloading the forward facing video
	 */
	void setDownloadForwardVideoUrl(std::string  downloadForwardVideoUrl);
	/*! \brief Get URL for downloading the inward facing video
	 */
	std::string getDownloadInwardVideoUrl();

	/*! \brief Set URL for downloading the inward facing video
	 */
	void setDownloadInwardVideoUrl(std::string  downloadInwardVideoUrl);
	/*! \brief Get URL for downloading the tracked inward facing video
	 */
	std::string getDownloadTrackedInwardVideoUrl();

	/*! \brief Set URL for downloading the tracked inward facing video
	 */
	void setDownloadTrackedInwardVideoUrl(std::string  downloadTrackedInwardVideoUrl);
	/*! \brief Get Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
	 */
	std::string getHarshEventType();

	/*! \brief Set Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
	 */
	void setHarshEventType(std::string  harshEventType);
	/*! \brief Get URL of the associated incident report page
	 */
	std::string getIncidentReportUrl();

	/*! \brief Set URL of the associated incident report page
	 */
	void setIncidentReportUrl(std::string  incidentReportUrl);
	/*! \brief Get Whether the driver was deemed distracted during this harsh event
	 */
	bool getIsDistracted();

	/*! \brief Set Whether the driver was deemed distracted during this harsh event
	 */
	void setIsDistracted(bool  isDistracted);
	/*! \brief Get 
	 */
	VehicleHarshEventResponse_location getLocation();

	/*! \brief Set 
	 */
	void setLocation(VehicleHarshEventResponse_location  location);

private:
	std::string downloadForwardVideoUrl;
	std::string downloadInwardVideoUrl;
	std::string downloadTrackedInwardVideoUrl;
	std::string harshEventType;
	std::string incidentReportUrl;
	bool isDistracted;
	VehicleHarshEventResponse_location location;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VehicleHarshEventResponse_H_ */
