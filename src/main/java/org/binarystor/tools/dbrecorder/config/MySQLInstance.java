/**
 * Copyright (c) 2008-2011 Wave2 Limited. All rights reserved.
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

package org.binarystor.tools.dbrecorder.config;

import org.binarystor.tools.dbrecorder.config.SSHTunnel;


/**
 *
 * @author Alan Snelson
 */
public class MySQLInstance {

    private String name;
    private String hostname;
    private int port;
    private String repository;
    private String username;
    private String password;
    private SSHTunnel securetunnel;
    private MySQLSchemata[] schemata;


    public MySQLInstance() {
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String value) {
        hostname = value;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int value) {
        port = value;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String value) {
        repository = value;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String value) {
        username = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        password = value;
    }

    public SSHTunnel getSecuretunnel() {
        return securetunnel;
    }

    public void setSecuretunnel(SSHTunnel value) {
        securetunnel = value;
    }

    public MySQLSchemata getSchemata(int index) {
        return this.schemata[index];
    }

    public MySQLSchemata[] getSchemata() {
        return this.schemata;
    }

    public void setSchemata(int index, MySQLSchemata value) {
        this.schemata[index] = value;
    }

    public void setSchemata(MySQLSchemata[] values) {
        this.schemata = values;
    }

}
