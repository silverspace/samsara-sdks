/*
 * TagModify_add.h
 *
 * Specify devices, etc. that should be added to the tag.
 */

#ifndef _TagModify_add_H_
#define _TagModify_add_H_


#include <string>
#include "TaggedAssetBase.h"
#include "TaggedDriverBase.h"
#include "TaggedMachineBase.h"
#include "TaggedSensorBase.h"
#include "TaggedVehicleBase.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Specify devices, etc. that should be added to the tag.
 *
 *  \ingroup Models
 *
 */

class TagModify_add : public Object {
public:
	/*! \brief Constructor.
	 */
	TagModify_add();
	TagModify_add(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TagModify_add();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The assets to be added to this tag.
	 */
	std::list<TaggedAssetBase> getAssets();

	/*! \brief Set The assets to be added to this tag.
	 */
	void setAssets(std::list <TaggedAssetBase> assets);
	/*! \brief Get The sensors to be added to this tag.
	 */
	std::list<TaggedSensorBase> getSensors();

	/*! \brief Set The sensors to be added to this tag.
	 */
	void setSensors(std::list <TaggedSensorBase> sensors);
	/*! \brief Get The vehicles to be added to this tag.
	 */
	std::list<TaggedVehicleBase> getVehicles();

	/*! \brief Set The vehicles to be added to this tag.
	 */
	void setVehicles(std::list <TaggedVehicleBase> vehicles);
	/*! \brief Get The machines to be added to this tag.
	 */
	std::list<TaggedMachineBase> getMachines();

	/*! \brief Set The machines to be added to this tag.
	 */
	void setMachines(std::list <TaggedMachineBase> machines);
	/*! \brief Get The drivers to be added to this tag.
	 */
	std::list<TaggedDriverBase> getDrivers();

	/*! \brief Set The drivers to be added to this tag.
	 */
	void setDrivers(std::list <TaggedDriverBase> drivers);

private:
	std::list <TaggedAssetBase>assets;
	std::list <TaggedSensorBase>sensors;
	std::list <TaggedVehicleBase>vehicles;
	std::list <TaggedMachineBase>machines;
	std::list <TaggedDriverBase>drivers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TagModify_add_H_ */
