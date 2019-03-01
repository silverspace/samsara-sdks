#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Driver.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Driver::Driver()
{
	//__init();
}

Driver::~Driver()
{
	//__cleanup();
}

void
Driver::__init()
{
	//eldAdverseWeatherExemptionEnabled = bool(false);
	//eldBigDayExemptionEnabled = bool(false);
	//eldDayStartHour = int(0);
	//eldExempt = bool(false);
	//eldExemptReason = std::string();
	//eldPcEnabled = bool(false);
	//eldYmEnabled = bool(false);
	//new std::map()std::map> externalIds;
	//groupId = long(0);
	//licenseNumber = std::string();
	//licenseState = std::string();
	//name = std::string();
	//notes = std::string();
	//phone = std::string();
	//username = std::string();
	//vehicleId = long(0);
	//id = long(0);
	//isDeactivated = bool(false);
	//new std::list()std::list> tags;
}

void
Driver::__cleanup()
{
	//if(eldAdverseWeatherExemptionEnabled != NULL) {
	//
	//delete eldAdverseWeatherExemptionEnabled;
	//eldAdverseWeatherExemptionEnabled = NULL;
	//}
	//if(eldBigDayExemptionEnabled != NULL) {
	//
	//delete eldBigDayExemptionEnabled;
	//eldBigDayExemptionEnabled = NULL;
	//}
	//if(eldDayStartHour != NULL) {
	//
	//delete eldDayStartHour;
	//eldDayStartHour = NULL;
	//}
	//if(eldExempt != NULL) {
	//
	//delete eldExempt;
	//eldExempt = NULL;
	//}
	//if(eldExemptReason != NULL) {
	//
	//delete eldExemptReason;
	//eldExemptReason = NULL;
	//}
	//if(eldPcEnabled != NULL) {
	//
	//delete eldPcEnabled;
	//eldPcEnabled = NULL;
	//}
	//if(eldYmEnabled != NULL) {
	//
	//delete eldYmEnabled;
	//eldYmEnabled = NULL;
	//}
	//if(externalIds != NULL) {
	//externalIds.RemoveAll(true);
	//delete externalIds;
	//externalIds = NULL;
	//}
	//if(groupId != NULL) {
	//
	//delete groupId;
	//groupId = NULL;
	//}
	//if(licenseNumber != NULL) {
	//
	//delete licenseNumber;
	//licenseNumber = NULL;
	//}
	//if(licenseState != NULL) {
	//
	//delete licenseState;
	//licenseState = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(notes != NULL) {
	//
	//delete notes;
	//notes = NULL;
	//}
	//if(phone != NULL) {
	//
	//delete phone;
	//phone = NULL;
	//}
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//if(vehicleId != NULL) {
	//
	//delete vehicleId;
	//vehicleId = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(isDeactivated != NULL) {
	//
	//delete isDeactivated;
	//isDeactivated = NULL;
	//}
	//if(tags != NULL) {
	//tags.RemoveAll(true);
	//delete tags;
	//tags = NULL;
	//}
	//
}

void
Driver::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *eldAdverseWeatherExemptionEnabledKey = "eldAdverseWeatherExemptionEnabled";
	node = json_object_get_member(pJsonObject, eldAdverseWeatherExemptionEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&eldAdverseWeatherExemptionEnabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *eldBigDayExemptionEnabledKey = "eldBigDayExemptionEnabled";
	node = json_object_get_member(pJsonObject, eldBigDayExemptionEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&eldBigDayExemptionEnabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *eldDayStartHourKey = "eldDayStartHour";
	node = json_object_get_member(pJsonObject, eldDayStartHourKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&eldDayStartHour, node, "int", "");
		} else {
			
		}
	}
	const gchar *eldExemptKey = "eldExempt";
	node = json_object_get_member(pJsonObject, eldExemptKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&eldExempt, node, "bool", "");
		} else {
			
		}
	}
	const gchar *eldExemptReasonKey = "eldExemptReason";
	node = json_object_get_member(pJsonObject, eldExemptReasonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&eldExemptReason, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *eldPcEnabledKey = "eldPcEnabled";
	node = json_object_get_member(pJsonObject, eldPcEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&eldPcEnabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *eldYmEnabledKey = "eldYmEnabled";
	node = json_object_get_member(pJsonObject, eldYmEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&eldYmEnabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *externalIdsKey = "externalIds";
	node = json_object_get_member(pJsonObject, externalIdsKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			externalIds = new_map;
		}
		
	}
	const gchar *groupIdKey = "groupId";
	node = json_object_get_member(pJsonObject, groupIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&groupId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *licenseNumberKey = "licenseNumber";
	node = json_object_get_member(pJsonObject, licenseNumberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&licenseNumber, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *licenseStateKey = "licenseState";
	node = json_object_get_member(pJsonObject, licenseStateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&licenseState, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *notesKey = "notes";
	node = json_object_get_member(pJsonObject, notesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&notes, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *phoneKey = "phone";
	node = json_object_get_member(pJsonObject, phoneKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&phone, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&username, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *vehicleIdKey = "vehicleId";
	node = json_object_get_member(pJsonObject, vehicleIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&vehicleId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *isDeactivatedKey = "isDeactivated";
	node = json_object_get_member(pJsonObject, isDeactivatedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&isDeactivated, node, "bool", "");
		} else {
			
		}
	}
	const gchar *tagsKey = "tags";
	node = json_object_get_member(pJsonObject, tagsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TagMetadata> new_list;
			TagMetadata inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TagMetadata")) {
					jsonToValue(&inst, temp_json, "TagMetadata", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tags = new_list;
		}
		
	}
}

Driver::Driver(char* json)
{
	this->fromJson(json);
}

char*
Driver::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getEldAdverseWeatherExemptionEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *eldAdverseWeatherExemptionEnabledKey = "eldAdverseWeatherExemptionEnabled";
	json_object_set_member(pJsonObject, eldAdverseWeatherExemptionEnabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getEldBigDayExemptionEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *eldBigDayExemptionEnabledKey = "eldBigDayExemptionEnabled";
	json_object_set_member(pJsonObject, eldBigDayExemptionEnabledKey, node);
	if (isprimitive("int")) {
		int obj = getEldDayStartHour();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *eldDayStartHourKey = "eldDayStartHour";
	json_object_set_member(pJsonObject, eldDayStartHourKey, node);
	if (isprimitive("bool")) {
		bool obj = getEldExempt();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *eldExemptKey = "eldExempt";
	json_object_set_member(pJsonObject, eldExemptKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEldExemptReason();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *eldExemptReasonKey = "eldExemptReason";
	json_object_set_member(pJsonObject, eldExemptReasonKey, node);
	if (isprimitive("bool")) {
		bool obj = getEldPcEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *eldPcEnabledKey = "eldPcEnabled";
	json_object_set_member(pJsonObject, eldPcEnabledKey, node);
	if (isprimitive("bool")) {
		bool obj = getEldYmEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *eldYmEnabledKey = "eldYmEnabled";
	json_object_set_member(pJsonObject, eldYmEnabledKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getExternalIds());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *externalIdsKey = "externalIds";
	json_object_set_member(pJsonObject, externalIdsKey, node);
	if (isprimitive("long long")) {
		long long obj = getGroupId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *groupIdKey = "groupId";
	json_object_set_member(pJsonObject, groupIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLicenseNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *licenseNumberKey = "licenseNumber";
	json_object_set_member(pJsonObject, licenseNumberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLicenseState();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *licenseStateKey = "licenseState";
	json_object_set_member(pJsonObject, licenseStateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNotes();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *notesKey = "notes";
	json_object_set_member(pJsonObject, notesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPhone();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *phoneKey = "phone";
	json_object_set_member(pJsonObject, phoneKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUsername();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	if (isprimitive("long long")) {
		long long obj = getVehicleId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *vehicleIdKey = "vehicleId";
	json_object_set_member(pJsonObject, vehicleIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsDeactivated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *isDeactivatedKey = "isDeactivated";
	json_object_set_member(pJsonObject, isDeactivatedKey, node);
	if (isprimitive("TagMetadata")) {
		list<TagMetadata> new_list = static_cast<list <TagMetadata> > (getTags());
		node = converttoJson(&new_list, "TagMetadata", "array");
	} else {
		node = json_node_alloc();
		list<TagMetadata> new_list = static_cast<list <TagMetadata> > (getTags());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TagMetadata>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TagMetadata obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tagsKey = "tags";
	json_object_set_member(pJsonObject, tagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
Driver::getEldAdverseWeatherExemptionEnabled()
{
	return eldAdverseWeatherExemptionEnabled;
}

void
Driver::setEldAdverseWeatherExemptionEnabled(bool  eldAdverseWeatherExemptionEnabled)
{
	this->eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
}

bool
Driver::getEldBigDayExemptionEnabled()
{
	return eldBigDayExemptionEnabled;
}

void
Driver::setEldBigDayExemptionEnabled(bool  eldBigDayExemptionEnabled)
{
	this->eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
}

int
Driver::getEldDayStartHour()
{
	return eldDayStartHour;
}

void
Driver::setEldDayStartHour(int  eldDayStartHour)
{
	this->eldDayStartHour = eldDayStartHour;
}

bool
Driver::getEldExempt()
{
	return eldExempt;
}

void
Driver::setEldExempt(bool  eldExempt)
{
	this->eldExempt = eldExempt;
}

std::string
Driver::getEldExemptReason()
{
	return eldExemptReason;
}

void
Driver::setEldExemptReason(std::string  eldExemptReason)
{
	this->eldExemptReason = eldExemptReason;
}

bool
Driver::getEldPcEnabled()
{
	return eldPcEnabled;
}

void
Driver::setEldPcEnabled(bool  eldPcEnabled)
{
	this->eldPcEnabled = eldPcEnabled;
}

bool
Driver::getEldYmEnabled()
{
	return eldYmEnabled;
}

void
Driver::setEldYmEnabled(bool  eldYmEnabled)
{
	this->eldYmEnabled = eldYmEnabled;
}

std::map<string, string>
Driver::getExternalIds()
{
	return externalIds;
}

void
Driver::setExternalIds(std::map <string, string> externalIds)
{
	this->externalIds = externalIds;
}

long long
Driver::getGroupId()
{
	return groupId;
}

void
Driver::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

std::string
Driver::getLicenseNumber()
{
	return licenseNumber;
}

void
Driver::setLicenseNumber(std::string  licenseNumber)
{
	this->licenseNumber = licenseNumber;
}

std::string
Driver::getLicenseState()
{
	return licenseState;
}

void
Driver::setLicenseState(std::string  licenseState)
{
	this->licenseState = licenseState;
}

std::string
Driver::getName()
{
	return name;
}

void
Driver::setName(std::string  name)
{
	this->name = name;
}

std::string
Driver::getNotes()
{
	return notes;
}

void
Driver::setNotes(std::string  notes)
{
	this->notes = notes;
}

std::string
Driver::getPhone()
{
	return phone;
}

void
Driver::setPhone(std::string  phone)
{
	this->phone = phone;
}

std::string
Driver::getUsername()
{
	return username;
}

void
Driver::setUsername(std::string  username)
{
	this->username = username;
}

long long
Driver::getVehicleId()
{
	return vehicleId;
}

void
Driver::setVehicleId(long long  vehicleId)
{
	this->vehicleId = vehicleId;
}

long long
Driver::getId()
{
	return id;
}

void
Driver::setId(long long  id)
{
	this->id = id;
}

bool
Driver::getIsDeactivated()
{
	return isDeactivated;
}

void
Driver::setIsDeactivated(bool  isDeactivated)
{
	this->isDeactivated = isDeactivated;
}

std::list<TagMetadata>
Driver::getTags()
{
	return tags;
}

void
Driver::setTags(std::list <TagMetadata> tags)
{
	this->tags = tags;
}


