package org.openapitools.handler;

import com.networknt.config.Config;
import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;

public class PathHandlerProvider implements HandlerProvider {

    public HttpHandler getHandler() {
        HttpHandler handler = Handlers.routing()


            .add(Methods.GET, "/v1/fleet/assets/locations", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAllAssetCurrentLocations");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/assets", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAllAssets");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/assets/{asset_id}/locations", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAssetLocation");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/assets/{asset_id}/reefer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAssetReefer");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/drivers/create", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createDriver");
                        }
                    })


            .add(Methods.DELETE, "/v1/fleet/drivers/{driver_id_or_external_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deactivateDriver");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/inactive", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAllDeactivatedDrivers");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/inactive/{driver_id_or_external_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDeactivatedDriverById");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/{driver_id_or_external_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDriverById");
                        }
                    })


            .add(Methods.PUT, "/v1/fleet/drivers/inactive/{driver_id_or_external_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("reactivateDriverById");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/add_address", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("addFleetAddress");
                        }
                    })


            .add(Methods.POST, "/v1/addresses", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("addOrganizationAddresses");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createDispatchRoute");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/drivers/create", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createDriver");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/drivers/{driver_id}/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createDriverDispatchRoute");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/drivers/{driver_id}/documents", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createDriverDocument");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/maintenance/dvirs", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createDvir");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/vehicles/{vehicle_id}/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createVehicleDispatchRoute");
                        }
                    })


            .add(Methods.DELETE, "/v1/fleet/drivers/{driver_id_or_external_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deactivateDriver");
                        }
                    })


            .add(Methods.DELETE, "/v1/fleet/dispatch/routes/{route_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deleteDispatchRouteById");
                        }
                    })


            .add(Methods.DELETE, "/v1/addresses/{addressId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deleteOrganizationAddress");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("fetchAllDispatchRoutes");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/dispatch/routes/job_updates", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("fetchAllRouteJobUpdates");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/assets/locations", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAllAssetCurrentLocations");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/assets", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAllAssets");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/inactive", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAllDeactivatedDrivers");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/assets/{asset_id}/locations", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAssetLocation");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/assets/{asset_id}/reefer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAssetReefer");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/inactive/{driver_id_or_external_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDeactivatedDriverById");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/dispatch/routes/{route_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDispatchRouteById");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/dispatch/routes/{route_id}/history", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDispatchRouteHistory");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/{driver_id}/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDispatchRoutesByDriverId");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/vehicles/{vehicle_id}/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDispatchRoutesByVehicleId");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/{driver_id_or_external_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDriverById");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/document_types", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDriverDocumentTypesByOrgId");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/documents", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDriverDocumentsByOrgId");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/{driverId}/safety/score", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDriverSafetyScore");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/maintenance/dvirs", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDvirs");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/drivers", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getFleetDrivers");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/drivers/{driver_id}/hos_daily_logs", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getFleetDriversHosDailyLogs");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/drivers/summary", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getFleetDriversSummary");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/hos_authentication_logs", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getFleetHosAuthenticationLogs");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/hos_logs", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getFleetHosLogs");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/hos_logs_summary", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getFleetHosLogsSummary");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/locations", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getFleetLocations");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/maintenance/list", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getFleetMaintenanceList");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/trips", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getFleetTrips");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/vehicles/{vehicle_id_or_external_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getFleetVehicle");
                        }
                    })


            .add(Methods.GET, "/v1/addresses/{addressId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getOrganizationAddress");
                        }
                    })


            .add(Methods.GET, "/v1/addresses", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getOrganizationAddresses");
                        }
                    })


            .add(Methods.GET, "/v1/contacts/{contact_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getOrganizationContact");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/vehicles/{vehicleId}/safety/harsh_event", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getVehicleHarshEvent");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/vehicles/{vehicle_id}/locations", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getVehicleLocations");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/vehicles/{vehicleId}/safety/score", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getVehicleSafetyScore");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/vehicles/stats", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getVehicleStats");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/vehicles/locations", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getVehiclesLocations");
                        }
                    })


            .add(Methods.GET, "/v1/contacts", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("listContacts");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/list", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("listFleet");
                        }
                    })


            .add(Methods.PATCH, "/v1/fleet/vehicles/{vehicle_id_or_external_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("patchFleetVehicle");
                        }
                    })


            .add(Methods.PUT, "/v1/fleet/drivers/inactive/{driver_id_or_external_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("reactivateDriverById");
                        }
                    })


            .add(Methods.PUT, "/v1/fleet/dispatch/routes/{route_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("updateDispatchRouteById");
                        }
                    })


            .add(Methods.PATCH, "/v1/addresses/{addressId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("updateOrganizationAddress");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/set_data", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("updateVehicles");
                        }
                    })


            .add(Methods.GET, "/v1/industrial/data", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAllDataInputs");
                        }
                    })


            .add(Methods.GET, "/v1/industrial/data/{data_input_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDataInput");
                        }
                    })


            .add(Methods.POST, "/v1/machines/list", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getMachines");
                        }
                    })


            .add(Methods.POST, "/v1/machines/history", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getMachinesHistory");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createDispatchRoute");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/drivers/{driver_id}/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createDriverDispatchRoute");
                        }
                    })


            .add(Methods.POST, "/v1/fleet/vehicles/{vehicle_id}/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createVehicleDispatchRoute");
                        }
                    })


            .add(Methods.DELETE, "/v1/fleet/dispatch/routes/{route_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deleteDispatchRouteById");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("fetchAllDispatchRoutes");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/dispatch/routes/job_updates", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("fetchAllRouteJobUpdates");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/dispatch/routes/{route_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDispatchRouteById");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/dispatch/routes/{route_id}/history", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDispatchRouteHistory");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/{driver_id}/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDispatchRoutesByDriverId");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/vehicles/{vehicle_id}/dispatch/routes", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDispatchRoutesByVehicleId");
                        }
                    })


            .add(Methods.PUT, "/v1/fleet/dispatch/routes/{route_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("updateDispatchRouteById");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/drivers/{driverId}/safety/score", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getDriverSafetyScore");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/vehicles/{vehicleId}/safety/harsh_event", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getVehicleHarshEvent");
                        }
                    })


            .add(Methods.GET, "/v1/fleet/vehicles/{vehicleId}/safety/score", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getVehicleSafetyScore");
                        }
                    })


            .add(Methods.POST, "/v1/sensors/list", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getSensors");
                        }
                    })


            .add(Methods.POST, "/v1/sensors/cargo", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getSensorsCargo");
                        }
                    })


            .add(Methods.POST, "/v1/sensors/door", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getSensorsDoor");
                        }
                    })


            .add(Methods.POST, "/v1/sensors/history", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getSensorsHistory");
                        }
                    })


            .add(Methods.POST, "/v1/sensors/humidity", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getSensorsHumidity");
                        }
                    })


            .add(Methods.POST, "/v1/sensors/temperature", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getSensorsTemperature");
                        }
                    })


            .add(Methods.POST, "/v1/tags", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("createTag");
                        }
                    })


            .add(Methods.DELETE, "/v1/tags/{tag_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deleteTagById");
                        }
                    })


            .add(Methods.GET, "/v1/tags", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getAllTags");
                        }
                    })


            .add(Methods.GET, "/v1/tags/{tag_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getTagById");
                        }
                    })


            .add(Methods.PATCH, "/v1/tags/{tag_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("modifyTagById");
                        }
                    })


            .add(Methods.PUT, "/v1/tags/{tag_id}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("updateTagById");
                        }
                    })


            .add(Methods.DELETE, "/v1/users/{userId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deleteUserById");
                        }
                    })


            .add(Methods.GET, "/v1/users/{userId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getUserById");
                        }
                    })


            .add(Methods.GET, "/v1/user_roles", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("listUserRoles");
                        }
                    })


            .add(Methods.GET, "/v1/users", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("listUsers");
                        }
                    })

        ;
        return handler;
    }
}

