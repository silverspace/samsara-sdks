/*
 * DocumentFieldType.h
 *
 * 
 */

#ifndef _DocumentFieldType_H_
#define _DocumentFieldType_H_


#include <string>
#include "DocumentFieldType_numberValueTypeMetadata.h"
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

class DocumentFieldType : public Object {
public:
	/*! \brief Constructor.
	 */
	DocumentFieldType();
	DocumentFieldType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DocumentFieldType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Descriptive name of this field type.
	 */
	std::string getLabel();

	/*! \brief Set Descriptive name of this field type.
	 */
	void setLabel(std::string  label);
	/*! \brief Get 
	 */
	DocumentFieldType_numberValueTypeMetadata getNumberValueTypeMetadata();

	/*! \brief Set 
	 */
	void setNumberValueTypeMetadata(DocumentFieldType_numberValueTypeMetadata  numberValueTypeMetadata);
	/*! \brief Get The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
	 */
	std::string getValueType();

	/*! \brief Set The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
	 */
	void setValueType(std::string  valueType);

private:
	std::string label;
	DocumentFieldType_numberValueTypeMetadata numberValueTypeMetadata;
	std::string valueType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DocumentFieldType_H_ */
