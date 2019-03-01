package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UserTagRoleTag

/**
 * 
 * @param role The name of the role the user has been granted on this tag.
 * @param roleId The id of the role the user has been granted on this tag.
 * @param tag 
 */
case class UserTagRole(role: Option[String],
                roleId: String,
                tag: UserTagRoleTag
                )

object UserTagRole {
    /**
     * Creates the codec for converting UserTagRole from and to JSON.
     */
    implicit val decoder: Decoder[UserTagRole] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserTagRole] = deriveEncoder
}
