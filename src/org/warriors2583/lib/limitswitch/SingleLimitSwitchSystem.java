package org.warriors2583.lib.limitswitch;

import org.warriors2583.lib.limitswitch.LimitSwitch.SwitchType;

/**
 * A Limit Switch System using only one Switch
 * @author Austin Reuland
 */
public class SingleLimitSwitchSystem implements ILimitSwitchSystem{
    
    /**
     * Single System Type Class
     */
    public static class SingleSystemType{
        private final int type;
        private SingleSystemType(int type){
            this.type = type;
        }
        public int getType(){
            return type;
        }
        public static final SingleSystemType
                TOP = new SingleSystemType(1),
                BOTTOM = new SingleSystemType(2);
    }
    
    private LimitSwitch m_limitSwitch;
    private SingleSystemType m_type;

    /**
     * Construct a new Single Limit Switch System for use with a LimitSwitchController
     * @param channel Limit Switch Channel
     * @param switchType Limit Switch Type (SwitchType)
     * @param systemType Single Switch System Type (SingleSystemType)
     */
    public SingleLimitSwitchSystem(int channel, SwitchType switchType, SingleSystemType systemType){
        this(new LimitSwitch(channel, switchType), systemType);
    }
    
    /**
     * Construct a new Single Limit Switch System for use with a LimitSwitchController
     * @param module Limit Switch Module Slot
     * @param channel Limit Switch Channel
     * @param switchType Limit Switch Type (SwitchType)
     * @param systemType Single Switch System Type (SingleSystemType)
     */ 
    public SingleLimitSwitchSystem(int module, int channel, SwitchType switchType, SingleSystemType systemType){
        this(new LimitSwitch(module, channel, switchType), systemType);
    }
    
    /**
     * Construct a new Single Limit Switch System for use with a LimitSwitchController
     * @param limitSwitch Limit Switch
     * @param type Single Switch System Type (SingleSystemType)
     */
    public SingleLimitSwitchSystem(LimitSwitch limitSwitch, SingleSystemType type){
        this.m_limitSwitch = limitSwitch;
        this.m_type = type;
    }
    
    
    /**
     * Returns if the top limit switch has been triggered or not
     * @return LimitSwitch value
     */
    public boolean canUp() {
        if(m_type == SingleSystemType.BOTTOM) return true;
        return !m_limitSwitch.state();
    }
    
    /**
     * Returns if the bottom limit switch has been triggered or not
     * @return LimitSwitch value
     */
    public boolean canDown() {
        if(m_type == SingleSystemType.TOP) return true;
        return !m_limitSwitch.state();
    }

}
