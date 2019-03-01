package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TagModifyAdd
import org.openapitools.models.TagModifyDelete

/**
 * 
 * @param add 
 * @param delete 
 * @param name Updated name of this tag.
 * @param parentTagId If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
 */
case class TagModify(add: Option[TagModifyAdd],
                delete: Option[TagModifyDelete],
                name: Option[String],
                parentTagId: Option[Long]
                )

object TagModify {
    /**
     * Creates the codec for converting TagModify from and to JSON.
     */
    implicit val decoder: Decoder[TagModify] = deriveDecoder
    implicit val encoder: ObjectEncoder[TagModify] = deriveEncoder
}
