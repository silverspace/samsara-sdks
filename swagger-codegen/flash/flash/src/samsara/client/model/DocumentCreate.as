package samsara.client.model {

import samsara.client.model.DocumentBase;
import samsara.client.model.DocumentField;

    [XmlRootNode(name="DocumentCreate")]
    public class DocumentCreate {
        /* ID of the Samsara dispatch job for which the document is submitted */
        [XmlElement(name="dispatchJobId")]
        public var dispatchJobId: Number = 0;
        /* Notes submitted with this document. */
        [XmlElement(name="notes")]
        public var notes: String = null;
        /* Universally unique identifier for the document type this document is being created for. */
        [XmlElement(name="documentTypeUuid")]
        public var documentTypeUuid: String = null;
        /* List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. */
        // This declaration below of _fields_obj_class is to force flash compiler to include this class
        private var _fields_obj_class: Array = null;
        [XmlElementWrapper(name="fields")]
        [XmlElements(name="fields", type="Array")]
                public var fields: Array = new Array();

    public function toString(): String {
        var str: String = "DocumentCreate: ";
        str += " (dispatchJobId: " + dispatchJobId + ")";
        str += " (notes: " + notes + ")";
        str += " (documentTypeUuid: " + documentTypeUuid + ")";
        str += " (fields: " + fields + ")";
        return str;
    }

}

}
