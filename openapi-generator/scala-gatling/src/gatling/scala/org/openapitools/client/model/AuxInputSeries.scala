
package org.openapitools.client.model


case class AuxInputSeries (
    /* The name of the aux input. */
    _name: String,
    _values: List[AuxInput]
)
object AuxInputSeries {
    def toStringBody(var_name: Object, var_values: Object) =
        s"""
        | {
        | "name":$var_name,"values":$var_values
        | }
        """.stripMargin
}
