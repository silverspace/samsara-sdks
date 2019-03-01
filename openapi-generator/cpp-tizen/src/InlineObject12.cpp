#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object_12.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object_12::Inline_object_12()
{
	//__init();
}

Inline_object_12::~Inline_object_12()
{
	//__cleanup();
}

void
Inline_object_12::__init()
{
	//inspectionType = std::string();
	//mechanicNotes = std::string();
	//odometerMiles = int(0);
	//previousDefectsCorrected = bool(false);
	//previousDefectsIgnored = bool(false);
	//safe = std::string();
	//trailerId = int(0);
	//userEmail = std::string();
	//vehicleId = int(0);
}

void
Inline_object_12::__cleanup()
{
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
	//if(odometerMiles != NULL) {
	//
	//delete odometerMiles;
	//odometerMiles = NULL;
	//}
	//if(previousDefectsCorrected != NULL) {
	//
	//delete previousDefectsCorrected;
	//previousDefectsCorrected = NULL;
	//}
	//if(previousDefectsIgnored != NULL) {
	//
	//delete previousDefectsIgnored;
	//previousDefectsIgnored = NULL;
	//}
	//if(safe != NULL) {
	//
	//delete safe;
	//safe = NULL;
	//}
	//if(trailerId != NULL) {
	//
	//delete trailerId;
	//trailerId = NULL;
	//}
	//if(userEmail != NULL) {
	//
	//delete userEmail;
	//userEmail = NULL;
	//}
	//if(vehicleId != NULL) {
	//
	//delete vehicleId;
	//vehicleId = NULL;
	//}
	//
}

void
Inline_object_12::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *odometerMilesKey = "odometerMiles";
	node = json_object_get_member(pJsonObject, odometerMilesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&odometerMiles, node, "int", "");
		} else {
			
		}
	}
	const gchar *previousDefectsCorrectedKey = "previousDefectsCorrected";
	node = json_object_get_member(pJsonObject, previousDefectsCorrectedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&previousDefectsCorrected, node, "bool", "");
		} else {
			
		}
	}
	const gchar *previousDefectsIgnoredKey = "previousDefectsIgnored";
	node = json_object_get_member(pJsonObject, previousDefectsIgnoredKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&previousDefectsIgnored, node, "bool", "");
		} else {
			
		}
	}
	const gchar *safeKey = "safe";
	node = json_object_get_member(pJsonObject, safeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&safe, node, "std::string", "");
		} else {
			
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
	const gchar *userEmailKey = "userEmail";
	node = json_object_get_member(pJsonObject, userEmailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&userEmail, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *vehicleIdKey = "vehicleId";
	node = json_object_get_member(pJsonObject, vehicleIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&vehicleId, node, "int", "");
		} else {
			
		}
	}
}

Inline_object_12::Inline_object_12(char* json)
{
	this->fromJson(json);
}

char*
Inline_object_12::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("int")) {
		int obj = getOdometerMiles();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *odometerMilesKey = "odometerMiles";
	json_object_set_member(pJsonObject, odometerMilesKey, node);
	if (isprimitive("bool")) {
		bool obj = getPreviousDefectsCorrected();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *previousDefectsCorrectedKey = "previousDefectsCorrected";
	json_object_set_member(pJsonObject, previousDefectsCorrectedKey, node);
	if (isprimitive("bool")) {
		bool obj = getPreviousDefectsIgnored();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *previousDefectsIgnoredKey = "previousDefectsIgnored";
	json_object_set_member(pJsonObject, previousDefectsIgnoredKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSafe();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *safeKey = "safe";
	json_object_set_member(pJsonObject, safeKey, node);
	if (isprimitive("int")) {
		int obj = getTrailerId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *trailerIdKey = "trailerId";
	json_object_set_member(pJsonObject, trailerIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *userEmailKey = "userEmail";
	json_object_set_member(pJsonObject, userEmailKey, node);
	if (isprimitive("int")) {
		int obj = getVehicleId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *vehicleIdKey = "vehicleId";
	json_object_set_member(pJsonObject, vehicleIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Inline_object_12::getInspectionType()
{
	return inspectionType;
}

void
Inline_object_12::setInspectionType(std::string  inspectionType)
{
	this->inspectionType = inspectionType;
}

std::string
Inline_object_12::getMechanicNotes()
{
	return mechanicNotes;
}

void
Inline_object_12::setMechanicNotes(std::string  mechanicNotes)
{
	this->mechanicNotes = mechanicNotes;
}

int
Inline_object_12::getOdometerMiles()
{
	return odometerMiles;
}

void
Inline_object_12::setOdometerMiles(int  odometerMiles)
{
	this->odometerMiles = odometerMiles;
}

bool
Inline_object_12::getPreviousDefectsCorrected()
{
	return previousDefectsCorrected;
}

void
Inline_object_12::setPreviousDefectsCorrected(bool  previousDefectsCorrected)
{
	this->previousDefectsCorrected = previousDefectsCorrected;
}

bool
Inline_object_12::getPreviousDefectsIgnored()
{
	return previousDefectsIgnored;
}

void
Inline_object_12::setPreviousDefectsIgnored(bool  previousDefectsIgnored)
{
	this->previousDefectsIgnored = previousDefectsIgnored;
}

std::string
Inline_object_12::getSafe()
{
	return safe;
}

void
Inline_object_12::setSafe(std::string  safe)
{
	this->safe = safe;
}

int
Inline_object_12::getTrailerId()
{
	return trailerId;
}

void
Inline_object_12::setTrailerId(int  trailerId)
{
	this->trailerId = trailerId;
}

std::string
Inline_object_12::getUserEmail()
{
	return userEmail;
}

void
Inline_object_12::setUserEmail(std::string  userEmail)
{
	this->userEmail = userEmail;
}

int
Inline_object_12::getVehicleId()
{
	return vehicleId;
}

void
Inline_object_12::setVehicleId(int  vehicleId)
{
	this->vehicleId = vehicleId;
}


