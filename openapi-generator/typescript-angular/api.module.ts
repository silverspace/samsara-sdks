import { NgModule, ModuleWithProviders, SkipSelf, Optional } from '@angular/core';
import { Configuration } from './configuration';
import { HttpClient } from '@angular/common/http';


import { AssetsService } from './api/assets.service';
import { DriversService } from './api/drivers.service';
import { FleetService } from './api/fleet.service';
import { IndustrialService } from './api/industrial.service';
import { RoutesService } from './api/routes.service';
import { SafetyService } from './api/safety.service';
import { SensorsService } from './api/sensors.service';
import { TagsService } from './api/tags.service';
import { UsersService } from './api/users.service';

@NgModule({
  imports:      [],
  declarations: [],
  exports:      [],
  providers: [
    AssetsService,
    DriversService,
    FleetService,
    IndustrialService,
    RoutesService,
    SafetyService,
    SensorsService,
    TagsService,
    UsersService ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): ModuleWithProviders {
        return {
            ngModule: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( @Optional() @SkipSelf() parentModule: ApiModule,
                 @Optional() http: HttpClient) {
        if (parentModule) {
            throw new Error('ApiModule is already loaded. Import in your base AppModule only.');
        }
        if (!http) {
            throw new Error('You need to import the HttpClientModule in your AppModule! \n' +
            'See also https://github.com/angular/angular/issues/20575');
        }
    }
}