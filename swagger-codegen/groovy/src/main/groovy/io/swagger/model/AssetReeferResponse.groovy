package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssetReeferResponseReeferStats;
@Canonical
class AssetReeferResponse {

  /* Asset type */
  String assetType = null

  /* Asset ID */
  Integer id = null

  /* Asset name */
  String name = null

    AssetReeferResponseReeferStats reeferStats = null
  

}

