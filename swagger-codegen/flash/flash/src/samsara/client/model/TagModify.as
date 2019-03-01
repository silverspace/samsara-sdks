package samsara.client.model {

import samsara.client.model.TagModifyAdd;
import samsara.client.model.TagModifyDelete;

    [XmlRootNode(name="TagModify")]
    public class TagModify {
                [XmlElement(name="add")]
        public var _add: TagModifyAdd = NaN;
                [XmlElement(name="delete")]
        public var _delete: TagModifyDelete = NaN;
        /* Updated name of this tag. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag. */
        [XmlElement(name="parentTagId")]
        public var parentTagId: Number = 0;

    public function toString(): String {
        var str: String = "TagModify: ";
        str += " (_add: " + _add + ")";
        str += " (_delete: " + _delete + ")";
        str += " (name: " + name + ")";
        str += " (parentTagId: " + parentTagId + ")";
        return str;
    }

}

}
