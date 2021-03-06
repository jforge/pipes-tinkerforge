/* ***********************************************************
 * This file was automatically generated on 2013-01-28.      *
 *                                                           *
 * Bindings Version 2.0.2                                    *
 *                                                           *
 * If you have a bugfix for this file and want to commit it, *
 * please fix the bug in the generator. You can find a link  *
 * to the generator git on tinkerforge.com                   *
 *************************************************************/

package com.tinkerforge;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Device for controlling Stacks and four Bricklets
 */
public class BrickMaster extends Device {
	public final static int DEVICE_IDENTIFIER = 13;

	public final static byte FUNCTION_GET_STACK_VOLTAGE = (byte)1;
	public final static byte FUNCTION_GET_STACK_CURRENT = (byte)2;
	public final static byte FUNCTION_SET_EXTENSION_TYPE = (byte)3;
	public final static byte FUNCTION_GET_EXTENSION_TYPE = (byte)4;
	public final static byte FUNCTION_IS_CHIBI_PRESENT = (byte)5;
	public final static byte FUNCTION_SET_CHIBI_ADDRESS = (byte)6;
	public final static byte FUNCTION_GET_CHIBI_ADDRESS = (byte)7;
	public final static byte FUNCTION_SET_CHIBI_MASTER_ADDRESS = (byte)8;
	public final static byte FUNCTION_GET_CHIBI_MASTER_ADDRESS = (byte)9;
	public final static byte FUNCTION_SET_CHIBI_SLAVE_ADDRESS = (byte)10;
	public final static byte FUNCTION_GET_CHIBI_SLAVE_ADDRESS = (byte)11;
	public final static byte FUNCTION_GET_CHIBI_SIGNAL_STRENGTH = (byte)12;
	public final static byte FUNCTION_GET_CHIBI_ERROR_LOG = (byte)13;
	public final static byte FUNCTION_SET_CHIBI_FREQUENCY = (byte)14;
	public final static byte FUNCTION_GET_CHIBI_FREQUENCY = (byte)15;
	public final static byte FUNCTION_SET_CHIBI_CHANNEL = (byte)16;
	public final static byte FUNCTION_GET_CHIBI_CHANNEL = (byte)17;
	public final static byte FUNCTION_IS_RS485_PRESENT = (byte)18;
	public final static byte FUNCTION_SET_RS485_ADDRESS = (byte)19;
	public final static byte FUNCTION_GET_RS485_ADDRESS = (byte)20;
	public final static byte FUNCTION_SET_RS485_SLAVE_ADDRESS = (byte)21;
	public final static byte FUNCTION_GET_RS485_SLAVE_ADDRESS = (byte)22;
	public final static byte FUNCTION_GET_RS485_ERROR_LOG = (byte)23;
	public final static byte FUNCTION_SET_RS485_CONFIGURATION = (byte)24;
	public final static byte FUNCTION_GET_RS485_CONFIGURATION = (byte)25;
	public final static byte FUNCTION_IS_WIFI_PRESENT = (byte)26;
	public final static byte FUNCTION_SET_WIFI_CONFIGURATION = (byte)27;
	public final static byte FUNCTION_GET_WIFI_CONFIGURATION = (byte)28;
	public final static byte FUNCTION_SET_WIFI_ENCRYPTION = (byte)29;
	public final static byte FUNCTION_GET_WIFI_ENCRYPTION = (byte)30;
	public final static byte FUNCTION_GET_WIFI_STATUS = (byte)31;
	public final static byte FUNCTION_REFRESH_WIFI_STATUS = (byte)32;
	public final static byte FUNCTION_SET_WIFI_CERTIFICATE = (byte)33;
	public final static byte FUNCTION_GET_WIFI_CERTIFICATE = (byte)34;
	public final static byte FUNCTION_SET_WIFI_POWER_MODE = (byte)35;
	public final static byte FUNCTION_GET_WIFI_POWER_MODE = (byte)36;
	public final static byte FUNCTION_GET_WIFI_BUFFER_INFO = (byte)37;
	public final static byte FUNCTION_SET_WIFI_REGULATORY_DOMAIN = (byte)38;
	public final static byte FUNCTION_GET_WIFI_REGULATORY_DOMAIN = (byte)39;
	public final static byte FUNCTION_GET_USB_VOLTAGE = (byte)40;
	public final static byte FUNCTION_GET_PROTOCOL1_BRICKLET_NAME = (byte)241;
	public final static byte FUNCTION_GET_CHIP_TEMPERATURE = (byte)242;
	public final static byte FUNCTION_RESET = (byte)243;
	public final static byte FUNCTION_GET_IDENTITY = (byte)255;

	public final static long EXTENSION_TYPE_CHIBI = (long)1;
	public final static long EXTENSION_TYPE_RS485 = (long)2;
	public final static long EXTENSION_TYPE_WIFI = (long)3;
	public final static long EXTENSION_TYPE_ETHERNET = (long)4;
	public final static short CHIBI_FREQUENCY_OQPSK_868_MHZ = (short)0;
	public final static short CHIBI_FREQUENCY_OQPSK_915_MHZ = (short)1;
	public final static short CHIBI_FREQUENCY_OQPSK_780_MHZ = (short)2;
	public final static short CHIBI_FREQUENCY_BPSK40_915_MHZ = (short)3;
	public final static char RS485_PARITY_NONE = (char)'n';
	public final static char RS485_PARITY_EVEN = (char)'e';
	public final static char RS485_PARITY_ODD = (char)'o';
	public final static short WIFI_CONNECTION_DHCP = (short)0;
	public final static short WIFI_CONNECTION_STATIC_IP = (short)1;
	public final static short WIFI_CONNECTION_ACCESS_POINT_DHCP = (short)2;
	public final static short WIFI_CONNECTION_ACCESS_POINT_STATIC_IP = (short)3;
	public final static short WIFI_CONNECTION_AD_HOC_DHCP = (short)4;
	public final static short WIFI_CONNECTION_AD_HOC_STATIC_IP = (short)5;
	public final static short WIFI_ENCRYPTION_WPA_WPA2 = (short)0;
	public final static short WIFI_ENCRYPTION_WPA_ENTERPRISE = (short)1;
	public final static short WIFI_ENCRYPTION_WEP = (short)2;
	public final static short WIFI_ENCRYPTION_NO_ENCRYPTION = (short)3;
	public final static short WIFI_EAP_OPTION_OUTER_AUTH_EAP_FAST = (short)0;
	public final static short WIFI_EAP_OPTION_OUTER_AUTH_EAP_TLS = (short)1;
	public final static short WIFI_EAP_OPTION_OUTER_AUTH_EAP_TTLS = (short)2;
	public final static short WIFI_EAP_OPTION_OUTER_AUTH_EAP_PEAP = (short)3;
	public final static short WIFI_EAP_OPTION_INNER_AUTH_EAP_MSCHAP = (short)0;
	public final static short WIFI_EAP_OPTION_INNER_AUTH_EAP_GTC = (short)4;
	public final static short WIFI_EAP_OPTION_CERT_TYPE_CA_CERT = (short)0;
	public final static short WIFI_EAP_OPTION_CERT_TYPE_CLIENT_CERT = (short)8;
	public final static short WIFI_EAP_OPTION_CERT_TYPE_PRIVATE_KEY = (short)16;
	public final static short WIFI_STATE_DISASSOCIATED = (short)0;
	public final static short WIFI_STATE_ASSOCIATED = (short)1;
	public final static short WIFI_STATE_ASSOCIATING = (short)2;
	public final static short WIFI_STATE_ERROR = (short)3;
	public final static short WIFI_STATE_NOT_INITIALIZED_YET = (short)255;
	public final static short WIFI_POWER_MODE_FULL_SPEED = (short)0;
	public final static short WIFI_POWER_MODE_LOW_POWER = (short)1;
	public final static short WIFI_DOMAIN_CHANNEL_1TO11 = (short)0;
	public final static short WIFI_DOMAIN_CHANNEL_1TO13 = (short)1;
	public final static short WIFI_DOMAIN_CHANNEL_1TO14 = (short)2;


	public class ChibiErrorLog {
		public int underrun;
		public int crcError;
		public int noAck;
		public int overflow;

		public String toString() {
			return "[" + "underrun = " + underrun + ", " + "crcError = " + crcError + ", " + "noAck = " + noAck + ", " + "overflow = " + overflow + "]";
		}
	}

	public class RS485Configuration {
		public long speed;
		public char parity;
		public short stopbits;

		public String toString() {
			return "[" + "speed = " + speed + ", " + "parity = " + parity + ", " + "stopbits = " + stopbits + "]";
		}
	}

	public class WifiConfiguration {
		public String ssid;
		public short connection;
		public short[] ip = new short[4];
		public short[] subnetMask = new short[4];
		public short[] gateway = new short[4];
		public int port;

		public String toString() {
			return "[" + "ssid = " + ssid + ", " + "connection = " + connection + ", " + "ip = " + Arrays.toString(ip) + ", " + "subnetMask = " + Arrays.toString(subnetMask) + ", " + "gateway = " + Arrays.toString(gateway) + ", " + "port = " + port + "]";
		}
	}

	public class WifiEncryption {
		public short encryption;
		public String key;
		public short keyIndex;
		public short eapOptions;
		public int caCertificateLength;
		public int clientCertificateLength;
		public int privateKeyLength;

		public String toString() {
			return "[" + "encryption = " + encryption + ", " + "key = " + key + ", " + "keyIndex = " + keyIndex + ", " + "eapOptions = " + eapOptions + ", " + "caCertificateLength = " + caCertificateLength + ", " + "clientCertificateLength = " + clientCertificateLength + ", " + "privateKeyLength = " + privateKeyLength + "]";
		}
	}

	public class WifiStatus {
		public short[] macAddress = new short[6];
		public short[] bssid = new short[6];
		public short channel;
		public short rssi;
		public short[] ip = new short[4];
		public short[] subnetMask = new short[4];
		public short[] gateway = new short[4];
		public long rxCount;
		public long txCount;
		public short state;

		public String toString() {
			return "[" + "macAddress = " + Arrays.toString(macAddress) + ", " + "bssid = " + Arrays.toString(bssid) + ", " + "channel = " + channel + ", " + "rssi = " + rssi + ", " + "ip = " + Arrays.toString(ip) + ", " + "subnetMask = " + Arrays.toString(subnetMask) + ", " + "gateway = " + Arrays.toString(gateway) + ", " + "rxCount = " + rxCount + ", " + "txCount = " + txCount + ", " + "state = " + state + "]";
		}
	}

	public class WifiCertificate {
		public int index;
		public short[] data = new short[32];
		public short dataLength;

		public String toString() {
			return "[" + "index = " + index + ", " + "data = " + Arrays.toString(data) + ", " + "dataLength = " + dataLength + "]";
		}
	}

	public class WifiBufferInfo {
		public long overflow;
		public int lowWatermark;
		public int used;

		public String toString() {
			return "[" + "overflow = " + overflow + ", " + "lowWatermark = " + lowWatermark + ", " + "used = " + used + "]";
		}
	}

	public class Protocol1BrickletName {
		public char port;
		public short protocolVersion;
		public short[] firmwareVersion = new short[3];
		public String name;

		public String toString() {
			return "[" + "port = " + port + ", " + "protocolVersion = " + protocolVersion + ", " + "firmwareVersion = " + Arrays.toString(firmwareVersion) + ", " + "name = " + name + "]";
		}
	}

	/**
	 * Creates an object with the unique device ID \c uid. and adds it to
	 * the IP Connection \c ipcon.
	 */
	public BrickMaster(String uid, IPConnection ipcon) {
		super(uid, ipcon);

		apiVersion[0] = 2;
		apiVersion[1] = 0;
		apiVersion[2] = 0;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STACK_VOLTAGE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STACK_CURRENT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_EXTENSION_TYPE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_EXTENSION_TYPE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_CHIBI_PRESENT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHIBI_ADDRESS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_ADDRESS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHIBI_MASTER_ADDRESS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_MASTER_ADDRESS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHIBI_SLAVE_ADDRESS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_SLAVE_ADDRESS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_SIGNAL_STRENGTH)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_ERROR_LOG)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHIBI_FREQUENCY)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_FREQUENCY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHIBI_CHANNEL)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_CHANNEL)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_RS485_PRESENT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_RS485_ADDRESS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_RS485_ADDRESS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_RS485_SLAVE_ADDRESS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_RS485_SLAVE_ADDRESS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_RS485_ERROR_LOG)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_RS485_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_RS485_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_WIFI_PRESENT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_ENCRYPTION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_ENCRYPTION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_STATUS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_REFRESH_WIFI_STATUS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_CERTIFICATE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_CERTIFICATE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_POWER_MODE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_POWER_MODE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_BUFFER_INFO)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_REGULATORY_DOMAIN)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_REGULATORY_DOMAIN)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_USB_VOLTAGE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_PROTOCOL1_BRICKLET_NAME)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIP_TEMPERATURE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_RESET)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_IDENTITY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
	}

	/**
	 * Returns the stack voltage in mV. The stack voltage is the
	 * voltage that is supplied via the stack, i.e. it is given by a 
	 * Step-Down or Step-Up Power Supply.
	 */
	public int getStackVoltage() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_STACK_VOLTAGE);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_STACK_VOLTAGE, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_STACK_VOLTAGE);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int voltage = IPConnection.unsignedShort(bb.getShort());

		return voltage;
	}

	/**
	 * Returns the stack current in mA. The stack current is the
	 * current that is drawn via the stack, i.e. it is given by a
	 * Step-Down or Step-Up Power Supply.
	 */
	public int getStackCurrent() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_STACK_CURRENT);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_STACK_CURRENT, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_STACK_CURRENT);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int current = IPConnection.unsignedShort(bb.getShort());

		return current;
	}

	/**
	 * Writes the extension type to the EEPROM of a specified extension. 
	 * The extension is either 0 or 1 (0 is the on the bottom, 1 is the on on top, 
	 * if only one extension is present use 0).
	 * 
	 * Possible extension types:
	 * 
	 * \verbatim
	 *  "Type", "Description"
	 * 
	 *  "1",    "Chibi"
	 *  "2",    "RS485"
	 *  "3",    "WIFI"
	 *  "4",    "Ethernet"
	 * \endverbatim
	 * 
	 * The extension type is already set when bought and it can be set with the 
	 * Brick Viewer, it is unlikely that you need this function.
	 * 
	 * The value will be saved in the EEPROM of the Chibi Extension, it does not
	 * have to be set on every startup.
	 */
	public void setExtensionType(short extension, long exttype) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_EXTENSION_TYPE);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)13, FUNCTION_SET_EXTENSION_TYPE, options, (byte)(0));
		bb.put((byte)extension);
		bb.putInt((int)exttype);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_EXTENSION_TYPE);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the extension type for a given extension as set by 
	 * {@link com.tinkerforge.BrickMaster.setExtensionType}.
	 */
	public long getExtensionType(short extension) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_EXTENSION_TYPE);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)9, FUNCTION_GET_EXTENSION_TYPE, options, (byte)(0));
		bb.put((byte)extension);

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_EXTENSION_TYPE);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long exttype = IPConnection.unsignedInt(bb.getInt());

		return exttype;
	}

	/**
	 * Returns *true* if a Chibi Extension is available to be used by the Master.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public boolean isChibiPresent() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_IS_CHIBI_PRESENT);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_IS_CHIBI_PRESENT, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_IS_CHIBI_PRESENT);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean present = (bb.get()) != 0;

		return present;
	}

	/**
	 * Sets the address (1-255) belonging to the Chibi Extension.
	 * 
	 * It is possible to set the address with the Brick Viewer and it will be 
	 * saved in the EEPROM of the Chibi Extension, it does not
	 * have to be set on every startup.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public void setChibiAddress(short address) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_CHIBI_ADDRESS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)9, FUNCTION_SET_CHIBI_ADDRESS, options, (byte)(0));
		bb.put((byte)address);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_CHIBI_ADDRESS);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the address as set by {@link com.tinkerforge.BrickMaster.setChibiAddress}.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public short getChibiAddress() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_CHIBI_ADDRESS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_CHIBI_ADDRESS, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_CHIBI_ADDRESS);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short address = IPConnection.unsignedByte(bb.get());

		return address;
	}

	/**
	 * Sets the address (1-255) of the Chibi Master. This address is used if the
	 * Chibi Extension is used as slave (i.e. it does not have a USB connection).
	 * 
	 * It is possible to set the address with the Brick Viewer and it will be 
	 * saved in the EEPROM of the Chibi Extension, it does not
	 * have to be set on every startup.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public void setChibiMasterAddress(short address) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_CHIBI_MASTER_ADDRESS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)9, FUNCTION_SET_CHIBI_MASTER_ADDRESS, options, (byte)(0));
		bb.put((byte)address);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_CHIBI_MASTER_ADDRESS);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the address as set by {@link com.tinkerforge.BrickMaster.setChibiMasterAddress}.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public short getChibiMasterAddress() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_CHIBI_MASTER_ADDRESS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_CHIBI_MASTER_ADDRESS, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_CHIBI_MASTER_ADDRESS);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short address = IPConnection.unsignedByte(bb.get());

		return address;
	}

	/**
	 * Sets up to 254 slave addresses. Valid addresses are in range 1-255.
	 * The address numeration (via num parameter) has to be used
	 * ascending from 0. For example: If you use the Chibi Extension in Master mode
	 * (i.e. the stack has an USB connection) and you want to talk to three other
	 * Chibi stacks with the slave addresses 17, 23, and 42, you should call with "(0, 17),
	 * (1, 23) and (2, 42)".
	 * 
	 * It is possible to set the addresses with the Brick Viewer and it will be 
	 * saved in the EEPROM of the Chibi Extension, they don't
	 * have to be set on every startup.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public void setChibiSlaveAddress(short num, short address) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_CHIBI_SLAVE_ADDRESS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)10, FUNCTION_SET_CHIBI_SLAVE_ADDRESS, options, (byte)(0));
		bb.put((byte)num);
		bb.put((byte)address);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_CHIBI_SLAVE_ADDRESS);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the slave address for a given num as set by 
	 * {@link com.tinkerforge.BrickMaster.setChibiSlaveAddress}.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public short getChibiSlaveAddress(short num) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_CHIBI_SLAVE_ADDRESS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)9, FUNCTION_GET_CHIBI_SLAVE_ADDRESS, options, (byte)(0));
		bb.put((byte)num);

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_CHIBI_SLAVE_ADDRESS);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short address = IPConnection.unsignedByte(bb.get());

		return address;
	}

	/**
	 * Returns the signal strength in dBm. The signal strength updates every time a
	 * packet is received.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public short getChibiSignalStrength() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_CHIBI_SIGNAL_STRENGTH);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_CHIBI_SIGNAL_STRENGTH, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_CHIBI_SIGNAL_STRENGTH);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short signalStrength = IPConnection.unsignedByte(bb.get());

		return signalStrength;
	}

	/**
	 * Returns underrun, CRC error, no ACK and overflow error counts of the Chibi
	 * communication. If these errors start rising, it is likely that either the
	 * distance between two Chibi stacks is becoming too big or there are
	 * interferences.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public ChibiErrorLog getChibiErrorLog() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_CHIBI_ERROR_LOG);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_CHIBI_ERROR_LOG, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_CHIBI_ERROR_LOG);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		ChibiErrorLog obj = new ChibiErrorLog();
		obj.underrun = IPConnection.unsignedShort(bb.getShort());
		obj.crcError = IPConnection.unsignedShort(bb.getShort());
		obj.noAck = IPConnection.unsignedShort(bb.getShort());
		obj.overflow = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Sets the Chibi frequency range for the Chibi Extension. Possible values are:
	 * 
	 * \verbatim
	 *  "Type", "Description"
	 * 
	 *  "0",    "OQPSK 868MHz (Europe)"
	 *  "1",    "OQPSK 915MHz (US)"
	 *  "2",    "OQPSK 780MHz (China)"
	 *  "3",    "BPSK40 915MHz"
	 * \endverbatim
	 * 
	 * It is possible to set the frequency with the Brick Viewer and it will be 
	 * saved in the EEPROM of the Chibi Extension, it does not
	 * have to be set on every startup.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public void setChibiFrequency(short frequency) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_CHIBI_FREQUENCY);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)9, FUNCTION_SET_CHIBI_FREQUENCY, options, (byte)(0));
		bb.put((byte)frequency);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_CHIBI_FREQUENCY);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the frequency value as set by {@link com.tinkerforge.BrickMaster.setChibiFrequency}.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public short getChibiFrequency() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_CHIBI_FREQUENCY);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_CHIBI_FREQUENCY, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_CHIBI_FREQUENCY);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short frequency = IPConnection.unsignedByte(bb.get());

		return frequency;
	}

	/**
	 * Sets the channel used by the Chibi Extension. Possible channels are
	 * different for different frequencies:
	 * 
	 * \verbatim
	 *  "Frequency",             "Possible Channels"
	 * 
	 *  "OQPSK 868Mhz (Europe)", "0"
	 *  "OQPSK 915Mhz (US)",     "1, 2, 3, 4, 5, 6, 7, 8, 9, 10"
	 *  "OQPSK 780Mhz (China)",  "0, 1, 2, 3"
	 *  "BPSK40 915Mhz",         "1, 2, 3, 4, 5, 6, 7, 8, 9, 10"
	 * \endverbatim
	 * 
	 * It is possible to set the channel with the Brick Viewer and it will be 
	 * saved in the EEPROM of the Chibi Extension, it does not
	 * have to be set on every startup.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public void setChibiChannel(short channel) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_CHIBI_CHANNEL);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)9, FUNCTION_SET_CHIBI_CHANNEL, options, (byte)(0));
		bb.put((byte)channel);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_CHIBI_CHANNEL);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the channel as set by {@link com.tinkerforge.BrickMaster.setChibiChannel}.
	 * 
	 * .. versionadded:: 1.1.0~(Firmware)
	 */
	public short getChibiChannel() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_CHIBI_CHANNEL);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_CHIBI_CHANNEL, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_CHIBI_CHANNEL);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short channel = IPConnection.unsignedByte(bb.get());

		return channel;
	}

	/**
	 * Returns *true* if a RS485 Extension is available to be used by the Master.
	 * 
	 * .. versionadded:: 1.2.0~(Firmware)
	 */
	public boolean isRS485Present() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_IS_RS485_PRESENT);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_IS_RS485_PRESENT, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_IS_RS485_PRESENT);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean present = (bb.get()) != 0;

		return present;
	}

	/**
	 * Sets the address (1-255) belonging to the RS485 Extension.
	 * 
	 * Set to 0 if the RS485 Extension should be the RS485 Master (i.e.
	 * connected to a PC via USB).
	 * 
	 * It is possible to set the address with the Brick Viewer and it will be 
	 * saved in the EEPROM of the RS485 Extension, it does not
	 * have to be set on every startup.
	 * 
	 * .. versionadded:: 1.2.0~(Firmware)
	 */
	public void setRS485Address(short address) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_RS485_ADDRESS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)9, FUNCTION_SET_RS485_ADDRESS, options, (byte)(0));
		bb.put((byte)address);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_RS485_ADDRESS);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the address as set by {@link com.tinkerforge.BrickMaster.setRS485Address}.
	 * 
	 * .. versionadded:: 1.2.0~(Firmware)
	 */
	public short getRS485Address() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_RS485_ADDRESS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_RS485_ADDRESS, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_RS485_ADDRESS);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short address = IPConnection.unsignedByte(bb.get());

		return address;
	}

	/**
	 * Sets up to 255 slave addresses. Valid addresses are in range 1-255.
	 * The address numeration (via num parameter) has to be used
	 * ascending from 0. For example: If you use the RS485 Extension in Master mode
	 * (i.e. the stack has an USB connection) and you want to talk to three other
	 * RS485 stacks with the IDs 17, 23, and 42, you should call with "(0, 17),
	 * (1, 23) and (2, 42)".
	 * 
	 * It is possible to set the addresses with the Brick Viewer and it will be 
	 * saved in the EEPROM of the RS485 Extension, they don't
	 * have to be set on every startup.
	 * 
	 * .. versionadded:: 1.2.0~(Firmware)
	 */
	public void setRS485SlaveAddress(short num, short address) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_RS485_SLAVE_ADDRESS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)10, FUNCTION_SET_RS485_SLAVE_ADDRESS, options, (byte)(0));
		bb.put((byte)num);
		bb.put((byte)address);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_RS485_SLAVE_ADDRESS);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the slave address for a given num as set by 
	 * {@link com.tinkerforge.BrickMaster.setRS485SlaveAddress}.
	 * 
	 * .. versionadded:: 1.2.0~(Firmware)
	 */
	public short getRS485SlaveAddress(short num) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_RS485_SLAVE_ADDRESS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)9, FUNCTION_GET_RS485_SLAVE_ADDRESS, options, (byte)(0));
		bb.put((byte)num);

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_RS485_SLAVE_ADDRESS);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short address = IPConnection.unsignedByte(bb.get());

		return address;
	}

	/**
	 * Returns CRC error counts of the RS485 communication.
	 * If this counter starts rising, it is likely that the distance
	 * between the RS485 nodes is too big or there is some kind of
	 * interference.
	 * 
	 * .. versionadded:: 1.2.0~(Firmware)
	 */
	public int getRS485ErrorLog() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_RS485_ERROR_LOG);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_RS485_ERROR_LOG, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_RS485_ERROR_LOG);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int crcError = IPConnection.unsignedShort(bb.getShort());

		return crcError;
	}

	/**
	 * Sets the configuration of the RS485 Extension. Speed is given in baud. The
	 * Master Brick will try to match the given baud rate as exactly as possible.
	 * The maximum recommended baud rate is 2000000 (2Mbit/s).
	 * Possible values for parity are 'n' (none), 'e' (even) and 'o' (odd).
	 * Possible values for stop bits are 1 and 2.
	 * 
	 * If your RS485 is unstable (lost messages etc.), the first thing you should
	 * try is to decrease the speed. On very large bus (e.g. 1km), you probably
	 * should use a value in the range of 100000 (100kbit/s).
	 * 
	 * The values are stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after configuration.
	 * 
	 * .. versionadded:: 1.2.0~(Firmware)
	 */
	public void setRS485Configuration(long speed, char parity, short stopbits) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_RS485_CONFIGURATION);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)14, FUNCTION_SET_RS485_CONFIGURATION, options, (byte)(0));
		bb.putInt((int)speed);
		bb.put((byte)parity);
		bb.put((byte)stopbits);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_RS485_CONFIGURATION);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the configuration as set by {@link com.tinkerforge.BrickMaster.setRS485Configuration}.
	 * 
	 * .. versionadded:: 1.2.0~(Firmware)
	 */
	public RS485Configuration getRS485Configuration() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_RS485_CONFIGURATION);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_RS485_CONFIGURATION, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_RS485_CONFIGURATION);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		RS485Configuration obj = new RS485Configuration();
		obj.speed = IPConnection.unsignedInt(bb.getInt());
		obj.parity = (char)(bb.get());
		obj.stopbits = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Returns *true* if a WIFI Extension is available to be used by the Master.
	 * 
	 * .. versionadded:: 1.2.0~(Firmware)
	 */
	public boolean isWifiPresent() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_IS_WIFI_PRESENT);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_IS_WIFI_PRESENT, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_IS_WIFI_PRESENT);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean present = (bb.get()) != 0;

		return present;
	}

	/**
	 * Sets the configuration of the WIFI Extension. The *ssid* can have a max length
	 * of 32 characters. Possible values for *connection* are:
	 * 
	 * \verbatim
	 *  "Value", "Description"
	 * 
	 *  "0", "DHCP"
	 *  "1", "Static IP"
	 *  "2", "Access Point: DHCP"
	 *  "3", "Access Point: Static IP"
	 *  "4", "Ad Hoc: DHCP"
	 *  "5", "Ad Hoc: Static IP"
	 * \endverbatim
	 * 
	 * If you set *connection* to one of the static IP options then you have to supply
	 * *ip*, *subnet_mask* and *gateway* as an array of size 4 (first element of the
	 * array is the least significant byte of the address). If *connection* is set to
	 * one of the DHCP options then *ip*, *subnet_mask* and *gateway* are ignored, you
	 * can set them to 0.
	 * 
	 * The last parameter is the port that your program will connect to. The
	 * default port, that is used by brickd, is 4223.
	 * 
	 * The values are stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after configuration.
	 * 
	 * It is recommended to use the Brick Viewer to set the WIFI configuration.
	 * 
	 * .. versionadded:: 1.3.0~(Firmware)
	 */
	public void setWifiConfiguration(String ssid, short connection, short[] ip, short[] subnetMask, short[] gateway, int port) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_WIFI_CONFIGURATION);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)55, FUNCTION_SET_WIFI_CONFIGURATION, options, (byte)(0));
		for(int i = 0; i < 32; i++) {
			try {
				bb.put((byte)ssid.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		bb.put((byte)connection);
		for(int i = 0; i < 4; i++) {
			bb.put((byte)ip[i]);
		}

		for(int i = 0; i < 4; i++) {
			bb.put((byte)subnetMask[i]);
		}

		for(int i = 0; i < 4; i++) {
			bb.put((byte)gateway[i]);
		}

		bb.putShort((short)port);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_WIFI_CONFIGURATION);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the configuration as set by {@link com.tinkerforge.BrickMaster.setWifiConfiguration}.
	 * 
	 * .. versionadded:: 1.3.0~(Firmware)
	 */
	public WifiConfiguration getWifiConfiguration() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_WIFI_CONFIGURATION);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_WIFI_CONFIGURATION, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_WIFI_CONFIGURATION);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		WifiConfiguration obj = new WifiConfiguration();
		obj.ssid = IPConnection.string(bb, 32);
		obj.connection = IPConnection.unsignedByte(bb.get());
		for(int i = 0; i < 4; i++) {
			obj.ip[i] = IPConnection.unsignedByte(bb.get());
		}

		for(int i = 0; i < 4; i++) {
			obj.subnetMask[i] = IPConnection.unsignedByte(bb.get());
		}

		for(int i = 0; i < 4; i++) {
			obj.gateway[i] = IPConnection.unsignedByte(bb.get());
		}

		obj.port = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Sets the encryption of the WIFI Extension. The first parameter is the
	 * type of the encryption. Possible values are:
	 * 
	 * \verbatim
	 *  "Value", "Description"
	 * 
	 *  "0", "WPA/WPA2"
	 *  "1", "WPA Enterprise (EAP-FAST, EAP-TLS, EAP-TTLS, PEAP)"
	 *  "2", "WEP"
	 *  "3", "No Encryption"
	 * \endverbatim
	 * 
	 * The key has a max length of 50 characters and is used if encryption
	 * is set to 0 or 2 (WPA or WEP). Otherwise the value is ignored.
	 * For WEP it is possible to set the key index (1-4). If you don't know your
	 * key index, it is likely 1.
	 * 
	 * If you choose WPA Enterprise as encryption, you have to set eap options and
	 * the length of the certificates (for other encryption types these paramters
	 * are ignored). The certificate length are given in byte and the certificates
	 * themself can be set with  {@link com.tinkerforge.BrickMaster.setWifiCertificate}. Eap options consist of 
	 * the outer authentication (bits 1-2), inner authentication (bit 3) and 
	 * certificate type (bits 4-5):
	 * 
	 * \verbatim
	 *  "Option", "Bits", "Description"
	 * 
	 *  "outer auth", "1-2", "0=EAP-FAST, 1=EAP-TLS, 2=EAP-TTLS, 3=EAP-PEAP"
	 *  "inner auth", "3", "0=EAP-MSCHAP, 1=EAP-GTC"
	 *  "cert type", "4-5", "0=CA Certificate, 1=Client Certificate, 2=Private Key"
	 * \endverbatim
	 * 
	 * Example for EAP-TTLS + EAP-GTC + Private Key: option = 2 | (1 << 2) | (2 << 3).
	 * 
	 * The values are stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after configuration.
	 * 
	 * It is recommended to use the Brick Viewer to set the WIFI encryption.
	 * 
	 * .. versionadded:: 1.3.0~(Firmware)
	 */
	public void setWifiEncryption(short encryption, String key, short keyIndex, short eapOptions, int caCertificateLength, int clientCertificateLength, int privateKeyLength) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_WIFI_ENCRYPTION);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)67, FUNCTION_SET_WIFI_ENCRYPTION, options, (byte)(0));
		bb.put((byte)encryption);
		for(int i = 0; i < 50; i++) {
			try {
				bb.put((byte)key.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		bb.put((byte)keyIndex);
		bb.put((byte)eapOptions);
		bb.putShort((short)caCertificateLength);
		bb.putShort((short)clientCertificateLength);
		bb.putShort((short)privateKeyLength);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_WIFI_ENCRYPTION);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the encryption as set by {@link com.tinkerforge.BrickMaster.setWifiEncryption}.
	 * 
	 * .. versionadded:: 1.3.0~(Firmware)
	 */
	public WifiEncryption getWifiEncryption() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_WIFI_ENCRYPTION);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_WIFI_ENCRYPTION, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_WIFI_ENCRYPTION);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		WifiEncryption obj = new WifiEncryption();
		obj.encryption = IPConnection.unsignedByte(bb.get());
		obj.key = IPConnection.string(bb, 50);
		obj.keyIndex = IPConnection.unsignedByte(bb.get());
		obj.eapOptions = IPConnection.unsignedByte(bb.get());
		obj.caCertificateLength = IPConnection.unsignedShort(bb.getShort());
		obj.clientCertificateLength = IPConnection.unsignedShort(bb.getShort());
		obj.privateKeyLength = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Returns the status of the WIFI Extension. The state is updated automatically,
	 * all of the other parameters are updated on startup and every time
	 * {@link com.tinkerforge.BrickMaster.refreshWifiStatus} is called.
	 * 
	 * Possible states are:
	 * 
	 * \verbatim
	 *  "State", "Description"
	 * 
	 *  "0", "Disassociated"
	 *  "1", "Associated"
	 *  "2", "Associating"
	 *  "3", "Error"
	 *  "255", "Not initialized yet"
	 * \endverbatim
	 * 
	 * .. versionadded:: 1.3.0~(Firmware)
	 */
	public WifiStatus getWifiStatus() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_WIFI_STATUS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_WIFI_STATUS, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_WIFI_STATUS);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		WifiStatus obj = new WifiStatus();
		for(int i = 0; i < 6; i++) {
			obj.macAddress[i] = IPConnection.unsignedByte(bb.get());
		}

		for(int i = 0; i < 6; i++) {
			obj.bssid[i] = IPConnection.unsignedByte(bb.get());
		}

		obj.channel = IPConnection.unsignedByte(bb.get());
		obj.rssi = (bb.getShort());
		for(int i = 0; i < 4; i++) {
			obj.ip[i] = IPConnection.unsignedByte(bb.get());
		}

		for(int i = 0; i < 4; i++) {
			obj.subnetMask[i] = IPConnection.unsignedByte(bb.get());
		}

		for(int i = 0; i < 4; i++) {
			obj.gateway[i] = IPConnection.unsignedByte(bb.get());
		}

		obj.rxCount = IPConnection.unsignedInt(bb.getInt());
		obj.txCount = IPConnection.unsignedInt(bb.getInt());
		obj.state = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Refreshes the WIFI status (see {@link com.tinkerforge.BrickMaster.getWifiStatus}). To read the status
	 * of the WIFI module, the Master Brick has to change from data mode to
	 * command mode and back. This transaction and the readout itself is
	 * unfortunately time consuming. This means, that it might take some ms
	 * until the stack with attached WIFI Extensions reacts again after this
	 * function is called.
	 * 
	 * .. versionadded:: 1.3.0~(Firmware)
	 */
	public void refreshWifiStatus() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_REFRESH_WIFI_STATUS);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_REFRESH_WIFI_STATUS, options, (byte)(0));

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_REFRESH_WIFI_STATUS);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * This function is used to set the certificate as well as password and username
	 * for WPA Enterprise. To set the username use index 0xFFFF,
	 * to set the password use index 0xFFFE. The max length of username and 
	 * password is 32.
	 * 
	 * The certificate is written in chunks of size 32 and the index is used as
	 * the index of the chunk. The data length should nearly always be 32. Only
	 * the last chunk can have a length that is not equal to 32.
	 * 
	 * The starting index of the CA Certificate is 0, of the Client Certificate
	 * 10000 and for the Private Key 20000. Maximum sizes are 1312, 1312 and
	 * 4320 byte respectively.
	 * 
	 * The values are stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after uploading the certificate.
	 * 
	 * It is recommended to use the Brick Viewer to set the certificate, username
	 * and password.
	 * 
	 * .. versionadded:: 1.3.0~(Firmware)
	 */
	public void setWifiCertificate(int index, short[] data, short dataLength) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_WIFI_CERTIFICATE);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)43, FUNCTION_SET_WIFI_CERTIFICATE, options, (byte)(0));
		bb.putShort((short)index);
		for(int i = 0; i < 32; i++) {
			bb.put((byte)data[i]);
		}

		bb.put((byte)dataLength);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_WIFI_CERTIFICATE);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the certificate for a given index as set by {@link com.tinkerforge.BrickMaster.setWifiCertificate}.
	 * 
	 * .. versionadded:: 1.3.0~(Firmware)
	 */
	public WifiCertificate getWifiCertificate(int index) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_WIFI_CERTIFICATE);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)10, FUNCTION_GET_WIFI_CERTIFICATE, options, (byte)(0));
		bb.putShort((short)index);

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_WIFI_CERTIFICATE);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		WifiCertificate obj = new WifiCertificate();
		for(int i = 0; i < 32; i++) {
			obj.data[i] = IPConnection.unsignedByte(bb.get());
		}

		obj.dataLength = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Sets the power mode of the WIFI Extension. Possible modes are:
	 * 
	 * \verbatim
	 *  "Mode", "Description"
	 * 
	 *  "0", "Full Speed (high power consumption, high throughput)"
	 *  "1", "Low Power (low power consumption, low throughput)"
	 * \endverbatim
	 * 
	 * The default value is 0 (Full Speed).
	 * 
	 * .. versionadded:: 1.3.0~(Firmware)
	 */
	public void setWifiPowerMode(short mode) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_WIFI_POWER_MODE);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)9, FUNCTION_SET_WIFI_POWER_MODE, options, (byte)(0));
		bb.put((byte)mode);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_WIFI_POWER_MODE);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the power mode as set by {@link com.tinkerforge.BrickMaster.setWifiPowerMode}.
	 * 
	 * .. versionadded:: 1.3.0~(Firmware)
	 */
	public short getWifiPowerMode() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_WIFI_POWER_MODE);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_WIFI_POWER_MODE, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_WIFI_POWER_MODE);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short mode = IPConnection.unsignedByte(bb.get());

		return mode;
	}

	/**
	 * Returns informations about the WIFI receive buffer. The WIFI
	 * receive buffer has a max size of 1500 byte and if data is transfered
	 * too fast, it might overflow.
	 * 
	 * The return values are the number of overflows, the low watermark 
	 * (i.e. the smallest number of bytes that were free in the buffer) and
	 * the bytes that are currently used.
	 * 
	 * You should always try to keep the buffer empty, otherwise you will
	 * have a permanent latency. A good rule of thumb is, that you can transfer
	 * 1000 messages per second without problems.
	 * 
	 * Try to not send more then 50 messages at a time without any kind of
	 * break between them.
	 * 
	 * .. versionadded:: 1.3.2~(Firmware)
	 */
	public WifiBufferInfo getWifiBufferInfo() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_WIFI_BUFFER_INFO);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_WIFI_BUFFER_INFO, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_WIFI_BUFFER_INFO);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		WifiBufferInfo obj = new WifiBufferInfo();
		obj.overflow = IPConnection.unsignedInt(bb.getInt());
		obj.lowWatermark = IPConnection.unsignedShort(bb.getShort());
		obj.used = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Sets the regulatory domain of the WIFI Extension. Possible domains are:
	 * 
	 * \verbatim
	 *  "Domain", "Description"
	 * 
	 *  "0", "FCC: Channel 1-11 (N/S America, Australia, New Zealand)"
	 *  "1", "ETSI: Channel 1-13 (Europe, Middle East, Africa)"
	 *  "2", "TELEC: Channel 1-14 (Japan)"
	 * \endverbatim
	 * 
	 * The default value is 1 (ETSI).
	 * 
	 * .. versionadded:: 1.3.4~(Firmware)
	 */
	public void setWifiRegulatoryDomain(short domain) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_SET_WIFI_REGULATORY_DOMAIN);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)9, FUNCTION_SET_WIFI_REGULATORY_DOMAIN, options, (byte)(0));
		bb.put((byte)domain);

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_SET_WIFI_REGULATORY_DOMAIN);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the regulatory domain as set by {@link com.tinkerforge.BrickMaster.setWifiRegulatoryDomain}.
	 * 
	 * .. versionadded:: 1.3.4~(Firmware)
	 */
	public short getWifiRegulatoryDomain() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_WIFI_REGULATORY_DOMAIN);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_WIFI_REGULATORY_DOMAIN, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_WIFI_REGULATORY_DOMAIN);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short domain = IPConnection.unsignedByte(bb.get());

		return domain;
	}

	/**
	 * Returns the USB voltage in mV.
	 * 
	 * .. versionadded:: 1.3.5~(Firmware)
	 */
	public int getUSBVoltage() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_USB_VOLTAGE);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_USB_VOLTAGE, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_USB_VOLTAGE);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int voltage = IPConnection.unsignedShort(bb.getShort());

		return voltage;
	}

	/**
	 * Returns the firmware and protocol version and the name of the Bricklet for a given port.
	 * 
	 * This functions sole purpose is to allow automatic flashing of v1.x.y Bricklet plugins.
	 * 
	 * .. versionadded:: 2.0.0~(Firmware)
	 */
	public Protocol1BrickletName getProtocol1BrickletName(char port) throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_PROTOCOL1_BRICKLET_NAME);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)9, FUNCTION_GET_PROTOCOL1_BRICKLET_NAME, options, (byte)(0));
		bb.put((byte)port);

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_PROTOCOL1_BRICKLET_NAME);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Protocol1BrickletName obj = new Protocol1BrickletName();
		obj.protocolVersion = IPConnection.unsignedByte(bb.get());
		for(int i = 0; i < 3; i++) {
			obj.firmwareVersion[i] = IPConnection.unsignedByte(bb.get());
		}

		obj.name = IPConnection.string(bb, 40);

		return obj;
	}

	/**
	 * Returns the temperature in °C/10 as measured inside the microcontroller. The
	 * value returned is not the ambient temperature!
	 * 
	 * The temperature is only proportional to the real temperature and it has an
	 * accuracy of +-15%. Practically it is only useful as an indicator for
	 * temperature changes.
	 * 
	 * .. versionadded:: 1.2.1~(Firmware)
	 */
	public short getChipTemperature() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_CHIP_TEMPERATURE);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_CHIP_TEMPERATURE, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_CHIP_TEMPERATURE);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short temperature = (bb.getShort());

		return temperature;
	}

	/**
	 * Calling this function will reset the Brick. Calling this function
	 * on a Brick inside of a stack will reset the whole stack.
	 * 
	 * After a reset you have to create new device objects,
	 * calling functions on the existing ones will result in
	 * undefined behavior!
	 * 
	 * .. versionadded:: 1.2.1~(Firmware)
	 */
	public void reset() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_RESET);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_RESET, options, (byte)(0));

		if(isResponseExpected) {
			byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_RESET);

			bb = ByteBuffer.wrap(response, 8, response.length - 8);
			bb.order(ByteOrder.LITTLE_ENDIAN);
		} else {
			sendRequestNoResponse(bb.array());
		}
	}

	/**
	 * Returns the UID, the UID where the Brick is connected to, 
	 * the position, the hardware and firmware version as well as the
	 * device identifier.
	 * 
	 * The position can be '0'-'8' (stack position).
	 * 
	 * The device identifiers can be found :ref:`here <device_identifier>`.
	 * 
	 * .. versionadded:: 2.0.0~(Firmware)
	 */
	public Identity getIdentity() throws TimeoutException, NotConnectedException {
		byte options = 0;
		boolean isResponseExpected = getResponseExpected(FUNCTION_GET_IDENTITY);
		if(isResponseExpected) {
			options = 8;
		}
		ByteBuffer bb = ipcon.createRequestBuffer(uid, (byte)8, FUNCTION_GET_IDENTITY, options, (byte)(0));

		byte[] response = sendRequestExpectResponse(bb.array(), FUNCTION_GET_IDENTITY);

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Identity obj = new Identity();
		obj.uid = IPConnection.string(bb, 8);
		obj.connectedUid = IPConnection.string(bb, 8);
		obj.position = (char)(bb.get());
		for(int i = 0; i < 3; i++) {
			obj.hardwareVersion[i] = IPConnection.unsignedByte(bb.get());
		}

		for(int i = 0; i < 3; i++) {
			obj.firmwareVersion[i] = IPConnection.unsignedByte(bb.get());
		}

		obj.deviceIdentifier = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}
}