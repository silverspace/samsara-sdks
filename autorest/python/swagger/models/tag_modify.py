# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class TagModify(Model):
    """TagModify.

    :param add: Specify devices, etc. that should be added to the tag.
    :type add: ~swagger.models.TagModifyAdd
    :param delete: Specify devices, etc. that should be removed from the tag.
    :type delete: ~swagger.models.TagModifyDelete
    :param name: Updated name of this tag.
    :type name: str
    :param parent_tag_id: If this tag is part a hierarchical tag tree as a
     child tag, the parentTagId is the ID of this tag's parent tag.
    :type parent_tag_id: long
    """

    _attribute_map = {
        'add': {'key': 'add', 'type': 'TagModifyAdd'},
        'delete': {'key': 'delete', 'type': 'TagModifyDelete'},
        'name': {'key': 'name', 'type': 'str'},
        'parent_tag_id': {'key': 'parentTagId', 'type': 'long'},
    }

    def __init__(self, add=None, delete=None, name=None, parent_tag_id=None):
        super(TagModify, self).__init__()
        self.add = add
        self.delete = delete
        self.name = name
        self.parent_tag_id = parent_tag_id
