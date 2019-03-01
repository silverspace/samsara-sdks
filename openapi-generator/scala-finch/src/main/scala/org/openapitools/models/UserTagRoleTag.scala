package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param parentTagId The ID of this tag.
 * @param name Name of this tag.
 * @param id The ID of this tag.
 */
case class UserTagRoleTag(parentTagId: Option[Long],
                name: String,
                id: Long
                )

object UserTagRoleTag {
    /**
     * Creates the codec for converting UserTagRoleTag from and to JSON.
     */
    implicit val decoder: Decoder[UserTagRoleTag] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserTagRoleTag] = deriveEncoder
}
