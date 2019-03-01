package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param authType The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
 * @param email The email address of this user.
 * @param name The first and last name of the user.
 * @param organizationRoleId The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
 */
case class UserBase(authType: String,
                email: String,
                name: Option[String],
                organizationRoleId: Option[String]
                )

object UserBase {
    /**
     * Creates the codec for converting UserBase from and to JSON.
     */
    implicit val decoder: Decoder[UserBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserBase] = deriveEncoder
}
