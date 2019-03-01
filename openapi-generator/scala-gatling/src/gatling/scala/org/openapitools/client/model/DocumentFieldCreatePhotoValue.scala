
package org.openapitools.client.model


case class DocumentFieldCreatePhotoValue (
    /* Photo URL for a JPG image */
    _url: Option[String]
)
object DocumentFieldCreatePhotoValue {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}
