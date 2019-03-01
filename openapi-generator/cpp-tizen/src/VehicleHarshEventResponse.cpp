#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VehicleHarshEventResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VehicleHarshEventResponse::VehicleHarshEventResponse()
{
	//__init();
}

VehicleHarshEventResponse::~VehicleHarshEventResponse()
{
	//__cleanup();
}

void
VehicleHarshEventResponse::__init()
{
	//downloadForwardVideoUrl = std::string();
	//downloadInwardVideoUrl = std::string();
	//downloadTrackedInwardVideoUrl = std::string();
	//harshEventType = std::string();
	//incidentReportUrl = std::string();
	//isDistracted = bool(false);
	//location = new VehicleHarshEventResponse_location();
}

void
VehicleHarshEventResponse::__cleanup()
{
	//if(downloadForwardVideoUrl != NULL) {
	//
	//delete downloadForwardVideoUrl;
	//downloadForwardVideoUrl = NULL;
	//}
	//if(downloadInwardVideoUrl != NULL) {
	//
	//delete downloadInwardVideoUrl;
	//downloadInwardVideoUrl = NULL;
	//}
	//if(downloadTrackedInwardVideoUrl != NULL) {
	//
	//delete downloadTrackedInwardVideoUrl;
	//downloadTrackedInwardVideoUrl = NULL;
	//}
	//if(harshEventType != NULL) {
	//
	//delete harshEventType;
	//harshEventType = NULL;
	//}
	//if(incidentReportUrl != NULL) {
	//
	//delete incidentReportUrl;
	//incidentReportUrl = NULL;
	//}
	//if(isDistracted != NULL) {
	//
	//delete isDistracted;
	//isDistracted = NULL;
	//}
	//if(location != NULL) {
	//
	//delete location;
	//location = NULL;
	//}
	//
}

void
VehicleHarshEventResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *downloadForwardVideoUrlKey = "downloadForwardVideoUrl";
	node = json_object_get_member(pJsonObject, downloadForwardVideoUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&downloadForwardVideoUrl, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *downloadInwardVideoUrlKey = "downloadInwardVideoUrl";
	node = json_object_get_member(pJsonObject, downloadInwardVideoUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&downloadInwardVideoUrl, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *downloadTrackedInwardVideoUrlKey = "downloadTrackedInwardVideoUrl";
	node = json_object_get_member(pJsonObject, downloadTrackedInwardVideoUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&downloadTrackedInwardVideoUrl, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *harshEventTypeKey = "harshEventType";
	node = json_object_get_member(pJsonObject, harshEventTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&harshEventType, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *incidentReportUrlKey = "incidentReportUrl";
	node = json_object_get_member(pJsonObject, incidentReportUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&incidentReportUrl, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *isDistractedKey = "isDistracted";
	node = json_object_get_member(pJsonObject, isDistractedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&isDistracted, node, "bool", "");
		} else {
			
		}
	}
	const gchar *locationKey = "location";
	node = json_object_get_member(pJsonObject, locationKey);
	if (node !=NULL) {
	

		if (isprimitive("VehicleHarshEventResponse_location")) {
			jsonToValue(&location, node, "VehicleHarshEventResponse_location", "VehicleHarshEventResponse_location");
		} else {
			
			VehicleHarshEventResponse_location* obj = static_cast<VehicleHarshEventResponse_location*> (&location);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

VehicleHarshEventResponse::VehicleHarshEventResponse(char* json)
{
	this->fromJson(json);
}

char*
VehicleHarshEventResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDownloadForwardVideoUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *downloadForwardVideoUrlKey = "downloadForwardVideoUrl";
	json_object_set_member(pJsonObject, downloadForwardVideoUrlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDownloadInwardVideoUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *downloadInwardVideoUrlKey = "downloadInwardVideoUrl";
	json_object_set_member(pJsonObject, downloadInwardVideoUrlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDownloadTrackedInwardVideoUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *downloadTrackedInwardVideoUrlKey = "downloadTrackedInwardVideoUrl";
	json_object_set_member(pJsonObject, downloadTrackedInwardVideoUrlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHarshEventType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *harshEventTypeKey = "harshEventType";
	json_object_set_member(pJsonObject, harshEventTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIncidentReportUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *incidentReportUrlKey = "incidentReportUrl";
	json_object_set_member(pJsonObject, incidentReportUrlKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsDistracted();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *isDistractedKey = "isDistracted";
	json_object_set_member(pJsonObject, isDistractedKey, node);
	if (isprimitive("VehicleHarshEventResponse_location")) {
		VehicleHarshEventResponse_location obj = getLocation();
		node = converttoJson(&obj, "VehicleHarshEventResponse_location", "");
	}
	else {
		
		VehicleHarshEventResponse_location obj = static_cast<VehicleHarshEventResponse_location> (getLocation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *locationKey = "location";
	json_object_set_member(pJsonObject, locationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
VehicleHarshEventResponse::getDownloadForwardVideoUrl()
{
	return downloadForwardVideoUrl;
}

void
VehicleHarshEventResponse::setDownloadForwardVideoUrl(std::string  downloadForwardVideoUrl)
{
	this->downloadForwardVideoUrl = downloadForwardVideoUrl;
}

std::string
VehicleHarshEventResponse::getDownloadInwardVideoUrl()
{
	return downloadInwardVideoUrl;
}

void
VehicleHarshEventResponse::setDownloadInwardVideoUrl(std::string  downloadInwardVideoUrl)
{
	this->downloadInwardVideoUrl = downloadInwardVideoUrl;
}

std::string
VehicleHarshEventResponse::getDownloadTrackedInwardVideoUrl()
{
	return downloadTrackedInwardVideoUrl;
}

void
VehicleHarshEventResponse::setDownloadTrackedInwardVideoUrl(std::string  downloadTrackedInwardVideoUrl)
{
	this->downloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
}

std::string
VehicleHarshEventResponse::getHarshEventType()
{
	return harshEventType;
}

void
VehicleHarshEventResponse::setHarshEventType(std::string  harshEventType)
{
	this->harshEventType = harshEventType;
}

std::string
VehicleHarshEventResponse::getIncidentReportUrl()
{
	return incidentReportUrl;
}

void
VehicleHarshEventResponse::setIncidentReportUrl(std::string  incidentReportUrl)
{
	this->incidentReportUrl = incidentReportUrl;
}

bool
VehicleHarshEventResponse::getIsDistracted()
{
	return isDistracted;
}

void
VehicleHarshEventResponse::setIsDistracted(bool  isDistracted)
{
	this->isDistracted = isDistracted;
}

VehicleHarshEventResponse_location
VehicleHarshEventResponse::getLocation()
{
	return location;
}

void
VehicleHarshEventResponse::setLocation(VehicleHarshEventResponse_location  location)
{
	this->location = location;
}


