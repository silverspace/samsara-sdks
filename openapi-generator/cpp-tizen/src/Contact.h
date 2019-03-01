/*
 * Contact.h
 *
 * Information about a notification contact for alerts.
 */

#ifndef _Contact_H_
#define _Contact_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Information about a notification contact for alerts.
 *
 *  \ingroup Models
 *
 */

class Contact : public Object {
public:
	/*! \brief Constructor.
	 */
	Contact();
	Contact(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Contact();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Email address of the contact
	 */
	std::string getEmail();

	/*! \brief Set Email address of the contact
	 */
	void setEmail(std::string  email);
	/*! \brief Get First name of the contact
	 */
	std::string getFirstName();

	/*! \brief Set First name of the contact
	 */
	void setFirstName(std::string  firstName);
	/*! \brief Get ID of the contact
	 */
	long long getId();

	/*! \brief Set ID of the contact
	 */
	void setId(long long  id);
	/*! \brief Get Last name of the contact
	 */
	std::string getLastName();

	/*! \brief Set Last name of the contact
	 */
	void setLastName(std::string  lastName);
	/*! \brief Get Phone number of the contact
	 */
	std::string getPhone();

	/*! \brief Set Phone number of the contact
	 */
	void setPhone(std::string  phone);

private:
	std::string email;
	std::string firstName;
	long long id;
	std::string lastName;
	std::string phone;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Contact_H_ */
