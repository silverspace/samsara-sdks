#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/data_input_history_response.h"
#include "../model/inline_object_17.h"
#include "../model/inline_object_18.h"
#include "../model/inline_response_200_6.h"
#include "../model/inline_response_200_7.h"
#include "../model/machine_history_response.h"


// /industrial/data
//
// Fetch all of the data inputs for a group.
//
inline_response_200_6_t*
IndustrialAPI_getAllDataInputs(apiClient_t *apiClient,char* access_token ,long group_id ,long startMs ,long endMs );



// /industrial/data/{data_input_id:[0-9]+}
//
// Fetch datapoints from a given data input.
//
data_input_history_response_t*
IndustrialAPI_getDataInput(apiClient_t *apiClient,char* access_token ,long data_input_id ,long startMs ,long endMs );



// /machines/list
//
// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
//
inline_response_200_7_t*
IndustrialAPI_getMachines(apiClient_t *apiClient,char* access_token ,inline_object_18_t* groupParam );



// /machines/history
//
// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
//
machine_history_response_t*
IndustrialAPI_getMachinesHistory(apiClient_t *apiClient,char* access_token ,inline_object_17_t* historyParam );



