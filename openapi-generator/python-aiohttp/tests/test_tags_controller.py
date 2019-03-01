# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.inline_response2009 import InlineResponse2009
from openapi_server.models.tag import Tag
from openapi_server.models.tag_create import TagCreate
from openapi_server.models.tag_modify import TagModify
from openapi_server.models.tag_update import TagUpdate


async def test_create_tag(client):
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
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/tags',
        headers=headers,
        json=tag_create_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_delete_tag_by_id(client):
    """Test case for delete_tag_by_id

    /tags/{tag_id:[0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/tags/{tag_id}'.format(tag_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_all_tags(client):
    """Test case for get_all_tags

    /tags
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/tags',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_tag_by_id(client):
    """Test case for get_tag_by_id

    /tags/{tag_id:[0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/tags/{tag_id}'.format(tag_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_modify_tag_by_id(client):
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
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/v1/tags/{tag_id}'.format(tag_id=56),
        headers=headers,
        json=tag_modify_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_tag_by_id(client):
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
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='PUT',
        path='/v1/tags/{tag_id}'.format(tag_id=56),
        headers=headers,
        json=update_tag_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

