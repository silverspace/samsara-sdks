/*
 * _sensors_history_series.h
 *
 * Sensor ID and field to query.
 */

#ifndef __sensors_history_series_H_
#define __sensors_history_series_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Sensor ID and field to query.
 *
 *  \ingroup Models
 *
 */

class _sensors_history_series : public Object {
public:
	/*! \brief Constructor.
	 */
	_sensors_history_series();
	_sensors_history_series(char* str);

	/*! \brief Destructor.
	 */
	virtual ~_sensors_history_series();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Field to query.
	 */
	std::string getField();

	/*! \brief Set Field to query.
	 */
	void setField(std::string  field);
	/*! \brief Get Sensor ID to query.
	 */
	long long getWidgetId();

	/*! \brief Set Sensor ID to query.
	 */
	void setWidgetId(long long  widgetId);

private:
	std::string field;
	long long widgetId;
	void __init();
	void __cleanup();

};
}
}

#endif /* __sensors_history_series_H_ */
