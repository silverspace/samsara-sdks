import com.google.inject.AbstractModule;

import controllers.*;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(AssetsApiControllerImpInterface.class).to(AssetsApiControllerImp.class);
        bind(DriversApiControllerImpInterface.class).to(DriversApiControllerImp.class);
        bind(FleetApiControllerImpInterface.class).to(FleetApiControllerImp.class);
        bind(IndustrialApiControllerImpInterface.class).to(IndustrialApiControllerImp.class);
        bind(RoutesApiControllerImpInterface.class).to(RoutesApiControllerImp.class);
        bind(SafetyApiControllerImpInterface.class).to(SafetyApiControllerImp.class);
        bind(SensorsApiControllerImpInterface.class).to(SensorsApiControllerImp.class);
        bind(TagsApiControllerImpInterface.class).to(TagsApiControllerImp.class);
        bind(UsersApiControllerImpInterface.class).to(UsersApiControllerImp.class);
    }
}