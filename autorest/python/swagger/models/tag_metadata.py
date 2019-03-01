# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class TagMetadata(Model):
    """TagMetadata.

    :param id: The ID of this tag.
    :type id: long
    :param name: Name of this tag.
    :type name: str
    """

    _validation = {
        'id': {'required': True},
        'name': {'required': True},
    }

    _attribute_map = {
        'id': {'key': 'id', 'type': 'long'},
        'name': {'key': 'name', 'type': 'str'},
    }

    def __init__(self, id, name):
        super(TagMetadata, self).__init__()
        self.id = id
        self.name = name