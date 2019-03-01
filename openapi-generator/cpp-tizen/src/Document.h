/*
 * Document.h
 *
 * 
 */

#ifndef _Document_H_
#define _Document_H_


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

class Document : public Object {
public:
	/*! \brief Constructor.
	 */
	Document();
	Document(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Document();

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
	/*! \brief Get Descriptive name of this type of document.
	 */
	std::string getDocumentType();

	/*! \brief Set Descriptive name of this type of document.
	 */
	void setDocumentType(std::string  documentType);
	/*! \brief Get The time in Unix epoch milliseconds that the document is created.
	 */
	long long getDriverCreatedAtMs();

	/*! \brief Set The time in Unix epoch milliseconds that the document is created.
	 */
	void setDriverCreatedAtMs(long long  driverCreatedAtMs);
	/*! \brief Get ID of the driver for whom the document is submitted
	 */
	long long getDriverId();

	/*! \brief Set ID of the driver for whom the document is submitted
	 */
	void setDriverId(long long  driverId);
	/*! \brief Get The fields associated with this document.
	 */
	std::list<DocumentField> getFields();

	/*! \brief Set The fields associated with this document.
	 */
	void setFields(std::list <DocumentField> fields);
	/*! \brief Get VehicleID of the driver at document creation.
	 */
	long long getVehicleId();

	/*! \brief Set VehicleID of the driver at document creation.
	 */
	void setVehicleId(long long  vehicleId);

private:
	long long dispatchJobId;
	std::string notes;
	std::string documentType;
	long long driverCreatedAtMs;
	long long driverId;
	std::list <DocumentField>fields;
	long long vehicleId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Document_H_ */
