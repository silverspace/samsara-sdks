function New-Addresses {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.AddressesAddresses[]]
        ${addresses}
    )

    Process {
        'Creating object: samsara.Model.Addresses' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.Addresses -ArgumentList @(
            ${addresses}
        )
    }
}
