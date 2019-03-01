
package org.openapitools.client.model


case class InlineObject22 (
    /* Group ID to query. */
    _groupId: Long,
    /* List of sensor IDs to query. */
    _sensors: List[Long]
)
object InlineObject22 {
    def toStringBody(var_groupId: Object, var_sensors: Object) =
        s"""
        | {
        | "groupId":$var_groupId,"sensors":$var_sensors
        | }
        """.stripMargin
}
