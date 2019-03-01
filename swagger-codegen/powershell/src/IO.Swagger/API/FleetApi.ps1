function Invoke-FleetApiAddFleetAddress {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.AddressParam]
        ${addressParam}
    )

    Process {
        'Calling method: FleetApi-AddFleetAddress' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.AddFleetAddress(
            ${accessToken},
            ${addressParam}
        )
    }
}

function Invoke-FleetApiAddOrganizationAddresses {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.Addresses]
        ${addresses}
    )

    Process {
        'Calling method: FleetApi-AddOrganizationAddresses' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.AddOrganizationAddresses(
            ${accessToken},
            ${addresses}
        )
    }
}

function Invoke-FleetApiCreateDispatchRoute {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.DispatchRouteCreate]
        ${createDispatchRouteParams}
    )

    Process {
        'Calling method: FleetApi-CreateDispatchRoute' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.CreateDispatchRoute(
            ${accessToken},
            ${createDispatchRouteParams}
        )
    }
}

function Invoke-FleetApiCreateDriver {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.DriverForCreate]
        ${createDriverParam}
    )

    Process {
        'Calling method: FleetApi-CreateDriver' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.CreateDriver(
            ${accessToken},
            ${createDriverParam}
        )
    }
}

function Invoke-FleetApiCreateDriverDispatchRoute {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${driverId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.DispatchRouteCreate]
        ${createDispatchRouteParams}
    )

    Process {
        'Calling method: FleetApi-CreateDriverDispatchRoute' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.CreateDriverDispatchRoute(
            ${accessToken},
            ${driverId},
            ${createDispatchRouteParams}
        )
    }
}

function Invoke-FleetApiCreateDriverDocument {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${driverId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.DocumentCreate]
        ${createDocumentParams}
    )

    Process {
        'Calling method: FleetApi-CreateDriverDocument' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.CreateDriverDocument(
            ${accessToken},
            ${driverId},
            ${createDocumentParams}
        )
    }
}

function Invoke-FleetApiCreateDvir {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.CreateDvirParam]
        ${createDvirParam}
    )

    Process {
        'Calling method: FleetApi-CreateDvir' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.CreateDvir(
            ${accessToken},
            ${createDvirParam}
        )
    }
}

function Invoke-FleetApiCreateVehicleDispatchRoute {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${vehicleId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.DispatchRouteCreate]
        ${createDispatchRouteParams}
    )

    Process {
        'Calling method: FleetApi-CreateVehicleDispatchRoute' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.CreateVehicleDispatchRoute(
            ${accessToken},
            ${vehicleId},
            ${createDispatchRouteParams}
        )
    }
}

function Invoke-FleetApiDeactivateDriver {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${driverIdOrExternalId}
    )

    Process {
        'Calling method: FleetApi-DeactivateDriver' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.DeactivateDriver(
            ${accessToken},
            ${driverIdOrExternalId}
        )
    }
}

function Invoke-FleetApiDeleteDispatchRouteById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${routeId}
    )

    Process {
        'Calling method: FleetApi-DeleteDispatchRouteById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.DeleteDispatchRouteById(
            ${accessToken},
            ${routeId}
        )
    }
}

function Invoke-FleetApiDeleteOrganizationAddress {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${addressId}
    )

    Process {
        'Calling method: FleetApi-DeleteOrganizationAddress' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.DeleteOrganizationAddress(
            ${accessToken},
            ${addressId}
        )
    }
}

function Invoke-FleetApiFetchAllDispatchRoutes {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${groupId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${endTime},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${duration}
    )

    Process {
        'Calling method: FleetApi-FetchAllDispatchRoutes' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.FetchAllDispatchRoutes(
            ${accessToken},
            ${groupId},
            ${endTime},
            ${duration}
        )
    }
}

function Invoke-FleetApiFetchAllRouteJobUpdates {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${groupId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${sequenceId},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${include}
    )

    Process {
        'Calling method: FleetApi-FetchAllRouteJobUpdates' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.FetchAllRouteJobUpdates(
            ${accessToken},
            ${groupId},
            ${sequenceId},
            ${include}
        )
    }
}

function Invoke-FleetApiGetAllAssetCurrentLocations {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${groupId}
    )

    Process {
        'Calling method: FleetApi-GetAllAssetCurrentLocations' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetAllAssetCurrentLocations(
            ${accessToken},
            ${groupId}
        )
    }
}

function Invoke-FleetApiGetAllAssets {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${groupId}
    )

    Process {
        'Calling method: FleetApi-GetAllAssets' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetAllAssets(
            ${accessToken},
            ${groupId}
        )
    }
}

function Invoke-FleetApiGetAllDeactivatedDrivers {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${groupId}
    )

    Process {
        'Calling method: FleetApi-GetAllDeactivatedDrivers' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetAllDeactivatedDrivers(
            ${accessToken},
            ${groupId}
        )
    }
}

function Invoke-FleetApiGetAssetLocation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${assetId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${endMs}
    )

    Process {
        'Calling method: FleetApi-GetAssetLocation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetAssetLocation(
            ${accessToken},
            ${assetId},
            ${startMs},
            ${endMs}
        )
    }
}

function Invoke-FleetApiGetAssetReefer {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${assetId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${endMs}
    )

    Process {
        'Calling method: FleetApi-GetAssetReefer' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetAssetReefer(
            ${accessToken},
            ${assetId},
            ${startMs},
            ${endMs}
        )
    }
}

function Invoke-FleetApiGetDeactivatedDriverById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${driverIdOrExternalId}
    )

    Process {
        'Calling method: FleetApi-GetDeactivatedDriverById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetDeactivatedDriverById(
            ${accessToken},
            ${driverIdOrExternalId}
        )
    }
}

function Invoke-FleetApiGetDispatchRouteById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${routeId}
    )

    Process {
        'Calling method: FleetApi-GetDispatchRouteById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetDispatchRouteById(
            ${accessToken},
            ${routeId}
        )
    }
}

function Invoke-FleetApiGetDispatchRouteHistory {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${routeId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${startTime},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${endTime}
    )

    Process {
        'Calling method: FleetApi-GetDispatchRouteHistory' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetDispatchRouteHistory(
            ${accessToken},
            ${routeId},
            ${startTime},
            ${endTime}
        )
    }
}

function Invoke-FleetApiGetDispatchRoutesByDriverId {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${driverId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${endTime},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${duration}
    )

    Process {
        'Calling method: FleetApi-GetDispatchRoutesByDriverId' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetDispatchRoutesByDriverId(
            ${accessToken},
            ${driverId},
            ${endTime},
            ${duration}
        )
    }
}

function Invoke-FleetApiGetDispatchRoutesByVehicleId {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${vehicleId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${endTime},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${duration}
    )

    Process {
        'Calling method: FleetApi-GetDispatchRoutesByVehicleId' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetDispatchRoutesByVehicleId(
            ${accessToken},
            ${vehicleId},
            ${endTime},
            ${duration}
        )
    }
}

function Invoke-FleetApiGetDriverById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${driverIdOrExternalId}
    )

    Process {
        'Calling method: FleetApi-GetDriverById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetDriverById(
            ${accessToken},
            ${driverIdOrExternalId}
        )
    }
}

function Invoke-FleetApiGetDriverDocumentTypesByOrgId {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Calling method: FleetApi-GetDriverDocumentTypesByOrgId' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetDriverDocumentTypesByOrgId(
        )
    }
}

function Invoke-FleetApiGetDriverDocumentsByOrgId {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${endMs},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${durationMs}
    )

    Process {
        'Calling method: FleetApi-GetDriverDocumentsByOrgId' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetDriverDocumentsByOrgId(
            ${accessToken},
            ${endMs},
            ${durationMs}
        )
    }
}

function Invoke-FleetApiGetDriverSafetyScore {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${driverId},
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${endMs}
    )

    Process {
        'Calling method: FleetApi-GetDriverSafetyScore' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetDriverSafetyScore(
            ${driverId},
            ${accessToken},
            ${startMs},
            ${endMs}
        )
    }
}

function Invoke-FleetApiGetDvirs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${endMs},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${durationMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int32]
        ${groupId}
    )

    Process {
        'Calling method: FleetApi-GetDvirs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetDvirs(
            ${accessToken},
            ${endMs},
            ${durationMs},
            ${groupId}
        )
    }
}

function Invoke-FleetApiGetFleetDrivers {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.GroupDriversParam]
        ${groupDriversParam}
    )

    Process {
        'Calling method: FleetApi-GetFleetDrivers' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetFleetDrivers(
            ${accessToken},
            ${groupDriversParam}
        )
    }
}

function Invoke-FleetApiGetFleetDriversHosDailyLogs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${driverId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.HosLogsParam]
        ${hosLogsParam}
    )

    Process {
        'Calling method: FleetApi-GetFleetDriversHosDailyLogs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetFleetDriversHosDailyLogs(
            ${accessToken},
            ${driverId},
            ${hosLogsParam}
        )
    }
}

function Invoke-FleetApiGetFleetDriversSummary {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.DriversSummaryParam]
        ${driversSummaryParam},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${snapToDayBounds}
    )

    Process {
        'Calling method: FleetApi-GetFleetDriversSummary' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetFleetDriversSummary(
            ${accessToken},
            ${driversSummaryParam},
            ${snapToDayBounds}
        )
    }
}

function Invoke-FleetApiGetFleetHosAuthenticationLogs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.HosAuthenticationLogsParam]
        ${hosAuthenticationLogsParam}
    )

    Process {
        'Calling method: FleetApi-GetFleetHosAuthenticationLogs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetFleetHosAuthenticationLogs(
            ${accessToken},
            ${hosAuthenticationLogsParam}
        )
    }
}

function Invoke-FleetApiGetFleetHosLogs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.HosLogsParam1]
        ${hosLogsParam}
    )

    Process {
        'Calling method: FleetApi-GetFleetHosLogs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetFleetHosLogs(
            ${accessToken},
            ${hosLogsParam}
        )
    }
}

function Invoke-FleetApiGetFleetHosLogsSummary {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.HosLogsParam2]
        ${hosLogsParam}
    )

    Process {
        'Calling method: FleetApi-GetFleetHosLogsSummary' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetFleetHosLogsSummary(
            ${accessToken},
            ${hosLogsParam}
        )
    }
}

function Invoke-FleetApiGetFleetLocations {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.GroupParam]
        ${groupParam}
    )

    Process {
        'Calling method: FleetApi-GetFleetLocations' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetFleetLocations(
            ${accessToken},
            ${groupParam}
        )
    }
}

function Invoke-FleetApiGetFleetMaintenanceList {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.GroupParam]
        ${groupParam}
    )

    Process {
        'Calling method: FleetApi-GetFleetMaintenanceList' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetFleetMaintenanceList(
            ${accessToken},
            ${groupParam}
        )
    }
}

function Invoke-FleetApiGetFleetTrips {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.TripsParam]
        ${tripsParam}
    )

    Process {
        'Calling method: FleetApi-GetFleetTrips' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetFleetTrips(
            ${accessToken},
            ${tripsParam}
        )
    }
}

function Invoke-FleetApiGetFleetVehicle {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${vehicleIdOrExternalId}
    )

    Process {
        'Calling method: FleetApi-GetFleetVehicle' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetFleetVehicle(
            ${accessToken},
            ${vehicleIdOrExternalId}
        )
    }
}

function Invoke-FleetApiGetOrganizationAddress {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${addressId}
    )

    Process {
        'Calling method: FleetApi-GetOrganizationAddress' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetOrganizationAddress(
            ${accessToken},
            ${addressId}
        )
    }
}

function Invoke-FleetApiGetOrganizationAddresses {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken}
    )

    Process {
        'Calling method: FleetApi-GetOrganizationAddresses' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetOrganizationAddresses(
            ${accessToken}
        )
    }
}

function Invoke-FleetApiGetOrganizationContact {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${contactId}
    )

    Process {
        'Calling method: FleetApi-GetOrganizationContact' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetOrganizationContact(
            ${accessToken},
            ${contactId}
        )
    }
}

function Invoke-FleetApiGetVehicleHarshEvent {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${vehicleId},
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${timestamp}
    )

    Process {
        'Calling method: FleetApi-GetVehicleHarshEvent' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetVehicleHarshEvent(
            ${vehicleId},
            ${accessToken},
            ${timestamp}
        )
    }
}

function Invoke-FleetApiGetVehicleLocations {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${vehicleId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${endMs}
    )

    Process {
        'Calling method: FleetApi-GetVehicleLocations' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetVehicleLocations(
            ${accessToken},
            ${vehicleId},
            ${startMs},
            ${endMs}
        )
    }
}

function Invoke-FleetApiGetVehicleSafetyScore {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${vehicleId},
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${endMs}
    )

    Process {
        'Calling method: FleetApi-GetVehicleSafetyScore' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetVehicleSafetyScore(
            ${vehicleId},
            ${accessToken},
            ${startMs},
            ${endMs}
        )
    }
}

function Invoke-FleetApiGetVehicleStats {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${startMs},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${endMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${series},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${tagIds},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${startingAfter},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${endingBefore},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${limit}
    )

    Process {
        'Calling method: FleetApi-GetVehicleStats' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetVehicleStats(
            ${accessToken},
            ${startMs},
            ${endMs},
            ${series},
            ${tagIds},
            ${startingAfter},
            ${endingBefore},
            ${limit}
        )
    }
}

function Invoke-FleetApiGetVehiclesLocations {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${startMs},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${endMs}
    )

    Process {
        'Calling method: FleetApi-GetVehiclesLocations' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.GetVehiclesLocations(
            ${accessToken},
            ${startMs},
            ${endMs}
        )
    }
}

function Invoke-FleetApiListContacts {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken}
    )

    Process {
        'Calling method: FleetApi-ListContacts' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.ListContacts(
            ${accessToken}
        )
    }
}

function Invoke-FleetApiListFleet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.GroupParam]
        ${groupParam},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${startingAfter},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${endingBefore},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${limit}
    )

    Process {
        'Calling method: FleetApi-ListFleet' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.ListFleet(
            ${accessToken},
            ${groupParam},
            ${startingAfter},
            ${endingBefore},
            ${limit}
        )
    }
}

function Invoke-FleetApiPatchFleetVehicle {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${vehicleIdOrExternalId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.Data]
        ${data}
    )

    Process {
        'Calling method: FleetApi-PatchFleetVehicle' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.PatchFleetVehicle(
            ${accessToken},
            ${vehicleIdOrExternalId},
            ${data}
        )
    }
}

function Invoke-FleetApiReactivateDriverById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${driverIdOrExternalId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.ReactivateDriverParam]
        ${reactivateDriverParam}
    )

    Process {
        'Calling method: FleetApi-ReactivateDriverById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.ReactivateDriverById(
            ${accessToken},
            ${driverIdOrExternalId},
            ${reactivateDriverParam}
        )
    }
}

function Invoke-FleetApiUpdateDispatchRouteById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${routeId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.DispatchRoute]
        ${updateDispatchRouteParams}
    )

    Process {
        'Calling method: FleetApi-UpdateDispatchRouteById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.UpdateDispatchRouteById(
            ${accessToken},
            ${routeId},
            ${updateDispatchRouteParams}
        )
    }
}

function Invoke-FleetApiUpdateOrganizationAddress {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.Address]
        ${address},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${addressId}
    )

    Process {
        'Calling method: FleetApi-UpdateOrganizationAddress' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.UpdateOrganizationAddress(
            ${accessToken},
            ${address},
            ${addressId}
        )
    }
}

function Invoke-FleetApiUpdateVehicles {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.VehicleUpdateParam]
        ${vehicleUpdateParam}
    )

    Process {
        'Calling method: FleetApi-UpdateVehicles' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:FleetApi.UpdateVehicles(
            ${accessToken},
            ${vehicleUpdateParam}
        )
    }
}

