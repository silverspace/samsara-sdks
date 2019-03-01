/*
 * Driver.h
 *
 * 
 */

#ifndef _Driver_H_
#define _Driver_H_


#include <string>
#include "DriverBase.h"
#include "TagMetadata.h"
#include <list>
#include <map>
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

class Driver : public Object {
public:
	/*! \brief Constructor.
	 */
	Driver();
	Driver(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Driver();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
	 */
	bool getEldAdverseWeatherExemptionEnabled();

	/*! \brief Set Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
	 */
	void setEldAdverseWeatherExemptionEnabled(bool  eldAdverseWeatherExemptionEnabled);
	/*! \brief Get Flag indicating this driver may use Big Day excemptions in ELD logs.
	 */
	bool getEldBigDayExemptionEnabled();

	/*! \brief Set Flag indicating this driver may use Big Day excemptions in ELD logs.
	 */
	void setEldBigDayExemptionEnabled(bool  eldBigDayExemptionEnabled);
	/*! \brief Get 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
	 */
	int getEldDayStartHour();

	/*! \brief Set 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
	 */
	void setEldDayStartHour(int  eldDayStartHour);
	/*! \brief Get Flag indicating this driver is exempt from the Electronic Logging Mandate.
	 */
	bool getEldExempt();

	/*! \brief Set Flag indicating this driver is exempt from the Electronic Logging Mandate.
	 */
	void setEldExempt(bool  eldExempt);
	/*! \brief Get Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
	 */
	std::string getEldExemptReason();

	/*! \brief Set Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
	 */
	void setEldExemptReason(std::string  eldExemptReason);
	/*! \brief Get Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
	 */
	bool getEldPcEnabled();

	/*! \brief Set Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
	 */
	void setEldPcEnabled(bool  eldPcEnabled);
	/*! \brief Get Flag indicating this driver may select the Yard Move duty status in ELD logs.
	 */
	bool getEldYmEnabled();

	/*! \brief Set Flag indicating this driver may select the Yard Move duty status in ELD logs.
	 */
	void setEldYmEnabled(bool  eldYmEnabled);
	/*! \brief Get Dictionary of external IDs (string key-value pairs)
	 */
	std::map<std::string, std::string> getExternalIds();

	/*! \brief Set Dictionary of external IDs (string key-value pairs)
	 */
	void setExternalIds(std::map <std::string, std::string> externalIds);
	/*! \brief Get ID of the group if the organization has multiple groups (uncommon).
	 */
	long long getGroupId();

	/*! \brief Set ID of the group if the organization has multiple groups (uncommon).
	 */
	void setGroupId(long long  groupId);
	/*! \brief Get Driver's state issued license number.
	 */
	std::string getLicenseNumber();

	/*! \brief Set Driver's state issued license number.
	 */
	void setLicenseNumber(std::string  licenseNumber);
	/*! \brief Get Abbreviation of state that issued driver's license.
	 */
	std::string getLicenseState();

	/*! \brief Set Abbreviation of state that issued driver's license.
	 */
	void setLicenseState(std::string  licenseState);
	/*! \brief Get Driver's name.
	 */
	std::string getName();

	/*! \brief Set Driver's name.
	 */
	void setName(std::string  name);
	/*! \brief Get Notes about the driver.
	 */
	std::string getNotes();

	/*! \brief Set Notes about the driver.
	 */
	void setNotes(std::string  notes);
	/*! \brief Get Driver's phone number. Please include only digits, ex. 4157771234
	 */
	std::string getPhone();

	/*! \brief Set Driver's phone number. Please include only digits, ex. 4157771234
	 */
	void setPhone(std::string  phone);
	/*! \brief Get Driver's login username into the driver app.
	 */
	std::string getUsername();

	/*! \brief Set Driver's login username into the driver app.
	 */
	void setUsername(std::string  username);
	/*! \brief Get ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
	 */
	long long getVehicleId();

	/*! \brief Set ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
	 */
	void setVehicleId(long long  vehicleId);
	/*! \brief Get ID of the driver.
	 */
	long long getId();

	/*! \brief Set ID of the driver.
	 */
	void setId(long long  id);
	/*! \brief Get True if the driver account has been deactivated.
	 */
	bool getIsDeactivated();

	/*! \brief Set True if the driver account has been deactivated.
	 */
	void setIsDeactivated(bool  isDeactivated);
	/*! \brief Get 
	 */
	std::list<TagMetadata> getTags();

	/*! \brief Set 
	 */
	void setTags(std::list <TagMetadata> tags);

private:
	bool eldAdverseWeatherExemptionEnabled;
	bool eldBigDayExemptionEnabled;
	int eldDayStartHour;
	bool eldExempt;
	std::string eldExemptReason;
	bool eldPcEnabled;
	bool eldYmEnabled;
	std::map <std::string, std::string>externalIds;
	long long groupId;
	std::string licenseNumber;
	std::string licenseState;
	std::string name;
	std::string notes;
	std::string phone;
	std::string username;
	long long vehicleId;
	long long id;
	bool isDeactivated;
	std::list <TagMetadata>tags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Driver_H_ */
