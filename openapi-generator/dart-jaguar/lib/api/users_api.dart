import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/user_role.dart';
import 'package:openapi/model/user.dart';


part 'users_api.jretro.dart';

@GenApiClient()
class UsersApi extends _$UsersApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;
    final Duration timeout;

    UsersApi({this.base, this.serializers, this.timeout = const Duration(minutes: 2)});

    /// /users/{userId:[0-9]+}
    ///
    /// Remove a user from the organization.
    @DeleteReq(path: "/users/:userId")
    Future<void> deleteUserById(
            @PathParam("userId") int userId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.deleteUserById(
        userId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /users/{userId:[0-9]+}
    ///
    /// Get a user.
    @GetReq(path: "/users/:userId")
    Future<User> getUserById(
            @PathParam("userId") int userId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.getUserById(
        userId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /user_roles
    ///
    /// Get all roles in the organization.
    @GetReq(path: "/user_roles")
    Future<List<UserRole>> listUserRoles(
        
            @QueryParam("access_token") String accessToken
        ) {
        return super.listUserRoles(
        
        accessToken

        ).timeout(timeout);
    }

    /// /users
    ///
    /// List all users in the organization.
    @GetReq(path: "/users")
    Future<List<User>> listUsers(
        
            @QueryParam("access_token") String accessToken
        ) {
        return super.listUsers(
        
        accessToken

        ).timeout(timeout);
    }


}
