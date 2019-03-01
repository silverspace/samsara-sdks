# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.inline_response2009 import InlineResponse2009  # noqa: E501
from openapi_server.models.tag import Tag  # noqa: E501
from openapi_server.models.tag_create import TagCreate  # noqa: E501
from openapi_server.models.tag_modify import TagModify  # noqa: E501
from openapi_server.models.tag_update import TagUpdate  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTagsController(BaseTestCase):
    """TagsController integration test stubs"""

    def test_create_tag(self):
        """Test case for create_tag

        /tags
        """
        tag_create_params = {
  "assets" : [ {
    "id" : 789
  }, {
    "id" : 789
  } ],
  "sensors" : [ {
    "id" : 345
  }, {
    "id" : 345
  } ],
  "parentTagId" : 8389,
  "name" : "Broken Vehicles",
  "vehicles" : [ {
    "id" : 123
  }, {
    "id" : 123
  } ],
  "machines" : [ {
    "id" : 567
  }, {
    "id" : 567
  } ],
  "drivers" : [ {
    "id" : 456
  }, {
    "id" : 456
  } ]
}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/tags',
            method='POST',
            headers=headers,
            data=json.dumps(tag_create_params),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_tag_by_id(self):
        """Test case for delete_tag_by_id

        /tags/{tag_id:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/tags/{tag_id}'.format(tag_id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_tags(self):
        """Test case for get_all_tags

        /tags
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/tags',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tag_by_id(self):
        """Test case for get_tag_by_id

        /tags/{tag_id:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/tags/{tag_id}'.format(tag_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_modify_tag_by_id(self):
        """Test case for modify_tag_by_id

        /tags/{tag_id:[0-9]+}
        """
        tag_modify_params = {
  "add" : {
    "assets" : [ {
      "id" : 789
    }, {
      "id" : 789
    } ],
    "sensors" : [ {
      "id" : 345
    }, {
      "id" : 345
    } ],
    "vehicles" : [ {
      "id" : 123
    }, {
      "id" : 123
    } ],
    "machines" : [ {
      "id" : 567
    }, {
      "id" : 567
    } ],
    "drivers" : [ {
      "id" : 456
    }, {
      "id" : 456
    } ]
  },
  "parentTagId" : 8389,
  "name" : "Broken Vehicles",
  "delete" : {
    "assets" : [ {
      "id" : 789
    }, {
      "id" : 789
    } ],
    "sensors" : [ {
      "id" : 345
    }, {
      "id" : 345
    } ],
    "vehicles" : [ {
      "id" : 123
    }, {
      "id" : 123
    } ],
    "machines" : [ {
      "id" : 567
    }, {
      "id" : 567
    } ],
    "drivers" : [ {
      "id" : 456
    }, {
      "id" : 456
    } ]
  }
}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/tags/{tag_id}'.format(tag_id=56),
            method='PATCH',
            headers=headers,
            data=json.dumps(tag_modify_params),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_tag_by_id(self):
        """Test case for update_tag_by_id

        /tags/{tag_id:[0-9]+}
        """
        update_tag_params = {
  "assets" : [ {
    "id" : 789
  }, {
    "id" : 789
  } ],
  "sensors" : [ {
    "id" : 345
  }, {
    "id" : 345
  } ],
  "parentTagId" : 8389,
  "name" : "Broken Vehicles",
  "vehicles" : [ {
    "id" : 123
  }, {
    "id" : 123
  } ],
  "machines" : [ {
    "id" : 567
  }, {
    "id" : 567
  } ],
  "drivers" : [ {
    "id" : 456
  }, {
    "id" : 456
  } ]
}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/tags/{tag_id}'.format(tag_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(update_tag_params),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
