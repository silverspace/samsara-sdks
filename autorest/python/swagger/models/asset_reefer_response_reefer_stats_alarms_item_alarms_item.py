# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class AssetReeferResponseReeferStatsAlarmsItemAlarmsItem(Model):
    """AssetReeferResponseReeferStatsAlarmsItemAlarmsItem.

    :param alarm_code: ID of the alarm
    :type alarm_code: long
    :param description: Description of the alarm
    :type description: str
    :param operator_action: Recommended operator action
    :type operator_action: str
    :param severity: Severity of the alarm: 1: OK to run, 2: Check as
     specified, 3: Take immediate action
    :type severity: long
    """

    _attribute_map = {
        'alarm_code': {'key': 'alarmCode', 'type': 'long'},
        'description': {'key': 'description', 'type': 'str'},
        'operator_action': {'key': 'operatorAction', 'type': 'str'},
        'severity': {'key': 'severity', 'type': 'long'},
    }

    def __init__(self, alarm_code=None, description=None, operator_action=None, severity=None):
        super(AssetReeferResponseReeferStatsAlarmsItemAlarmsItem, self).__init__()
        self.alarm_code = alarm_code
        self.description = description
        self.operator_action = operator_action
        self.severity = severity
