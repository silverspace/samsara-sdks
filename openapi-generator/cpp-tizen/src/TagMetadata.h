/*
 * TagMetadata.h
 *
 * 
 */

#ifndef _TagMetadata_H_
#define _TagMetadata_H_


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

class TagMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	TagMetadata();
	TagMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TagMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of this tag.
	 */
	long long getId();

	/*! \brief Set The ID of this tag.
	 */
	void setId(long long  id);
	/*! \brief Get Name of this tag.
	 */
	std::string getName();

	/*! \brief Set Name of this tag.
	 */
	void setName(std::string  name);

private:
	long long id;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TagMetadata_H_ */
