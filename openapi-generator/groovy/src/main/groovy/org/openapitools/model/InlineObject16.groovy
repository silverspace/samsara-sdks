package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;

@Canonical
class InlineObject16 {
    Map<String, String> externalIds = new HashMap<String, String>()

    /* Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic */
    Integer harshAccelSetting

    /* Name */
    String name

}
