function Invoke-RoutesApiCreateDispatchRoute {
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
        'Calling method: RoutesApi-CreateDispatchRoute' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:RoutesApi.CreateDispatchRoute(
            ${accessToken},
            ${createDispatchRouteParams}
        )
    }
}

function Invoke-RoutesApiCreateDriverDispatchRoute {
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
        'Calling method: RoutesApi-CreateDriverDispatchRoute' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:RoutesApi.CreateDriverDispatchRoute(
            ${accessToken},
            ${driverId},
            ${createDispatchRouteParams}
        )
    }
}

function Invoke-RoutesApiCreateVehicleDispatchRoute {
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
        'Calling method: RoutesApi-CreateVehicleDispatchRoute' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:RoutesApi.CreateVehicleDispatchRoute(
            ${accessToken},
            ${vehicleId},
            ${createDispatchRouteParams}
        )
    }
}

function Invoke-RoutesApiDeleteDispatchRouteById {
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
        'Calling method: RoutesApi-DeleteDispatchRouteById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:RoutesApi.DeleteDispatchRouteById(
            ${accessToken},
            ${routeId}
        )
    }
}

function Invoke-RoutesApiFetchAllDispatchRoutes {
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
        'Calling method: RoutesApi-FetchAllDispatchRoutes' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:RoutesApi.FetchAllDispatchRoutes(
            ${accessToken},
            ${groupId},
            ${endTime},
            ${duration}
        )
    }
}

function Invoke-RoutesApiFetchAllRouteJobUpdates {
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
        'Calling method: RoutesApi-FetchAllRouteJobUpdates' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:RoutesApi.FetchAllRouteJobUpdates(
            ${accessToken},
            ${groupId},
            ${sequenceId},
            ${include}
        )
    }
}

function Invoke-RoutesApiGetDispatchRouteById {
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
        'Calling method: RoutesApi-GetDispatchRouteById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:RoutesApi.GetDispatchRouteById(
            ${accessToken},
            ${routeId}
        )
    }
}

function Invoke-RoutesApiGetDispatchRouteHistory {
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
        'Calling method: RoutesApi-GetDispatchRouteHistory' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:RoutesApi.GetDispatchRouteHistory(
            ${accessToken},
            ${routeId},
            ${startTime},
            ${endTime}
        )
    }
}

function Invoke-RoutesApiGetDispatchRoutesByDriverId {
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
        'Calling method: RoutesApi-GetDispatchRoutesByDriverId' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:RoutesApi.GetDispatchRoutesByDriverId(
            ${accessToken},
            ${driverId},
            ${endTime},
            ${duration}
        )
    }
}

function Invoke-RoutesApiGetDispatchRoutesByVehicleId {
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
        'Calling method: RoutesApi-GetDispatchRoutesByVehicleId' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:RoutesApi.GetDispatchRoutesByVehicleId(
            ${accessToken},
            ${vehicleId},
            ${endTime},
            ${duration}
        )
    }
}

function Invoke-RoutesApiUpdateDispatchRouteById {
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
        'Calling method: RoutesApi-UpdateDispatchRouteById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:RoutesApi.UpdateDispatchRouteById(
            ${accessToken},
            ${routeId},
            ${updateDispatchRouteParams}
        )
    }
}

