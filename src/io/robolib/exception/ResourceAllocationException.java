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

package io.robolib.exception;

/**
 * 
 * @author noriah Reuland <vix@noriah.dev>
 *
 */
public class ResourceAllocationException extends RuntimeException {


    private static final long serialVersionUID = -6451386153566418315L;
    
    /**
     * Instantiates a new robot exception.
     *
     * @param msg the msg
     */
    public ResourceAllocationException(String msg){
        super(msg);
    }
}