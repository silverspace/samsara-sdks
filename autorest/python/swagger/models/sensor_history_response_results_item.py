# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class SensorHistoryResponseResultsItem(Model):
    """SensorHistoryResponseResultsItem.

    :param series: List of datapoints, one for each requested (sensor, field)
     pair.
    :type series: list[long]
    :param time_ms: Timestamp in UNIX milliseconds.
    :type time_ms: int
    """

    _attribute_map = {
        'series': {'key': 'series', 'type': '[long]'},
        'time_ms': {'key': 'timeMs', 'type': 'int'},
    }

    def __init__(self, series=None, time_ms=None):
        super(SensorHistoryResponseResultsItem, self).__init__()
        self.series = series
        self.time_ms = time_ms
