package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetReeferResponseReeferStats;

@Canonical
class AssetReeferResponse {
    /* Asset type */
    String assetType

    /* Asset ID */
    Integer id

    /* Asset name */
    String name

    AssetReeferResponseReeferStats reeferStats = null

}
