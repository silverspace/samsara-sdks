function New-InlineResponse2004 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.VehicleMaintenance[]]]
        ${vehicles}
    )

    Process {
        'Creating object: samsara.Model.InlineResponse2004' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.InlineResponse2004 -ArgumentList @(
            ${vehicles}
        )
    }
}
