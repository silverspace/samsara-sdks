package org.openapitools.client.model {

import org.openapitools.client.model.SensorsHistorySeries;

    [XmlRootNode(name="InlineObject21")]
    public class InlineObject21 {
        /* End of the time range, specified in milliseconds UNIX time. */
        [XmlElement(name="endMs")]
        public var endMs: Number = 0;
                [XmlElement(name="fillMissing")]
        public var fillMissing: String = null;
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
                // This declaration below of _series_obj_class is to force flash compiler to include this class
        private var _series_obj_class: Array = null;
        [XmlElementWrapper(name="series")]
        [XmlElements(name="series", type="Array")]
                public var series: Array = new Array();
        /* Beginning of the time range, specified in milliseconds UNIX time. */
        [XmlElement(name="startMs")]
        public var startMs: Number = 0;
        /* Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. */
        [XmlElement(name="stepMs")]
        public var stepMs: Number = 0;

    public function toString(): String {
        var str: String = "InlineObject21: ";
        str += " (endMs: " + endMs + ")";
        str += " (fillMissing: " + fillMissing + ")";
        str += " (groupId: " + groupId + ")";
        str += " (series: " + series + ")";
        str += " (startMs: " + startMs + ")";
        str += " (stepMs: " + stepMs + ")";
        return str;
    }

}

}
