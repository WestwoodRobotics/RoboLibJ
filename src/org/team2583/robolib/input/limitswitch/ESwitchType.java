/*
 * Copyright (c) 2015 Westwood Robotics <code.westwoodrobotics@gmail.com>.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package org.team2583.robolib.input.limitswitch;

/**
 * Limit Switch Type Enum
 * 
 * @author Austin Reuland <amreuland@gmail.com>
 */
public enum ESwitchType {
    
    /**
     * Normally Open Switch
     */
    NO(true),
    /**
     * Normally Closed Switch
     */
    NC(false);
    
    private final boolean open;
    
    ESwitchType(boolean open){
        this.open = open;
    }
    
    public boolean getValue(boolean value){
        return this.open && value;
    }
}