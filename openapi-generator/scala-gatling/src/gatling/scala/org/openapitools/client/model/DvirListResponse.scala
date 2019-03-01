
package org.openapitools.client.model


case class DvirListResponse (
    _dvirs: Option[List[DvirBase]]
)
object DvirListResponse {
    def toStringBody(var_dvirs: Object) =
        s"""
        | {
        | "dvirs":$var_dvirs
        | }
        """.stripMargin
}
