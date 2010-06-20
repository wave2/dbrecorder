/**
 * Copyright (c) 2008-2010 Wave2 Limited. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of Wave2 Limited nor the names of its contributors may be
 * used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.binarystor.tools.dbrecorder;

import org.binarystor.tools.dbrecorder.mysql.MySQLInstance;

/**
 *
 * @author Alan Snelson
 */
public class dbRecorderConfig {
    private SubversionRepository[] subversion;
    private MySQLInstance[] mysql;
    private NotificationMethod[] notification;
    public String configError = "";

    public NotificationMethod getNotification(int index) {
        return this.notification[index];
    }

    public NotificationMethod[] getNotification() {
        return this.notification;
    }

    public void setNotification(int index, NotificationMethod value) {
        this.notification[index] = value;
    }

    public void setNotification(NotificationMethod[] value) {
        this.notification = value;
    }

    public MySQLInstance getMysql(int index) {
        return this.mysql[index];
    }

    public MySQLInstance[] getMysql() {
        return this.mysql;
    }

    public void setMysql(int index, MySQLInstance value) {
        this.mysql[index] = value;
    }

    public void setMysql(MySQLInstance[] values) {
        this.mysql = values;
    }

    public SubversionRepository getSubversion(int index) {
        return this.subversion[index];
    }

    public SubversionRepository[] getSubversion() {
        return this.subversion;
    }

    public void setSubversion(int index, SubversionRepository value) {
        this.subversion[index] = value;
    }

    public void setSubversion(SubversionRepository[] value) {
        this.subversion = value;
    }

    public boolean checkConfig(){
        //Check Subversion Repositories
        if (this.subversion == null){
            configError = "No Repositories found - please check config file.";
            return false;
        } else {
            for (SubversionRepository repo: this.subversion){
                if (repo.getName() == null){
                    configError = "Repository name required. e.g. - name: MyRepo";
                    return false;
                }
                if (repo.getUrl() == null){
                    configError = "Repository url required. e.g. url: file://C:/SVN/dbRecorder";
                    return false;
                }
            }
        }
        //Check Notification methods
        if (this.notification == null){
            configError = "No notification methods found - please check config file.";
            return false;
        } else {
            for (NotificationMethod notify: this.notification){
                if (notify.getMethod() == null){
                    configError = "Notification method required. e.g. - method: smtp";
                    return false;
                }else{
                    if (notify.getRecipients() == null){
                        configError = "Notification recipients required. e.g. recipients: [me@mycompany.com]";
                        return false;
                    }
                }
            }
        }
        //Check MySQL instances
        if (this.mysql != null){

        }
        return true;
    }

}
