<?php
declare(strict_types=1);

namespace App\Handler;

use Articus\PathHandler\Annotation as PHA;
use Articus\PathHandler\Consumer as PHConsumer;
use Articus\PathHandler\Producer as PHProducer;
use Articus\PathHandler\Attribute as PHAttribute;
use Articus\PathHandler\Exception as PHException;
use Psr\Http\Message\ServerRequestInterface;

/**
 * @PHA\Route(pattern="/fleet/vehicles/{vehicle_id}/locations")
 */
class FleetVehiclesVehicleIdLocations
{
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * @PHA\Get()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * TODO check if generated return container type is valid
     * @return \App\DTO\FleetVehicleLocation[]
     */
    public function getVehicleLocations(ServerRequestInterface $request): array
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
