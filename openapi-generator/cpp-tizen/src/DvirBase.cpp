#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DvirBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DvirBase::DvirBase()
{
	//__init();
}

DvirBase::~DvirBase()
{
	//__cleanup();
}

void
DvirBase::__init()
{
	//authorSignature = new DvirBase_authorSignature();
	//defectsCorrected = bool(false);
	//defectsNeedNotBeCorrected = bool(false);
	//id = long(0);
	//inspectionType = std::string();
	//mechanicNotes = std::string();
	//mechanicOrAgentSignature = new DvirBase_mechanicOrAgentSignature();
	//nextDriverSignature = new DvirBase_nextDriverSignature();
	//odometerMiles = long(0);
	//timeMs = long(0);
	//new std::list()std::list> trailerDefects;
	//trailerId = int(0);
	//trailerName = std::string();
	//vehicle = new DvirBase_vehicle();
	//vehicleCondition = std::string();
	//new std::list()std::list> vehicleDefects;
}

void
DvirBase::__cleanup()
{
	//if(authorSignature != NULL) {
	//
	//delete authorSignature;
	//authorSignature = NULL;
	//}
	//if(defectsCorrected != NULL) {
	//
	//delete defectsCorrected;
	//defectsCorrected = NULL;
	//}
	//if(defectsNeedNotBeCorrected != NULL) {
	//
	//delete defectsNeedNotBeCorrected;
	//defectsNeedNotBeCorrected = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(inspectionType != NULL) {
	//
	//delete inspectionType;
	//inspectionType = NULL;
	//}
	//if(mechanicNotes != NULL) {
	//
	//delete mechanicNotes;
	//mechanicNotes = NULL;
	//}
	//if(mechanicOrAgentSignature != NULL) {
	//
	//delete mechanicOrAgentSignature;
	//mechanicOrAgentSignature = NULL;
	//}
	//if(nextDriverSignature != NULL) {
	//
	//delete nextDriverSignature;
	//nextDriverSignature = NULL;
	//}
	//if(odometerMiles != NULL) {
	//
	//delete odometerMiles;
	//odometerMiles = NULL;
	//}
	//if(timeMs != NULL) {
	//
	//delete timeMs;
	//timeMs = NULL;
	//}
	//if(trailerDefects != NULL) {
	//trailerDefects.RemoveAll(true);
	//delete trailerDefects;
	//trailerDefects = NULL;
	//}
	//if(trailerId != NULL) {
	//
	//delete trailerId;
	//trailerId = NULL;
	//}
	//if(trailerName != NULL) {
	//
	//delete trailerName;
	//trailerName = NULL;
	//}
	//if(vehicle != NULL) {
	//
	//delete vehicle;
	//vehicle = NULL;
	//}
	//if(vehicleCondition != NULL) {
	//
	//delete vehicleCondition;
	//vehicleCondition = NULL;
	//}
	//if(vehicleDefects != NULL) {
	//vehicleDefects.RemoveAll(true);
	//delete vehicleDefects;
	//vehicleDefects = NULL;
	//}
	//
}

void
DvirBase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *authorSignatureKey = "authorSignature";
	node = json_object_get_member(pJsonObject, authorSignatureKey);
	if (node !=NULL) {
	

		if (isprimitive("DvirBase_authorSignature")) {
			jsonToValue(&authorSignature, node, "DvirBase_authorSignature", "DvirBase_authorSignature");
		} else {
			
			DvirBase_authorSignature* obj = static_cast<DvirBase_authorSignature*> (&authorSignature);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defectsCorrectedKey = "defectsCorrected";
	node = json_object_get_member(pJsonObject, defectsCorrectedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&defectsCorrected, node, "bool", "");
		} else {
			
		}
	}
	const gchar *defectsNeedNotBeCorrectedKey = "defectsNeedNotBeCorrected";
	node = json_object_get_member(pJsonObject, defectsNeedNotBeCorrectedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&defectsNeedNotBeCorrected, node, "bool", "");
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
	const gchar *inspectionTypeKey = "inspectionType";
	node = json_object_get_member(pJsonObject, inspectionTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&inspectionType, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *mechanicNotesKey = "mechanicNotes";
	node = json_object_get_member(pJsonObject, mechanicNotesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&mechanicNotes, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *mechanicOrAgentSignatureKey = "mechanicOrAgentSignature";
	node = json_object_get_member(pJsonObject, mechanicOrAgentSignatureKey);
	if (node !=NULL) {
	

		if (isprimitive("DvirBase_mechanicOrAgentSignature")) {
			jsonToValue(&mechanicOrAgentSignature, node, "DvirBase_mechanicOrAgentSignature", "DvirBase_mechanicOrAgentSignature");
		} else {
			
			DvirBase_mechanicOrAgentSignature* obj = static_cast<DvirBase_mechanicOrAgentSignature*> (&mechanicOrAgentSignature);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nextDriverSignatureKey = "nextDriverSignature";
	node = json_object_get_member(pJsonObject, nextDriverSignatureKey);
	if (node !=NULL) {
	

		if (isprimitive("DvirBase_nextDriverSignature")) {
			jsonToValue(&nextDriverSignature, node, "DvirBase_nextDriverSignature", "DvirBase_nextDriverSignature");
		} else {
			
			DvirBase_nextDriverSignature* obj = static_cast<DvirBase_nextDriverSignature*> (&nextDriverSignature);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *odometerMilesKey = "odometerMiles";
	node = json_object_get_member(pJsonObject, odometerMilesKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&odometerMiles, node, "long long", "");
		} else {
			
		}
	}
	const gchar *timeMsKey = "timeMs";
	node = json_object_get_member(pJsonObject, timeMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&timeMs, node, "long long", "");
		} else {
			
		}
	}
	const gchar *trailerDefectsKey = "trailerDefects";
	node = json_object_get_member(pJsonObject, trailerDefectsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DvirBase_trailerDefects> new_list;
			DvirBase_trailerDefects inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DvirBase_trailerDefects")) {
					jsonToValue(&inst, temp_json, "DvirBase_trailerDefects", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			trailerDefects = new_list;
		}
		
	}
	const gchar *trailerIdKey = "trailerId";
	node = json_object_get_member(pJsonObject, trailerIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&trailerId, node, "int", "");
		} else {
			
		}
	}
	const gchar *trailerNameKey = "trailerName";
	node = json_object_get_member(pJsonObject, trailerNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&trailerName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *vehicleKey = "vehicle";
	node = json_object_get_member(pJsonObject, vehicleKey);
	if (node !=NULL) {
	

		if (isprimitive("DvirBase_vehicle")) {
			jsonToValue(&vehicle, node, "DvirBase_vehicle", "DvirBase_vehicle");
		} else {
			
			DvirBase_vehicle* obj = static_cast<DvirBase_vehicle*> (&vehicle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *vehicleConditionKey = "vehicleCondition";
	node = json_object_get_member(pJsonObject, vehicleConditionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vehicleCondition, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *vehicleDefectsKey = "vehicleDefects";
	node = json_object_get_member(pJsonObject, vehicleDefectsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DvirBase_trailerDefects> new_list;
			DvirBase_trailerDefects inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DvirBase_trailerDefects")) {
					jsonToValue(&inst, temp_json, "DvirBase_trailerDefects", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			vehicleDefects = new_list;
		}
		
	}
}

DvirBase::DvirBase(char* json)
{
	this->fromJson(json);
}

char*
DvirBase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DvirBase_authorSignature")) {
		DvirBase_authorSignature obj = getAuthorSignature();
		node = converttoJson(&obj, "DvirBase_authorSignature", "");
	}
	else {
		
		DvirBase_authorSignature obj = static_cast<DvirBase_authorSignature> (getAuthorSignature());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authorSignatureKey = "authorSignature";
	json_object_set_member(pJsonObject, authorSignatureKey, node);
	if (isprimitive("bool")) {
		bool obj = getDefectsCorrected();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *defectsCorrectedKey = "defectsCorrected";
	json_object_set_member(pJsonObject, defectsCorrectedKey, node);
	if (isprimitive("bool")) {
		bool obj = getDefectsNeedNotBeCorrected();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *defectsNeedNotBeCorrectedKey = "defectsNeedNotBeCorrected";
	json_object_set_member(pJsonObject, defectsNeedNotBeCorrectedKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInspectionType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *inspectionTypeKey = "inspectionType";
	json_object_set_member(pJsonObject, inspectionTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMechanicNotes();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *mechanicNotesKey = "mechanicNotes";
	json_object_set_member(pJsonObject, mechanicNotesKey, node);
	if (isprimitive("DvirBase_mechanicOrAgentSignature")) {
		DvirBase_mechanicOrAgentSignature obj = getMechanicOrAgentSignature();
		node = converttoJson(&obj, "DvirBase_mechanicOrAgentSignature", "");
	}
	else {
		
		DvirBase_mechanicOrAgentSignature obj = static_cast<DvirBase_mechanicOrAgentSignature> (getMechanicOrAgentSignature());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mechanicOrAgentSignatureKey = "mechanicOrAgentSignature";
	json_object_set_member(pJsonObject, mechanicOrAgentSignatureKey, node);
	if (isprimitive("DvirBase_nextDriverSignature")) {
		DvirBase_nextDriverSignature obj = getNextDriverSignature();
		node = converttoJson(&obj, "DvirBase_nextDriverSignature", "");
	}
	else {
		
		DvirBase_nextDriverSignature obj = static_cast<DvirBase_nextDriverSignature> (getNextDriverSignature());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nextDriverSignatureKey = "nextDriverSignature";
	json_object_set_member(pJsonObject, nextDriverSignatureKey, node);
	if (isprimitive("long long")) {
		long long obj = getOdometerMiles();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *odometerMilesKey = "odometerMiles";
	json_object_set_member(pJsonObject, odometerMilesKey, node);
	if (isprimitive("long long")) {
		long long obj = getTimeMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *timeMsKey = "timeMs";
	json_object_set_member(pJsonObject, timeMsKey, node);
	if (isprimitive("DvirBase_trailerDefects")) {
		list<DvirBase_trailerDefects> new_list = static_cast<list <DvirBase_trailerDefects> > (getTrailerDefects());
		node = converttoJson(&new_list, "DvirBase_trailerDefects", "array");
	} else {
		node = json_node_alloc();
		list<DvirBase_trailerDefects> new_list = static_cast<list <DvirBase_trailerDefects> > (getTrailerDefects());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DvirBase_trailerDefects>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DvirBase_trailerDefects obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *trailerDefectsKey = "trailerDefects";
	json_object_set_member(pJsonObject, trailerDefectsKey, node);
	if (isprimitive("int")) {
		int obj = getTrailerId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *trailerIdKey = "trailerId";
	json_object_set_member(pJsonObject, trailerIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTrailerName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *trailerNameKey = "trailerName";
	json_object_set_member(pJsonObject, trailerNameKey, node);
	if (isprimitive("DvirBase_vehicle")) {
		DvirBase_vehicle obj = getVehicle();
		node = converttoJson(&obj, "DvirBase_vehicle", "");
	}
	else {
		
		DvirBase_vehicle obj = static_cast<DvirBase_vehicle> (getVehicle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *vehicleKey = "vehicle";
	json_object_set_member(pJsonObject, vehicleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVehicleCondition();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vehicleConditionKey = "vehicleCondition";
	json_object_set_member(pJsonObject, vehicleConditionKey, node);
	if (isprimitive("DvirBase_trailerDefects")) {
		list<DvirBase_trailerDefects> new_list = static_cast<list <DvirBase_trailerDefects> > (getVehicleDefects());
		node = converttoJson(&new_list, "DvirBase_trailerDefects", "array");
	} else {
		node = json_node_alloc();
		list<DvirBase_trailerDefects> new_list = static_cast<list <DvirBase_trailerDefects> > (getVehicleDefects());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DvirBase_trailerDefects>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DvirBase_trailerDefects obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *vehicleDefectsKey = "vehicleDefects";
	json_object_set_member(pJsonObject, vehicleDefectsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

DvirBase_authorSignature
DvirBase::getAuthorSignature()
{
	return authorSignature;
}

void
DvirBase::setAuthorSignature(DvirBase_authorSignature  authorSignature)
{
	this->authorSignature = authorSignature;
}

bool
DvirBase::getDefectsCorrected()
{
	return defectsCorrected;
}

void
DvirBase::setDefectsCorrected(bool  defectsCorrected)
{
	this->defectsCorrected = defectsCorrected;
}

bool
DvirBase::getDefectsNeedNotBeCorrected()
{
	return defectsNeedNotBeCorrected;
}

void
DvirBase::setDefectsNeedNotBeCorrected(bool  defectsNeedNotBeCorrected)
{
	this->defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
}

long long
DvirBase::getId()
{
	return id;
}

void
DvirBase::setId(long long  id)
{
	this->id = id;
}

std::string
DvirBase::getInspectionType()
{
	return inspectionType;
}

void
DvirBase::setInspectionType(std::string  inspectionType)
{
	this->inspectionType = inspectionType;
}

std::string
DvirBase::getMechanicNotes()
{
	return mechanicNotes;
}

void
DvirBase::setMechanicNotes(std::string  mechanicNotes)
{
	this->mechanicNotes = mechanicNotes;
}

DvirBase_mechanicOrAgentSignature
DvirBase::getMechanicOrAgentSignature()
{
	return mechanicOrAgentSignature;
}

void
DvirBase::setMechanicOrAgentSignature(DvirBase_mechanicOrAgentSignature  mechanicOrAgentSignature)
{
	this->mechanicOrAgentSignature = mechanicOrAgentSignature;
}

DvirBase_nextDriverSignature
DvirBase::getNextDriverSignature()
{
	return nextDriverSignature;
}

void
DvirBase::setNextDriverSignature(DvirBase_nextDriverSignature  nextDriverSignature)
{
	this->nextDriverSignature = nextDriverSignature;
}

long long
DvirBase::getOdometerMiles()
{
	return odometerMiles;
}

void
DvirBase::setOdometerMiles(long long  odometerMiles)
{
	this->odometerMiles = odometerMiles;
}

long long
DvirBase::getTimeMs()
{
	return timeMs;
}

void
DvirBase::setTimeMs(long long  timeMs)
{
	this->timeMs = timeMs;
}

std::list<DvirBase_trailerDefects>
DvirBase::getTrailerDefects()
{
	return trailerDefects;
}

void
DvirBase::setTrailerDefects(std::list <DvirBase_trailerDefects> trailerDefects)
{
	this->trailerDefects = trailerDefects;
}

int
DvirBase::getTrailerId()
{
	return trailerId;
}

void
DvirBase::setTrailerId(int  trailerId)
{
	this->trailerId = trailerId;
}

std::string
DvirBase::getTrailerName()
{
	return trailerName;
}

void
DvirBase::setTrailerName(std::string  trailerName)
{
	this->trailerName = trailerName;
}

DvirBase_vehicle
DvirBase::getVehicle()
{
	return vehicle;
}

void
DvirBase::setVehicle(DvirBase_vehicle  vehicle)
{
	this->vehicle = vehicle;
}

std::string
DvirBase::getVehicleCondition()
{
	return vehicleCondition;
}

void
DvirBase::setVehicleCondition(std::string  vehicleCondition)
{
	this->vehicleCondition = vehicleCondition;
}

std::list<DvirBase_trailerDefects>
DvirBase::getVehicleDefects()
{
	return vehicleDefects;
}

void
DvirBase::setVehicleDefects(std::list <DvirBase_trailerDefects> vehicleDefects)
{
	this->vehicleDefects = vehicleDefects;
}


