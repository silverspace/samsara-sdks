package controllers;

import apimodels.InlineResponse2009;
import apimodels.Tag;
import apimodels.TagCreate;
import apimodels.TagModify;
import apimodels.TagUpdate;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface TagsApiControllerImpInterface {
    Tag createTag( @NotNull String accessToken, TagCreate tagCreateParams) throws Exception;

    void deleteTagById( @NotNull String accessToken, Long tagId) throws Exception;

    InlineResponse2009 getAllTags( @NotNull String accessToken, Long groupId) throws Exception;

    Tag getTagById( @NotNull String accessToken, Long tagId) throws Exception;

    Tag modifyTagById( @NotNull String accessToken, Long tagId, TagModify tagModifyParams) throws Exception;

    Tag updateTagById( @NotNull String accessToken, Long tagId, TagUpdate updateTagParams) throws Exception;

}
