package org.openapitools.client.model {

import org.openapitools.client.model.DocumentFieldCreate;
import org.openapitools.client.model.DocumentFieldCreatePhotoValue;
import org.openapitools.client.model.Object;

    [XmlRootNode(name="DocumentField")]
    public class DocumentField {
        /* Value of this field if this document field has valueType: ValueType_Number. */
        [XmlElement(name="numberValue")]
        public var numberValue: Number = 0.0;
        /* Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. */
        // This declaration below of _photoValue_obj_class is to force flash compiler to include this class
        private var _photoValue_obj_class: Array = null;
        [XmlElementWrapper(name="photoValue")]
        [XmlElements(name="photoValue", type="Array")]
                public var photoValue: Array = new Array();
        /* Value of this field if this document field has valueType: ValueType_String. */
        [XmlElement(name="stringValue")]
        public var stringValue: String = null;
        /* Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
        [XmlElement(name="valueType")]
        public var valueType: String = null;
        /* Descriptive name of this field. */
        [XmlElement(name="label")]
        public var label: String = null;
        /* DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string. */
        [XmlElement(name="value")]
        public var value: Object = NaN;

    public function toString(): String {
        var str: String = "DocumentField: ";
        str += " (numberValue: " + numberValue + ")";
        str += " (photoValue: " + photoValue + ")";
        str += " (stringValue: " + stringValue + ")";
        str += " (valueType: " + valueType + ")";
        str += " (label: " + label + ")";
        str += " (value: " + value + ")";
        return str;
    }

}

}
