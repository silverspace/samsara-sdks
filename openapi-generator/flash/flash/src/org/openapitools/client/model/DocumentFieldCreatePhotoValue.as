package org.openapitools.client.model {


    [XmlRootNode(name="DocumentFieldCreatePhotoValue")]
    public class DocumentFieldCreatePhotoValue {
        /* Photo URL for a JPG image */
        [XmlElement(name="url")]
        public var url: String = null;

    public function toString(): String {
        var str: String = "DocumentFieldCreatePhotoValue: ";
        str += " (url: " + url + ")";
        return str;
    }

}

}
