# tags_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateTag**](tags_api.md#CreateTag) | **POST** /tags | /tags
[**DeleteTagById**](tags_api.md#DeleteTagById) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**GetAllTags**](tags_api.md#GetAllTags) | **GET** /tags | /tags
[**GetTagById**](tags_api.md#GetTagById) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**ModifyTagById**](tags_api.md#ModifyTagById) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**UpdateTagById**](tags_api.md#UpdateTagById) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


<a name="CreateTag"></a>
# **CreateTag**
> Tag CreateTag(accessToken, tagCreateParams)

/tags

Create a new tag for the group.
<a name="DeleteTagById"></a>
# **DeleteTagById**
> DeleteTagById(accessToken, tagId)

/tags/{tag_id:[0-9]+}

Permanently deletes a tag.
<a name="GetAllTags"></a>
# **GetAllTags**
> InlineResponse2009 GetAllTags(accessToken, groupId)

/tags

Fetch all of the tags for a group.
<a name="GetTagById"></a>
# **GetTagById**
> Tag GetTagById(accessToken, tagId)

/tags/{tag_id:[0-9]+}

Fetch a tag by id.
<a name="ModifyTagById"></a>
# **ModifyTagById**
> Tag ModifyTagById(accessToken, tagId, tagModifyParams)

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.
<a name="UpdateTagById"></a>
# **UpdateTagById**
> Tag UpdateTagById(accessToken, tagId, updateTagParams)

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
