/**
 * @Author Hamzat Habibllahi
 * @Thanks to Mohit Gupta (GeeksforGeeks)
 */
package com.hicmikrolab.hotelManagementSystem.Utility;

import java.io.IOException;
import java.net.InetAddress;

public class Network {
    public static boolean sendPingRequest(String ipOrHostName) throws  IOException{
        var inetAddress = InetAddress.getByName(ipOrHostName);
        if(inetAddress.isReachable(5000))
            return true;
        else
            return false;
    }
    public static InetAddress getLocalHostIp()throws IOException{
        return InetAddress.getLocalHost();
    }
    public static InetAddress getNodeIp(String ipOrHostName) throws IOException{

        return InetAddress.getByName(ipOrHostName);
    }

}
