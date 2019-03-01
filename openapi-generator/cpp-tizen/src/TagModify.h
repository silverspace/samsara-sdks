/*
 * TagModify.h
 *
 * 
 */

#ifndef _TagModify_H_
#define _TagModify_H_


#include <string>
#include "TagModify_add.h"
#include "TagModify_delete.h"
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

class TagModify : public Object {
public:
	/*! \brief Constructor.
	 */
	TagModify();
	TagModify(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TagModify();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TagModify_add getAdd();

	/*! \brief Set 
	 */
	void setAdd(TagModify_add  add);
	/*! \brief Get 
	 */
	TagModify_delete getDelete();

	/*! \brief Set 
	 */
	void setDelete(TagModify_delete  _delete);
	/*! \brief Get Updated name of this tag.
	 */
	std::string getName();

	/*! \brief Set Updated name of this tag.
	 */
	void setName(std::string  name);
	/*! \brief Get If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
	 */
	long long getParentTagId();

	/*! \brief Set If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
	 */
	void setParentTagId(long long  parentTagId);

private:
	TagModify_add add;
	TagModify_delete _delete;
	std::string name;
	long long parentTagId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TagModify_H_ */
