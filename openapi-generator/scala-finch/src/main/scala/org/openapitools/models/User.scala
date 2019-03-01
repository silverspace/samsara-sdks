package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UserBase
import org.openapitools.models.UserTagRole
import scala.collection.immutable.Seq

/**
 * 
 * @param authType The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
 * @param email The email address of this user.
 * @param name The first and last name of the user.
 * @param organizationRoleId The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
 * @param id The ID of the User record.
 * @param organizationRole The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
 * @param tagRoles The specific tags this user has access to. This will be blank for users that have full access to the organization.
 */
case class User(authType: String,
                email: String,
                name: Option[String],
                organizationRoleId: Option[String],
                id: Option[Long],
                organizationRole: Option[String],
                tagRoles: Option[Seq[UserTagRole]]
                )

object User {
    /**
     * Creates the codec for converting User from and to JSON.
     */
    implicit val decoder: Decoder[User] = deriveDecoder
    implicit val encoder: ObjectEncoder[User] = deriveEncoder
}
