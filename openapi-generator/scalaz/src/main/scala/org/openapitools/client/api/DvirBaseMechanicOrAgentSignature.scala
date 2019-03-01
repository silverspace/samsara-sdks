package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DvirBaseMechanicOrAgentSignature._

case class DvirBaseMechanicOrAgentSignature (
  /* ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. */
  mechanicUserId: Option[Long],
/* ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. */
  driverId: Option[Long],
/* The name of the agent or mechanic who signed the DVIR. */
  name: Option[String],
/* The time in millis when the DVIR was signed */
  signedAt: Option[Long],
/* Type corresponds to whether the signature corresponds to driver|mechanic. */
  `type`: Option[String],
/* Email of the  agent|mechanic who signed the DVIR. */
  email: Option[String],
/* Username of the  agent|mechanic who signed the DVIR. */
  username: Option[String])

object DvirBaseMechanicOrAgentSignature {
  import DateTimeCodecs._

  implicit val DvirBaseMechanicOrAgentSignatureCodecJson: CodecJson[DvirBaseMechanicOrAgentSignature] = CodecJson.derive[DvirBaseMechanicOrAgentSignature]
  implicit val DvirBaseMechanicOrAgentSignatureDecoder: EntityDecoder[DvirBaseMechanicOrAgentSignature] = jsonOf[DvirBaseMechanicOrAgentSignature]
  implicit val DvirBaseMechanicOrAgentSignatureEncoder: EntityEncoder[DvirBaseMechanicOrAgentSignature] = jsonEncoderOf[DvirBaseMechanicOrAgentSignature]
}
