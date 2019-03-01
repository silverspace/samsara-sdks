package org.openapitools.client.model {


    [XmlRootNode(name="DvirBaseTrailerDefects")]
    public class DvirBaseTrailerDefects {
        /* The comment describing the type of DVIR defect */
        [XmlElement(name="comment")]
        public var comment: String = null;
        /* The type of DVIR defect */
        [XmlElement(name="defectType")]
        public var defectType: String = null;

    public function toString(): String {
        var str: String = "DvirBaseTrailerDefects: ";
        str += " (comment: " + comment + ")";
        str += " (defectType: " + defectType + ")";
        return str;
    }

}

}
