/*
 * Copyright (c) 2015 noriah <vix@noriah.dev>.
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

package io.github.robolib.module;

import java.lang.reflect.InvocationTargetException;

import org.json.JSONArray;
import org.json.JSONException;

import io.github.robolib.module.actuator.DoubleSolenoid;
import io.github.robolib.module.actuator.Solenoid;
import io.github.robolib.module.actuator.SolenoidBase;
import io.github.robolib.module.actuator.SolenoidBase.SolenoidChannel;
import io.github.robolib.util.log.Logger;

/**
 * 
 *
 * @author noriah Reuland <vix@noriah.dev>
 */
public class SolenoidBuilder implements ModuleBuilder<SolenoidBase> {

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getStringIdentifiers() {
        return new String[]{
                "solenoid",
                "pneumatic"
        };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SolenoidBase createModule(String key, JSONArray arrayData) {
        String type = arrayData.getString(0);
        try {
            switch(type){
            case "single":
            case "solenoid":
            case "singlesolenoid":
                return Solenoid.class.getConstructor(SolenoidChannel.class).newInstance(
                        SolenoidChannel.values()[arrayData.getInt(1)]);
            case "double":
            case "doublesolenoid":
                return DoubleSolenoid.class.getConstructor(
                        SolenoidChannel.class, SolenoidChannel.class).newInstance(
                        SolenoidChannel.values()[arrayData.getInt(1)],
                        SolenoidChannel.values()[arrayData.getInt(2)]);
            default:
                Logger.get(RobotMap.class).fatal("Unable to create Solenoid for '" + key + "'! NO type '" + type + "'");
                break;
            }
                
        } catch (NoSuchMethodException | SecurityException
                | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException
                | JSONException e) {
            Logger.get(RobotMap.class).fatal("Unable to create Solenoid for '" + key + "'!", e);
        }
        return null;
    }

}
