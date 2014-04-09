package org.warriors2583.lib;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;
import edu.wpi.first.wpilibj.tables.ITable;

/**
 * Potentiometer Class for use with the WPILib Code
 * @author Austin Reuland
 */
public class Potentiometer implements PIDSource, LiveWindowSendable {
    
    private AnalogChannel m_pot;
    
    /**
     * 
     * @param channel Analog Channel of the Potentiometer
     * @param avgBits Number of Averaging Bits
     * @param ovrBits Number of Oversample Bits
     */
    public Potentiometer(int channel, int avgBits, int ovrBits){
        this(1, channel, avgBits, ovrBits);
    }
    
    /**
     * 
     * @param module Analog Module Number
     * @param channel Analog Channel of the Potentiometer
     * @param avgBits Number of Averaging Bits
     * @param ovrBits Number of Oversample Bits
     */ 
    public Potentiometer(int module, int channel, int avgBits, int ovrBits){
        m_pot = new AnalogChannel(module, channel);
        m_pot.setAverageBits(avgBits);
        m_pot.setOversampleBits(ovrBits);
    }

    /**
     * Get raw value
     * @return Potentiometer raw value
     */
    public int getValue() {return m_pot.getValue(); }
    
    /**
     * Get raw voltage
     * @return Potentiometer raw voltage
     */
    public double getVoltage() { return m_pot.getVoltage(); }
        
    private double lastRaw = 0;
    
    /**
     * Get an Averaged value from the pot
     * @return The average of the current and last values
     */
    public double getAverage(){
        lastRaw = (lastRaw + getVoltage())/2;
        return lastRaw;
    }
    
    public int getAverageBits() { return m_pot.getAverageBits(); }
    
    public int getOversampleBits() { return m_pot.getOversampleBits(); }
    
    public double pidGet() { return m_pot.pidGet(); }

    public void updateTable() { m_pot.updateTable(); }

    public void startLiveWindowMode() { m_pot.startLiveWindowMode(); }

    public void stopLiveWindowMode() { m_pot.stopLiveWindowMode(); }

    public void initTable(ITable arg0) { m_pot.initTable(arg0); }

    public ITable getTable() { return m_pot.getTable(); }

    public String getSmartDashboardType() { return m_pot.getSmartDashboardType(); }

}