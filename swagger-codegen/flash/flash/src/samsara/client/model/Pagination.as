package samsara.client.model {


    [XmlRootNode(name="Pagination")]
    public class Pagination {
        /* Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter. */
        [XmlElement(name="endCursor")]
        public var endCursor: String = null;
        /* True if there are more pages of results after this response. */
        [XmlElement(name="hasNextPage")]
        public var hasNextPage: Boolean = false;
        /* True if there are more pages of results before this response. */
        [XmlElement(name="hasPrevPage")]
        public var hasPrevPage: Boolean = false;
        /* Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter. */
        [XmlElement(name="startCursor")]
        public var startCursor: String = null;

    public function toString(): String {
        var str: String = "Pagination: ";
        str += " (endCursor: " + endCursor + ")";
        str += " (hasNextPage: " + hasNextPage + ")";
        str += " (hasPrevPage: " + hasPrevPage + ")";
        str += " (startCursor: " + startCursor + ")";
        return str;
    }

}

}
