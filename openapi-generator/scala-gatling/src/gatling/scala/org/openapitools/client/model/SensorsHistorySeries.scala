
package org.openapitools.client.model


case class SensorsHistorySeries (
    /* Field to query. */
    _field: String,
    /* Sensor ID to query. */
    _widgetId: Long
)
object SensorsHistorySeries {
    def toStringBody(var_field: Object, var_widgetId: Object) =
        s"""
        | {
        | "field":$var_field,"widgetId":$var_widgetId
        | }
        """.stripMargin
}
