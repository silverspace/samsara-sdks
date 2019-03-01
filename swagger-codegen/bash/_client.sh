#compdef 

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! swagger-codegen (https://github.com/swagger-api/swagger-codegen)
# ! FROM SWAGGER SPECIFICATION IN JSON.
# !
# ! Based on: https://github.com/Valodim/zsh-curl-completion/blob/master/_curl
# !
# !
# !
# ! Installation:
# !
# ! Copy the _ file to any directory under FPATH
# ! environment variable (echo $FPATH)
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


local curcontext="$curcontext" state line ret=1
typeset -A opt_args

typeset -A mime_type_abbreviations
# text/*
mime_type_abbreviations[text]="text/plain"
mime_type_abbreviations[html]="text/html"
mime_type_abbreviations[md]="text/x-markdown"
mime_type_abbreviations[csv]="text/csv"
mime_type_abbreviations[css]="text/css"
mime_type_abbreviations[rtf]="text/rtf"
# application/*
mime_type_abbreviations[json]="application/json"
mime_type_abbreviations[xml]="application/xml"
mime_type_abbreviations[yaml]="application/yaml"
mime_type_abbreviations[js]="application/javascript"
mime_type_abbreviations[bin]="application/octet-stream"
mime_type_abbreviations[rdf]="application/rdf+xml"
# image/*
mime_type_abbreviations[jpg]="image/jpeg"
mime_type_abbreviations[png]="image/png"
mime_type_abbreviations[gif]="image/gif"
mime_type_abbreviations[bmp]="image/bmp"
mime_type_abbreviations[tiff]="image/tiff"

#
# Generate zsh completion string list for abbreviated mime types
#
get_mime_type_completions() {
    typeset -a result
    result=()
    for k in "${(@k)mime_type_abbreviations}"; do
        value=$mime_type_abbreviations[${k}]
        #echo $value
        result+=( "${k}[${value}]" )
        #echo $result
    done
    echo "$result"
}

#
# cURL crypto engines completion function
#
_curl_crypto_engine() {
    local vals
    vals=( ${${(f)"$(curl --engine list)":gs/ /}[2,$]} )
    _describe -t outputs 'engines' vals && return 0
}

#
# cURL post data completion functions=
#
_curl_post_data() {

    # don't do anything further if this is raw content
    compset -P '=' && _message 'raw content' && return 0

    # complete filename or stdin for @ syntax
    compset -P '*@' && {
        local expl
        _description files expl stdin
        compadd "$expl[@]" - "-"
        _files
        return 0
    }

    # got a name already? expecting data.
    compset -P '*=' && _message 'data value' && return 0

    # otherwise, name (or @ or =) should be specified
    _message 'data name' && return 0

}


local arg_http arg_ftp arg_other arg_proxy arg_crypto arg_connection arg_auth arg_input arg_output

# HTTP Arguments
arg_http=(''\
  {-0,--http1.0}'[force use of use http 1.0 instead of 1.1]' \
  {-b,--cookie}'[pass data to http server as cookie]:data or file' \
  {-c,--cookie-jar}'[specify cookie file]:file name:_files' \
  {-d,--data}'[send specified data as HTTP POST data]:data:{_curl_post_data}' \
  '--data-binary[post HTTP POST data without any processing]:data:{_curl_post_data}' \
  '--data-urlencode[post HTTP POST data, with url encoding]:data:{_curl_post_data}' \
  {-f,--fail}'[enable failfast behavior for server errors]' \
  '*'{-F,--form}'[add POST form data]:name=content' \
  {-G,--get}'[use HTTP GET even with data (-d, --data, --data-binary)]' \
  '*'{-H,--header}'[specify an extra header]:header' \
  '--ignore-content-length[ignore Content-Length header]' \
  {-i,--include}'[include HTTP header in the output]' \
  {-j,--junk-session-cookies}'[discard all session cookies]' \
  {-e,--referer}'[send url as referer]:referer url:_urls' \
  {-L,--location}'[follow Location headers on http 3XX response]' \
  '--location-trusted[like --location, but allows sending of auth data to redirected hosts]' \
  '--max-redirs[set maximum number of redirection followings allowed]:number' \
  {-J,--remote-header-name}'[use Content-Disposition for output file name]' \
  {-O,--remote-name}'[write to filename parsed from url instead of stdout]' \
  '--post301[do not convert POST to GET after following 301 Location response (follow RFC 2616/10.3.2)]' \
  '--post302[do not convert POST to GET after following 302 Location response (follow RFC 2616/10.3.2)]' \
  )

# FTP arguments
arg_ftp=(\
  {-a,--append}'[append to target file instead of overwriting (FTP/SFTP)]' \
  '--crlf[convert LF to CRLF in upload]' \
  '--disable-eprt[disable use of EPRT and LPRT for active FTP transfers]' \
  '--disable-epsv[disable use of EPSV for passive FTP transfers]' \
  '--ftp-account[account data (FTP)]:data' \
  '--ftp-alternative-to-user[command to send when USER and PASS commands fail (FTP)]:command' \
  '--ftp-create-dirs[create paths remotely if it does not exist]' \
  '--ftp-method[ftp method to use to reach a file (FTP)]:method:(multicwd ocwd singlecwd)' \
  '--ftp-pasv[use passive mode for the data connection (FTP)]' \
  '--ftp-skip-pasv-ip[do not use the ip the server suggests for PASV]' \
  '--form-string[like --form, but do not parse content]:name=string' \
  '--ftp-pret[send PRET before PASV]' \
  '--ftp-ssl-ccc[use clear command channel (CCC) after authentication (FTP)]' \
  '--ftp-ssl-ccc-mode[sets the CCC mode (FTP)]:mode:(active passive)' \
  '--ftp-ssl-control[require SSL/TLS for FTP login, clear for transfer]' \
  {-l,--list-only}'[list names only when listing directories (FTP)]' \
  {-P,--ftp-port}'[use active mode, tell server to connect to specified address or interface (FTP]:address' \
  '*'{-Q,--quote}'[send arbitrary command to the remote server before transfer (FTP/SFTP)]:command' \
  )

# Other Protocol arguments
arg_other=(\
  '--mail-from[specify From: address]:address' \
  '--mail-rcpt[specify email recipient for SMTP, may be given multiple times]:address' \
  {-t,--telnet-option}'[pass options to telnet protocol]:opt=val' \
  '--tftp-blksize[set tftp BLKSIZE option]:value' \
  )

# Proxy arguments
arg_proxy=(\
  '--noproxy[list of hosts to connect directly to instead of through proxy]:no-proxy-list' \
  {-p,--proxytunnel}'[tunnel non-http protocols through http proxy]' \
  {-U,--proxy-user}'[specify the user name and password to use for proxy authentication]:user:password' \
  '--proxy-anyauth[use any authentication method for proxy, default to most secure]' \
  '--proxy-basic[use HTTP Basic authentication for proxy]' \
  '--proxy-digest[use http digest authentication for proxy]' \
  '--proxy-negotiate[enable GSS-Negotiate authentication for proxy]' \
  '--proxy-ntlm[enable ntlm authentication for proxy]' \
  '--proxy1.0[use http 1.0 proxy]:proxy url' \
  {-x,--proxy}'[use specified proxy]:proxy url' \
  '--socks5-gssapi-service[change service name for socks server]:servicename' \
  '--socks5-gssapi-nec[allow unprotected exchange of protection mode negotiation]' \
  )

# Crypto arguments
arg_crypto=(\
  {-1,--tlsv1}'[Forces curl to use TLS version 1 when negotiating with a remote TLS server.]' \
  {-2,--sslv2}'[Forces curl to use SSL version 2 when negotiating with a remote SSL server.]' \
  {-3,--sslv3}'[Forces curl to use SSL version 3 when negotiating with a remote SSL server.]' \
  '--ciphers[specifies which cipher to use for the ssl connection]:list of ciphers' \
  '--crlfile[specify file with revoked certificates]:file' \
  '--delegation[set delegation policy to use with GSS/kerberos]:delegation policy:(none policy always)' \
  {-E,--cert}'[use specified client certificate]:certificate file:_files' \
  '--engine[use selected OpenSSL crypto engine]:ssl crypto engine:{_curl_crypto_engine}' \
  '--egd-file[set ssl entropy gathering daemon socket]:entropy socket:_files' \
  '--cert-type[specify certificate type (PEM, DER, ENG)]:certificate type:(PEM DER ENG)' \
  '--cacert[specify certificate file to verify the peer with]:CA certificate:_files' \
  '--capath[specify a search path for certificate files]:CA certificate directory:_directories' \
  '--hostpubmd5[check remote hosts public key]:md5 hash' \
  {-k,--insecure}'[allow ssl to perform insecure ssl connections (ie, ignore certificate)]' \
  '--key[ssl/ssh private key file name]:key file:_files' \
  '--key-type[ssl/ssh private key file type]:file type:(PEM DER ENG)' \
  '--pubkey[ssh public key file]:pubkey file:_files' \
  '--random-file[set source of random data for ssl]:random source:_files' \
  '--no-sessionid[disable caching of ssl session ids]' \
  '--pass:phrase[passphrase for ssl/ssh private key]' \
  '--ssl[try to use ssl/tls for connection, if available]' \
  '--ssl-reqd[try to use ssl/tls for connection, fail if unavailable]' \
  '--tlsauthtype[set TLS authentication type (only SRP supported!)]:authtype' \
  '--tlsuser[set username for TLS authentication]:user' \
  '--tlspassword[set password for TLS authentication]:password' \
  )

# Connection arguments
arg_connection=(\
  {-4,--ipv4}'[prefer ipv4]' \
  {-6,--ipv6}'[prefer ipv6, if available]' \
  {-B,--use-ascii}'[use ascii mode]' \
  '--compressed[request a compressed transfer]' \
  '--connect-timeout[timeout for connection phase]:seconds' \
  {-I,--head}'[fetch http HEAD only (HTTP/FTP/FILE]' \
  '--interface[work on a specific interface]:name' \
  '--keepalive-time[set time to wait before sending keepalive probes]:seconds' \
  '--limit-rate[specify maximum transfer rate]:speed' \
  '--local-port[set preferred number or range of local ports to use]:num' \
  {-N,--no-buffer}'[disable buffering of the output stream]' \
  '--no-keepalive[disable use of keepalive messages in TCP connections]' \
  '--raw[disable all http decoding and pass raw data]' \
  '--resolve[provide a custom address for a specific host and port pair]:host\:port\:address' \
  '--retry[specify maximum number of retries for transient errors]:num' \
  '--retry-delay[specify delay between retries]:seconds' \
  '--retry-max-time[maximum time to spend on retries]:seconds' \
  '--tcp-nodelay[turn on TCP_NODELAY option]' \
  {-y,--speed-time}'[specify time to abort after if download is slower than speed-limit]:time' \
  {-Y,--speed-limit}'[specify minimum speed for --speed-time]:speed' \
  )

# Authentication arguments
arg_auth=(\
  '--anyauth[use any authentication method, default to most secure]' \
  '--basic[use HTTP Basic authentication]' \
  '--ntlm[enable ntlm authentication]' \
  '--digest[use http digest authentication]' \
  '--krb[use kerberos authentication]:auth:(clear safe confidential private)' \
  '--negotiate[enable GSS-Negotiate authentication]' \
  {-n,--netrc}'[scan ~/.netrc for login data]' \
  '--netrc-optional[like --netrc, but does not make .netrc usage mandatory]' \
  '--netrc-file[like --netrc, but specify file to use]:netrc file:_files' \
  '--tr-encoding[request compressed transfer-encoding]' \
  {-u,--user}'[specify user name and password for server authentication]:user\:password' \
  )

# Input arguments
arg_input=(\
  {-C,--continue-at}'[resume at offset ]:offset' \
  {-g,--globoff}'[do not glob {}\[\] letters]' \
  '--max-filesize[maximum filesize to download, fail for bigger files]:bytes' \
  '--proto[specify allowed protocols for transfer]:protocols' \
  '--proto-redir[specify allowed protocols for transfer after a redirect]:protocols' \
  {-r,--range}'[set range of bytes to request (HTTP/FTP/SFTP/FILE)]:range' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  {-T,--upload-file}'[transfer file to remote url (using PUT for HTTP)]:file to upload:_files' \
  '--url[specify a URL to fetch (multi)]:url:_urls' \
  {-z,--time-cond}'[request downloaded file to be newer than date or given reference file]:date expression' \
  )

# Output arguments
arg_output=(\
  '--create-dirs[create local directory hierarchy as needed]' \
  {-D,--dump-header}'[write protocol headers to file]:dump file:_files' \
  {-o,--output}'[write to specified file instead of stdout]:output file:_files' \
  {--progress-bar,-\#}'[display progress as a simple progress bar]' \
  {-\#,--progress-bar}'[Make curl display progress as a simple progress bar instead of the standard, more informational, meter.]' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  '--raw[disable all http decoding and pass raw data]' \
  {-s,--silent}'[silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[show errors in silent mode]' \
  '--stderr[redirect stderr to specified file]:output file:_files' \
  '--trace[enable full trace dump of all incoming and outgoing data]:trace file:_files' \
  '--trace-ascii[enable full trace dump of all incoming and outgoing data, without hex data]:trace file:_files' \
  '--trace-time[prepends a time stamp to each trace or verbose line that curl displays]' \
  {-v,--verbose}'[output debug info]' \
  {-w,--write-out}'[specify message to output on successful operation]:format string' \
  '--xattr[store some file metadata in extended file attributes]' \
  {-X,--request}'[specifies request method for HTTP server]:method:(GET POST PUT DELETE HEAD OPTIONS TRACE CONNECT PATCH LINK UNLINK)' \
  )

_arguments -C -s $arg_http $arg_ftp $arg_other $arg_crypto $arg_connection $arg_auth $arg_input $arg_output \
  {-M,--manual}'[Print manual]' \
  '*'{-K,--config}'[Use other config file to read arguments from]:config file:_files' \
  '--libcurl[output libcurl code for the operation to file]:output file:_files' \
  {-m,--max-time}'[Limit total time of operation]:seconds' \
  {-s,--silent}'[Silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[Show errors in silent mode]' \
  '--stderr[Redirect stderr to specified file]:output file:_files' \
  '-q[Do not read settings from .curlrc (must be first option)]' \
  {-h,--help}'[Print help and list of operations]' \
  {-V,--version}'[Print service API version]' \
  '--about[Print the information about service]' \
  '--host[Specify the host URL]':URL:_urls \
  '--dry-run[Print out the cURL command without executing it]' \
  {-ac,--accept}'[Set the Accept header in the request]: :{_values "Accept mime type" $(get_mime_type_completions)}' \
  {-ct,--content-type}'[Set the Content-type header in request]: :{_values "Content mime type" $(get_mime_type_completions)}' \
  '1: :->ops' \
  '*:: :->args' \
  && ret=0


case $state in
  ops)
    # Operations
    _values "Operations" \
            "getAllAssetCurrentLocations[/fleet/assets/locations]" \
            "getAllAssets[/fleet/assets]" \
            "getAssetLocation[/fleet/assets/{assetId:[0-9]+}/locations]" \
            "getAssetReefer[/fleet/assets/{assetId:[0-9]+}/reefer]"             "createDriver[/fleet/drivers/create]" \
            "deactivateDriver[/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}]" \
            "getAllDeactivatedDrivers[/fleet/drivers/inactive]" \
            "getDeactivatedDriverById[/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}]" \
            "getDriverById[/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}]" \
            "reactivateDriverById[/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}]"             "addFleetAddress[/fleet/add_address]" \
            "addOrganizationAddresses[/addresses]" \
            "createDispatchRoute[/fleet/dispatch/routes]" \
            "createDriver[/fleet/drivers/create]" \
            "createDriverDispatchRoute[/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes]" \
            "createDriverDocument[/fleet/drivers/{driver_id:[0-9]+}/documents]" \
            "createDvir[/fleet/maintenance/dvirs]" \
            "createVehicleDispatchRoute[/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes]" \
            "deactivateDriver[/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}]" \
            "deleteDispatchRouteById[/fleet/dispatch/routes/{route_id:[0-9]+}/]" \
            "deleteOrganizationAddress[/addresses/{addressId}]" \
            "fetchAllDispatchRoutes[/fleet/dispatch/routes]" \
            "fetchAllRouteJobUpdates[/fleet/dispatch/routes/job_updates]" \
            "getAllAssetCurrentLocations[/fleet/assets/locations]" \
            "getAllAssets[/fleet/assets]" \
            "getAllDeactivatedDrivers[/fleet/drivers/inactive]" \
            "getAssetLocation[/fleet/assets/{assetId:[0-9]+}/locations]" \
            "getAssetReefer[/fleet/assets/{assetId:[0-9]+}/reefer]" \
            "getDeactivatedDriverById[/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}]" \
            "getDispatchRouteById[/fleet/dispatch/routes/{route_id:[0-9]+}]" \
            "getDispatchRouteHistory[/fleet/dispatch/routes/{route_id:[0-9]+}/history]" \
            "getDispatchRoutesByDriverId[/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes]" \
            "getDispatchRoutesByVehicleId[/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes]" \
            "getDriverById[/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}]" \
            "getDriverDocumentTypesByOrgId[/fleet/drivers/document_types]" \
            "getDriverDocumentsByOrgId[/fleet/drivers/documents]" \
            "getDriverSafetyScore[/fleet/drivers/{driverId:[0-9]+}/safety/score]" \
            "getDvirs[/fleet/maintenance/dvirs]" \
            "getFleetDrivers[/fleet/drivers]" \
            "getFleetDriversHosDailyLogs[/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs]" \
            "getFleetDriversSummary[/fleet/drivers/summary]" \
            "getFleetHosAuthenticationLogs[/fleet/hos_authentication_logs]" \
            "getFleetHosLogs[/fleet/hos_logs]" \
            "getFleetHosLogsSummary[/fleet/hos_logs_summary]" \
            "getFleetLocations[/fleet/locations]" \
            "getFleetMaintenanceList[/fleet/maintenance/list]" \
            "getFleetTrips[/fleet/trips]" \
            "getFleetVehicle[/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}]" \
            "getOrganizationAddress[/addresses/{addressId}]" \
            "getOrganizationAddresses[/addresses]" \
            "getOrganizationContact[/contacts/{contact_id}]" \
            "getVehicleHarshEvent[/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event]" \
            "getVehicleLocations[/fleet/vehicles/{vehicle_id:[0-9]+}/locations]" \
            "getVehicleSafetyScore[/fleet/vehicles/{vehicleId:[0-9]+}/safety/score]" \
            "getVehicleStats[/fleet/vehicles/stats]" \
            "getVehiclesLocations[/fleet/vehicles/locations]" \
            "listContacts[/contacts]" \
            "listFleet[/fleet/list]" \
            "patchFleetVehicle[/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}]" \
            "reactivateDriverById[/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}]" \
            "updateDispatchRouteById[/fleet/dispatch/routes/{route_id:[0-9]+}/]" \
            "updateOrganizationAddress[/addresses/{addressId}]" \
            "updateVehicles[/fleet/set_data]"             "getAllDataInputs[/industrial/data]" \
            "getDataInput[/industrial/data/{data_input_id:[0-9]+}]" \
            "getMachines[/machines/list]" \
            "getMachinesHistory[/machines/history]"             "createDispatchRoute[/fleet/dispatch/routes]" \
            "createDriverDispatchRoute[/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes]" \
            "createVehicleDispatchRoute[/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes]" \
            "deleteDispatchRouteById[/fleet/dispatch/routes/{route_id:[0-9]+}/]" \
            "fetchAllDispatchRoutes[/fleet/dispatch/routes]" \
            "fetchAllRouteJobUpdates[/fleet/dispatch/routes/job_updates]" \
            "getDispatchRouteById[/fleet/dispatch/routes/{route_id:[0-9]+}]" \
            "getDispatchRouteHistory[/fleet/dispatch/routes/{route_id:[0-9]+}/history]" \
            "getDispatchRoutesByDriverId[/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes]" \
            "getDispatchRoutesByVehicleId[/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes]" \
            "updateDispatchRouteById[/fleet/dispatch/routes/{route_id:[0-9]+}/]"             "getDriverSafetyScore[/fleet/drivers/{driverId:[0-9]+}/safety/score]" \
            "getVehicleHarshEvent[/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event]" \
            "getVehicleSafetyScore[/fleet/vehicles/{vehicleId:[0-9]+}/safety/score]"             "getSensors[/sensors/list]" \
            "getSensorsCargo[/sensors/cargo]" \
            "getSensorsDoor[/sensors/door]" \
            "getSensorsHistory[/sensors/history]" \
            "getSensorsHumidity[/sensors/humidity]" \
            "getSensorsTemperature[/sensors/temperature]"             "createTag[/tags]" \
            "deleteTagById[/tags/{tag_id:[0-9]+}]" \
            "getAllTags[/tags]" \
            "getTagById[/tags/{tag_id:[0-9]+}]" \
            "modifyTagById[/tags/{tag_id:[0-9]+}]" \
            "updateTagById[/tags/{tag_id:[0-9]+}]"             "deleteUserById[/users/{userId:[0-9]+}]" \
            "getUserById[/users/{userId:[0-9]+}]" \
            "listUserRoles[/user_roles]" \
            "listUsers[/users]" 
    _arguments "(--help)--help[Print information about operation]"

    ret=0
    ;;
  args)
    case $line[1] in
      getAllAssetCurrentLocations)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllAssets)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAssetLocation)
        local -a _op_arguments
        _op_arguments=(
          "asset_id=:[PATH] ID of the asset"
          "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs."
"endMs=:[QUERY] Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAssetReefer)
        local -a _op_arguments
        _op_arguments=(
          "asset_id=:[PATH] ID of the asset"
          "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs."
"endMs=:[QUERY] Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createDriver)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deactivateDriver)
        local -a _op_arguments
        _op_arguments=(
          "driver_id_or_external_id=:[PATH] ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllDeactivatedDrivers)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDeactivatedDriverById)
        local -a _op_arguments
        _op_arguments=(
          "driver_id_or_external_id=:[PATH] ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDriverById)
        local -a _op_arguments
        _op_arguments=(
          "driver_id_or_external_id=:[PATH] ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reactivateDriverById)
        local -a _op_arguments
        _op_arguments=(
          "driver_id_or_external_id=:[PATH] ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addFleetAddress)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addOrganizationAddresses)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createDispatchRoute)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createDriver)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createDriverDispatchRoute)
        local -a _op_arguments
        _op_arguments=(
          "driver_id=:[PATH] ID of the driver with the associated routes."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createDriverDocument)
        local -a _op_arguments
        _op_arguments=(
          "driver_id=:[PATH] ID of the driver for whom the document is created."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createDvir)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createVehicleDispatchRoute)
        local -a _op_arguments
        _op_arguments=(
          "vehicle_id=:[PATH] ID of the vehicle with the associated routes."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deactivateDriver)
        local -a _op_arguments
        _op_arguments=(
          "driver_id_or_external_id=:[PATH] ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteDispatchRouteById)
        local -a _op_arguments
        _op_arguments=(
          "route_id=:[PATH] ID of the dispatch route."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteOrganizationAddress)
        local -a _op_arguments
        _op_arguments=(
          "addressId=:[PATH] ID of the address/geofence"
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      fetchAllDispatchRoutes)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
"end_time=:[QUERY] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now."
"duration=:[QUERY] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      fetchAllRouteJobUpdates)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
"sequence_id=:[QUERY] Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours."
"include=:[QUERY] Optionally set include&#x3D;route to include route object in response payload."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllAssetCurrentLocations)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllAssets)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllDeactivatedDrivers)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAssetLocation)
        local -a _op_arguments
        _op_arguments=(
          "asset_id=:[PATH] ID of the asset"
          "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs."
"endMs=:[QUERY] Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAssetReefer)
        local -a _op_arguments
        _op_arguments=(
          "asset_id=:[PATH] ID of the asset"
          "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs."
"endMs=:[QUERY] Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDeactivatedDriverById)
        local -a _op_arguments
        _op_arguments=(
          "driver_id_or_external_id=:[PATH] ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDispatchRouteById)
        local -a _op_arguments
        _op_arguments=(
          "route_id=:[PATH] ID of the dispatch route."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDispatchRouteHistory)
        local -a _op_arguments
        _op_arguments=(
          "route_id=:[PATH] ID of the route with history."
          "access_token=:[QUERY] Samsara API access token."
"start_time=:[QUERY] Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0."
"end_time=:[QUERY] Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDispatchRoutesByDriverId)
        local -a _op_arguments
        _op_arguments=(
          "driver_id=:[PATH] ID of the driver with the associated routes."
          "access_token=:[QUERY] Samsara API access token."
"end_time=:[QUERY] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now."
"duration=:[QUERY] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDispatchRoutesByVehicleId)
        local -a _op_arguments
        _op_arguments=(
          "vehicle_id=:[PATH] ID of the vehicle with the associated routes."
          "access_token=:[QUERY] Samsara API access token."
"end_time=:[QUERY] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now."
"duration=:[QUERY] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDriverById)
        local -a _op_arguments
        _op_arguments=(
          "driver_id_or_external_id=:[PATH] ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDriverDocumentTypesByOrgId)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDriverDocumentsByOrgId)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"endMs=:[QUERY] Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now."
"durationMs=:[QUERY] Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDriverSafetyScore)
        local -a _op_arguments
        _op_arguments=(
          "driverId=:[PATH] ID of the driver"
          "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs."
"endMs=:[QUERY] Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDvirs)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"end_ms=:[QUERY] time in millis until the last dvir log."
"duration_ms=:[QUERY] time in millis which corresponds to the duration before the end_ms."
"group_id=:[QUERY] Group ID to query."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFleetDrivers)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFleetDriversHosDailyLogs)
        local -a _op_arguments
        _op_arguments=(
          "driver_id=:[PATH] ID of the driver with HOS logs."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFleetDriversSummary)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"snap_to_day_bounds=true:[QUERY] Snap query result to HOS day boundaries."
          "snap_to_day_bounds=false:[QUERY] Snap query result to HOS day boundaries."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFleetHosAuthenticationLogs)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFleetHosLogs)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFleetHosLogsSummary)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFleetLocations)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFleetMaintenanceList)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFleetTrips)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getFleetVehicle)
        local -a _op_arguments
        _op_arguments=(
          "vehicle_id_or_external_id=:[PATH] ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrganizationAddress)
        local -a _op_arguments
        _op_arguments=(
          "addressId=:[PATH] ID of the address/geofence"
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrganizationAddresses)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getOrganizationContact)
        local -a _op_arguments
        _op_arguments=(
          "contact_id=:[PATH] ID of the contact"
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVehicleHarshEvent)
        local -a _op_arguments
        _op_arguments=(
          "vehicleId=:[PATH] ID of the vehicle"
          "access_token=:[QUERY] Samsara API access token."
"timestamp=:[QUERY] Timestamp in milliseconds representing the timestamp of a harsh event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVehicleLocations)
        local -a _op_arguments
        _op_arguments=(
          "vehicle_id=:[PATH] ID of the vehicle with the associated routes."
          "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)"
"endMs=:[QUERY] Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVehicleSafetyScore)
        local -a _op_arguments
        _op_arguments=(
          "vehicleId=:[PATH] ID of the vehicle"
          "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs."
"endMs=:[QUERY] Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVehicleStats)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Time in Unix epoch milliseconds for the start of the query."
"endMs=:[QUERY] Time in Unix epoch milliseconds for the end of the query."
"series=:[QUERY] Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2"
"tagIds=:[QUERY] Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3"
"startingAfter=:[QUERY] Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter."
"endingBefore=:[QUERY] Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter."
"limit=:[QUERY] Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVehiclesLocations)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)"
"endMs=:[QUERY] Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listContacts)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listFleet)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"startingAfter=:[QUERY] Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter."
"endingBefore=:[QUERY] Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter."
"limit=:[QUERY] Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      patchFleetVehicle)
        local -a _op_arguments
        _op_arguments=(
          "vehicle_id_or_external_id=:[PATH] ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reactivateDriverById)
        local -a _op_arguments
        _op_arguments=(
          "driver_id_or_external_id=:[PATH] ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateDispatchRouteById)
        local -a _op_arguments
        _op_arguments=(
          "route_id=:[PATH] ID of the dispatch route."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateOrganizationAddress)
        local -a _op_arguments
        _op_arguments=(
          "addressId=:[PATH] ID of the address/geofence"
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateVehicles)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllDataInputs)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
"startMs=:[QUERY] Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs."
"endMs=:[QUERY] Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDataInput)
        local -a _op_arguments
        _op_arguments=(
          "data_input_id=:[PATH] ID of the data input"
          "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs."
"endMs=:[QUERY] Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getMachines)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getMachinesHistory)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createDispatchRoute)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createDriverDispatchRoute)
        local -a _op_arguments
        _op_arguments=(
          "driver_id=:[PATH] ID of the driver with the associated routes."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createVehicleDispatchRoute)
        local -a _op_arguments
        _op_arguments=(
          "vehicle_id=:[PATH] ID of the vehicle with the associated routes."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteDispatchRouteById)
        local -a _op_arguments
        _op_arguments=(
          "route_id=:[PATH] ID of the dispatch route."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      fetchAllDispatchRoutes)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
"end_time=:[QUERY] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now."
"duration=:[QUERY] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      fetchAllRouteJobUpdates)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
"sequence_id=:[QUERY] Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours."
"include=:[QUERY] Optionally set include&#x3D;route to include route object in response payload."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDispatchRouteById)
        local -a _op_arguments
        _op_arguments=(
          "route_id=:[PATH] ID of the dispatch route."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDispatchRouteHistory)
        local -a _op_arguments
        _op_arguments=(
          "route_id=:[PATH] ID of the route with history."
          "access_token=:[QUERY] Samsara API access token."
"start_time=:[QUERY] Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0."
"end_time=:[QUERY] Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDispatchRoutesByDriverId)
        local -a _op_arguments
        _op_arguments=(
          "driver_id=:[PATH] ID of the driver with the associated routes."
          "access_token=:[QUERY] Samsara API access token."
"end_time=:[QUERY] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now."
"duration=:[QUERY] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDispatchRoutesByVehicleId)
        local -a _op_arguments
        _op_arguments=(
          "vehicle_id=:[PATH] ID of the vehicle with the associated routes."
          "access_token=:[QUERY] Samsara API access token."
"end_time=:[QUERY] Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now."
"duration=:[QUERY] Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateDispatchRouteById)
        local -a _op_arguments
        _op_arguments=(
          "route_id=:[PATH] ID of the dispatch route."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDriverSafetyScore)
        local -a _op_arguments
        _op_arguments=(
          "driverId=:[PATH] ID of the driver"
          "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs."
"endMs=:[QUERY] Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVehicleHarshEvent)
        local -a _op_arguments
        _op_arguments=(
          "vehicleId=:[PATH] ID of the vehicle"
          "access_token=:[QUERY] Samsara API access token."
"timestamp=:[QUERY] Timestamp in milliseconds representing the timestamp of a harsh event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVehicleSafetyScore)
        local -a _op_arguments
        _op_arguments=(
          "vehicleId=:[PATH] ID of the vehicle"
          "access_token=:[QUERY] Samsara API access token."
"startMs=:[QUERY] Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs."
"endMs=:[QUERY] Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSensors)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSensorsCargo)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSensorsDoor)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSensorsHistory)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSensorsHumidity)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSensorsTemperature)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createTag)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteTagById)
        local -a _op_arguments
        _op_arguments=(
          "tag_id=:[PATH] ID of the tag."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAllTags)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
"group_id=:[QUERY] Optional group ID if the organization has multiple groups (uncommon)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getTagById)
        local -a _op_arguments
        _op_arguments=(
          "tag_id=:[PATH] ID of the tag."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      modifyTagById)
        local -a _op_arguments
        _op_arguments=(
          "tag_id=:[PATH] ID of the tag."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateTagById)
        local -a _op_arguments
        _op_arguments=(
          "tag_id=:[PATH] ID of the tag."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteUserById)
        local -a _op_arguments
        _op_arguments=(
          "userId=:[PATH] ID of the user."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getUserById)
        local -a _op_arguments
        _op_arguments=(
          "userId=:[PATH] ID of the user."
          "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listUserRoles)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listUsers)
        local -a _op_arguments
        _op_arguments=(
                    "access_token=:[QUERY] Samsara API access token."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
    esac
    ;;

esac

return ret
