function New-AuxInputSeries {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.AuxInput[]]
        ${values}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AuxInputSeries' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AuxInputSeries -ArgumentList @(
            ${name},
            ${values}
        )
    }
}
