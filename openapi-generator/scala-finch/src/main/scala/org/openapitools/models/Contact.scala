package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Information about a notification contact for alerts.
 * @param email Email address of the contact
 * @param firstName First name of the contact
 * @param id ID of the contact
 * @param lastName Last name of the contact
 * @param phone Phone number of the contact
 */
case class Contact(email: Option[String],
                firstName: Option[String],
                id: Option[Long],
                lastName: Option[String],
                phone: Option[String]
                )

object Contact {
    /**
     * Creates the codec for converting Contact from and to JSON.
     */
    implicit val decoder: Decoder[Contact] = deriveDecoder
    implicit val encoder: ObjectEncoder[Contact] = deriveEncoder
}
