function New-InlineResponse2005 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.Pagination]]
        ${pagination},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.InlineResponse2005VehicleStats[]]
        ${vehicleStats}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2005' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2005 -ArgumentList @(
            ${pagination},
            ${vehicleStats}
        )
    }
}
