package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TagMetadataList implements ListWrapper {
        // This declaration below of _TagMetadata_obj_class is to force flash compiler to include this class
        private var _tagMetadata_obj_class: org.openapitools.client.model.TagMetadata = null;
        [XmlElements(name="tagMetadata", type="org.openapitools.client.model.TagMetadata")]
        public var tagMetadata: Array = new Array();

        public function getList(): Array{
            return tagMetadata;
        }

}

}
