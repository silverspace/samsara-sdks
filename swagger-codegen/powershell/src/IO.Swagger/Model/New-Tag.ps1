function New-Tag {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedAddress[]]]
        ${addresses},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedAsset[]]]
        ${assets},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedDriver[]]]
        ${drivers},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedMachine[]]]
        ${machines},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${parentTagId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedSensor[]]]
        ${sensors},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedVehicle[]]]
        ${vehicles}
    )

    Process {
        'Creating object: samsara.Model.Tag' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.Tag -ArgumentList @(
            ${addresses},
            ${assets},
            ${drivers},
            ${groupId},
            ${id},
            ${machines},
            ${name},
            ${parentTagId},
            ${sensors},
            ${vehicles}
        )
    }
}
