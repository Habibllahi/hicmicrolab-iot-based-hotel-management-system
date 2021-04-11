package com.hicmikrolab.hotelManagementSystem.Utility;

import java.io.IOException;
import java.net.InetAddress;

public interface NetworkInterface {

    boolean sendPingRequest(String ip) throws IOException;

    InetAddress getLocalHostIp() throws IOException;

    InetAddress getNodeIp(String ip) throws IOException;
}
