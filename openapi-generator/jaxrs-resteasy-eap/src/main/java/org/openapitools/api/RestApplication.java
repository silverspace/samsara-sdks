package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.AddressesApiServiceImpl;
import org.openapitools.api.impl.ContactsApiServiceImpl;
import org.openapitools.api.impl.FleetApiServiceImpl;
import org.openapitools.api.impl.IndustrialApiServiceImpl;
import org.openapitools.api.impl.MachinesApiServiceImpl;
import org.openapitools.api.impl.SensorsApiServiceImpl;
import org.openapitools.api.impl.TagsApiServiceImpl;
import org.openapitools.api.impl.UserRolesApiServiceImpl;
import org.openapitools.api.impl.UsersApiServiceImpl;

@ApplicationPath("/v1")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(AddressesApiServiceImpl.class);
        resources.add(ContactsApiServiceImpl.class);
        resources.add(FleetApiServiceImpl.class);
        resources.add(IndustrialApiServiceImpl.class);
        resources.add(MachinesApiServiceImpl.class);
        resources.add(SensorsApiServiceImpl.class);
        resources.add(TagsApiServiceImpl.class);
        resources.add(UserRolesApiServiceImpl.class);
        resources.add(UsersApiServiceImpl.class);

        return resources;
    }




}