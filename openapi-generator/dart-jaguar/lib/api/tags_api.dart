import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/tag_update.dart';
import 'package:openapi/model/inline_response2009.dart';
import 'package:openapi/model/tag_create.dart';
import 'package:openapi/model/tag_modify.dart';
import 'package:openapi/model/tag.dart';


part 'tags_api.jretro.dart';

@GenApiClient()
class TagsApi extends _$TagsApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;
    final Duration timeout;

    TagsApi({this.base, this.serializers, this.timeout = const Duration(minutes: 2)});

    /// /tags
    ///
    /// Create a new tag for the group.
    @PostReq(path: "/tags")
    Future<Tag> createTag(
        
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() TagCreate tagCreateParams
        ) {
        return super.createTag(
        
        accessToken

        ,
        tagCreateParams
        ).timeout(timeout);
    }

    /// /tags/{tag_id:[0-9]+}
    ///
    /// Permanently deletes a tag.
    @DeleteReq(path: "/tags/:tag_id")
    Future<void> deleteTagById(
            @PathParam("tag_id") int tagId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.deleteTagById(
        tagId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /tags
    ///
    /// Fetch all of the tags for a group.
    @GetReq(path: "/tags")
    Future<InlineResponse2009> getAllTags(
        
            @QueryParam("access_token") String accessToken, 
        
            @QueryParam("group_id") int groupId
        ) {
        return super.getAllTags(
        
        accessToken, 
        
        groupId

        ).timeout(timeout);
    }

    /// /tags/{tag_id:[0-9]+}
    ///
    /// Fetch a tag by id.
    @GetReq(path: "/tags/:tag_id")
    Future<Tag> getTagById(
            @PathParam("tag_id") int tagId
        ,
            @QueryParam("access_token") String accessToken
        ) {
        return super.getTagById(
        tagId
        ,
        accessToken

        ).timeout(timeout);
    }

    /// /tags/{tag_id:[0-9]+}
    ///
    /// Add or delete specific members from a tag, or modify the name of a tag.
    @PatchReq(path: "/tags/:tag_id")
    Future<Tag> modifyTagById(
            @PathParam("tag_id") int tagId
        ,
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() TagModify tagModifyParams
        ) {
        return super.modifyTagById(
        tagId
        ,
        accessToken

        ,
        tagModifyParams
        ).timeout(timeout);
    }

    /// /tags/{tag_id:[0-9]+}
    ///
    /// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
    @PutReq(path: "/tags/:tag_id")
    Future<Tag> updateTagById(
            @PathParam("tag_id") int tagId
        ,
            @QueryParam("access_token") String accessToken
            ,
              @AsJson() TagUpdate updateTagParams
        ) {
        return super.updateTagById(
        tagId
        ,
        accessToken

        ,
        updateTagParams
        ).timeout(timeout);
    }


}
