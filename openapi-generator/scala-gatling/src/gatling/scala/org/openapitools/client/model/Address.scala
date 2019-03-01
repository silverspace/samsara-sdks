
package org.openapitools.client.model


case class Address (
    _contacts: Option[List[Contact]],
    /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
    _formattedAddress: Option[String],
    _geofence: Option[AddressGeofence],
    /* ID of the address */
    _id: Option[Long],
    /* Name of the address or geofence */
    _name: Option[String],
    /* Notes associated with an address. */
    _notes: Option[String],
    _tags: Option[List[TagMetadata]]
)
object Address {
    def toStringBody(var_contacts: Object, var_formattedAddress: Object, var_geofence: Object, var_id: Object, var_name: Object, var_notes: Object, var_tags: Object) =
        s"""
        | {
        | "contacts":$var_contacts,"formattedAddress":$var_formattedAddress,"geofence":$var_geofence,"id":$var_id,"name":$var_name,"notes":$var_notes,"tags":$var_tags
        | }
        """.stripMargin
}
