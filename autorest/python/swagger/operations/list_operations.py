# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.pipeline import ClientRawResponse

from .. import models


class ListOperations(object):
    """ListOperations operations.

    :param client: Client for service requests.
    :param config: Configuration of service client.
    :param serializer: An object model serializer.
    :param deserializer: An object model deserializer.
    """

    models = models

    def __init__(self, client, config, serializer, deserializer):

        self._client = client
        self._serialize = serializer
        self._deserialize = deserializer

        self.config = config

    def fleet(
            self, group_param, custom_headers=None, raw=False, **operation_config):
        """/fleet/list.

        Get list of the vehicles. This method returns a list of the vehicles in
        the Samsara Cloud and information about them.

        :param group_param: Group ID to query.
        :type group_param: ~swagger.models.BodyModel
        :param dict custom_headers: headers that will be added to the request
        :param bool raw: returns the direct response alongside the
         deserialized response
        :param operation_config: :ref:`Operation configuration
         overrides<msrest:optionsforoperations>`.
        :return: FleetOKResponse or ClientRawResponse if raw=true
        :rtype: ~swagger.models.FleetOKResponse or
         ~msrest.pipeline.ClientRawResponse
        :raises:
         :class:`HttpOperationError<msrest.exceptions.HttpOperationError>`
        """
        # Construct URL
        url = self.fleet.metadata['url']

        # Construct parameters
        query_parameters = {}
        query_parameters['access_token'] = self._serialize.query("self.config.access_token", self.config.access_token, 'str')
        if self.config.starting_after is not None:
            query_parameters['startingAfter'] = self._serialize.query("self.config.starting_after", self.config.starting_after, 'str')
        if self.config.ending_before is not None:
            query_parameters['endingBefore'] = self._serialize.query("self.config.ending_before", self.config.ending_before, 'str')
        if self.config.limit is not None:
            query_parameters['limit'] = self._serialize.query("self.config.limit", self.config.limit, 'float')

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(group_param, 'BodyModel')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, stream=False, **operation_config)

        if response.status_code not in [200]:
            raise HttpOperationError(self._deserialize, response, 'str')

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('FleetOKResponse', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized
    fleet.metadata = {'url': '/fleet/list'}

    def users(
            self, custom_headers=None, raw=False, **operation_config):
        """/users.

        List all users in the organization.

        :param dict custom_headers: headers that will be added to the request
        :param bool raw: returns the direct response alongside the
         deserialized response
        :param operation_config: :ref:`Operation configuration
         overrides<msrest:optionsforoperations>`.
        :return: list or ClientRawResponse if raw=true
        :rtype: list[~swagger.models.User] or
         ~msrest.pipeline.ClientRawResponse
        :raises:
         :class:`HttpOperationError<msrest.exceptions.HttpOperationError>`
        """
        # Construct URL
        url = self.users.metadata['url']

        # Construct parameters
        query_parameters = {}
        query_parameters['access_token'] = self._serialize.query("self.config.access_token", self.config.access_token, 'str')

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct and send request
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, stream=False, **operation_config)

        if response.status_code not in [200]:
            raise HttpOperationError(self._deserialize, response, 'str')

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('[User]', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized
    users.metadata = {'url': '/users'}
