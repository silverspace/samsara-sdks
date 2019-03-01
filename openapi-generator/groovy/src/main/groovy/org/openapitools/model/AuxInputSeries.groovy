package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AuxInput;

@Canonical
class AuxInputSeries {
    /* The name of the aux input. */
    String name

    List<AuxInput> values = new ArrayList<AuxInput>()

}
