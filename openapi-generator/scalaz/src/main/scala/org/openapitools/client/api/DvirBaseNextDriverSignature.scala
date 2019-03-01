package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DvirBaseNextDriverSignature._

case class DvirBaseNextDriverSignature (
  /* ID of the driver who signed the DVIR */
  driverId: Option[Long],
/* The name of the driver who signed the next DVIR on this vehicle. */
  name: Option[String],
/* The time in millis when the next driver signed the DVIR on this vehicle. */
  signedAt: Option[Long],
/* Type corresponds to driver. */
  `type`: Option[String],
/* Email of the  driver who signed the next DVIR on this vehicle. */
  email: Option[String],
/* Username of the  driver who signed the next DVIR on this vehicle. */
  username: Option[String])

object DvirBaseNextDriverSignature {
  import DateTimeCodecs._

  implicit val DvirBaseNextDriverSignatureCodecJson: CodecJson[DvirBaseNextDriverSignature] = CodecJson.derive[DvirBaseNextDriverSignature]
  implicit val DvirBaseNextDriverSignatureDecoder: EntityDecoder[DvirBaseNextDriverSignature] = jsonOf[DvirBaseNextDriverSignature]
  implicit val DvirBaseNextDriverSignatureEncoder: EntityEncoder[DvirBaseNextDriverSignature] = jsonEncoderOf[DvirBaseNextDriverSignature]
}
