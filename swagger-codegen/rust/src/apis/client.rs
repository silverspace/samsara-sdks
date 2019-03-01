use std::rc::Rc;

use hyper;
use super::configuration::Configuration;

pub struct APIClient<C: hyper::client::Connect> {
  configuration: Rc<Configuration<C>>,
  assets_api: Box<::apis::AssetsApi>,
  drivers_api: Box<::apis::DriversApi>,
  fleet_api: Box<::apis::FleetApi>,
  industrial_api: Box<::apis::IndustrialApi>,
  routes_api: Box<::apis::RoutesApi>,
  safety_api: Box<::apis::SafetyApi>,
  sensors_api: Box<::apis::SensorsApi>,
  tags_api: Box<::apis::TagsApi>,
  users_api: Box<::apis::UsersApi>,
}

impl<C: hyper::client::Connect> APIClient<C> {
  pub fn new(configuration: Configuration<C>) -> APIClient<C> {
    let rc = Rc::new(configuration);

    APIClient {
      configuration: rc.clone(),
      assets_api: Box::new(::apis::AssetsApiClient::new(rc.clone())),
      drivers_api: Box::new(::apis::DriversApiClient::new(rc.clone())),
      fleet_api: Box::new(::apis::FleetApiClient::new(rc.clone())),
      industrial_api: Box::new(::apis::IndustrialApiClient::new(rc.clone())),
      routes_api: Box::new(::apis::RoutesApiClient::new(rc.clone())),
      safety_api: Box::new(::apis::SafetyApiClient::new(rc.clone())),
      sensors_api: Box::new(::apis::SensorsApiClient::new(rc.clone())),
      tags_api: Box::new(::apis::TagsApiClient::new(rc.clone())),
      users_api: Box::new(::apis::UsersApiClient::new(rc.clone())),
    }
  }

  pub fn assets_api(&self) -> &::apis::AssetsApi{
    self.assets_api.as_ref()
  }

  pub fn drivers_api(&self) -> &::apis::DriversApi{
    self.drivers_api.as_ref()
  }

  pub fn fleet_api(&self) -> &::apis::FleetApi{
    self.fleet_api.as_ref()
  }

  pub fn industrial_api(&self) -> &::apis::IndustrialApi{
    self.industrial_api.as_ref()
  }

  pub fn routes_api(&self) -> &::apis::RoutesApi{
    self.routes_api.as_ref()
  }

  pub fn safety_api(&self) -> &::apis::SafetyApi{
    self.safety_api.as_ref()
  }

  pub fn sensors_api(&self) -> &::apis::SensorsApi{
    self.sensors_api.as_ref()
  }

  pub fn tags_api(&self) -> &::apis::TagsApi{
    self.tags_api.as_ref()
  }

  pub fn users_api(&self) -> &::apis::UsersApi{
    self.users_api.as_ref()
  }


}
