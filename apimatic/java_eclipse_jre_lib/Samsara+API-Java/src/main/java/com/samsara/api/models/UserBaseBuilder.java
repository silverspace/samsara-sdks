/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;

public class UserBaseBuilder {
    //the instance to build
    private UserBase userBase;

    /**
     * Default constructor to initialize the instance
     */
    public UserBaseBuilder() {
        userBase = new UserBase();
    }

    /**
     * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
     */
    public UserBaseBuilder authType(AuthTypeEnum authType) {
        userBase.setAuthType(authType);
        return this;
    }

    /**
     * The email address of this user.
     */
    public UserBaseBuilder email(String email) {
        userBase.setEmail(email);
        return this;
    }

    /**
     * The first and last name of the user.
     */
    public UserBaseBuilder name(String name) {
        userBase.setName(name);
        return this;
    }

    /**
     * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
     */
    public UserBaseBuilder organizationRoleId(String organizationRoleId) {
        userBase.setOrganizationRoleId(organizationRoleId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserBase build() {
        return userBase;
    }
}