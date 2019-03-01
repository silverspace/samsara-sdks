package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AssetCable;

@Canonical
class Asset {
    /* Serial number of the host asset */
    String assetSerialNumber

    /* The cable connected to the asset */
    List<AssetCable> cable = new ArrayList<AssetCable>()

    /* Engine hours */
    Integer engineHours

    /* Asset ID */
    Long id

    /* Asset name */
    String name

}
