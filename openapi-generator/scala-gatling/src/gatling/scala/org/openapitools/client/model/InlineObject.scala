
package org.openapitools.client.model


case class InlineObject (
    _addresses: List[AddressesAddresses]
)
object InlineObject {
    def toStringBody(var_addresses: Object) =
        s"""
        | {
        | "addresses":$var_addresses
        | }
        """.stripMargin
}
