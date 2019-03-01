/*
 * DocumentType.h
 *
 * 
 */

#ifndef _DocumentType_H_
#define _DocumentType_H_


#include <string>
#include "DocumentFieldType.h"
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

class DocumentType : public Object {
public:
	/*! \brief Constructor.
	 */
	DocumentType();
	DocumentType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DocumentType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
	 */
	std::list<std::list> getFieldTypes();

	/*! \brief Set The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
	 */
	void setFieldTypes(std::list <std::list> fieldTypes);
	/*! \brief Get Name of the document type.
	 */
	std::string getName();

	/*! \brief Set Name of the document type.
	 */
	void setName(std::string  name);
	/*! \brief Get ID for the organization this document belongs to.
	 */
	long long getOrgId();

	/*! \brief Set ID for the organization this document belongs to.
	 */
	void setOrgId(long long  orgId);
	/*! \brief Get Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
	 */
	std::string getUuid();

	/*! \brief Set Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
	 */
	void setUuid(std::string  uuid);

private:
	std::list <std::list>fieldTypes;
	std::string name;
	long long orgId;
	std::string uuid;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DocumentType_H_ */
