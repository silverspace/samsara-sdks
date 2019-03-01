package io.swagger.api;

import io.swagger.model.Address;
import io.swagger.model.Addresses;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

@Controller
public class AddressesApiController implements AddressesApi {

    private static final Logger log = LoggerFactory.getLogger(AddressesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AddressesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Address>> addOrganizationAddresses(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence will be saved as a polygon." ,required=true )  @Valid @RequestBody Addresses addresses) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Address>>(objectMapper.readValue("[ {  \"tags\" : [ {    \"id\" : 12345,    \"name\" : \"Broken Vehicles\"  }, {    \"id\" : 12345,    \"name\" : \"Broken Vehicles\"  } ],  \"id\" : 123,  \"geofence\" : {    \"polygon\" : {      \"vertices\" : [ {        \"longitude\" : -122.403098,        \"latitude\" : 37.765363      }, {        \"longitude\" : -122.403098,        \"latitude\" : 37.765363      } ]    },    \"circle\" : {      \"radiusMeters\" : 250,      \"longitude\" : -122.403098,      \"latitude\" : 37.765363    }  },  \"name\" : \"Samsara HQ\",  \"formattedAddress\" : \"350 Rhode Island St, San Francisco, CA\",  \"notes\" : \"Delivery site 1\",  \"contacts\" : [ {    \"id\" : 123,    \"lastName\" : \"Jones\",    \"phone\" : \"111-222-3344\",    \"email\" : \"jane.jones@yahoo.com\",    \"firstName\" : \"Jane\"  }, {    \"id\" : 123,    \"lastName\" : \"Jones\",    \"phone\" : \"111-222-3344\",    \"email\" : \"jane.jones@yahoo.com\",    \"firstName\" : \"Jane\"  } ]}, {  \"tags\" : [ {    \"id\" : 12345,    \"name\" : \"Broken Vehicles\"  }, {    \"id\" : 12345,    \"name\" : \"Broken Vehicles\"  } ],  \"id\" : 123,  \"geofence\" : {    \"polygon\" : {      \"vertices\" : [ {        \"longitude\" : -122.403098,        \"latitude\" : 37.765363      }, {        \"longitude\" : -122.403098,        \"latitude\" : 37.765363      } ]    },    \"circle\" : {      \"radiusMeters\" : 250,      \"longitude\" : -122.403098,      \"latitude\" : 37.765363    }  },  \"name\" : \"Samsara HQ\",  \"formattedAddress\" : \"350 Rhode Island St, San Francisco, CA\",  \"notes\" : \"Delivery site 1\",  \"contacts\" : [ {    \"id\" : 123,    \"lastName\" : \"Jones\",    \"phone\" : \"111-222-3344\",    \"email\" : \"jane.jones@yahoo.com\",    \"firstName\" : \"Jane\"  }, {    \"id\" : 123,    \"lastName\" : \"Jones\",    \"phone\" : \"111-222-3344\",    \"email\" : \"jane.jones@yahoo.com\",    \"firstName\" : \"Jane\"  } ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Address>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Address>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteOrganizationAddress(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the address/geofence",required=true) @PathVariable("addressId") Long addressId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Address> getOrganizationAddress(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "ID of the address/geofence",required=true) @PathVariable("addressId") Long addressId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Address>(objectMapper.readValue("{  \"tags\" : [ {    \"id\" : 12345,    \"name\" : \"Broken Vehicles\"  }, {    \"id\" : 12345,    \"name\" : \"Broken Vehicles\"  } ],  \"id\" : 123,  \"geofence\" : {    \"polygon\" : {      \"vertices\" : [ {        \"longitude\" : -122.403098,        \"latitude\" : 37.765363      }, {        \"longitude\" : -122.403098,        \"latitude\" : 37.765363      } ]    },    \"circle\" : {      \"radiusMeters\" : 250,      \"longitude\" : -122.403098,      \"latitude\" : 37.765363    }  },  \"name\" : \"Samsara HQ\",  \"formattedAddress\" : \"350 Rhode Island St, San Francisco, CA\",  \"notes\" : \"Delivery site 1\",  \"contacts\" : [ {    \"id\" : 123,    \"lastName\" : \"Jones\",    \"phone\" : \"111-222-3344\",    \"email\" : \"jane.jones@yahoo.com\",    \"firstName\" : \"Jane\"  }, {    \"id\" : 123,    \"lastName\" : \"Jones\",    \"phone\" : \"111-222-3344\",    \"email\" : \"jane.jones@yahoo.com\",    \"firstName\" : \"Jane\"  } ]}", Address.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Address>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Address>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Address>> getOrganizationAddresses(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Address>>(objectMapper.readValue("[ {  \"tags\" : [ {    \"id\" : 12345,    \"name\" : \"Broken Vehicles\"  }, {    \"id\" : 12345,    \"name\" : \"Broken Vehicles\"  } ],  \"id\" : 123,  \"geofence\" : {    \"polygon\" : {      \"vertices\" : [ {        \"longitude\" : -122.403098,        \"latitude\" : 37.765363      }, {        \"longitude\" : -122.403098,        \"latitude\" : 37.765363      } ]    },    \"circle\" : {      \"radiusMeters\" : 250,      \"longitude\" : -122.403098,      \"latitude\" : 37.765363    }  },  \"name\" : \"Samsara HQ\",  \"formattedAddress\" : \"350 Rhode Island St, San Francisco, CA\",  \"notes\" : \"Delivery site 1\",  \"contacts\" : [ {    \"id\" : 123,    \"lastName\" : \"Jones\",    \"phone\" : \"111-222-3344\",    \"email\" : \"jane.jones@yahoo.com\",    \"firstName\" : \"Jane\"  }, {    \"id\" : 123,    \"lastName\" : \"Jones\",    \"phone\" : \"111-222-3344\",    \"email\" : \"jane.jones@yahoo.com\",    \"firstName\" : \"Jane\"  } ]}, {  \"tags\" : [ {    \"id\" : 12345,    \"name\" : \"Broken Vehicles\"  }, {    \"id\" : 12345,    \"name\" : \"Broken Vehicles\"  } ],  \"id\" : 123,  \"geofence\" : {    \"polygon\" : {      \"vertices\" : [ {        \"longitude\" : -122.403098,        \"latitude\" : 37.765363      }, {        \"longitude\" : -122.403098,        \"latitude\" : 37.765363      } ]    },    \"circle\" : {      \"radiusMeters\" : 250,      \"longitude\" : -122.403098,      \"latitude\" : 37.765363    }  },  \"name\" : \"Samsara HQ\",  \"formattedAddress\" : \"350 Rhode Island St, San Francisco, CA\",  \"notes\" : \"Delivery site 1\",  \"contacts\" : [ {    \"id\" : 123,    \"lastName\" : \"Jones\",    \"phone\" : \"111-222-3344\",    \"email\" : \"jane.jones@yahoo.com\",    \"firstName\" : \"Jane\"  }, {    \"id\" : 123,    \"lastName\" : \"Jones\",    \"phone\" : \"111-222-3344\",    \"email\" : \"jane.jones@yahoo.com\",    \"firstName\" : \"Jane\"  } ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Address>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Address>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateOrganizationAddress(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "Update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the update will change the type of geofence accordingly." ,required=true )  @Valid @RequestBody Address address,@ApiParam(value = "ID of the address/geofence",required=true) @PathVariable("addressId") Long addressId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
