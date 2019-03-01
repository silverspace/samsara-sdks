/*
 * DocumentFieldCreate_photoValue.h
 *
 * 
 */

#ifndef _DocumentFieldCreate_photoValue_H_
#define _DocumentFieldCreate_photoValue_H_


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

class DocumentFieldCreate_photoValue : public Object {
public:
	/*! \brief Constructor.
	 */
	DocumentFieldCreate_photoValue();
	DocumentFieldCreate_photoValue(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DocumentFieldCreate_photoValue();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Photo URL for a JPG image
	 */
	std::string getUrl();

	/*! \brief Set Photo URL for a JPG image
	 */
	void setUrl(std::string  url);

private:
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DocumentFieldCreate_photoValue_H_ */
