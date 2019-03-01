function New-InlineObject16 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[{String, String}]]
        ${externalIds},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${harshUnderscoreaccelUnderscoresetting},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject16' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject16 -ArgumentList @(
            ${externalIds},
            ${harshUnderscoreaccelUnderscoresetting},
            ${name}
        )
    }
}
