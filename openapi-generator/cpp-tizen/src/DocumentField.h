/*
 * DocumentField.h
 *
 * 
 */

#ifndef _DocumentField_H_
#define _DocumentField_H_


#include <string>
#include "DocumentFieldCreate.h"
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

class DocumentField : public Object {
public:
	/*! \brief Constructor.
	 */
	DocumentField();
	DocumentField(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DocumentField();

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
	/*! \brief Get Descriptive name of this field.
	 */
	std::string getLabel();

	/*! \brief Set Descriptive name of this field.
	 */
	void setLabel(std::string  label);
	/*! \brief Get DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
	 */
	std::string getValue();

	/*! \brief Set DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
	 */
	void setValue(std::string  value);

private:
	double numberValue;
	std::list <DocumentFieldCreate_photoValue>photoValue;
	std::string stringValue;
	std::string valueType;
	std::string label;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DocumentField_H_ */
