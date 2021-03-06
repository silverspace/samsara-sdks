# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # User Model.
  class User < BaseModel
    # The authentication type the user uses to authenticate. To use SAML this
    # organization must have a configured SAML integration.
    # @return [AuthTypeEnum]
    attr_accessor :auth_type

    # The email address of this user.
    # @return [String]
    attr_accessor :email

    # The first and last name of the user.
    # @return [String]
    attr_accessor :name

    # The id of the role the user is assigned to at the organization level. This
    # will be blank for users that only have access to specific tags.
    # @return [String]
    attr_accessor :organization_role_id

    # The ID of the User record.
    # @return [Long]
    attr_accessor :id

    # The name of the role the user is assigned to at the organization level.
    # This will be blank for users that only have access to specific tags.
    # @return [String]
    attr_accessor :organization_role

    # The specific tags this user has access to. This will be blank for users
    # that have full access to the organization.
    # @return [List of UserTagRole]
    attr_accessor :tag_roles

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['auth_type'] = 'authType'
      @_hash['email'] = 'email'
      @_hash['name'] = 'name'
      @_hash['organization_role_id'] = 'organizationRoleId'
      @_hash['id'] = 'id'
      @_hash['organization_role'] = 'organizationRole'
      @_hash['tag_roles'] = 'tagRoles'
      @_hash
    end

    def initialize(auth_type = nil,
                   email = nil,
                   name = nil,
                   organization_role_id = nil,
                   id = nil,
                   organization_role = nil,
                   tag_roles = nil)
      @auth_type = auth_type
      @email = email
      @name = name
      @organization_role_id = organization_role_id
      @id = id
      @organization_role = organization_role
      @tag_roles = tag_roles
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      auth_type = hash['authType']
      email = hash['email']
      name = hash['name']
      organization_role_id = hash['organizationRoleId']
      id = hash['id']
      organization_role = hash['organizationRole']
      # Parameter is an array, so we need to iterate through it
      tag_roles = nil
      unless hash['tagRoles'].nil?
        tag_roles = []
        hash['tagRoles'].each do |structure|
          tag_roles << (UserTagRole.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      User.new(auth_type,
               email,
               name,
               organization_role_id,
               id,
               organization_role,
               tag_roles)
    end
  end
end
