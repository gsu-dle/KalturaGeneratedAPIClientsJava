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
import com.kaltura.client.KalturaObjectBase;
import com.kaltura.client.enums.KalturaUploadTokenStatus;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Mon, 10 Aug 15 02:02:11 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaUploadToken extends KalturaObjectBase {
	/**  Upload token unique ID     */
    public String id;
	/**  Partner ID of the upload token     */
    public int partnerId = Integer.MIN_VALUE;
	/**  User id for the upload token     */
    public String userId;
	/**  Status of the upload token     */
    public KalturaUploadTokenStatus status;
	/**  Name of the file for the upload token, can be empty when the upload token is
	  created and will be updated internally after the file is uploaded     */
    public String fileName;
	/**  File size in bytes, can be empty when the upload token is created and will be
	  updated internally after the file is uploaded     */
    public double fileSize = Double.MIN_VALUE;
	/**  Uploaded file size in bytes, can be used to identify how many bytes were
	  uploaded before resuming     */
    public double uploadedFileSize = Double.MIN_VALUE;
	/**  Creation date as Unix timestamp (In seconds)     */
    public int createdAt = Integer.MIN_VALUE;
	/**  Last update date as Unix timestamp (In seconds)     */
    public int updatedAt = Integer.MIN_VALUE;

    public KalturaUploadToken() {
    }

    public KalturaUploadToken(Element node) throws KalturaApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("userId")) {
                this.userId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("status")) {
                this.status = KalturaUploadTokenStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("fileName")) {
                this.fileName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileSize")) {
                this.fileSize = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("uploadedFileSize")) {
                this.uploadedFileSize = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaUploadToken");
        kparams.add("fileName", this.fileName);
        kparams.add("fileSize", this.fileSize);
        return kparams;
    }

}

