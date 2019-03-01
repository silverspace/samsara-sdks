# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class AssetReeferResponseReeferStatsFuelPercentageItem(Model):
    """AssetReeferResponseReeferStatsFuelPercentageItem.

    :param changed_at_ms: Timestamp in Unix milliseconds since epoch.
    :type changed_at_ms: long
    :param fuel_percentage: Fuel percentage of the reefer.
    :type fuel_percentage: long
    """

    _attribute_map = {
        'changed_at_ms': {'key': 'changedAtMs', 'type': 'long'},
        'fuel_percentage': {'key': 'fuelPercentage', 'type': 'long'},
    }

    def __init__(self, changed_at_ms=None, fuel_percentage=None):
        super(AssetReeferResponseReeferStatsFuelPercentageItem, self).__init__()
        self.changed_at_ms = changed_at_ms
        self.fuel_percentage = fuel_percentage
