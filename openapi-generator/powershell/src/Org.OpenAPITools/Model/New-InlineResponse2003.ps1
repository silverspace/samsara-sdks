function New-InlineResponse2003 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.VehicleLocation[]]]
        ${vehicles}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2003' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2003 -ArgumentList @(
            ${groupId},
            ${vehicles}
        )
    }
}
