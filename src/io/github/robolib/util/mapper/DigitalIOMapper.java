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

package io.github.robolib.util.mapper;

import io.github.robolib.module.iface.DigitalIO;

import org.json.JSONObject;

/**
 * 
 *
 * @author noriah Reuland <vix@noriah.dev>
 */
public class DigitalIOMapper implements ModuleMapper<DigitalIO>{
    
    

    /**
     * {@inheritDoc}
     */
    @Override
    public DigitalIO createModule(String key, JSONObject data) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getModuleIdentifiers() {
        return new String[]{
                "digitalio"
        };
    }
    
    

}