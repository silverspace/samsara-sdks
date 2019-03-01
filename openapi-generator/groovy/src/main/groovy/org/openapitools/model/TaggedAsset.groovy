package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TaggedAssetBase;

@Canonical
class TaggedAsset {
    /* The ID of the Asset being tagged. */
    Long id

    /* Name of the Asset being tagged. */
    String name

}
