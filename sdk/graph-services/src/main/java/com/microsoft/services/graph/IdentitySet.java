/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;




/**
 * The type Identity Set.
*/
public class IdentitySet extends ODataBaseEntity {

    public IdentitySet(){
        setODataType("#microsoft.graph.identitySet");
    }

    private Identity application;

    /**
    * Gets the application.
    *
    * @return the Identity
    */
    public Identity getApplication() {
        return this.application; 
    }

    /**
    * Sets the application.
    *
    * @param value the Identity
    */
    public void setApplication(Identity value) { 
        this.application = value;
        valueChanged("application", value);

    }

    private Identity device;

    /**
    * Gets the device.
    *
    * @return the Identity
    */
    public Identity getDevice() {
        return this.device; 
    }

    /**
    * Sets the device.
    *
    * @param value the Identity
    */
    public void setDevice(Identity value) { 
        this.device = value;
        valueChanged("device", value);

    }

    private Identity user;

    /**
    * Gets the user.
    *
    * @return the Identity
    */
    public Identity getUser() {
        return this.user; 
    }

    /**
    * Sets the user.
    *
    * @param value the Identity
    */
    public void setUser(Identity value) { 
        this.user = value;
        valueChanged("user", value);

    }
}
