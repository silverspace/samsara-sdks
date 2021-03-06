/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.samsara.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PhotoValue 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 101831427240903209L;
    private String url;
    /** GETTER
     * Photo URL for a JPG image
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * Photo URL for a JPG image
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
        notifyObservers(this.url);
    }
 
}
