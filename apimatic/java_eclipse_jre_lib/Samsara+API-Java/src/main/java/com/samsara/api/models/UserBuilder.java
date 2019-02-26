/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class UserBuilder {
    //the instance to build
    private User user;

    /**
     * Default constructor to initialize the instance
     */
    public UserBuilder() {
        user = new User();
    }

    /**
     * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
     */
    public UserBuilder authType(AuthTypeEnum authType) {
        user.setAuthType(authType);
        return this;
    }

    /**
     * The email address of this user.
     */
    public UserBuilder email(String email) {
        user.setEmail(email);
        return this;
    }

    /**
     * The first and last name of the user.
     */
    public UserBuilder name(String name) {
        user.setName(name);
        return this;
    }

    /**
     * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
     */
    public UserBuilder organizationRoleId(String organizationRoleId) {
        user.setOrganizationRoleId(organizationRoleId);
        return this;
    }

    /**
     * The ID of the User record.
     */
    public UserBuilder id(Long id) {
        user.setId(id);
        return this;
    }

    /**
     * The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
     */
    public UserBuilder organizationRole(String organizationRole) {
        user.setOrganizationRole(organizationRole);
        return this;
    }

    /**
     * The specific tags this user has access to. This will be blank for users that have full access to the organization.
     */
    public UserBuilder tagRoles(List<UserTagRole> tagRoles) {
        user.setTagRoles(tagRoles);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public User build() {
        return user;
    }
}