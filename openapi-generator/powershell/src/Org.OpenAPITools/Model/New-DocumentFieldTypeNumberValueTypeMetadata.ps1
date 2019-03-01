function New-DocumentFieldTypeNumberValueTypeMetadata {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${numDecimalPlaces}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DocumentFieldTypeNumberValueTypeMetadata' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DocumentFieldTypeNumberValueTypeMetadata -ArgumentList @(
            ${numDecimalPlaces}
        )
    }
}
