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

package org.apache.wss4j.common.saml.bean;

import org.apache.wss4j.common.saml.builder.SAML1Constants;

/**
 * Class NameIDBean represents a SAML NameID (can be used to create both SAML v1.1 and v2.0 statements)
 */
public class NameIDBean {
    private String nameValue;
    private String nameIDFormat = SAML1Constants.NAMEID_FORMAT_UNSPECIFIED;
    private String nameQualifier;

    /**
     * Constructor NameIDBean creates a new NameIDBean instance.
     */
    public NameIDBean() {
    }

    /**
     * Constructor NameIDBean creates a new NameIDBean instance.
     *
     * @param nameValue of type String
     * @param nameQualifier of type String
     */
    public NameIDBean(
        String nameValue, 
        String nameQualifier,
        String nameIDFormat
    ) {
        this.setNameValue(nameValue);
        this.setNameQualifier(nameQualifier);
        this.setNameIDFormat(nameIDFormat);
    }
    
    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public String getNameIDFormat() {
        return nameIDFormat;
    }

    public void setNameIDFormat(String nameIDFormat) {
        this.nameIDFormat = nameIDFormat;
    }

    public String getNameQualifier() {
        return nameQualifier;
    }

    public void setNameQualifier(String nameQualifier) {
        this.nameQualifier = nameQualifier;
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
        if (!(o instanceof NameIDBean)) return false;

        NameIDBean that = (NameIDBean) o;

        if (nameValue == null && that.nameValue != null) {
            return false;
        } else if (nameValue != null && !nameValue.equals(that.nameValue)) {
            return false;
        }
        
        if (nameIDFormat == null && that.nameIDFormat != null) {
            return false;
        } else if (nameIDFormat != null && !nameIDFormat.equals(that.nameIDFormat)) {
            return false;
        }
        
        if (nameQualifier == null && that.nameQualifier != null) {
            return false;
        } else if (nameQualifier != null && !nameQualifier.equals(that.nameQualifier)) {
            return false;
        }
        
        return true;
    }

    /**
     * @return the hashcode of this object
     */
    @Override
    public int hashCode() {
        int result = 0;
        if (nameValue != null) {
            result = nameValue.hashCode();
        }
        if (nameIDFormat != null) {
            result = 31 * result + nameIDFormat.hashCode();
        }
        if (nameQualifier != null) {
            result = 31 * result + nameQualifier.hashCode();
        }
        return result;
    }

}