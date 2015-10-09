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
import com.kaltura.client.enums.KalturaNullableBoolean;
import java.util.ArrayList;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Fri, 09 Oct 15 12:28:09 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaAnswerCuePoint extends KalturaCuePoint {
    public String parentId;
    public String quizUserEntryId;
    public String answerKey;
    public KalturaNullableBoolean isCorrect;
	/**  Array of string     */
    public ArrayList<KalturaString> correctAnswerKeys;
    public String explanation;

    public KalturaAnswerCuePoint() {
    }

    public KalturaAnswerCuePoint(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("parentId")) {
                this.parentId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("quizUserEntryId")) {
                this.quizUserEntryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("answerKey")) {
                this.answerKey = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("isCorrect")) {
                this.isCorrect = KalturaNullableBoolean.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("correctAnswerKeys")) {
                this.correctAnswerKeys = ParseUtils.parseArray(KalturaString.class, aNode);
                continue;
            } else if (nodeName.equals("explanation")) {
                this.explanation = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() throws KalturaApiException {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaAnswerCuePoint");
        kparams.add("parentId", this.parentId);
        kparams.add("quizUserEntryId", this.quizUserEntryId);
        kparams.add("answerKey", this.answerKey);
        return kparams;
    }

}

