/*
 * TagCreate.h
 *
 * 
 */

#ifndef _TagCreate_H_
#define _TagCreate_H_


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


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TagCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	TagCreate();
	TagCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TagCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The assets that belong to this tag.
	 */
	std::list<TaggedAssetBase> getAssets();

	/*! \brief Set The assets that belong to this tag.
	 */
	void setAssets(std::list <TaggedAssetBase> assets);
	/*! \brief Get The drivers that belong to this tag.
	 */
	std::list<TaggedDriverBase> getDrivers();

	/*! \brief Set The drivers that belong to this tag.
	 */
	void setDrivers(std::list <TaggedDriverBase> drivers);
	/*! \brief Get The machines that belong to this tag.
	 */
	std::list<TaggedMachineBase> getMachines();

	/*! \brief Set The machines that belong to this tag.
	 */
	void setMachines(std::list <TaggedMachineBase> machines);
	/*! \brief Get Name of this tag.
	 */
	std::string getName();

	/*! \brief Set Name of this tag.
	 */
	void setName(std::string  name);
	/*! \brief Get If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
	 */
	long long getParentTagId();

	/*! \brief Set If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
	 */
	void setParentTagId(long long  parentTagId);
	/*! \brief Get The sensors that belong to this tag.
	 */
	std::list<TaggedSensorBase> getSensors();

	/*! \brief Set The sensors that belong to this tag.
	 */
	void setSensors(std::list <TaggedSensorBase> sensors);
	/*! \brief Get The vehicles that belong to this tag.
	 */
	std::list<TaggedVehicleBase> getVehicles();

	/*! \brief Set The vehicles that belong to this tag.
	 */
	void setVehicles(std::list <TaggedVehicleBase> vehicles);

private:
	std::list <TaggedAssetBase>assets;
	std::list <TaggedDriverBase>drivers;
	std::list <TaggedMachineBase>machines;
	std::string name;
	long long parentTagId;
	std::list <TaggedSensorBase>sensors;
	std::list <TaggedVehicleBase>vehicles;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TagCreate_H_ */
