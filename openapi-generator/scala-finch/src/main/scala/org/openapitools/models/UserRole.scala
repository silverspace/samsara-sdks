package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id 
 * @param name 
 */
case class UserRole(id: Option[String],
                name: Option[String]
                )

object UserRole {
    /**
     * Creates the codec for converting UserRole from and to JSON.
     */
    implicit val decoder: Decoder[UserRole] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserRole] = deriveEncoder
}
