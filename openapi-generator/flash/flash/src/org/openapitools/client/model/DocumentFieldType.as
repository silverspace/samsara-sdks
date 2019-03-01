package org.openapitools.client.model {

import org.openapitools.client.model.DocumentFieldTypeNumberValueTypeMetadata;

    [XmlRootNode(name="DocumentFieldType")]
    public class DocumentFieldType {
        /* Descriptive name of this field type. */
        [XmlElement(name="label")]
        public var label: String = null;
                [XmlElement(name="numberValueTypeMetadata")]
        public var numberValueTypeMetadata: DocumentFieldTypeNumberValueTypeMetadata = NaN;
        /* The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
        [XmlElement(name="valueType")]
        public var valueType: String = null;

    public function toString(): String {
        var str: String = "DocumentFieldType: ";
        str += " (label: " + label + ")";
        str += " (numberValueTypeMetadata: " + numberValueTypeMetadata + ")";
        str += " (valueType: " + valueType + ")";
        return str;
    }

}

}
