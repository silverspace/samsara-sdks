function New-VehicleUpdateParam {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${groupId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.Vehicle[]]
        ${vehicles}
    )

    Process {
        'Creating object: samsara.Model.VehicleUpdateParam' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.VehicleUpdateParam -ArgumentList @(
            ${groupId},
            ${vehicles}
        )
    }
}
