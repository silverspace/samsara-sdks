/*
 * TaggedMachineBase.h
 *
 * 
 */

#ifndef _TaggedMachineBase_H_
#define _TaggedMachineBase_H_


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

class TaggedMachineBase : public Object {
public:
	/*! \brief Constructor.
	 */
	TaggedMachineBase();
	TaggedMachineBase(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TaggedMachineBase();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the Machine being tagged.
	 */
	long long getId();

	/*! \brief Set The ID of the Machine being tagged.
	 */
	void setId(long long  id);

private:
	long long id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TaggedMachineBase_H_ */
