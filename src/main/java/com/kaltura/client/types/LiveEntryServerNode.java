// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2023  Kaltura Inc.
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
import com.kaltura.client.enums.ViewMode;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveEntryServerNode.Tokenizer.class)
public class LiveEntryServerNode extends EntryServerNode {
	
	public interface Tokenizer extends EntryServerNode.Tokenizer {
		RequestBuilder.ListTokenizer<LiveStreamParams.Tokenizer> streams();
		RequestBuilder.ListTokenizer<LiveEntryServerNodeRecordingInfo.Tokenizer> recordingInfo();
		String isPlayableUser();
		String viewMode();
		String featuresUpdatedAt();
	}

	/**
	 * parameters of the stream we got
	 */
	private List<LiveStreamParams> streams;
	private List<LiveEntryServerNodeRecordingInfo> recordingInfo;
	private Boolean isPlayableUser;
	private ViewMode viewMode;
	private Integer featuresUpdatedAt;

	// streams:
	public List<LiveStreamParams> getStreams(){
		return this.streams;
	}
	public void setStreams(List<LiveStreamParams> streams){
		this.streams = streams;
	}

	// recordingInfo:
	public List<LiveEntryServerNodeRecordingInfo> getRecordingInfo(){
		return this.recordingInfo;
	}
	public void setRecordingInfo(List<LiveEntryServerNodeRecordingInfo> recordingInfo){
		this.recordingInfo = recordingInfo;
	}

	// isPlayableUser:
	public Boolean getIsPlayableUser(){
		return this.isPlayableUser;
	}
	public void setIsPlayableUser(Boolean isPlayableUser){
		this.isPlayableUser = isPlayableUser;
	}

	public void isPlayableUser(String multirequestToken){
		setToken("isPlayableUser", multirequestToken);
	}

	// viewMode:
	public ViewMode getViewMode(){
		return this.viewMode;
	}
	public void setViewMode(ViewMode viewMode){
		this.viewMode = viewMode;
	}

	public void viewMode(String multirequestToken){
		setToken("viewMode", multirequestToken);
	}

	// featuresUpdatedAt:
	public Integer getFeaturesUpdatedAt(){
		return this.featuresUpdatedAt;
	}
	public void setFeaturesUpdatedAt(Integer featuresUpdatedAt){
		this.featuresUpdatedAt = featuresUpdatedAt;
	}

	public void featuresUpdatedAt(String multirequestToken){
		setToken("featuresUpdatedAt", multirequestToken);
	}


	public LiveEntryServerNode() {
		super();
	}

	public LiveEntryServerNode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		streams = GsonParser.parseArray(jsonObject.getAsJsonArray("streams"), LiveStreamParams.class);
		recordingInfo = GsonParser.parseArray(jsonObject.getAsJsonArray("recordingInfo"), LiveEntryServerNodeRecordingInfo.class);
		isPlayableUser = GsonParser.parseBoolean(jsonObject.get("isPlayableUser"));
		viewMode = ViewMode.get(GsonParser.parseInt(jsonObject.get("viewMode")));
		featuresUpdatedAt = GsonParser.parseInt(jsonObject.get("featuresUpdatedAt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveEntryServerNode");
		kparams.add("streams", this.streams);
		kparams.add("recordingInfo", this.recordingInfo);
		kparams.add("isPlayableUser", this.isPlayableUser);
		kparams.add("viewMode", this.viewMode);
		kparams.add("featuresUpdatedAt", this.featuresUpdatedAt);
		return kparams;
	}

}

