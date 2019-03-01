/*
 * DispatchJobCreate.h
 *
 * 
 */

#ifndef _DispatchJobCreate_H_
#define _DispatchJobCreate_H_


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

class DispatchJobCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	DispatchJobCreate();
	DispatchJobCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DispatchJobCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
	 */
	std::string getDestinationAddress();

	/*! \brief Set The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
	 */
	void setDestinationAddress(std::string  destination_address);
	/*! \brief Get ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
	 */
	long long getDestinationAddressId();

	/*! \brief Set ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
	 */
	void setDestinationAddressId(long long  destination_address_id);
	/*! \brief Get Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
	 */
	double getDestinationLat();

	/*! \brief Set Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
	 */
	void setDestinationLat(double  destination_lat);
	/*! \brief Get Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
	 */
	double getDestinationLng();

	/*! \brief Set Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
	 */
	void setDestinationLng(double  destination_lng);
	/*! \brief Get The name of the job destination. If provided, it will take precedence over the name of the address book entry.
	 */
	std::string getDestinationName();

	/*! \brief Set The name of the job destination. If provided, it will take precedence over the name of the address book entry.
	 */
	void setDestinationName(std::string  destination_name);
	/*! \brief Get Notes regarding the details of this job.
	 */
	std::string getNotes();

	/*! \brief Set Notes regarding the details of this job.
	 */
	void setNotes(std::string  notes);
	/*! \brief Get The time at which the assigned driver is scheduled to arrive at the job destination.
	 */
	long long getScheduledArrivalTimeMs();

	/*! \brief Set The time at which the assigned driver is scheduled to arrive at the job destination.
	 */
	void setScheduledArrivalTimeMs(long long  scheduled_arrival_time_ms);
	/*! \brief Get The time at which the assigned driver is scheduled to depart from the job destination.
	 */
	long long getScheduledDepartureTimeMs();

	/*! \brief Set The time at which the assigned driver is scheduled to depart from the job destination.
	 */
	void setScheduledDepartureTimeMs(long long  scheduled_departure_time_ms);

private:
	std::string destination_address;
	long long destination_address_id;
	double destination_lat;
	double destination_lng;
	std::string destination_name;
	std::string notes;
	long long scheduled_arrival_time_ms;
	long long scheduled_departure_time_ms;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DispatchJobCreate_H_ */
