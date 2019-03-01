/*
 * Inline_object_16.h
 *
 * 
 */

#ifndef _Inline_object_16_H_
#define _Inline_object_16_H_


#include <string>
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

class Inline_object_16 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_16();
	Inline_object_16(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_16();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::map<std::string, std::string> getExternalIds();

	/*! \brief Set 
	 */
	void setExternalIds(std::map <std::string, std::string> externalIds);
	/*! \brief Get Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
	 */
	int getHarshAccelSetting();

	/*! \brief Set Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
	 */
	void setHarshAccelSetting(int  harsh_accel_setting);
	/*! \brief Get Name
	 */
	std::string getName();

	/*! \brief Set Name
	 */
	void setName(std::string  name);

private:
	std::map <std::string, std::string>externalIds;
	int harsh_accel_setting;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_16_H_ */
