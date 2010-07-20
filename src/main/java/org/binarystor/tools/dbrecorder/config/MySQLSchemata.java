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

package org.binarystor.tools.dbrecorder.config;

/**
 *
 * @author Alan Snelson
 */
public class MySQLSchemata {
    private String name;
    private String[] tables;
    private String[] triggers;
    private String[] views;
    private String[] events;
    private String[] routines;
    private String[] auto_increment;

    public MySQLSchemata(String schema){
        name = schema;
    }

    public String getAuto_increment(int index) {
        return this.auto_increment[index];
    }

    public String[] getAuto_increment() {
        return this.auto_increment;
    }

    public void setAuto_increment(int index, String value) {
        this.auto_increment[index] = value;
    }

    public void setAuto_increment(String[] values) {
        this.auto_increment = values;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public String getTables(int index) {
        return this.tables[index];
    }

    public String[] getTables() {
        return this.tables;
    }

    public void setTables(int index, String value) {
        this.tables[index] = value;
    }

    public void setTables(String[] values) {
        this.tables = values;
    }

    public String getTriggers(int index) {
        return this.triggers[index];
    }

    public String[] getTriggers() {
        return this.triggers;
    }

    public void setTriggers(int index, String value) {
        this.triggers[index] = value;
    }

    public void setTriggers(String[] values) {
        this.triggers = values;
    }

    public String getViews(int index) {
        return this.views[index];
    }

    public String[] getViews() {
        return this.views;
    }

    public void setViews(int index, String value) {
        this.views[index] = value;
    }

    public void setViews(String[] values) {
        this.views = values;
    }

    public String getEvents(int index) {
        return this.events[index];
    }

    public String[] getEvents() {
        return this.events;
    }

    public void setEvents(int index, String value) {
        this.events[index] = value;
    }

    public void setEvents(String[] values) {
        this.events = values;
    }

    public String getRoutines(int index) {
        return this.routines[index];
    }

    public String[] getRoutines() {
        return this.routines;
    }

    public void setRoutines(int index, String value) {
        this.routines[index] = value;
    }

    public void setRoutines(String[] values) {
        this.routines = values;
    }
}