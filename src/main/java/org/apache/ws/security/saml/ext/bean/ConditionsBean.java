/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.ws.security.saml.ext.bean;

import org.joda.time.DateTime;


/**
 * Class ConditionsBean represents a SAML Conditions object (can be used to create
 * both SAML v1.1 and v2.0 statements)
 *
 * Created on May 20, 2009
 */
public class ConditionsBean {
    private DateTime notBefore;
    private DateTime notAfter;
    private int tokenPeriodMinutes;

    /**
     * Constructor ConditionsBean creates a new ConditionsBean instance.
     */
    public ConditionsBean() {
    }

    /**
     * Constructor ConditionsBean creates a new ConditionsBean instance.
     *
     * @param notBefore The notBefore instance
     * @param notAfter The notAfter instance
     */
    public ConditionsBean(
        DateTime notBefore, 
        DateTime notAfter
    ) {
        this.notBefore = notBefore;
        this.notAfter = notAfter;
    }
    
    /**
     * Constructor ConditionsBean creates a new ConditionsBean instance.
     *
     * @param tokenPeriodMinutes how long the token is valid for in minutes
     */
    public ConditionsBean(
        int tokenPeriodMinutes
    ) {
        this.tokenPeriodMinutes = tokenPeriodMinutes;
    }
    
    /**
     * Get the notBefore instance
     *
     * @return the notBefore instance
     */
    public DateTime getNotBefore() {
        return notBefore;
    }

    /**
     * Set the notBefore instance
     *
     * @param notBefore the notBefore instance to set
     */
    public void setNotBefore(DateTime notBefore) {
        this.notBefore = notBefore;
    }
    
    /**
     * Get the notAfter instance
     *
     * @return the notAfter instance
     */
    public DateTime getNotAfter() {
        return notAfter;
    }

    /**
     * Set the notAfter instance
     *
     * @param notAfter the notAfter instance to set
     */
    public void setNotAfter(DateTime notAfter) {
        this.notAfter = notAfter;
    }
    
    /**
     * Get the tokenPeriodMinutes of this object.
     *
     * @return the tokenPeriodMinutes (type int)
     */
    public int getTokenPeriodMinutes() {
        return tokenPeriodMinutes;
    }

    /**
     * Set the tokenPeriodMinutes.
     *
     * @param tokenPeriodMinutes the tokenPeriodMinutes to set
     */
    public void setTokenPeriodMinutes(int tokenPeriodMinutes) {
        this.tokenPeriodMinutes = tokenPeriodMinutes;
    }

    /**
     * Method equals ...
     *
     * @param o of type Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConditionsBean)) return false;

        ConditionsBean that = (ConditionsBean) o;

        if (tokenPeriodMinutes != that.tokenPeriodMinutes) return false;
        if (!notBefore.equals(that.notBefore)) return false;
        if (!notAfter.equals(that.notAfter)) return false; 

        return true;
    }

    /**
     * Method hashCode ...
     * @return int
     */
    @Override
    public int hashCode() {
        int result = tokenPeriodMinutes;
        result = 31 * result + notBefore.hashCode();
        result = 31 * result + notAfter.hashCode();
        return result;
    }
}