/*
 * Inline_object_1.h
 *
 * 
 */

#ifndef _Inline_object_1_H_
#define _Inline_object_1_H_


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

class Inline_object_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_1();
	Inline_object_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of IDs for contact book entries.
	 */
	std::list<long long> getContactIds();

	/*! \brief Set A list of IDs for contact book entries.
	 */
	void setContactIds(std::list <long long> contactIds);
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
	/*! \brief Get The name of this address/geofence
	 */
	std::string getName();

	/*! \brief Set The name of this address/geofence
	 */
	void setName(std::string  name);
	/*! \brief Get Notes associated with an address.
	 */
	std::string getNotes();

	/*! \brief Set Notes associated with an address.
	 */
	void setNotes(std::string  notes);
	/*! \brief Get A list of tag IDs.
	 */
	std::list<long long> getTagIds();

	/*! \brief Set A list of tag IDs.
	 */
	void setTagIds(std::list <long long> tagIds);

private:
	std::list <long long>contactIds;
	std::string formattedAddress;
	AddressGeofence geofence;
	std::string name;
	std::string notes;
	std::list <long long>tagIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_1_H_ */
