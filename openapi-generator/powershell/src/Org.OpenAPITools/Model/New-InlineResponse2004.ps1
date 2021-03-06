function New-InlineResponse2004 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.VehicleMaintenance[]]]
        ${vehicles}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2004' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2004 -ArgumentList @(
            ${vehicles}
        )
    }
}
