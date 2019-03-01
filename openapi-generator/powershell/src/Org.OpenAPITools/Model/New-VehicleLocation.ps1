function New-VehicleLocation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${heading},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${latitude},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${location},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${longitude},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${odometerMeters},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${onTrip},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${speed},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${time},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${vin}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VehicleLocation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VehicleLocation -ArgumentList @(
            ${heading},
            ${id},
            ${latitude},
            ${location},
            ${longitude},
            ${name},
            ${odometerMeters},
            ${onTrip},
            ${speed},
            ${time},
            ${vin}
        )
    }
}
