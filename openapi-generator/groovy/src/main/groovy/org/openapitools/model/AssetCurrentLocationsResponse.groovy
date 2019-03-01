package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AssetCable;
import org.openapitools.model.AssetCurrentLocation;

@Canonical
class AssetCurrentLocationsResponse {
    /* The cable connected to the asset */
    List<AssetCable> cable = new ArrayList<AssetCable>()

    /* Engine hours */
    Integer engineHours

    /* Asset ID */
    Long id

    /* Current location of an asset */
    List<AssetCurrentLocation> location = new ArrayList<AssetCurrentLocation>()

    /* Asset name */
    String name

}
