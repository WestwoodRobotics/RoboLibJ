package org.team2583.robolib.communication;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

import org.team2583.robolib.hal.JNIWrapper;
/**
 * JNA Wrapper for library <b>FRC_NetworkCommunications</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class FRCNetworkCommunicationsLibrary extends JNIWrapper {
	//public static final String JNA_LIBRARY_NAME = LibraryExtractor.getLibraryPath("FRC_NetworkCommunications", true, FRC_NetworkCommunicationsLibrary.class);
	//public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(FRC_NetworkCommunicationsLibrary.JNA_LIBRARY_NAME, MangledFunctionMapper.DEFAULT_OPTIONS);
	//static {
		//System.loadLibrary("JNIWrappers");
		//Native.register(FRC_NetworkCommunicationsLibrary.class, FRC_NetworkCommunicationsLibrary.JNA_NATIVE_LIB);
	//}
	/**
	 * <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h</i><br>
	 * enum values
	 */
	public static interface tModuleType {
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:9</i> */
		public static final int kModuleType_Unknown = 0x00;
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:10</i> */
		public static final int kModuleType_Analog = 0x01;
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:11</i> */
		public static final int kModuleType_Digital = 0x02;
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:12</i> */
		public static final int kModuleType_Solenoid = 0x03;
	};
	/**
	 * <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h</i><br>
	 * enum values
	 */
	public static interface tTargetClass {
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:16</i> */
		public static final int kTargetClass_Unknown = 0x00;
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:17</i> */
		public static final int kTargetClass_FRC1 = 0x10;
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:18</i> */
		public static final int kTargetClass_FRC2 = 0x20;
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:19</i> */
		public static final int kTargetClass_FRC2_Analog = (int)FRCNetworkCommunicationsLibrary.tTargetClass.kTargetClass_FRC2 | (int)FRCNetworkCommunicationsLibrary.tModuleType.kModuleType_Analog;
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:20</i> */
		public static final int kTargetClass_FRC2_Digital = (int)FRCNetworkCommunicationsLibrary.tTargetClass.kTargetClass_FRC2 | (int)FRCNetworkCommunicationsLibrary.tModuleType.kModuleType_Digital;
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:21</i> */
		public static final int kTargetClass_FRC2_Solenoid = (int)FRCNetworkCommunicationsLibrary.tTargetClass.kTargetClass_FRC2 | (int)FRCNetworkCommunicationsLibrary.tModuleType.kModuleType_Solenoid;
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:22</i> */
		public static final int kTargetClass_FamilyMask = 0xF0;
		/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:23</i> */
		public static final int kTargetClass_ModuleMask = 0x0F;
	};
	/**
	 * <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h</i><br>
	 * enum values
	 */
	public static interface tResourceType {
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:10</i> */
		public static final int kResourceType_Controller = 0;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:11</i> */
		public static final int kResourceType_Module = 1;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:12</i> */
		public static final int kResourceType_Language = 2;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:13</i> */
		public static final int kResourceType_CANPlugin = 3;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:14</i> */
		public static final int kResourceType_Accelerometer = 4;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:15</i> */
		public static final int kResourceType_ADXL345 = 5;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:16</i> */
		public static final int kResourceType_AnalogChannel = 6;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:17</i> */
		public static final int kResourceType_AnalogTrigger = 7;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:18</i> */
		public static final int kResourceType_AnalogTriggerOutput = 8;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:19</i> */
		public static final int kResourceType_CANJaguar = 9;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:20</i> */
		public static final int kResourceType_Compressor = 10;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:21</i> */
		public static final int kResourceType_Counter = 11;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:22</i> */
		public static final int kResourceType_Dashboard = 12;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:23</i> */
		public static final int kResourceType_DigitalInput = 13;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:24</i> */
		public static final int kResourceType_DigitalOutput = 14;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:25</i> */
		public static final int kResourceType_DriverStationCIO = 15;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:26</i> */
		public static final int kResourceType_DriverStationEIO = 16;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:27</i> */
		public static final int kResourceType_DriverStationLCD = 17;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:28</i> */
		public static final int kResourceType_Encoder = 18;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:29</i> */
		public static final int kResourceType_GearTooth = 19;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:30</i> */
		public static final int kResourceType_Gyro = 20;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:31</i> */
		public static final int kResourceType_I2C = 21;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:32</i> */
		public static final int kResourceType_Framework = 22;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:33</i> */
		public static final int kResourceType_Jaguar = 23;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:34</i> */
		public static final int kResourceType_Joystick = 24;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:35</i> */
		public static final int kResourceType_Kinect = 25;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:36</i> */
		public static final int kResourceType_KinectStick = 26;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:37</i> */
		public static final int kResourceType_PIDController = 27;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:38</i> */
		public static final int kResourceType_Preferences = 28;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:39</i> */
		public static final int kResourceType_PWM = 29;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:40</i> */
		public static final int kResourceType_Relay = 30;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:41</i> */
		public static final int kResourceType_RobotDrive = 31;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:42</i> */
		public static final int kResourceType_SerialPort = 32;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:43</i> */
		public static final int kResourceType_Servo = 33;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:44</i> */
		public static final int kResourceType_Solenoid = 34;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:45</i> */
		public static final int kResourceType_SPI = 35;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:46</i> */
		public static final int kResourceType_Task = 36;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:47</i> */
		public static final int kResourceType_Ultrasonic = 37;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:48</i> */
		public static final int kResourceType_Victor = 38;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:49</i> */
		public static final int kResourceType_Button = 39;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:50</i> */
		public static final int kResourceType_Command = 40;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:51</i> */
		public static final int kResourceType_AxisCamera = 41;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:52</i> */
		public static final int kResourceType_PCVideoServer = 42;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:53</i> */
		public static final int kResourceType_SmartDashboard = 43;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:54</i> */
		public static final int kResourceType_Talon = 44;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:55</i> */
		public static final int kResourceType_HiTechnicColorSensor = 45;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:56</i> */
		public static final int kResourceType_HiTechnicAccel = 46;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:57</i> */
		public static final int kResourceType_HiTechnicCompass = 47;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:58</i> */
		public static final int kResourceType_SRF08 = 48;
	};
	/**
	 * <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h</i><br>
	 * enum values
	 */
	public static interface tInstances {
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:63</i> */
		public static final int kLanguage_LabVIEW = 1;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:64</i> */
		public static final int kLanguage_CPlusPlus = 2;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:65</i> */
		public static final int kLanguage_Java = 3;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:66</i> */
		public static final int kLanguage_Python = 4;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:68</i> */
		public static final int kCANPlugin_BlackJagBridge = 1;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:69</i> */
		public static final int kCANPlugin_2CAN = 2;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:71</i> */
		public static final int kFramework_Iterative = 1;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:72</i> */
		public static final int kFramework_Simple = 2;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:74</i> */
		public static final int kRobotDrive_ArcadeStandard = 1;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:75</i> */
		public static final int kRobotDrive_ArcadeButtonSpin = 2;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:76</i> */
		public static final int kRobotDrive_ArcadeRatioCurve = 3;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:77</i> */
		public static final int kRobotDrive_Tank = 4;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:78</i> */
		public static final int kRobotDrive_MecanumPolar = 5;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:79</i> */
		public static final int kRobotDrive_MecanumCartesian = 6;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:81</i> */
		public static final int kDriverStationCIO_Analog = 1;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:82</i> */
		public static final int kDriverStationCIO_DigitalIn = 2;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:83</i> */
		public static final int kDriverStationCIO_DigitalOut = 3;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:85</i> */
		public static final int kDriverStationEIO_Acceleration = 1;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:86</i> */
		public static final int kDriverStationEIO_AnalogIn = 2;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:87</i> */
		public static final int kDriverStationEIO_AnalogOut = 3;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:88</i> */
		public static final int kDriverStationEIO_Button = 4;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:89</i> */
		public static final int kDriverStationEIO_LED = 5;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:90</i> */
		public static final int kDriverStationEIO_DigitalIn = 6;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:91</i> */
		public static final int kDriverStationEIO_DigitalOut = 7;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:92</i> */
		public static final int kDriverStationEIO_FixedDigitalOut = 8;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:93</i> */
		public static final int kDriverStationEIO_PWM = 9;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:94</i> */
		public static final int kDriverStationEIO_Encoder = 10;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:95</i> */
		public static final int kDriverStationEIO_TouchSlider = 11;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:97</i> */
		public static final int kADXL345_SPI = 1;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:98</i> */
		public static final int kADXL345_I2C = 2;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:100</i> */
		public static final int kCommand_Scheduler = 1;
		/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:102</i> */
		public static final int kSmartDashboard_Instance = 1;
	};
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int kFRC_NetworkCommunication_DynamicType_DSEnhancedIO_Input = 17;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int kFRC_NetworkCommunication_DynamicType_Kinect_Vertices1 = 21;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int SYS_STATUS_DATA_SIZE = 44;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int kFRC_NetworkCommunication_DynamicType_Kinect_Custom = 25;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int kFRC_NetworkCommunication_DynamicType_Kinect_Vertices2 = 23;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int kFRC_NetworkCommunication_DynamicType_Kinect_Header = 19;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int kFRC_NetworkCommunication_DynamicType_Kinect_Joystick = 24;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int IO_CONFIG_DATA_SIZE = 32;
	/** <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h</i> */
	public static final int kMaxModuleNumber = 2;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int kFRC_NetworkCommunication_DynamicType_DSEnhancedIO_Output = 18;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int kFRC_NetworkCommunication_DynamicType_Kinect_Extra2 = 22;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int kFRC_NetworkCommunication_DynamicType_Kinect_Extra1 = 20;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int USER_DS_LCD_DATA_SIZE = 128;
	/** <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h</i> */
	public static final int kUsageReporting_version = 1;
	/** <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h</i> */
	public static final int USER_STATUS_DATA_SIZE = (984 - 32 - 44);
	/**
	 * Original signature : <code>uint32_t FRC_NetworkCommunication_nAICalibration_getLSBWeight(const uint32_t, const uint32_t, int32_t*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\AICalibration.h:7</i><br>
	 * @deprecated use the safer methods {@link #FRC_NetworkCommunication_nAICalibration_getLSBWeight(int, int, java.nio.IntBuffer)} and {@link #FRC_NetworkCommunication_nAICalibration_getLSBWeight(int, int, com.sun.jna.ptr.IntByReference)} instead
	 */
	//@Deprecated
	//public static native int FRC_NetworkCommunication_nAICalibration_getLSBWeight(int aiSystemIndex, int channel, Integer status);
	/**
	 * Original signature : <code>uint32_t FRC_NetworkCommunication_nAICalibration_getLSBWeight(const uint32_t, const uint32_t, int32_t*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\AICalibration.h:7</i>
	 */
	public static native int FRCNetworkCommunicationAICalibrationGetLSBWeight(int aiSystemIndex, int channel, Integer status);
	/**
	 * Original signature : <code>int32_t FRC_NetworkCommunication_nAICalibration_getOffset(const uint32_t, const uint32_t, int32_t*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\AICalibration.h:8</i><br>
	 * @deprecated use the safer methods {@link #FRC_NetworkCommunication_nAICalibration_getOffset(int, int, java.nio.IntBuffer)} and {@link #FRC_NetworkCommunication_nAICalibration_getOffset(int, int, com.sun.jna.ptr.IntByReference)} instead
	 */
	//@Deprecated
	//public static native int FRC_NetworkCommunication_nAICalibration_getOffset(int aiSystemIndex, int channel, Integer status);
	/**
	 * Original signature : <code>int32_t FRC_NetworkCommunication_nAICalibration_getOffset(const uint32_t, const uint32_t, int32_t*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\AICalibration.h:8</i>
	 */
	public static native int FRCNetworkCommunicationAICalibrationGetOffset(int aiSystemIndex, int channel, Integer status);
	/**
	 * Original signature : <code>tTargetClass getTargetClass()</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:25</i>
	 */
	public static native int getTargetClass();
	/**
	 * Original signature : <code>uint32_t FRC_NetworkCommunication_nLoadOut_getModulePresence(uint32_t, uint8_t)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:32</i>
	 */
	public static native int FRCNetworkCommunicationLoadOutGetModulePresence(int moduleType, byte moduleNumber);
	/**
	 * Original signature : <code>uint32_t FRC_NetworkCommunication_nLoadOut_getTargetClass()</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\LoadOut.h:33</i>
	 */
	public static native int FRCNetworkCommunicationLoadOutGetTargetClass();
	/**
	 * Original signature : <code>STATUS moduleNameFindBySymbolName(const char*, char*)</code><br>
	 * @param symbol symbol name to look for<br>
	 * @param module where to return module name<br>
	 * <i>native declaration : src\main\include\NetworkCommunication\symModuleLink.h:6</i><br>
	 * @deprecated use the safer methods {@link #moduleNameFindBySymbolName(java.lang.String, java.nio.ByteBuffer)} and {@link #moduleNameFindBySymbolName(com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	//@Deprecated
	//public static native FRC_NetworkCommunicationsLibrary.STATUS moduleNameFindBySymbolName(Pointer symbol, Pointer module);
	/**
	 * Original signature : <code>STATUS moduleNameFindBySymbolName(const char*, char*)</code><br>
	 * @param symbol symbol name to look for<br>
	 * @param module where to return module name<br>
	 * <i>native declaration : src\main\include\NetworkCommunication\symModuleLink.h:6</i>
	 */
	//public static native FRC_NetworkCommunicationsLibrary.STATUS moduleNameFindBySymbolName(String symbol, ByteBuffer module);
	/**
	 * Report the usage of a resource of interest.
<br>
	 *
<br>
	 * @param resource one of the values in the tResourceType above (max value 51).
<br>
	 * @param instanceNumber an index that identifies the resource instance.
<br>
	 * @param context an optional additional context number for some cases (such as module number).  Set to 0 to omit.
<br>
	 * @param feature a string to be included describing features in use on a specific resource.  Setting the same resource more than once allows you to change the feature string.<br>
	 * Original signature : <code>uint32_t report(tResourceType, uint8_t, uint8_t, const char*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:113</i><br>
	 * @deprecated use the safer methods {@link #report(int, byte, byte, java.lang.String)} and {@link #report(int, byte, byte, com.sun.jna.Pointer)} instead
	 */
	//@Deprecated
	//public static native int report(int resource, byte instanceNumber, byte context, Pointer feature);
	/**
	 * Report the usage of a resource of interest.
<br>
	 *
<br>
	 * @param resource one of the values in the tResourceType above (max value 51).
<br>
	 * @param instanceNumber an index that identifies the resource instance.
<br>
	 * @param context an optional additional context number for some cases (such as module number).  Set to 0 to omit.
<br>
	 * @param feature a string to be included describing features in use on a specific resource.  Setting the same resource more than once allows you to change the feature string.<br>
	 * Original signature : <code>uint32_t report(tResourceType, uint8_t, uint8_t, const char*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:113</i>
	 */
	public static native int report(int resource, byte instanceNumber, byte context, String feature);
	/**
	 * Original signature : <code>uint32_t FRC_NetworkCommunication_nUsageReporting_report(uint8_t, uint8_t, uint8_t, const char*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:120</i><br>
	 * @deprecated use the safer methods {@link #FRC_NetworkCommunication_nUsageReporting_report(byte, byte, byte, java.lang.String)} and {@link #FRC_NetworkCommunication_nUsageReporting_report(byte, byte, byte, com.sun.jna.Pointer)} instead
	 */
	//@Deprecated
	//public static native int FRC_NetworkCommunication_nUsageReporting_report(byte resource, byte instanceNumber, byte context, Pointer feature);
	/**
	 * Original signature : <code>uint32_t FRC_NetworkCommunication_nUsageReporting_report(uint8_t, uint8_t, uint8_t, const char*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\UsageReporting.h:120</i>
	 */
	public static native int FRCNetworkCommunicationUsageReportingReport(byte resource, byte instanceNumber, byte context, String feature);
	/**
	 * Original signature : <code>void getFPGAHardwareVersion(uint16_t*, uint32_t*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:124</i><br>
	 * @deprecated use the safer methods {@link #getFPGAHardwareVersion(java.nio.ShortBuffer, java.nio.IntBuffer)} and {@link #getFPGAHardwareVersion(com.sun.jna.ptr.ShortByReference, com.sun.jna.ptr.IntByReference)} instead
	 */
	//@Deprecated
	//public static native void getFPGAHardwareVersion(ShortByReference fpgaVersion, IntByReference fpgaRevision);
	/**
	 * Original signature : <code>void getFPGAHardwareVersion(uint16_t*, uint32_t*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:124</i>
	 */
	public static native void getFPGAHardwareVersion(ShortBuffer fpgaVersion, IntBuffer fpgaRevision);
	/**
	 * Original signature : <code>int setErrorData(const char*, int, int)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:136</i><br>
	 * @deprecated use the safer methods {@link #setErrorData(java.lang.String, int, int)} and {@link #setErrorData(com.sun.jna.Pointer, int, int)} instead
	 */
	//@Deprecated
	//public static native int setErrorData(Pointer errors, int errorsLength, int wait_ms);
	/**
	 * Original signature : <code>int setErrorData(const char*, int, int)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:136</i>
	 */
	public static native int setErrorData(String errors, int errorsLength, int wait_ms);
	/**
	 * Original signature : <code>int overrideIOConfig(const char*, int)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:138</i><br>
	 * @deprecated use the safer methods {@link #overrideIOConfig(java.lang.String, int)} and {@link #overrideIOConfig(com.sun.jna.Pointer, int)} instead
	 */
	//@Deprecated
	//public static native int overrideIOConfig(String ioConfig, int wait_ms);
	/**
	 * Original signature : <code>int overrideIOConfig(const char*, int)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:138</i>
	 */
	public static native int overrideIOConfig(String ioConfig, int wait_ms);
	/**
	 * Original signature : <code>void setNewDataSem(pthread_mutex_t*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:147</i>
	 */
	public static native void setNewDataSem(ByteBuffer mutexId);
	/**
	 * Original signature : <code>void setResyncSem(pthread_mutex_t*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:148</i>
	 */
	//public static native void setResyncSem(FRC_NetworkCommunicationsLibrary.pthread_mutex_t pthread_mutex_tPtr1);
	/**
	 * Original signature : <code>void signalResyncActionDone()</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:150</i>
	 */
	public static native void signalResyncActionDone();
	/**
	 * this uint32_t is really a LVRefNum<br>
	 * Original signature : <code>void setNewDataOccurRef(uint32_t)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:154</i>
	 */
	public static native void setNewDataOccurRef(int refnum);
	/**
	 * Original signature : <code>void setResyncOccurRef(uint32_t)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:156</i>
	 */
	public static native void setResyncOccurRef(int refnum);
	/**
	 * Original signature : <code>void FRC_NetworkCommunication_getVersionString(char*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:159</i><br>
	 * @deprecated use the safer methods {@link #FRC_NetworkCommunication_getVersionString(java.nio.ByteBuffer)} and {@link #FRC_NetworkCommunication_getVersionString(com.sun.jna.Pointer)} instead
	 */
	//@Deprecated
	//public static native void FRC_NetworkCommunication_getVersionString(Pointer version);
	/**
	 * Original signature : <code>void FRC_NetworkCommunication_getVersionString(char*)</code><br>
	 * <i>native declaration : src\main\include\NetworkCommunication\FRCComm.h:159</i>
	 */
	public static native void FRCNetworkCommunicationGetVersionString(ByteBuffer version);
	public static native void FRCNetworkCommunicationObserveUserProgramStarting();
	public static native void FRCNetworkCommunicationObserveUserProgramDisabled();
	public static native void FRCNetworkCommunicationObserveUserProgramAutonomous();
	public static native void FRCNetworkCommunicationObserveUserProgramTeleop();
	public static native void FRCNetworkCommunicationObserveUserProgramTest();
	public static native void FRCNetworkCommunicationReserve();

	public static native int NativeHALGetControlWord();
	public static HALControlWord HALGetControlWord() {
		int word = NativeHALGetControlWord();
		return new HALControlWord(
			(word & 1) != 0,
			((word >> 1) & 1) != 0,
			((word >> 2) & 1) != 0,
			((word >> 3) & 1) != 0,
			((word >> 4) & 1) != 0,
			((word >> 5) & 1) != 0
		);
	}

	public static native int NativeHALGetAllianceStation();
	public static HALAllianceStationID HALGetAllianceStation() {
		switch(NativeHALGetAllianceStation()) {
		case 0:
			return HALAllianceStationID.Red1;
		case 1:
			return HALAllianceStationID.Red2;
		case 2:
			return HALAllianceStationID.Red3;
		case 3:
			return HALAllianceStationID.Blue1;
		case 4:
			return HALAllianceStationID.Blue2;
		case 5:
			return HALAllianceStationID.Blue3;
		default:
			return null;
		}
	}

	public static int kMaxJoystickAxes = 12;
	public static int kMaxJoystickPOVs = 12;
	public static native short[] HALGetJoystickAxes(byte joystickNum);
	public static native short[] HALGetJoystickPOVs(byte joystickNum);
	public static native int HALGetJoystickButtons(byte joystickNum, ByteBuffer count);
	public static native int HALSetJoystickOutputs(byte joystickNum, int outputs, short leftRumble, short rightRumble);
	public static native float HALGetMatchTime();
	public static native boolean HALGetSystemActive(IntBuffer status);
	public static native boolean HALGetBrownedOut(IntBuffer status);
	
	public static native int HALSetErrorData(String error);
}
