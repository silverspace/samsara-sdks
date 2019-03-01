
package org.openapitools.client.model


case class InlineObject1 (
    /* A list of IDs for contact book entries. */
    _contactIds: Option[List[Long]],
    /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
    _formattedAddress: Option[String],
    _geofence: Option[AddressGeofence],
    /* The name of this address/geofence */
    _name: Option[String],
    /* Notes associated with an address. */
    _notes: Option[String],
    /* A list of tag IDs. */
    _tagIds: Option[List[Long]]
)
object InlineObject1 {
    def toStringBody(var_contactIds: Object, var_formattedAddress: Object, var_geofence: Object, var_name: Object, var_notes: Object, var_tagIds: Object) =
        s"""
        | {
        | "contactIds":$var_contactIds,"formattedAddress":$var_formattedAddress,"geofence":$var_geofence,"name":$var_name,"notes":$var_notes,"tagIds":$var_tagIds
        | }
        """.stripMargin
}
