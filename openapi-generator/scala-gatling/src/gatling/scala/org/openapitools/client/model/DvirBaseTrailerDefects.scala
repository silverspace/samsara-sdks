
package org.openapitools.client.model


case class DvirBaseTrailerDefects (
    /* The comment describing the type of DVIR defect */
    _comment: Option[String],
    /* The type of DVIR defect */
    _defectType: Option[String]
)
object DvirBaseTrailerDefects {
    def toStringBody(var_comment: Object, var_defectType: Object) =
        s"""
        | {
        | "comment":$var_comment,"defectType":$var_defectType
        | }
        """.stripMargin
}
