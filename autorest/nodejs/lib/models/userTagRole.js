/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a UserTagRole.
 */
class UserTagRole {
  /**
   * Create a UserTagRole.
   * @property {string} [role] The name of the role the user has been granted
   * on this tag.
   * @property {string} roleId The id of the role the user has been granted on
   * this tag.
   * @property {object} tag
   * @property {number} [tag.id] The ID of this tag.
   * @property {string} [tag.name] Name of this tag.
   * @property {number} [tag.parentTagId] The ID of this tag.
   */
  constructor() {
  }

  /**
   * Defines the metadata of UserTagRole
   *
   * @returns {object} metadata of UserTagRole
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'UserTagRole',
      type: {
        name: 'Composite',
        className: 'UserTagRole',
        modelProperties: {
          role: {
            required: false,
            serializedName: 'role',
            type: {
              name: 'String'
            }
          },
          roleId: {
            required: true,
            serializedName: 'roleId',
            type: {
              name: 'String'
            }
          },
          tag: {
            required: true,
            serializedName: 'tag',
            type: {
              name: 'Composite',
              className: 'UserTagRoleTag'
            }
          }
        }
      }
    };
  }
}

module.exports = UserTagRole;