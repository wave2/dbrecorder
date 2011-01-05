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

/**
 *
 * @author Alan Snelson
 */
public class SSHTunnel {
    private String hostname;
    private String username;
    private String password;
    private int localport;
    private String remotehost;
    private int remoteport;
    private String keyfile;
    private String keypassword;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String value) {
        hostname = value;
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

    public int getLocalport() {
        return localport;
    }

    public void setLocalport(int value) {
        localport = value;
    }

    public String getRemotehost() {
        return remotehost;
    }

    public void setRemotehost(String value) {
        remotehost = value;
    }

    public int getRemoteport() {
        return remoteport;
    }

    public void setRemoteport(int value) {
        remoteport = value;
    }

    public String getKeyfile() {
        return keyfile;
    }

    public void setKeyfile(String value) {
        keyfile = value;
    }

    public String getKeypassword() {
        return keypassword;
    }

    public void setKeypassword(String value) {
        keypassword = value;
    }

}
