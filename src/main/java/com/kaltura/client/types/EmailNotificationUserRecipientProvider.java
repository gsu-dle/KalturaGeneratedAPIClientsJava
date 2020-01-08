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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.types.UserFilter;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * API class for recipient provider which constructs a dynamic list of recipients
  according to a user filter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EmailNotificationUserRecipientProvider.Tokenizer.class)
public class EmailNotificationUserRecipientProvider extends EmailNotificationRecipientProvider {
	
	public interface Tokenizer extends EmailNotificationRecipientProvider.Tokenizer {
		UserFilter.Tokenizer filter();
	}

	private UserFilter filter;

	// filter:
	public UserFilter getFilter(){
		return this.filter;
	}
	public void setFilter(UserFilter filter){
		this.filter = filter;
	}


	public EmailNotificationUserRecipientProvider() {
		super();
	}

	public EmailNotificationUserRecipientProvider(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		filter = GsonParser.parseObject(jsonObject.getAsJsonObject("filter"), UserFilter.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEmailNotificationUserRecipientProvider");
		kparams.add("filter", this.filter);
		return kparams;
	}

}

