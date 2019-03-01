#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tag.h"



tag_t *tag_create(
    list_t *addresses,
    list_t *assets,
    list_t *drivers,
    long groupId,
    long id,
    list_t *machines,
    char *name,
    long parentTagId,
    list_t *sensors,
    list_t *vehicles
    ) {
	tag_t *tag = malloc(sizeof(tag_t));
	tag->addresses = addresses;
	tag->assets = assets;
	tag->drivers = drivers;
	tag->groupId = groupId;
	tag->id = id;
	tag->machines = machines;
	tag->name = name;
	tag->parentTagId = parentTagId;
	tag->sensors = sensors;
	tag->vehicles = vehicles;

	return tag;
}


void tag_free(tag_t *tag) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, tag->addresses) {
		tagged_address_free(listEntry->data);
	}
	list_free(tag->addresses);
		list_ForEach(listEntry, tag->assets) {
		tagged_asset_free(listEntry->data);
	}
	list_free(tag->assets);
		list_ForEach(listEntry, tag->drivers) {
		tagged_driver_free(listEntry->data);
	}
	list_free(tag->drivers);
		list_ForEach(listEntry, tag->machines) {
		tagged_machine_free(listEntry->data);
	}
	list_free(tag->machines);
    free(tag->name);
		list_ForEach(listEntry, tag->sensors) {
		tagged_sensor_free(listEntry->data);
	}
	list_free(tag->sensors);
		list_ForEach(listEntry, tag->vehicles) {
		tagged_vehicle_free(listEntry->data);
	}
	list_free(tag->vehicles);

	free(tag);
}

cJSON *tag_convertToJSON(tag_t *tag) {
	cJSON *item = cJSON_CreateObject();
	// tag->addresses
    cJSON *addresses = cJSON_AddArrayToObject(item, "addresses");
	if(addresses == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *addressesListEntry;
	list_ForEach(addressesListEntry, tag->addresses) {
		cJSON *item = tagged_address_convertToJSON(addressesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(addresses, item);
	}

	// tag->assets
    cJSON *assets = cJSON_AddArrayToObject(item, "assets");
	if(assets == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *assetsListEntry;
	list_ForEach(assetsListEntry, tag->assets) {
		cJSON *item = tagged_asset_convertToJSON(assetsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(assets, item);
	}

	// tag->drivers
    cJSON *drivers = cJSON_AddArrayToObject(item, "drivers");
	if(drivers == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *driversListEntry;
	list_ForEach(driversListEntry, tag->drivers) {
		cJSON *item = tagged_driver_convertToJSON(driversListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(drivers, item);
	}

	// tag->groupId
    if(cJSON_AddNumberToObject(item, "groupId", tag->groupId) == NULL) {
    goto fail; //Numeric
    }

	// tag->id
    if(cJSON_AddNumberToObject(item, "id", tag->id) == NULL) {
    goto fail; //Numeric
    }

	// tag->machines
    cJSON *machines = cJSON_AddArrayToObject(item, "machines");
	if(machines == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *machinesListEntry;
	list_ForEach(machinesListEntry, tag->machines) {
		cJSON *item = tagged_machine_convertToJSON(machinesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(machines, item);
	}

	// tag->name
    if(cJSON_AddStringToObject(item, "name", tag->name) == NULL) {
    goto fail; //String
    }

	// tag->parentTagId
    if(cJSON_AddNumberToObject(item, "parentTagId", tag->parentTagId) == NULL) {
    goto fail; //Numeric
    }

	// tag->sensors
    cJSON *sensors = cJSON_AddArrayToObject(item, "sensors");
	if(sensors == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *sensorsListEntry;
	list_ForEach(sensorsListEntry, tag->sensors) {
		cJSON *item = tagged_sensor_convertToJSON(sensorsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(sensors, item);
	}

	// tag->vehicles
    cJSON *vehicles = cJSON_AddArrayToObject(item, "vehicles");
	if(vehicles == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *vehiclesListEntry;
	list_ForEach(vehiclesListEntry, tag->vehicles) {
		cJSON *item = tagged_vehicle_convertToJSON(vehiclesListEntry->data);
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

tag_t *tag_parseFromJSON(char *jsonString){

    tag_t *tag = NULL;
    cJSON *tagJSON = cJSON_Parse(jsonString);
    if(tagJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tag->addresses
    cJSON *addresses;
    cJSON *addressesJSON = cJSON_GetObjectItemCaseSensitive(tagJSON,"addresses");
    if(!cJSON_IsArray(addressesJSON)){
        goto end; //nonprimitive container
    }

    list_t *addressesList = list_create();

    cJSON_ArrayForEach(addresses,addressesJSON )
    {
        if(!cJSON_IsObject(addresses)){
            goto end;
        }
		char *JSONData = cJSON_Print(addresses);
        tagged_address_t *addressesItem = tagged_address_parseFromJSON(JSONData);

        list_addElement(addressesList, addressesItem);
        free(JSONData);
    }

    // tag->assets
    cJSON *assets;
    cJSON *assetsJSON = cJSON_GetObjectItemCaseSensitive(tagJSON,"assets");
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
        tagged_asset_t *assetsItem = tagged_asset_parseFromJSON(JSONData);

        list_addElement(assetsList, assetsItem);
        free(JSONData);
    }

    // tag->drivers
    cJSON *drivers;
    cJSON *driversJSON = cJSON_GetObjectItemCaseSensitive(tagJSON,"drivers");
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
        tagged_driver_t *driversItem = tagged_driver_parseFromJSON(JSONData);

        list_addElement(driversList, driversItem);
        free(JSONData);
    }

    // tag->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(tagJSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // tag->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // tag->machines
    cJSON *machines;
    cJSON *machinesJSON = cJSON_GetObjectItemCaseSensitive(tagJSON,"machines");
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
        tagged_machine_t *machinesItem = tagged_machine_parseFromJSON(JSONData);

        list_addElement(machinesList, machinesItem);
        free(JSONData);
    }

    // tag->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tagJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // tag->parentTagId
    cJSON *parentTagId = cJSON_GetObjectItemCaseSensitive(tagJSON, "parentTagId");
    if(!cJSON_IsNumber(parentTagId))
    {
    goto end; //Numeric
    }

    // tag->sensors
    cJSON *sensors;
    cJSON *sensorsJSON = cJSON_GetObjectItemCaseSensitive(tagJSON,"sensors");
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
        tagged_sensor_t *sensorsItem = tagged_sensor_parseFromJSON(JSONData);

        list_addElement(sensorsList, sensorsItem);
        free(JSONData);
    }

    // tag->vehicles
    cJSON *vehicles;
    cJSON *vehiclesJSON = cJSON_GetObjectItemCaseSensitive(tagJSON,"vehicles");
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
        tagged_vehicle_t *vehiclesItem = tagged_vehicle_parseFromJSON(JSONData);

        list_addElement(vehiclesList, vehiclesItem);
        free(JSONData);
    }


    tag = tag_create (
        addressesList,
        assetsList,
        driversList,
        groupId->valuedouble,
        id->valuedouble,
        machinesList,
        strdup(name->valuestring),
        parentTagId->valuedouble,
        sensorsList,
        vehiclesList
        );
 cJSON_Delete(tagJSON);
    return tag;
end:
    cJSON_Delete(tagJSON);
    return NULL;

}

