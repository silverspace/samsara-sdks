package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.AssetCable;
import io.swagger.model.AssetCurrentLocation;
import java.util.List;
@Canonical
class AssetCurrentLocationsResponse {

  /* The cable connected to the asset */
  List<AssetCable> cable = new ArrayList<AssetCable>()

  /* Engine hours */
  Integer engineHours = null

  /* Asset ID */
  Long id = null

  /* Current location of an asset */
  List<AssetCurrentLocation> location = new ArrayList<AssetCurrentLocation>()

  /* Asset name */
  String name = null
  

}

