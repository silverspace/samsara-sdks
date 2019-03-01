function New-InlineObject {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.AddressesAddresses[]]
        ${addresses}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject -ArgumentList @(
            ${addresses}
        )
    }
}
