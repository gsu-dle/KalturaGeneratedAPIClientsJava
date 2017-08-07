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
public class ConvertCollectionJobData extends ConvartableJobData {

    private String destDirLocalPath;
    private String destDirRemoteUrl;
    private String destFileName;
    private String inputXmlLocalPath;
    private String inputXmlRemoteUrl;
    private String commandLinesStr;
    private List<ConvertCollectionFlavorData> flavors;

    // destDirLocalPath:
    public String getDestDirLocalPath(){
        return this.destDirLocalPath;
    }
    public void setDestDirLocalPath(String destDirLocalPath){
        this.destDirLocalPath = destDirLocalPath;
    }

    // destDirRemoteUrl:
    public String getDestDirRemoteUrl(){
        return this.destDirRemoteUrl;
    }
    public void setDestDirRemoteUrl(String destDirRemoteUrl){
        this.destDirRemoteUrl = destDirRemoteUrl;
    }

    // destFileName:
    public String getDestFileName(){
        return this.destFileName;
    }
    public void setDestFileName(String destFileName){
        this.destFileName = destFileName;
    }

    // inputXmlLocalPath:
    public String getInputXmlLocalPath(){
        return this.inputXmlLocalPath;
    }
    public void setInputXmlLocalPath(String inputXmlLocalPath){
        this.inputXmlLocalPath = inputXmlLocalPath;
    }

    // inputXmlRemoteUrl:
    public String getInputXmlRemoteUrl(){
        return this.inputXmlRemoteUrl;
    }
    public void setInputXmlRemoteUrl(String inputXmlRemoteUrl){
        this.inputXmlRemoteUrl = inputXmlRemoteUrl;
    }

    // commandLinesStr:
    public String getCommandLinesStr(){
        return this.commandLinesStr;
    }
    public void setCommandLinesStr(String commandLinesStr){
        this.commandLinesStr = commandLinesStr;
    }

    // flavors:
    public List<ConvertCollectionFlavorData> getFlavors(){
        return this.flavors;
    }
    public void setFlavors(List<ConvertCollectionFlavorData> flavors){
        this.flavors = flavors;
    }


    public ConvertCollectionJobData() {
       super();
    }

    public ConvertCollectionJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        destDirLocalPath = GsonParser.parseString(jsonObject.get("destDirLocalPath"));
        destDirRemoteUrl = GsonParser.parseString(jsonObject.get("destDirRemoteUrl"));
        destFileName = GsonParser.parseString(jsonObject.get("destFileName"));
        inputXmlLocalPath = GsonParser.parseString(jsonObject.get("inputXmlLocalPath"));
        inputXmlRemoteUrl = GsonParser.parseString(jsonObject.get("inputXmlRemoteUrl"));
        commandLinesStr = GsonParser.parseString(jsonObject.get("commandLinesStr"));
        flavors = GsonParser.parseArray(jsonObject.getAsJsonArray("flavors"), ConvertCollectionFlavorData.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaConvertCollectionJobData");
        kparams.add("destDirLocalPath", this.destDirLocalPath);
        kparams.add("destDirRemoteUrl", this.destDirRemoteUrl);
        kparams.add("destFileName", this.destFileName);
        kparams.add("inputXmlLocalPath", this.inputXmlLocalPath);
        kparams.add("inputXmlRemoteUrl", this.inputXmlRemoteUrl);
        kparams.add("commandLinesStr", this.commandLinesStr);
        kparams.add("flavors", this.flavors);
        return kparams;
    }

}

