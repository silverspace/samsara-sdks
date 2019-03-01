function New-TagModifyDelete {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedAssetBase[]]]
        ${assets},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedDriverBase[]]]
        ${drivers},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedMachineBase[]]]
        ${machines},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedSensorBase[]]]
        ${sensors},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedVehicleBase[]]]
        ${vehicles}
    )

    Process {
        'Creating object: samsara.Model.TagModifyDelete' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.TagModifyDelete -ArgumentList @(
            ${assets},
            ${drivers},
            ${machines},
            ${sensors},
            ${vehicles}
        )
    }
}
