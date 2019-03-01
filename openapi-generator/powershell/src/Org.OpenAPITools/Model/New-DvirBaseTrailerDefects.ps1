function New-DvirBaseTrailerDefects {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${comment},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${defectType}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DvirBaseTrailerDefects' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DvirBaseTrailerDefects -ArgumentList @(
            ${comment},
            ${defectType}
        )
    }
}
