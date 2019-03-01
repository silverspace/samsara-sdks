# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.pipeline import ClientRawResponse

from .. import models


class CreateOperations(object):
    """CreateOperations operations.

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

    def dvir(
            self, create_dvir_param, custom_headers=None, raw=False, **operation_config):
        """/fleet/maintenance/dvirs.

        Create a new dvir, marking a vehicle or trailer safe or unsafe.

        :param create_dvir_param: DVIR creation body
        :type create_dvir_param: ~swagger.models.CreateDvirParam
        :param dict custom_headers: headers that will be added to the request
        :param bool raw: returns the direct response alongside the
         deserialized response
        :param operation_config: :ref:`Operation configuration
         overrides<msrest:optionsforoperations>`.
        :return: DvirBase or ClientRawResponse if raw=true
        :rtype: ~swagger.models.DvirBase or ~msrest.pipeline.ClientRawResponse
        :raises:
         :class:`HttpOperationError<msrest.exceptions.HttpOperationError>`
        """
        # Construct URL
        url = self.dvir.metadata['url']

        # Construct parameters
        query_parameters = {}
        query_parameters['access_token'] = self._serialize.query("self.config.access_token", self.config.access_token, 'str')

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(create_dvir_param, 'CreateDvirParam')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, stream=False, **operation_config)

        if response.status_code not in [200]:
            raise HttpOperationError(self._deserialize, response, 'str')

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('DvirBase', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized
    dvir.metadata = {'url': '/fleet/maintenance/dvirs'}