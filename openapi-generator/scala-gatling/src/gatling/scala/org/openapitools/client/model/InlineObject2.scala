
package org.openapitools.client.model


case class InlineObject2 (
    /* The address of the entry to add, as it would be recognized if provided to maps.google.com. */
    _address: String,
    /* Group ID to query. */
    _groupId: Long,
    /* Name of the location to add to the address book. */
    _name: String,
    /* Radius in meters of the address (used for matching vehicle trip stops to this location). */
    _radius: Integer
)
object InlineObject2 {
    def toStringBody(var_address: Object, var_groupId: Object, var_name: Object, var_radius: Object) =
        s"""
        | {
        | "address":$var_address,"groupId":$var_groupId,"name":$var_name,"radius":$var_radius
        | }
        """.stripMargin
}
