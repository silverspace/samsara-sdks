/*
 * _addresses_addresses.h
 *
 * 
 */

#ifndef __addresses_addresses_H_
#define __addresses_addresses_H_


#include <string>
#include "AddressGeofence.h"
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

class _addresses_addresses : public Object {
public:
	/*! \brief Constructor.
	 */
	_addresses_addresses();
	_addresses_addresses(char* str);

	/*! \brief Destructor.
	 */
	virtual ~_addresses_addresses();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Notes associated with an address.
	 */
	std::string getNotes();

	/*! \brief Set Notes associated with an address.
	 */
	void setNotes(std::string  notes);
	/*! \brief Get The full address associated with this address/geofence, as it might be recognized by maps.google.com
	 */
	std::string getFormattedAddress();

	/*! \brief Set The full address associated with this address/geofence, as it might be recognized by maps.google.com
	 */
	void setFormattedAddress(std::string  formattedAddress);
	/*! \brief Get 
	 */
	AddressGeofence getGeofence();

	/*! \brief Set 
	 */
	void setGeofence(AddressGeofence  geofence);
	/*! \brief Get A list of tag IDs.
	 */
	std::list<long long> getTagIds();

	/*! \brief Set A list of tag IDs.
	 */
	void setTagIds(std::list <long long> tagIds);
	/*! \brief Get The name of this address/geofence
	 */
	std::string getName();

	/*! \brief Set The name of this address/geofence
	 */
	void setName(std::string  name);
	/*! \brief Get A list of IDs for contact book entries.
	 */
	std::list<long long> getContactIds();

	/*! \brief Set A list of IDs for contact book entries.
	 */
	void setContactIds(std::list <long long> contactIds);

private:
	std::string notes;
	std::string formattedAddress;
	AddressGeofence geofence;
	std::list <long long>tagIds;
	std::string name;
	std::list <long long>contactIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* __addresses_addresses_H_ */
