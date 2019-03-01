package org.openapitools.server.api;

import java.nio.charset.Charset;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.phiz71.vertx.swagger.router.OperationIdServiceIdResolver;
import com.github.phiz71.vertx.swagger.router.SwaggerRouter;

import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.file.FileSystem;
import io.vertx.core.json.Json;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class MainApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(MainApiVerticle.class);

    private int serverPort = 8080;
    protected Router router;

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        router = Router.router(vertx);
    }

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        Json.mapper.registerModule(new JavaTimeModule());
        FileSystem vertxFileSystem = vertx.fileSystem();
        vertxFileSystem.readFile("openapi.json", readFile -> {
            if (readFile.succeeded()) {
                Swagger swagger = new SwaggerParser().parse(readFile.result().toString(Charset.forName("utf-8")));
                Router swaggerRouter = SwaggerRouter.swaggerRouter(router, swagger, vertx.eventBus(), new OperationIdServiceIdResolver());

                deployVerticles(startFuture);

                vertx.createHttpServer()
                    .requestHandler(swaggerRouter::accept) 
                    .listen(serverPort, h -> {
                        if (h.succeeded()) {
                            startFuture.complete();
                        } else {
                            startFuture.fail(h.cause());
                        }
                    });
            } else {
            	startFuture.fail(readFile.cause());
            }
        });        		        
    }
      
    public void deployVerticles(Future<Void> startFuture) {
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AssetsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AssetsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AssetsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.DriversApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("DriversApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("DriversApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.FleetApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("FleetApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("FleetApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.IndustrialApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("IndustrialApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("IndustrialApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.RoutesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("RoutesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("RoutesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.SafetyApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("SafetyApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("SafetyApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.SensorsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("SensorsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("SensorsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.TagsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("TagsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("TagsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.UsersApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("UsersApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("UsersApiVerticle : Deployment failed");
            }
        });
        
    }
}