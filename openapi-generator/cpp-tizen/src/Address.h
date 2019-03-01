/*
 * Address.h
 *
 * Information about an address/geofence. Geofences are either a circle or a polygon.
 */

#ifndef _Address_H_
#define _Address_H_


#include <string>
#include "AddressGeofence.h"
#include "Contact.h"
#include "TagMetadata.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Information about an address/geofence. Geofences are either a circle or a polygon.
 *
 *  \ingroup Models
 *
 */

class Address : public Object {
public:
	/*! \brief Constructor.
	 */
	Address();
	Address(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Address();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Contact> getContacts();

	/*! \brief Set 
	 */
	void setContacts(std::list <Contact> contacts);
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
	/*! \brief Get ID of the address
	 */
	long long getId();

	/*! \brief Set ID of the address
	 */
	void setId(long long  id);
	/*! \brief Get Name of the address or geofence
	 */
	std::string getName();

	/*! \brief Set Name of the address or geofence
	 */
	void setName(std::string  name);
	/*! \brief Get Notes associated with an address.
	 */
	std::string getNotes();

	/*! \brief Set Notes associated with an address.
	 */
	void setNotes(std::string  notes);
	/*! \brief Get 
	 */
	std::list<TagMetadata> getTags();

	/*! \brief Set 
	 */
	void setTags(std::list <TagMetadata> tags);

private:
	std::list <Contact>contacts;
	std::string formattedAddress;
	AddressGeofence geofence;
	long long id;
	std::string name;
	std::string notes;
	std::list <TagMetadata>tags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Address_H_ */
