/*
 * DocumentFieldType_numberValueTypeMetadata.h
 *
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 */

#ifndef _DocumentFieldType_numberValueTypeMetadata_H_
#define _DocumentFieldType_numberValueTypeMetadata_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 *
 *  \ingroup Models
 *
 */

class DocumentFieldType_numberValueTypeMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	DocumentFieldType_numberValueTypeMetadata();
	DocumentFieldType_numberValueTypeMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DocumentFieldType_numberValueTypeMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Number of decimal places that values for this field type can have.
	 */
	long long getNumDecimalPlaces();

	/*! \brief Set Number of decimal places that values for this field type can have.
	 */
	void setNumDecimalPlaces(long long  numDecimalPlaces);

private:
	long long numDecimalPlaces;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DocumentFieldType_numberValueTypeMetadata_H_ */
