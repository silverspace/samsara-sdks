/*
 * AuxInputSeries.h
 *
 * A list of aux input values over a timerange.
 */

#ifndef _AuxInputSeries_H_
#define _AuxInputSeries_H_


#include <string>
#include "AuxInput.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A list of aux input values over a timerange.
 *
 *  \ingroup Models
 *
 */

class AuxInputSeries : public Object {
public:
	/*! \brief Constructor.
	 */
	AuxInputSeries();
	AuxInputSeries(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuxInputSeries();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the aux input.
	 */
	std::string getName();

	/*! \brief Set The name of the aux input.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<AuxInput> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <AuxInput> values);

private:
	std::string name;
	std::list <AuxInput>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuxInputSeries_H_ */
