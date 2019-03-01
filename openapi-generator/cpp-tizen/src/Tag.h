/*
 * Tag.h
 *
 * 
 */

#ifndef _Tag_H_
#define _Tag_H_


#include <string>
#include "TaggedAddress.h"
#include "TaggedAsset.h"
#include "TaggedDriver.h"
#include "TaggedMachine.h"
#include "TaggedSensor.h"
#include "TaggedVehicle.h"
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

class Tag : public Object {
public:
	/*! \brief Constructor.
	 */
	Tag();
	Tag(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Tag();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The addresses that belong to this tag.
	 */
	std::list<TaggedAddress> getAddresses();

	/*! \brief Set The addresses that belong to this tag.
	 */
	void setAddresses(std::list <TaggedAddress> addresses);
	/*! \brief Get The assets that belong to this tag.
	 */
	std::list<TaggedAsset> getAssets();

	/*! \brief Set The assets that belong to this tag.
	 */
	void setAssets(std::list <TaggedAsset> assets);
	/*! \brief Get The drivers that belong to this tag.
	 */
	std::list<TaggedDriver> getDrivers();

	/*! \brief Set The drivers that belong to this tag.
	 */
	void setDrivers(std::list <TaggedDriver> drivers);
	/*! \brief Get The GroupID that this tag belongs to.
	 */
	long long getGroupId();

	/*! \brief Set The GroupID that this tag belongs to.
	 */
	void setGroupId(long long  groupId);
	/*! \brief Get The ID of this tag.
	 */
	long long getId();

	/*! \brief Set The ID of this tag.
	 */
	void setId(long long  id);
	/*! \brief Get The machines that belong to this tag.
	 */
	std::list<TaggedMachine> getMachines();

	/*! \brief Set The machines that belong to this tag.
	 */
	void setMachines(std::list <TaggedMachine> machines);
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
	std::list<TaggedSensor> getSensors();

	/*! \brief Set The sensors that belong to this tag.
	 */
	void setSensors(std::list <TaggedSensor> sensors);
	/*! \brief Get The vehicles that belong to this tag.
	 */
	std::list<TaggedVehicle> getVehicles();

	/*! \brief Set The vehicles that belong to this tag.
	 */
	void setVehicles(std::list <TaggedVehicle> vehicles);

private:
	std::list <TaggedAddress>addresses;
	std::list <TaggedAsset>assets;
	std::list <TaggedDriver>drivers;
	long long groupId;
	long long id;
	std::list <TaggedMachine>machines;
	std::string name;
	long long parentTagId;
	std::list <TaggedSensor>sensors;
	std::list <TaggedVehicle>vehicles;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Tag_H_ */
