# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DvirBaseAuthorSignature(Model):
    """The authors signature for the DVIR.

    :param driver_id: ID of the driver who signed the DVIR. Will not be
     returned if mechanicUserId is returned.
    :type driver_id: long
    :param email: Email of the  driver|mechanic who signed the DVIR.
    :type email: str
    :param mechanic_user_id: ID of the mechanic who signed the DVIR. Will not
     be returned if driverId is returned.
    :type mechanic_user_id: long
    :param name: The name of the driver or mechanic who signed the DVIR.
    :type name: str
    :param signed_at: The time in millis when the DVIR was signed
    :type signed_at: long
    :param type: Type corresponds to whether the signature corresponds to
     driver|mechanic.
    :type type: str
    :param username: Username of the  driver|mechanic who signed the DVIR.
    :type username: str
    """

    _attribute_map = {
        'driver_id': {'key': 'driverId', 'type': 'long'},
        'email': {'key': 'email', 'type': 'str'},
        'mechanic_user_id': {'key': 'mechanicUserId', 'type': 'long'},
        'name': {'key': 'name', 'type': 'str'},
        'signed_at': {'key': 'signedAt', 'type': 'long'},
        'type': {'key': 'type', 'type': 'str'},
        'username': {'key': 'username', 'type': 'str'},
    }

    def __init__(self, driver_id=None, email=None, mechanic_user_id=None, name=None, signed_at=None, type=None, username=None):
        super(DvirBaseAuthorSignature, self).__init__()
        self.driver_id = driver_id
        self.email = email
        self.mechanic_user_id = mechanic_user_id
        self.name = name
        self.signed_at = signed_at
        self.type = type
        self.username = username
