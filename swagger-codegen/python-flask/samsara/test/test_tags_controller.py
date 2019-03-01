# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from samsara.models.error_response import ErrorResponse  # noqa: E501
from samsara.models.inline_response2009 import InlineResponse2009  # noqa: E501
from samsara.models.tag import Tag  # noqa: E501
from samsara.models.tag_create import TagCreate  # noqa: E501
from samsara.models.tag_modify import TagModify  # noqa: E501
from samsara.models.tag_update import TagUpdate  # noqa: E501
from samsara.test import BaseTestCase


class TestTagsController(BaseTestCase):
    """TagsController integration test stubs"""

    def test_create_tag(self):
        """Test case for create_tag

        /tags
        """
        tagCreateParams = TagCreate()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/tags',
            method='POST',
            data=json.dumps(tagCreateParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_tag_by_id(self):
        """Test case for delete_tag_by_id

        /tags/{tag_id:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/tags/{tag_id}'.format(tag_id=789),
            method='DELETE',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_tags(self):
        """Test case for get_all_tags

        /tags
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 789)]
        response = self.client.open(
            '/v1/tags',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tag_by_id(self):
        """Test case for get_tag_by_id

        /tags/{tag_id:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/tags/{tag_id}'.format(tag_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_modify_tag_by_id(self):
        """Test case for modify_tag_by_id

        /tags/{tag_id:[0-9]+}
        """
        tagModifyParams = TagModify()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/tags/{tag_id}'.format(tag_id=789),
            method='PATCH',
            data=json.dumps(tagModifyParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_tag_by_id(self):
        """Test case for update_tag_by_id

        /tags/{tag_id:[0-9]+}
        """
        updateTagParams = TagUpdate()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/tags/{tag_id}'.format(tag_id=789),
            method='PUT',
            data=json.dumps(updateTagParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
