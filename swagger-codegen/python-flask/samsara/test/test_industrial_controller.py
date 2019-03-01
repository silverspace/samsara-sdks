# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from samsara.models.data_input_history_response import DataInputHistoryResponse  # noqa: E501
from samsara.models.error_response import ErrorResponse  # noqa: E501
from samsara.models.group_param import GroupParam  # noqa: E501
from samsara.models.history_param import HistoryParam  # noqa: E501
from samsara.models.inline_response2006 import InlineResponse2006  # noqa: E501
from samsara.models.inline_response2007 import InlineResponse2007  # noqa: E501
from samsara.models.machine_history_response import MachineHistoryResponse  # noqa: E501
from samsara.test import BaseTestCase


class TestIndustrialController(BaseTestCase):
    """IndustrialController integration test stubs"""

    def test_get_all_data_inputs(self):
        """Test case for get_all_data_inputs

        /industrial/data
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 789),
                        ('startMs', 789),
                        ('endMs', 789)]
        response = self.client.open(
            '/v1/industrial/data',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_data_input(self):
        """Test case for get_data_input

        /industrial/data/{data_input_id:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 789),
                        ('endMs', 789)]
        response = self.client.open(
            '/v1/industrial/data/{data_input_id}'.format(data_input_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_machines(self):
        """Test case for get_machines

        /machines/list
        """
        groupParam = GroupParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/machines/list',
            method='POST',
            data=json.dumps(groupParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_machines_history(self):
        """Test case for get_machines_history

        /machines/history
        """
        historyParam = HistoryParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/machines/history',
            method='POST',
            data=json.dumps(historyParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
