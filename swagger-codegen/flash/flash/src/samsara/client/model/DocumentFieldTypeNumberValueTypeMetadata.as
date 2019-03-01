package samsara.client.model {


    [XmlRootNode(name="DocumentFieldTypeNumberValueTypeMetadata")]
    public class DocumentFieldTypeNumberValueTypeMetadata {
        /* Number of decimal places that values for this field type can have. */
        [XmlElement(name="numDecimalPlaces")]
        public var numDecimalPlaces: Number = 0;

    public function toString(): String {
        var str: String = "DocumentFieldTypeNumberValueTypeMetadata: ";
        str += " (numDecimalPlaces: " + numDecimalPlaces + ")";
        return str;
    }

}

}
