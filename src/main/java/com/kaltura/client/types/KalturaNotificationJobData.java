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
// Copyright (C) 2006-2015  Kaltura Inc.
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

import org.w3c.dom.Element;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.enums.KalturaNotificationType;
import com.kaltura.client.enums.KalturaNotificationStatus;
import com.kaltura.client.enums.KalturaNotificationObjectType;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Tue, 01 Sep 15 01:39:59 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaNotificationJobData extends KalturaJobData {
    public String userId;
    public KalturaNotificationType type;
    public String typeAsString;
    public String objectId;
    public KalturaNotificationStatus status;
    public String data;
    public int numberOfAttempts = Integer.MIN_VALUE;
    public String notificationResult;
    public KalturaNotificationObjectType objType;

    public KalturaNotificationJobData() {
    }

    public KalturaNotificationJobData(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("userId")) {
                this.userId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("type")) {
                this.type = KalturaNotificationType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("typeAsString")) {
                this.typeAsString = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("objectId")) {
                this.objectId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("status")) {
                this.status = KalturaNotificationStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("data")) {
                this.data = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("numberOfAttempts")) {
                this.numberOfAttempts = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("notificationResult")) {
                this.notificationResult = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("objType")) {
                this.objType = KalturaNotificationObjectType.get(ParseUtils.parseInt(txt));
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaNotificationJobData");
        kparams.add("userId", this.userId);
        kparams.add("type", this.type);
        kparams.add("typeAsString", this.typeAsString);
        kparams.add("objectId", this.objectId);
        kparams.add("status", this.status);
        kparams.add("data", this.data);
        kparams.add("numberOfAttempts", this.numberOfAttempts);
        kparams.add("notificationResult", this.notificationResult);
        kparams.add("objType", this.objType);
        return kparams;
    }

}

