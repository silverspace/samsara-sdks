package org.openapitools.client.model {

import org.openapitools.client.model.DocumentFieldType;

    [XmlRootNode(name="DocumentType")]
    public class DocumentType {
        /* The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have. */
        // This declaration below of _fieldTypes_obj_class is to force flash compiler to include this class
        private var _fieldTypes_obj_class: Array = null;
        [XmlElementWrapper(name="fieldTypes")]
        [XmlElements(name="fieldTypes", type="Array")]
                public var fieldTypes: Array = new Array();
        /* Name of the document type. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* ID for the organization this document belongs to. */
        [XmlElement(name="orgId")]
        public var orgId: Number = 0;
        /* Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type. */
        [XmlElement(name="uuid")]
        public var uuid: String = null;

    public function toString(): String {
        var str: String = "DocumentType: ";
        str += " (fieldTypes: " + fieldTypes + ")";
        str += " (name: " + name + ")";
        str += " (orgId: " + orgId + ")";
        str += " (uuid: " + uuid + ")";
        return str;
    }

}

}
