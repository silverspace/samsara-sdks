/*
 * dvir_base.h
 *
 * 
 */

#ifndef _dvir_base_H_
#define _dvir_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "dvir_base_author_signature.h"
#include "dvir_base_mechanic_or_agent_signature.h"
#include "dvir_base_next_driver_signature.h"
#include "dvir_base_trailer_defects.h"
#include "dvir_base_vehicle.h"

typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0



typedef struct dvir_base_t {
        dvir_base_author_signature_t *authorSignature; //nonprimitive
        bool defectsCorrected; //boolean
        bool defectsNeedNotBeCorrected; //boolean
        long id; //numeric
        char *inspectionType; //no enum string
        char *mechanicNotes; //no enum string
        dvir_base_mechanic_or_agent_signature_t *mechanicOrAgentSignature; //nonprimitive
        dvir_base_next_driver_signature_t *nextDriverSignature; //nonprimitive
        long odometerMiles; //numeric
        long timeMs; //numeric
        list_t *trailerDefects; //nonprimitive container
        int trailerId; //numeric
        char *trailerName; //no enum string
        dvir_base_vehicle_t *vehicle; //nonprimitive
        char *vehicleCondition; //no enum string
        list_t *vehicleDefects; //nonprimitive container

} dvir_base_t;

dvir_base_t *dvir_base_create(
        dvir_base_author_signature_t *authorSignature,
        bool defectsCorrected,
        bool defectsNeedNotBeCorrected,
        long id,
        char *inspectionType,
        char *mechanicNotes,
        dvir_base_mechanic_or_agent_signature_t *mechanicOrAgentSignature,
        dvir_base_next_driver_signature_t *nextDriverSignature,
        long odometerMiles,
        long timeMs,
        list_t *trailerDefects,
        int trailerId,
        char *trailerName,
        dvir_base_vehicle_t *vehicle,
        char *vehicleCondition,
        list_t *vehicleDefects
);

void dvir_base_free(dvir_base_t *dvir_base);

dvir_base_t *dvir_base_parseFromJSON(char *jsonString);

cJSON *dvir_base_convertToJSON(dvir_base_t *dvir_base);

#endif /* _dvir_base_H_ */

