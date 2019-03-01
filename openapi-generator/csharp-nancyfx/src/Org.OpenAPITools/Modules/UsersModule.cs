using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools.v1.Models;
using Org.OpenAPITools.v1.Utils;
using NodaTime;

namespace Org.OpenAPITools.v1.Modules
{ 

    /// <summary>
    /// Module processing requests of Users domain.
    /// </summary>
    public sealed class UsersModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public UsersModule(UsersService service) : base("/v1")
        { 
            Delete["/users/{userId}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var userId = Parameters.ValueOf<long?>(parameters, Context.Request, "userId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'DeleteUserById'");
                
                Preconditions.IsNotNull(userId, "Required parameter: 'userId' is missing at 'DeleteUserById'");
                
                service.DeleteUserById(Context, accessToken, userId);
                return new Response { ContentType = "application/json"};
            };

            Get["/users/{userId}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var userId = Parameters.ValueOf<long?>(parameters, Context.Request, "userId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetUserById'");
                
                Preconditions.IsNotNull(userId, "Required parameter: 'userId' is missing at 'GetUserById'");
                
                return service.GetUserById(Context, accessToken, userId);
            };

            Get["/user_roles"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'ListUserRoles'");
                
                return service.ListUserRoles(Context, accessToken).ToArray();
            };

            Get["/users"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'ListUsers'");
                
                return service.ListUsers(Context, accessToken).ToArray();
            };
        }
    }

    /// <summary>
    /// Service handling Users requests.
    /// </summary>
    public interface UsersService
    {
        /// <summary>
        /// Remove a user from the organization.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="userId">ID of the user.</param>
        /// <returns></returns>
        void DeleteUserById(NancyContext context, string accessToken, long? userId);

        /// <summary>
        /// Get a user.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="userId">ID of the user.</param>
        /// <returns>User</returns>
        User GetUserById(NancyContext context, string accessToken, long? userId);

        /// <summary>
        /// Get all roles in the organization.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;UserRole&gt;</returns>
        List<UserRole> ListUserRoles(NancyContext context, string accessToken);

        /// <summary>
        /// List all users in the organization.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;User&gt;</returns>
        List<User> ListUsers(NancyContext context, string accessToken);
    }

    /// <summary>
    /// Abstraction of UsersService.
    /// </summary>
    public abstract class AbstractUsersService: UsersService
    {
        public virtual void DeleteUserById(NancyContext context, string accessToken, long? userId)
        {
            DeleteUserById(accessToken, userId);
        }

        public virtual User GetUserById(NancyContext context, string accessToken, long? userId)
        {
            return GetUserById(accessToken, userId);
        }

        public virtual List<UserRole> ListUserRoles(NancyContext context, string accessToken)
        {
            return ListUserRoles(accessToken);
        }

        public virtual List<User> ListUsers(NancyContext context, string accessToken)
        {
            return ListUsers(accessToken);
        }

        protected abstract void DeleteUserById(string accessToken, long? userId);

        protected abstract User GetUserById(string accessToken, long? userId);

        protected abstract List<UserRole> ListUserRoles(string accessToken);

        protected abstract List<User> ListUsers(string accessToken);
    }

}
