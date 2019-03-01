package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.AssetCable;
import java.util.List;
@Canonical
class Asset {

  /* Serial number of the host asset */
  String assetSerialNumber = null

  /* The cable connected to the asset */
  List<AssetCable> cable = new ArrayList<AssetCable>()

  /* Engine hours */
  Integer engineHours = null

  /* Asset ID */
  Long id = null

  /* Asset name */
  String name = null
  

}

