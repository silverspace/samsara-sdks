/*
 * DispatchRoute.h
 *
 * 
 */

#ifndef _DispatchRoute_H_
#define _DispatchRoute_H_


#include <string>
#include "DispatchJob.h"
#include "DispatchRouteBase.h"
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

class DispatchRoute : public Object {
public:
	/*! \brief Constructor.
	 */
	DispatchRoute();
	DispatchRoute(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DispatchRoute();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The time in Unix epoch milliseconds that the route actually ended.
	 */
	long long getActualEndMs();

	/*! \brief Set The time in Unix epoch milliseconds that the route actually ended.
	 */
	void setActualEndMs(long long  actual_end_ms);
	/*! \brief Get The time in Unix epoch milliseconds that the route actually started.
	 */
	long long getActualStartMs();

	/*! \brief Set The time in Unix epoch milliseconds that the route actually started.
	 */
	void setActualStartMs(long long  actual_start_ms);
	/*! \brief Get ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
	 */
	long long getDriverId();

	/*! \brief Set ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
	 */
	void setDriverId(long long  driver_id);
	/*! \brief Get ID of the group if the organization has multiple groups (optional).
	 */
	long long getGroupId();

	/*! \brief Set ID of the group if the organization has multiple groups (optional).
	 */
	void setGroupId(long long  group_id);
	/*! \brief Get Descriptive name of this route.
	 */
	std::string getName();

	/*! \brief Set Descriptive name of this route.
	 */
	void setName(std::string  name);
	/*! \brief Get The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
	 */
	long long getScheduledEndMs();

	/*! \brief Set The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
	 */
	void setScheduledEndMs(long long  scheduled_end_ms);
	/*! \brief Get The distance expected to be traveled for this route in meters.
	 */
	long long getScheduledMeters();

	/*! \brief Set The distance expected to be traveled for this route in meters.
	 */
	void setScheduledMeters(long long  scheduled_meters);
	/*! \brief Get The time in Unix epoch milliseconds that the route is scheduled to start.
	 */
	long long getScheduledStartMs();

	/*! \brief Set The time in Unix epoch milliseconds that the route is scheduled to start.
	 */
	void setScheduledStartMs(long long  scheduled_start_ms);
	/*! \brief Get The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
	 */
	std::string getStartLocationAddress();

	/*! \brief Set The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
	 */
	void setStartLocationAddress(std::string  start_location_address);
	/*! \brief Get ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
	 */
	long long getStartLocationAddressId();

	/*! \brief Set ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
	 */
	void setStartLocationAddressId(long long  start_location_address_id);
	/*! \brief Get Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
	 */
	double getStartLocationLat();

	/*! \brief Set Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
	 */
	void setStartLocationLat(double  start_location_lat);
	/*! \brief Get Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
	 */
	double getStartLocationLng();

	/*! \brief Set Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
	 */
	void setStartLocationLng(double  start_location_lng);
	/*! \brief Get The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
	 */
	std::string getStartLocationName();

	/*! \brief Set The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
	 */
	void setStartLocationName(std::string  start_location_name);
	/*! \brief Get ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
	 */
	long long getTrailerId();

	/*! \brief Set ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
	 */
	void setTrailerId(long long  trailer_id);
	/*! \brief Get ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
	 */
	long long getVehicleId();

	/*! \brief Set ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
	 */
	void setVehicleId(long long  vehicle_id);
	/*! \brief Get The dispatch jobs associated with this route.
	 */
	std::list<DispatchJob> getDispatchJobs();

	/*! \brief Set The dispatch jobs associated with this route.
	 */
	void setDispatchJobs(std::list <DispatchJob> dispatch_jobs);
	/*! \brief Get ID of the Samsara dispatch route.
	 */
	long long getId();

	/*! \brief Set ID of the Samsara dispatch route.
	 */
	void setId(long long  id);

private:
	long long actual_end_ms;
	long long actual_start_ms;
	long long driver_id;
	long long group_id;
	std::string name;
	long long scheduled_end_ms;
	long long scheduled_meters;
	long long scheduled_start_ms;
	std::string start_location_address;
	long long start_location_address_id;
	double start_location_lat;
	double start_location_lng;
	std::string start_location_name;
	long long trailer_id;
	long long vehicle_id;
	std::list <DispatchJob>dispatch_jobs;
	long long id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DispatchRoute_H_ */
