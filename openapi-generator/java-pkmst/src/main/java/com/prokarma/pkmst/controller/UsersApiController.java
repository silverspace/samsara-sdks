package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.User;
import com.prokarma.pkmst.model.UserRole;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

@Controller
public class UsersApiController implements UsersApi {
    private final ObjectMapper objectMapper;
@Autowired
    public UsersApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> deleteUserById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the user.",required=true ) @PathVariable("userId") Long userId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<User> getUserById(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @ApiParam(value = "ID of the user.",required=true ) @PathVariable("userId") Long userId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<User>(objectMapper.readValue("", User.class), HttpStatus.OK);
        }

        return new ResponseEntity<User>(HttpStatus.OK);
    }

    public ResponseEntity<List<UserRole>> listUserRoles(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<UserRole>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<UserRole>>(HttpStatus.OK);
    }

    public ResponseEntity<List<User>> listUsers(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<User>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<User>>(HttpStatus.OK);
    }

}
