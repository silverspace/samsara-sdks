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
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

public class TagsApiControllerImp implements TagsApiControllerImpInterface {
    @Override
    public Tag createTag( @NotNull String accessToken, TagCreate tagCreateParams) throws Exception {
        //Do your magic!!!
        return new Tag();
    }

    @Override
    public void deleteTagById( @NotNull String accessToken, Long tagId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public InlineResponse2009 getAllTags( @NotNull String accessToken, Long groupId) throws Exception {
        //Do your magic!!!
        return new InlineResponse2009();
    }

    @Override
    public Tag getTagById( @NotNull String accessToken, Long tagId) throws Exception {
        //Do your magic!!!
        return new Tag();
    }

    @Override
    public Tag modifyTagById( @NotNull String accessToken, Long tagId, TagModify tagModifyParams) throws Exception {
        //Do your magic!!!
        return new Tag();
    }

    @Override
    public Tag updateTagById( @NotNull String accessToken, Long tagId, TagUpdate updateTagParams) throws Exception {
        //Do your magic!!!
        return new Tag();
    }

}
