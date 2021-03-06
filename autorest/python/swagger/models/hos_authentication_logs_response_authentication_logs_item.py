# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class HosAuthenticationLogsResponseAuthenticationLogsItem(Model):
    """HosAuthenticationLogsResponseAuthenticationLogsItem.

    :param action_type: The log type - one of 'signin' or 'signout'
    :type action_type: str
    :param address: Address at which the log was recorded, if applicable.
    :type address: str
    :param address_name: Address name from the group address book at which the
     log was recorded, if applicable.
    :type address_name: str
    :param city: City in which the log was recorded, if applicable.
    :type city: str
    :param happened_at_ms: The time at which the event was recorded in UNIX
     milliseconds.
    :type happened_at_ms: long
    :param state: State in which the log was recorded, if applicable.
    :type state: str
    """

    _attribute_map = {
        'action_type': {'key': 'actionType', 'type': 'str'},
        'address': {'key': 'address', 'type': 'str'},
        'address_name': {'key': 'addressName', 'type': 'str'},
        'city': {'key': 'city', 'type': 'str'},
        'happened_at_ms': {'key': 'happenedAtMs', 'type': 'long'},
        'state': {'key': 'state', 'type': 'str'},
    }

    def __init__(self, action_type=None, address=None, address_name=None, city=None, happened_at_ms=None, state=None):
        super(HosAuthenticationLogsResponseAuthenticationLogsItem, self).__init__()
        self.action_type = action_type
        self.address = address
        self.address_name = address_name
        self.city = city
        self.happened_at_ms = happened_at_ms
        self.state = state
