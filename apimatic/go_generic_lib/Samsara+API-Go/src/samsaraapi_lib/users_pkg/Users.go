/*
 * samsaraapi_lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package users_pkg

import "samsaraapi_lib/models_pkg"
import "samsaraapi_lib/configuration_pkg"

/*
 * Interface for the USERS_IMPL
 */
type USERS interface {
    DeleteUserById (string, int64) (error)

    GetUserById (string, int64) (*models_pkg.User, error)

    ListUsers (string) ([]*models_pkg.User, error)

    ListUserRoles (string) ([]*models_pkg.UserRole, error)
}

/*
 * Factory for the USERS interaface returning USERS_IMPL
 */
func NewUSERS(config configuration_pkg.CONFIGURATION) *USERS_IMPL {
    client := new(USERS_IMPL)
    client.config = config
    return client
}