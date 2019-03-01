
package org.openapitools.client.model


case class TagModify (
    _add: Option[TagModifyAdd],
    _delete: Option[TagModifyDelete],
    /* Updated name of this tag. */
    _name: Option[String],
    /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
    _parentTagId: Option[Long]
)
object TagModify {
    def toStringBody(var_add: Object, var_delete: Object, var_name: Object, var_parentTagId: Object) =
        s"""
        | {
        | "add":$var_add,"delete":$var_delete,"name":$var_name,"parentTagId":$var_parentTagId
        | }
        """.stripMargin
}
