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

package org.team2583.robolib.output;

/**
 * 
 * @author Austin Reuland <amreuland@gmail.com>
 *
 */
public enum ControllerType {
    
    Victor(2.027, 1.525, 1.507, 1.49, 1.026),
    VictorSP(2.004, 1.52, 1.50, 1.48, 0.997),
    Talon(2.037, 1.539, 1.513, 1.487, 0.989),
    TalonSRX(2.004, 1.52, 1.50, 1.48, 0.997),
    Jaguar(2.31, 1.55, 1.507, 1.454, 0.697);
    
    
    
    public final double max;
    public final double deadMax;
    public final double center;
    public final double deadMin;
    public final double min;
    
    private ControllerType(double max, double deadMax, double center, double deadMin, double min){
        this.max = max;
        this.deadMax = deadMax;
        this.center = center;
        this.deadMin = deadMin;
        this.min = min;
    }

}
