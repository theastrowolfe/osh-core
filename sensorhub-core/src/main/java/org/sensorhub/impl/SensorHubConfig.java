/***************************** BEGIN LICENSE BLOCK ***************************

 The contents of this file are subject to the Mozilla Public License Version
 1.1 (the "License"); you may not use this file except in compliance with
 the License. You may obtain a copy of the License at
 http://www.mozilla.org/MPL/MPL-1.1.html
 
 Software distributed under the License is distributed on an "AS IS" basis,
 WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 for the specific language governing rights and limitations under the License.
 
 The Original Code is "SensorHub".
 
 The Initial Developer of the Original Code is Sensia Software LLC.
 <http://www.sensiasoftware.com>. Portions created by the Initial
 Developer are Copyright (C) 2013 the Initial Developer. All Rights Reserved.
 
 Please Contact Alexandre Robin <alex.robin@sensiasoftware.com> for more 
 information.
 
 Contributor(s): 
    Alexandre Robin <alex.robin@sensiasoftware.com>
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.impl;

import org.sensorhub.api.config.IGlobalConfig;


/**
 * <p>
 * Configuration class containing bootstrap configuration options
 * </p>
 *
 * <p>Copyright (c) 2013</p>
 * @author Alexandre Robin <alex.robin@sensiasoftware.com>
 * @since Sep 20, 2013
 */
public class SensorHubConfig implements IGlobalConfig
{
    public String moduleConfigPath;
    
    public SensorHubConfig()
    {        
    }
    
    
    public SensorHubConfig(String moduleConfigPath)
    {
        this.moduleConfigPath = moduleConfigPath;
    }
    
    
    @Override
    public String getModuleConfigPath()
    {
        return moduleConfigPath;
    }


    @Override
    public String getProperty(String property)
    {
        // TODO Auto-generated method stub
        return null;
    }

}
