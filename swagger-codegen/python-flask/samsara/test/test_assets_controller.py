# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from samsara.models.asset_location_response import AssetLocationResponse  # noqa: E501
from samsara.models.asset_reefer_response import AssetReeferResponse  # noqa: E501
from samsara.models.error_response import ErrorResponse  # noqa: E501
from samsara.models.inline_response200 import InlineResponse200  # noqa: E501
from samsara.models.inline_response2001 import InlineResponse2001  # noqa: E501
from samsara.test import BaseTestCase


class TestAssetsController(BaseTestCase):
    """AssetsController integration test stubs"""

    def test_get_all_asset_current_locations(self):
        """Test case for get_all_asset_current_locations

        /fleet/assets/locations
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 789)]
        response = self.client.open(
            '/v1/fleet/assets/locations',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_assets(self):
        """Test case for get_all_assets

        /fleet/assets
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 789)]
        response = self.client.open(
            '/v1/fleet/assets',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_asset_location(self):
        """Test case for get_asset_location

        /fleet/assets/{assetId:[0-9]+}/locations
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 789),
                        ('endMs', 789)]
        response = self.client.open(
            '/v1/fleet/assets/{asset_id}/locations'.format(asset_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_asset_reefer(self):
        """Test case for get_asset_reefer

        /fleet/assets/{assetId:[0-9]+}/reefer
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 789),
                        ('endMs', 789)]
        response = self.client.open(
            '/v1/fleet/assets/{asset_id}/reefer'.format(asset_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
