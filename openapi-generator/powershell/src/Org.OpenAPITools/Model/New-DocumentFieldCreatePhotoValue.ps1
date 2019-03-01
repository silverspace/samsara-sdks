function New-DocumentFieldCreatePhotoValue {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${url}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DocumentFieldCreatePhotoValue' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DocumentFieldCreatePhotoValue -ArgumentList @(
            ${url}
        )
    }
}
