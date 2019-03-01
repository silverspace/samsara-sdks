
package org.openapitools.client.model


case class AddressesAddresses (
    /* Notes associated with an address. */
    _notes: Option[String],
    /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
    _formattedAddress: String,
    _geofence: AddressGeofence,
    /* A list of tag IDs. */
    _tagIds: Option[List[Long]],
    /* The name of this address/geofence */
    _name: String,
    /* A list of IDs for contact book entries. */
    _contactIds: Option[List[Long]]
)
object AddressesAddresses {
    def toStringBody(var_notes: Object, var_formattedAddress: Object, var_geofence: Object, var_tagIds: Object, var_name: Object, var_contactIds: Object) =
        s"""
        | {
        | "notes":$var_notes,"formattedAddress":$var_formattedAddress,"geofence":$var_geofence,"tagIds":$var_tagIds,"name":$var_name,"contactIds":$var_contactIds
        | }
        """.stripMargin
}
