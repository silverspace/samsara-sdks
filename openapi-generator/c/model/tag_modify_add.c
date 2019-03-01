#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tag_modify_add.h"



tag_modify_add_t *tag_modify_add_create(
    list_t *assets,
    list_t *sensors,
    list_t *vehicles,
    list_t *machines,
    list_t *drivers
    ) {
	tag_modify_add_t *tag_modify_add = malloc(sizeof(tag_modify_add_t));
	tag_modify_add->assets = assets;
	tag_modify_add->sensors = sensors;
	tag_modify_add->vehicles = vehicles;
	tag_modify_add->machines = machines;
	tag_modify_add->drivers = drivers;

	return tag_modify_add;
}


void tag_modify_add_free(tag_modify_add_t *tag_modify_add) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, tag_modify_add->assets) {
		tagged_asset_base_free(listEntry->data);
	}
	list_free(tag_modify_add->assets);
		list_ForEach(listEntry, tag_modify_add->sensors) {
		tagged_sensor_base_free(listEntry->data);
	}
	list_free(tag_modify_add->sensors);
		list_ForEach(listEntry, tag_modify_add->vehicles) {
		tagged_vehicle_base_free(listEntry->data);
	}
	list_free(tag_modify_add->vehicles);
		list_ForEach(listEntry, tag_modify_add->machines) {
		tagged_machine_base_free(listEntry->data);
	}
	list_free(tag_modify_add->machines);
		list_ForEach(listEntry, tag_modify_add->drivers) {
		tagged_driver_base_free(listEntry->data);
	}
	list_free(tag_modify_add->drivers);

	free(tag_modify_add);
}

cJSON *tag_modify_add_convertToJSON(tag_modify_add_t *tag_modify_add) {
	cJSON *item = cJSON_CreateObject();
	// tag_modify_add->assets
    cJSON *assets = cJSON_AddArrayToObject(item, "assets");
	if(assets == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *assetsListEntry;
	list_ForEach(assetsListEntry, tag_modify_add->assets) {
		cJSON *item = tagged_asset_base_convertToJSON(assetsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(assets, item);
	}

	// tag_modify_add->sensors
    cJSON *sensors = cJSON_AddArrayToObject(item, "sensors");
	if(sensors == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *sensorsListEntry;
	list_ForEach(sensorsListEntry, tag_modify_add->sensors) {
		cJSON *item = tagged_sensor_base_convertToJSON(sensorsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(sensors, item);
	}

	// tag_modify_add->vehicles
    cJSON *vehicles = cJSON_AddArrayToObject(item, "vehicles");
	if(vehicles == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *vehiclesListEntry;
	list_ForEach(vehiclesListEntry, tag_modify_add->vehicles) {
		cJSON *item = tagged_vehicle_base_convertToJSON(vehiclesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(vehicles, item);
	}

	// tag_modify_add->machines
    cJSON *machines = cJSON_AddArrayToObject(item, "machines");
	if(machines == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *machinesListEntry;
	list_ForEach(machinesListEntry, tag_modify_add->machines) {
		cJSON *item = tagged_machine_base_convertToJSON(machinesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(machines, item);
	}

	// tag_modify_add->drivers
    cJSON *drivers = cJSON_AddArrayToObject(item, "drivers");
	if(drivers == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *driversListEntry;
	list_ForEach(driversListEntry, tag_modify_add->drivers) {
		cJSON *item = tagged_driver_base_convertToJSON(driversListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(drivers, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tag_modify_add_t *tag_modify_add_parseFromJSON(char *jsonString){

    tag_modify_add_t *tag_modify_add = NULL;
    cJSON *tag_modify_addJSON = cJSON_Parse(jsonString);
    if(tag_modify_addJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tag_modify_add->assets
    cJSON *assets;
    cJSON *assetsJSON = cJSON_GetObjectItemCaseSensitive(tag_modify_addJSON,"assets");
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

    // tag_modify_add->sensors
    cJSON *sensors;
    cJSON *sensorsJSON = cJSON_GetObjectItemCaseSensitive(tag_modify_addJSON,"sensors");
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

    // tag_modify_add->vehicles
    cJSON *vehicles;
    cJSON *vehiclesJSON = cJSON_GetObjectItemCaseSensitive(tag_modify_addJSON,"vehicles");
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

    // tag_modify_add->machines
    cJSON *machines;
    cJSON *machinesJSON = cJSON_GetObjectItemCaseSensitive(tag_modify_addJSON,"machines");
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

    // tag_modify_add->drivers
    cJSON *drivers;
    cJSON *driversJSON = cJSON_GetObjectItemCaseSensitive(tag_modify_addJSON,"drivers");
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


    tag_modify_add = tag_modify_add_create (
        assetsList,
        sensorsList,
        vehiclesList,
        machinesList,
        driversList
        );
 cJSON_Delete(tag_modify_addJSON);
    return tag_modify_add;
end:
    cJSON_Delete(tag_modify_addJSON);
    return NULL;

}

