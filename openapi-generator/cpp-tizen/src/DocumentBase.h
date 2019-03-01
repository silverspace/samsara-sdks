/*
 * DocumentBase.h
 *
 * 
 */

#ifndef _DocumentBase_H_
#define _DocumentBase_H_


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

class DocumentBase : public Object {
public:
	/*! \brief Constructor.
	 */
	DocumentBase();
	DocumentBase(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DocumentBase();

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

private:
	long long dispatchJobId;
	std::string notes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DocumentBase_H_ */
