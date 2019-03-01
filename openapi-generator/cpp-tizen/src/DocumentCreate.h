/*
 * DocumentCreate.h
 *
 * 
 */

#ifndef _DocumentCreate_H_
#define _DocumentCreate_H_


#include <string>
#include "DocumentBase.h"
#include "DocumentField.h"
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

class DocumentCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	DocumentCreate();
	DocumentCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DocumentCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the Samsara dispatch job for which the document is submitted
	 */
	long long getDispatchJobId();

	/*! \brief Set ID of the Samsara dispatch job for which the document is submitted
	 */
	void setDispatchJobId(long long  dispatchJobId);
	/*! \brief Get Notes submitted with this document.
	 */
	std::string getNotes();

	/*! \brief Set Notes submitted with this document.
	 */
	void setNotes(std::string  notes);
	/*! \brief Get Universally unique identifier for the document type this document is being created for.
	 */
	std::string getDocumentTypeUuid();

	/*! \brief Set Universally unique identifier for the document type this document is being created for.
	 */
	void setDocumentTypeUuid(std::string  documentTypeUuid);
	/*! \brief Get List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
	 */
	std::list<DocumentField> getFields();

	/*! \brief Set List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
	 */
	void setFields(std::list <DocumentField> fields);

private:
	long long dispatchJobId;
	std::string notes;
	std::string documentTypeUuid;
	std::list <DocumentField>fields;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DocumentCreate_H_ */
