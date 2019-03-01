#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "aux_input_series.h"


char* nameaux_input_series_ToString(name_e name){
    char *nameArray[] =  { "Emergency Lights","Emergency Alarm","Stop Paddle","Power Take-Off","Plow","Sweeper","Salter","Boom" };
    return nameArray[name];

}

name_e nameaux_input_series_FromString(char* name){
    int stringToReturn = 0;
    char *nameArray[] =  { "Emergency Lights","Emergency Alarm","Stop Paddle","Power Take-Off","Plow","Sweeper","Salter","Boom" };
    size_t sizeofArray = sizeof(nameArray) / sizeof(nameArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(name, nameArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
}

aux_input_series_t *aux_input_series_create(
    name_e name,
    list_t *values
    ) {
	aux_input_series_t *aux_input_series = malloc(sizeof(aux_input_series_t));
	aux_input_series->name = name;
	aux_input_series->values = values;

	return aux_input_series;
}


void aux_input_series_free(aux_input_series_t *aux_input_series) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, aux_input_series->values) {
		aux_input_free(listEntry->data);
	}
	list_free(aux_input_series->values);

	free(aux_input_series);
}

cJSON *aux_input_series_convertToJSON(aux_input_series_t *aux_input_series) {
	cJSON *item = cJSON_CreateObject();
	// aux_input_series->name
    if(cJSON_AddStringToObject(item, "name", nameaux_input_series_ToString(aux_input_series->name)) == NULL) {
    goto fail; //String
    }

	// aux_input_series->values
    cJSON *values = cJSON_AddArrayToObject(item, "values");
	if(values == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *valuesListEntry;
	list_ForEach(valuesListEntry, aux_input_series->values) {
		cJSON *item = aux_input_convertToJSON(valuesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(values, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

aux_input_series_t *aux_input_series_parseFromJSON(char *jsonString){

    aux_input_series_t *aux_input_series = NULL;
    cJSON *aux_input_seriesJSON = cJSON_Parse(jsonString);
    if(aux_input_seriesJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // aux_input_series->name
    name_e nameVariable;
    cJSON *name = cJSON_GetObjectItemCaseSensitive(aux_input_seriesJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    nameVariable = nameaux_input_series_FromString(name->valuestring);

    // aux_input_series->values
    cJSON *values;
    cJSON *valuesJSON = cJSON_GetObjectItemCaseSensitive(aux_input_seriesJSON,"values");
    if(!cJSON_IsArray(valuesJSON)){
        goto end; //nonprimitive container
    }

    list_t *valuesList = list_create();

    cJSON_ArrayForEach(values,valuesJSON )
    {
        if(!cJSON_IsObject(values)){
            goto end;
        }
		char *JSONData = cJSON_Print(values);
        aux_input_t *valuesItem = aux_input_parseFromJSON(JSONData);

        list_addElement(valuesList, valuesItem);
        free(JSONData);
    }


    aux_input_series = aux_input_series_create (
        nameVariable,
        valuesList
        );
 cJSON_Delete(aux_input_seriesJSON);
    return aux_input_series;
end:
    cJSON_Delete(aux_input_seriesJSON);
    return NULL;

}

