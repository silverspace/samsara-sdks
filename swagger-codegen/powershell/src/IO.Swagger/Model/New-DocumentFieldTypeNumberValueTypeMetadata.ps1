function New-DocumentFieldTypeNumberValueTypeMetadata {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${numDecimalPlaces}
    )

    Process {
        'Creating object: samsara.Model.DocumentFieldTypeNumberValueTypeMetadata' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DocumentFieldTypeNumberValueTypeMetadata -ArgumentList @(
            ${numDecimalPlaces}
        )
    }
}
