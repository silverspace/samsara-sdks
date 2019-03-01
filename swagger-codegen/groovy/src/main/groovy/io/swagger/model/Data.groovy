package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import java.util.List;
@Canonical
class Data {

    Map<String, String> externalIds = new HashMap<String, String>()

  /* Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic */
  Integer harshAccelSetting = null

  /* Name */
  String name = null
  

}

