#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tag_update.h"



tag_update_t *tag_update_create(
    list_t *assets,
    list_t *drivers,
    list_t *machines,
    char *name,
    long parentTagId,
    list_t *sensors,
    list_t *vehicles
    ) {
	tag_update_t *tag_update = malloc(sizeof(tag_update_t));
	tag_update->assets = assets;
	tag_update->drivers = drivers;
	tag_update->machines = machines;
	tag_update->name = name;
	tag_update->parentTagId = parentTagId;
	tag_update->sensors = sensors;
	tag_update->vehicles = vehicles;

	return tag_update;
}


void tag_update_free(tag_update_t *tag_update) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, tag_update->assets) {
		tagged_asset_base_free(listEntry->data);
	}
	list_free(tag_update->assets);
		list_ForEach(listEntry, tag_update->drivers) {
		tagged_driver_base_free(listEntry->data);
	}
	list_free(tag_update->drivers);
		list_ForEach(listEntry, tag_update->machines) {
		tagged_machine_base_free(listEntry->data);
	}
	list_free(tag_update->machines);
    free(tag_update->name);
		list_ForEach(listEntry, tag_update->sensors) {
		tagged_sensor_base_free(listEntry->data);
	}
	list_free(tag_update->sensors);
		list_ForEach(listEntry, tag_update->vehicles) {
		tagged_vehicle_base_free(listEntry->data);
	}
	list_free(tag_update->vehicles);

	free(tag_update);
}

cJSON *tag_update_convertToJSON(tag_update_t *tag_update) {
	cJSON *item = cJSON_CreateObject();
	// tag_update->assets
    cJSON *assets = cJSON_AddArrayToObject(item, "assets");
	if(assets == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *assetsListEntry;
	list_ForEach(assetsListEntry, tag_update->assets) {
		cJSON *item = tagged_asset_base_convertToJSON(assetsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(assets, item);
	}

	// tag_update->drivers
    cJSON *drivers = cJSON_AddArrayToObject(item, "drivers");
	if(drivers == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *driversListEntry;
	list_ForEach(driversListEntry, tag_update->drivers) {
		cJSON *item = tagged_driver_base_convertToJSON(driversListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(drivers, item);
	}

	// tag_update->machines
    cJSON *machines = cJSON_AddArrayToObject(item, "machines");
	if(machines == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *machinesListEntry;
	list_ForEach(machinesListEntry, tag_update->machines) {
		cJSON *item = tagged_machine_base_convertToJSON(machinesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(machines, item);
	}

	// tag_update->name
    if(cJSON_AddStringToObject(item, "name", tag_update->name) == NULL) {
    goto fail; //String
    }

	// tag_update->parentTagId
    if(cJSON_AddNumberToObject(item, "parentTagId", tag_update->parentTagId) == NULL) {
    goto fail; //Numeric
    }

	// tag_update->sensors
    cJSON *sensors = cJSON_AddArrayToObject(item, "sensors");
	if(sensors == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *sensorsListEntry;
	list_ForEach(sensorsListEntry, tag_update->sensors) {
		cJSON *item = tagged_sensor_base_convertToJSON(sensorsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(sensors, item);
	}

	// tag_update->vehicles
    cJSON *vehicles = cJSON_AddArrayToObject(item, "vehicles");
	if(vehicles == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *vehiclesListEntry;
	list_ForEach(vehiclesListEntry, tag_update->vehicles) {
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

tag_update_t *tag_update_parseFromJSON(char *jsonString){

    tag_update_t *tag_update = NULL;
    cJSON *tag_updateJSON = cJSON_Parse(jsonString);
    if(tag_updateJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tag_update->assets
    cJSON *assets;
    cJSON *assetsJSON = cJSON_GetObjectItemCaseSensitive(tag_updateJSON,"assets");
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

    // tag_update->drivers
    cJSON *drivers;
    cJSON *driversJSON = cJSON_GetObjectItemCaseSensitive(tag_updateJSON,"drivers");
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

    // tag_update->machines
    cJSON *machines;
    cJSON *machinesJSON = cJSON_GetObjectItemCaseSensitive(tag_updateJSON,"machines");
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

    // tag_update->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tag_updateJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // tag_update->parentTagId
    cJSON *parentTagId = cJSON_GetObjectItemCaseSensitive(tag_updateJSON, "parentTagId");
    if(!cJSON_IsNumber(parentTagId))
    {
    goto end; //Numeric
    }

    // tag_update->sensors
    cJSON *sensors;
    cJSON *sensorsJSON = cJSON_GetObjectItemCaseSensitive(tag_updateJSON,"sensors");
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

    // tag_update->vehicles
    cJSON *vehicles;
    cJSON *vehiclesJSON = cJSON_GetObjectItemCaseSensitive(tag_updateJSON,"vehicles");
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


    tag_update = tag_update_create (
        assetsList,
        driversList,
        machinesList,
        strdup(name->valuestring),
        parentTagId->valuedouble,
        sensorsList,
        vehiclesList
        );
 cJSON_Delete(tag_updateJSON);
    return tag_update;
end:
    cJSON_Delete(tag_updateJSON);
    return NULL;

}

