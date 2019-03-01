/*
 * DispatchJob.h
 *
 * 
 */

#ifndef _DispatchJob_H_
#define _DispatchJob_H_


#include <string>
#include "DispatchJobCreate.h"
#include "JobStatus.h"
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

class DispatchJob : public Object {
public:
	/*! \brief Constructor.
	 */
	DispatchJob();
	DispatchJob(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DispatchJob();

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
	/*! \brief Get The time at which the driver arrived at the job destination.
	 */
	long long getArrivedAtMs();

	/*! \brief Set The time at which the driver arrived at the job destination.
	 */
	void setArrivedAtMs(long long  arrived_at_ms);
	/*! \brief Get The time at which the job was marked complete (e.g. started driving to the next destination).
	 */
	long long getCompletedAtMs();

	/*! \brief Set The time at which the job was marked complete (e.g. started driving to the next destination).
	 */
	void setCompletedAtMs(long long  completed_at_ms);
	/*! \brief Get ID of the route that this job belongs to.
	 */
	long long getDispatchRouteId();

	/*! \brief Set ID of the route that this job belongs to.
	 */
	void setDispatchRouteId(long long  dispatch_route_id);
	/*! \brief Get ID of the driver assigned to the dispatch job.
	 */
	long long getDriverId();

	/*! \brief Set ID of the driver assigned to the dispatch job.
	 */
	void setDriverId(long long  driver_id);
	/*! \brief Get The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
	 */
	long long getEnRouteAtMs();

	/*! \brief Set The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
	 */
	void setEnRouteAtMs(long long  en_route_at_ms);
	/*! \brief Get The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
	 */
	long long getEstimatedArrivalMs();

	/*! \brief Set The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
	 */
	void setEstimatedArrivalMs(long long  estimated_arrival_ms);
	/*! \brief Get Fleet viewer url of the dispatch job.
	 */
	std::string getFleetViewerUrl();

	/*! \brief Set Fleet viewer url of the dispatch job.
	 */
	void setFleetViewerUrl(std::string  fleet_viewer_url);
	/*! \brief Get 
	 */
	long long getGroupId();

	/*! \brief Set 
	 */
	void setGroupId(long long  group_id);
	/*! \brief Get ID of the Samsara dispatch job.
	 */
	long long getId();

	/*! \brief Set ID of the Samsara dispatch job.
	 */
	void setId(long long  id);
	/*! \brief Get 
	 */
	JobStatus getJobState();

	/*! \brief Set 
	 */
	void setJobState(JobStatus  job_state);
	/*! \brief Get The time at which the job was marked skipped.
	 */
	long long getSkippedAtMs();

	/*! \brief Set The time at which the job was marked skipped.
	 */
	void setSkippedAtMs(long long  skipped_at_ms);
	/*! \brief Get ID of the vehicle used for the dispatch job.
	 */
	long long getVehicleId();

	/*! \brief Set ID of the vehicle used for the dispatch job.
	 */
	void setVehicleId(long long  vehicle_id);

private:
	std::string destination_address;
	long long destination_address_id;
	double destination_lat;
	double destination_lng;
	std::string destination_name;
	std::string notes;
	long long scheduled_arrival_time_ms;
	long long scheduled_departure_time_ms;
	long long arrived_at_ms;
	long long completed_at_ms;
	long long dispatch_route_id;
	long long driver_id;
	long long en_route_at_ms;
	long long estimated_arrival_ms;
	std::string fleet_viewer_url;
	long long group_id;
	long long id;
	JobStatus job_state;
	long long skipped_at_ms;
	long long vehicle_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DispatchJob_H_ */
