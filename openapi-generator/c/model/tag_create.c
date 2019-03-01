#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tag_create.h"



tag_create_t *tag_create_create(
    list_t *assets,
    list_t *drivers,
    list_t *machines,
    char *name,
    long parentTagId,
    list_t *sensors,
    list_t *vehicles
    ) {
	tag_create_t *tag_create = malloc(sizeof(tag_create_t));
	tag_create->assets = assets;
	tag_create->drivers = drivers;
	tag_create->machines = machines;
	tag_create->name = name;
	tag_create->parentTagId = parentTagId;
	tag_create->sensors = sensors;
	tag_create->vehicles = vehicles;

	return tag_create;
}


void tag_create_free(tag_create_t *tag_create) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, tag_create->assets) {
		tagged_asset_base_free(listEntry->data);
	}
	list_free(tag_create->assets);
		list_ForEach(listEntry, tag_create->drivers) {
		tagged_driver_base_free(listEntry->data);
	}
	list_free(tag_create->drivers);
		list_ForEach(listEntry, tag_create->machines) {
		tagged_machine_base_free(listEntry->data);
	}
	list_free(tag_create->machines);
    free(tag_create->name);
		list_ForEach(listEntry, tag_create->sensors) {
		tagged_sensor_base_free(listEntry->data);
	}
	list_free(tag_create->sensors);
		list_ForEach(listEntry, tag_create->vehicles) {
		tagged_vehicle_base_free(listEntry->data);
	}
	list_free(tag_create->vehicles);

	free(tag_create);
}

cJSON *tag_create_convertToJSON(tag_create_t *tag_create) {
	cJSON *item = cJSON_CreateObject();
	// tag_create->assets
    cJSON *assets = cJSON_AddArrayToObject(item, "assets");
	if(assets == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *assetsListEntry;
	list_ForEach(assetsListEntry, tag_create->assets) {
		cJSON *item = tagged_asset_base_convertToJSON(assetsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(assets, item);
	}

	// tag_create->drivers
    cJSON *drivers = cJSON_AddArrayToObject(item, "drivers");
	if(drivers == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *driversListEntry;
	list_ForEach(driversListEntry, tag_create->drivers) {
		cJSON *item = tagged_driver_base_convertToJSON(driversListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(drivers, item);
	}

	// tag_create->machines
    cJSON *machines = cJSON_AddArrayToObject(item, "machines");
	if(machines == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *machinesListEntry;
	list_ForEach(machinesListEntry, tag_create->machines) {
		cJSON *item = tagged_machine_base_convertToJSON(machinesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(machines, item);
	}

	// tag_create->name
    if(cJSON_AddStringToObject(item, "name", tag_create->name) == NULL) {
    goto fail; //String
    }

	// tag_create->parentTagId
    if(cJSON_AddNumberToObject(item, "parentTagId", tag_create->parentTagId) == NULL) {
    goto fail; //Numeric
    }

	// tag_create->sensors
    cJSON *sensors = cJSON_AddArrayToObject(item, "sensors");
	if(sensors == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *sensorsListEntry;
	list_ForEach(sensorsListEntry, tag_create->sensors) {
		cJSON *item = tagged_sensor_base_convertToJSON(sensorsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(sensors, item);
	}

	// tag_create->vehicles
    cJSON *vehicles = cJSON_AddArrayToObject(item, "vehicles");
	if(vehicles == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *vehiclesListEntry;
	list_ForEach(vehiclesListEntry, tag_create->vehicles) {
		cJSON *item = tagged_vehicle_base_convertToJSON(vehiclesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(vehicles, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tag_create_t *tag_create_parseFromJSON(char *jsonString){

    tag_create_t *tag_create = NULL;
    cJSON *tag_createJSON = cJSON_Parse(jsonString);
    if(tag_createJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tag_create->assets
    cJSON *assets;
    cJSON *assetsJSON = cJSON_GetObjectItemCaseSensitive(tag_createJSON,"assets");
    if(!cJSON_IsArray(assetsJSON)){
        goto end; //nonprimitive container
    }

    list_t *assetsList = list_create();

    cJSON_ArrayForEach(assets,assetsJSON )
    {
        if(!cJSON_IsObject(assets)){
            goto end;
        }
		char *JSONData = cJSON_Print(assets);
        tagged_asset_base_t *assetsItem = tagged_asset_base_parseFromJSON(JSONData);

        list_addElement(assetsList, assetsItem);
        free(JSONData);
    }

    // tag_create->drivers
    cJSON *drivers;
    cJSON *driversJSON = cJSON_GetObjectItemCaseSensitive(tag_createJSON,"drivers");
    if(!cJSON_IsArray(driversJSON)){
        goto end; //nonprimitive container
    }

    list_t *driversList = list_create();

    cJSON_ArrayForEach(drivers,driversJSON )
    {
        if(!cJSON_IsObject(drivers)){
            goto end;
        }
		char *JSONData = cJSON_Print(drivers);
        tagged_driver_base_t *driversItem = tagged_driver_base_parseFromJSON(JSONData);

        list_addElement(driversList, driversItem);
        free(JSONData);
    }

    // tag_create->machines
    cJSON *machines;
    cJSON *machinesJSON = cJSON_GetObjectItemCaseSensitive(tag_createJSON,"machines");
    if(!cJSON_IsArray(machinesJSON)){
        goto end; //nonprimitive container
    }

    list_t *machinesList = list_create();

    cJSON_ArrayForEach(machines,machinesJSON )
    {
        if(!cJSON_IsObject(machines)){
            goto end;
        }
		char *JSONData = cJSON_Print(machines);
        tagged_machine_base_t *machinesItem = tagged_machine_base_parseFromJSON(JSONData);

        list_addElement(machinesList, machinesItem);
        free(JSONData);
    }

    // tag_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tag_createJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // tag_create->parentTagId
    cJSON *parentTagId = cJSON_GetObjectItemCaseSensitive(tag_createJSON, "parentTagId");
    if(!cJSON_IsNumber(parentTagId))
    {
    goto end; //Numeric
    }

    // tag_create->sensors
    cJSON *sensors;
    cJSON *sensorsJSON = cJSON_GetObjectItemCaseSensitive(tag_createJSON,"sensors");
    if(!cJSON_IsArray(sensorsJSON)){
        goto end; //nonprimitive container
    }

    list_t *sensorsList = list_create();

    cJSON_ArrayForEach(sensors,sensorsJSON )
    {
        if(!cJSON_IsObject(sensors)){
            goto end;
        }
		char *JSONData = cJSON_Print(sensors);
        tagged_sensor_base_t *sensorsItem = tagged_sensor_base_parseFromJSON(JSONData);

        list_addElement(sensorsList, sensorsItem);
        free(JSONData);
    }

    // tag_create->vehicles
    cJSON *vehicles;
    cJSON *vehiclesJSON = cJSON_GetObjectItemCaseSensitive(tag_createJSON,"vehicles");
    if(!cJSON_IsArray(vehiclesJSON)){
        goto end; //nonprimitive container
    }

    list_t *vehiclesList = list_create();

    cJSON_ArrayForEach(vehicles,vehiclesJSON )
    {
        if(!cJSON_IsObject(vehicles)){
            goto end;
        }
		char *JSONData = cJSON_Print(vehicles);
        tagged_vehicle_base_t *vehiclesItem = tagged_vehicle_base_parseFromJSON(JSONData);

        list_addElement(vehiclesList, vehiclesItem);
        free(JSONData);
    }


    tag_create = tag_create_create (
        assetsList,
        driversList,
        machinesList,
        strdup(name->valuestring),
        parentTagId->valuedouble,
        sensorsList,
        vehiclesList
        );
 cJSON_Delete(tag_createJSON);
    return tag_create;
end:
    cJSON_Delete(tag_createJSON);
    return NULL;

}

