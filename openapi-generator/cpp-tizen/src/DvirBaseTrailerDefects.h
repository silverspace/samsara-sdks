/*
 * DvirBase_trailerDefects.h
 *
 * 
 */

#ifndef _DvirBase_trailerDefects_H_
#define _DvirBase_trailerDefects_H_


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

class DvirBase_trailerDefects : public Object {
public:
	/*! \brief Constructor.
	 */
	DvirBase_trailerDefects();
	DvirBase_trailerDefects(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DvirBase_trailerDefects();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The comment describing the type of DVIR defect
	 */
	std::string getComment();

	/*! \brief Set The comment describing the type of DVIR defect
	 */
	void setComment(std::string  comment);
	/*! \brief Get The type of DVIR defect
	 */
	std::string getDefectType();

	/*! \brief Set The type of DVIR defect
	 */
	void setDefectType(std::string  defectType);

private:
	std::string comment;
	std::string defectType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DvirBase_trailerDefects_H_ */
