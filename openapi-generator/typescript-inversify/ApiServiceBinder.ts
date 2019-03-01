import {interfaces} from "inversify";

import { AssetsService } from './api/assets.service';
import { DriversService } from './api/drivers.service';
import { FleetService } from './api/fleet.service';
import { IndustrialService } from './api/industrial.service';
import { RoutesService } from './api/routes.service';
import { SafetyService } from './api/safety.service';
import { SensorsService } from './api/sensors.service';
import { TagsService } from './api/tags.service';
import { UsersService } from './api/users.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<AssetsService>("AssetsService").to(AssetsService).inSingletonScope();
        container.bind<DriversService>("DriversService").to(DriversService).inSingletonScope();
        container.bind<FleetService>("FleetService").to(FleetService).inSingletonScope();
        container.bind<IndustrialService>("IndustrialService").to(IndustrialService).inSingletonScope();
        container.bind<RoutesService>("RoutesService").to(RoutesService).inSingletonScope();
        container.bind<SafetyService>("SafetyService").to(SafetyService).inSingletonScope();
        container.bind<SensorsService>("SensorsService").to(SensorsService).inSingletonScope();
        container.bind<TagsService>("TagsService").to(TagsService).inSingletonScope();
        container.bind<UsersService>("UsersService").to(UsersService).inSingletonScope();
    }
}
