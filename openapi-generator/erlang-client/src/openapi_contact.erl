-module(openapi_contact).

-export([encode/1]).

-export_type([openapi_contact/0]).

-type openapi_contact() ::
    #{ 'email' => binary(),
       'firstName' => binary(),
       'id' => integer(),
       'lastName' => binary(),
       'phone' => binary()
     }.

encode(#{ 'email' := Email,
          'firstName' := FirstName,
          'id' := Id,
          'lastName' := LastName,
          'phone' := Phone
        }) ->
    #{ 'email' => Email,
       'firstName' => FirstName,
       'id' => Id,
       'lastName' => LastName,
       'phone' => Phone
     }.
