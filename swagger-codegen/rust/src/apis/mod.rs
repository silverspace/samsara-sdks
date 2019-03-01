use hyper;
use serde;
use serde_json;

#[derive(Debug)]
pub enum Error<T> {
    Hyper(hyper::Error),
    Serde(serde_json::Error),
    ApiError(ApiError<T>),
}

#[derive(Debug)]
pub struct ApiError<T> {
    pub code: hyper::StatusCode,
    pub content: Option<T>,
}

impl<'de, T> From<(hyper::StatusCode, &'de [u8])> for Error<T> 
    where T: serde::Deserialize<'de> {
    fn from(e: (hyper::StatusCode, &'de [u8])) -> Self {
        if e.1.len() == 0 {
            return Error::ApiError(ApiError{
                code: e.0,
                content: None,
            });
        }
        match serde_json::from_slice::<T>(e.1) {
            Ok(t) => Error::ApiError(ApiError{
                code: e.0,
                content: Some(t),
            }),
            Err(e) => {
                Error::from(e)
            }
        }
    }
}

impl<T> From<hyper::Error> for Error<T> {
    fn from(e: hyper::Error) -> Self {
        return Error::Hyper(e)
    }
}

impl<T> From<serde_json::Error> for Error<T> {
    fn from(e: serde_json::Error) -> Self {
        return Error::Serde(e)
    }
}

use super::models::*;

mod assets_api;
pub use self::assets_api::{ AssetsApi, AssetsApiClient };
mod drivers_api;
pub use self::drivers_api::{ DriversApi, DriversApiClient };
mod fleet_api;
pub use self::fleet_api::{ FleetApi, FleetApiClient };
mod industrial_api;
pub use self::industrial_api::{ IndustrialApi, IndustrialApiClient };
mod routes_api;
pub use self::routes_api::{ RoutesApi, RoutesApiClient };
mod safety_api;
pub use self::safety_api::{ SafetyApi, SafetyApiClient };
mod sensors_api;
pub use self::sensors_api::{ SensorsApi, SensorsApiClient };
mod tags_api;
pub use self::tags_api::{ TagsApi, TagsApiClient };
mod users_api;
pub use self::users_api::{ UsersApi, UsersApiClient };

pub mod configuration;
pub mod client;
