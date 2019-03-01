/*
 * DocumentFieldCreate.h
 *
 * 
 */

#ifndef _DocumentFieldCreate_H_
#define _DocumentFieldCreate_H_


#include <string>
#include "DocumentFieldCreate_photoValue.h"
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

class DocumentFieldCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	DocumentFieldCreate();
	DocumentFieldCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DocumentFieldCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Value of this field if this document field has valueType: ValueType_Number.
	 */
	double getNumberValue();

	/*! \brief Set Value of this field if this document field has valueType: ValueType_Number.
	 */
	void setNumberValue(double  numberValue);
	/*! \brief Get Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
	 */
	std::list<DocumentFieldCreate_photoValue> getPhotoValue();

	/*! \brief Set Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
	 */
	void setPhotoValue(std::list <DocumentFieldCreate_photoValue> photoValue);
	/*! \brief Get Value of this field if this document field has valueType: ValueType_String.
	 */
	std::string getStringValue();

	/*! \brief Set Value of this field if this document field has valueType: ValueType_String.
	 */
	void setStringValue(std::string  stringValue);
	/*! \brief Get Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
	 */
	std::string getValueType();

	/*! \brief Set Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
	 */
	void setValueType(std::string  valueType);

private:
	double numberValue;
	std::list <DocumentFieldCreate_photoValue>photoValue;
	std::string stringValue;
	std::string valueType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DocumentFieldCreate_H_ */
