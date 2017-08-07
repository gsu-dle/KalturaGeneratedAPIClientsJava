// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2017  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.HttpNotificationAuthenticationMethod;
import com.kaltura.client.enums.HttpNotificationCertificateType;
import com.kaltura.client.enums.HttpNotificationMethod;
import com.kaltura.client.enums.HttpNotificationSslKeyType;
import com.kaltura.client.enums.HttpNotificationSslVersion;
import com.kaltura.client.utils.GsonParser;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class HttpNotificationDispatchJobData extends EventNotificationDispatchJobData {

	/**  Remote server URL  */
    private String url;
	/**  Request method.  */
    private HttpNotificationMethod method;
	/**  Data to send.  */
    private String data;
	/**  The maximum number of seconds to allow cURL functions to execute.  */
    private Integer timeout;
	/**  The number of seconds to wait while trying to connect.   Must be larger than
	  zero.  */
    private Integer connectTimeout;
	/**  A username to use for the connection.  */
    private String username;
	/**  A password to use for the connection.  */
    private String password;
	/**  The HTTP authentication method to use.  */
    private HttpNotificationAuthenticationMethod authenticationMethod;
	/**  The SSL version (2 or 3) to use.   By default PHP will try to determine this
	  itself, although in some cases this must be set manually.  */
    private HttpNotificationSslVersion sslVersion;
	/**  SSL certificate to verify the peer with.  */
    private String sslCertificate;
	/**  The format of the certificate.  */
    private HttpNotificationCertificateType sslCertificateType;
	/**  The password required to use the certificate.  */
    private String sslCertificatePassword;
	/**  The identifier for the crypto engine of the private SSL key specified in ssl
	  key.  */
    private String sslEngine;
	/**  The identifier for the crypto engine used for asymmetric crypto operations.  */
    private String sslEngineDefault;
	/**  The key type of the private SSL key specified in ssl key - PEM / DER / ENG.  */
    private HttpNotificationSslKeyType sslKeyType;
	/**  Private SSL key.  */
    private String sslKey;
	/**  The secret password needed to use the private SSL key specified in ssl key.  */
    private String sslKeyPassword;
	/**  Adds a e-mail custom header  */
    private List<KeyValue> customHeaders;
	/**  The secret to sign the notification with  */
    private String signSecret;

    // url:
    public String getUrl(){
        return this.url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    // method:
    public HttpNotificationMethod getMethod(){
        return this.method;
    }
    public void setMethod(HttpNotificationMethod method){
        this.method = method;
    }

    // data:
    public String getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }

    // timeout:
    public Integer getTimeout(){
        return this.timeout;
    }
    public void setTimeout(Integer timeout){
        this.timeout = timeout;
    }

    // connectTimeout:
    public Integer getConnectTimeout(){
        return this.connectTimeout;
    }
    public void setConnectTimeout(Integer connectTimeout){
        this.connectTimeout = connectTimeout;
    }

    // username:
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    // password:
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    // authenticationMethod:
    public HttpNotificationAuthenticationMethod getAuthenticationMethod(){
        return this.authenticationMethod;
    }
    public void setAuthenticationMethod(HttpNotificationAuthenticationMethod authenticationMethod){
        this.authenticationMethod = authenticationMethod;
    }

    // sslVersion:
    public HttpNotificationSslVersion getSslVersion(){
        return this.sslVersion;
    }
    public void setSslVersion(HttpNotificationSslVersion sslVersion){
        this.sslVersion = sslVersion;
    }

    // sslCertificate:
    public String getSslCertificate(){
        return this.sslCertificate;
    }
    public void setSslCertificate(String sslCertificate){
        this.sslCertificate = sslCertificate;
    }

    // sslCertificateType:
    public HttpNotificationCertificateType getSslCertificateType(){
        return this.sslCertificateType;
    }
    public void setSslCertificateType(HttpNotificationCertificateType sslCertificateType){
        this.sslCertificateType = sslCertificateType;
    }

    // sslCertificatePassword:
    public String getSslCertificatePassword(){
        return this.sslCertificatePassword;
    }
    public void setSslCertificatePassword(String sslCertificatePassword){
        this.sslCertificatePassword = sslCertificatePassword;
    }

    // sslEngine:
    public String getSslEngine(){
        return this.sslEngine;
    }
    public void setSslEngine(String sslEngine){
        this.sslEngine = sslEngine;
    }

    // sslEngineDefault:
    public String getSslEngineDefault(){
        return this.sslEngineDefault;
    }
    public void setSslEngineDefault(String sslEngineDefault){
        this.sslEngineDefault = sslEngineDefault;
    }

    // sslKeyType:
    public HttpNotificationSslKeyType getSslKeyType(){
        return this.sslKeyType;
    }
    public void setSslKeyType(HttpNotificationSslKeyType sslKeyType){
        this.sslKeyType = sslKeyType;
    }

    // sslKey:
    public String getSslKey(){
        return this.sslKey;
    }
    public void setSslKey(String sslKey){
        this.sslKey = sslKey;
    }

    // sslKeyPassword:
    public String getSslKeyPassword(){
        return this.sslKeyPassword;
    }
    public void setSslKeyPassword(String sslKeyPassword){
        this.sslKeyPassword = sslKeyPassword;
    }

    // customHeaders:
    public List<KeyValue> getCustomHeaders(){
        return this.customHeaders;
    }
    public void setCustomHeaders(List<KeyValue> customHeaders){
        this.customHeaders = customHeaders;
    }

    // signSecret:
    public String getSignSecret(){
        return this.signSecret;
    }
    public void setSignSecret(String signSecret){
        this.signSecret = signSecret;
    }


    public HttpNotificationDispatchJobData() {
       super();
    }

    public HttpNotificationDispatchJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        url = GsonParser.parseString(jsonObject.get("url"));
        method = HttpNotificationMethod.get(GsonParser.parseInt(jsonObject.get("method")));
        data = GsonParser.parseString(jsonObject.get("data"));
        timeout = GsonParser.parseInt(jsonObject.get("timeout"));
        connectTimeout = GsonParser.parseInt(jsonObject.get("connectTimeout"));
        username = GsonParser.parseString(jsonObject.get("username"));
        password = GsonParser.parseString(jsonObject.get("password"));
        authenticationMethod = HttpNotificationAuthenticationMethod.get(GsonParser.parseInt(jsonObject.get("authenticationMethod")));
        sslVersion = HttpNotificationSslVersion.get(GsonParser.parseInt(jsonObject.get("sslVersion")));
        sslCertificate = GsonParser.parseString(jsonObject.get("sslCertificate"));
        sslCertificateType = HttpNotificationCertificateType.get(GsonParser.parseString(jsonObject.get("sslCertificateType")));
        sslCertificatePassword = GsonParser.parseString(jsonObject.get("sslCertificatePassword"));
        sslEngine = GsonParser.parseString(jsonObject.get("sslEngine"));
        sslEngineDefault = GsonParser.parseString(jsonObject.get("sslEngineDefault"));
        sslKeyType = HttpNotificationSslKeyType.get(GsonParser.parseString(jsonObject.get("sslKeyType")));
        sslKey = GsonParser.parseString(jsonObject.get("sslKey"));
        sslKeyPassword = GsonParser.parseString(jsonObject.get("sslKeyPassword"));
        customHeaders = GsonParser.parseArray(jsonObject.getAsJsonArray("customHeaders"), KeyValue.class);
        signSecret = GsonParser.parseString(jsonObject.get("signSecret"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaHttpNotificationDispatchJobData");
        kparams.add("url", this.url);
        kparams.add("method", this.method);
        kparams.add("data", this.data);
        kparams.add("timeout", this.timeout);
        kparams.add("connectTimeout", this.connectTimeout);
        kparams.add("username", this.username);
        kparams.add("password", this.password);
        kparams.add("authenticationMethod", this.authenticationMethod);
        kparams.add("sslVersion", this.sslVersion);
        kparams.add("sslCertificate", this.sslCertificate);
        kparams.add("sslCertificateType", this.sslCertificateType);
        kparams.add("sslCertificatePassword", this.sslCertificatePassword);
        kparams.add("sslEngine", this.sslEngine);
        kparams.add("sslEngineDefault", this.sslEngineDefault);
        kparams.add("sslKeyType", this.sslKeyType);
        kparams.add("sslKey", this.sslKey);
        kparams.add("sslKeyPassword", this.sslKeyPassword);
        kparams.add("customHeaders", this.customHeaders);
        kparams.add("signSecret", this.signSecret);
        return kparams;
    }

}

