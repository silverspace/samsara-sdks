function New-DocumentFieldCreatePhotoValue {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${url}
    )

    Process {
        'Creating object: samsara.Model.DocumentFieldCreatePhotoValue' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DocumentFieldCreatePhotoValue -ArgumentList @(
            ${url}
        )
    }
}
