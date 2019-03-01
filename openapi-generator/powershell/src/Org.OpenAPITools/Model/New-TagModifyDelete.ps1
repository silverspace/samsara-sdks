function New-TagModifyDelete {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TaggedAssetBase[]]]
        ${assets},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TaggedSensorBase[]]]
        ${sensors},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TaggedVehicleBase[]]]
        ${vehicles},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TaggedMachineBase[]]]
        ${machines},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TaggedDriverBase[]]]
        ${drivers}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TagModifyDelete' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TagModifyDelete -ArgumentList @(
            ${assets},
            ${sensors},
            ${vehicles},
            ${machines},
            ${drivers}
        )
    }
}
