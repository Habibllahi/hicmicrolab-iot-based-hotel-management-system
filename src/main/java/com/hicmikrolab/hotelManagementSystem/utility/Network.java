/**
 * @Author Hamzat Habibllahi
 * @Thanks to Mohit Gupta (GeeksforGeeks)
 */
package com.hicmikrolab.hotelManagementSystem.Utility;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.InetAddress;

@Component
@Data
public class Network implements NetworkInterface {

    /**
     * port value is assign initial value.
     */
    @Value("${com.hicmikrolab.hotelManagementSystem.socket.port}")
    private int port;
    /**
     * <p>
     *     Test whether the ip address is reachable. Best effort is made by the implementation to try to reach the host,
     *     but firewalls and server configuration may block requests resulting in a unreachable status while some specific
     *     ports may be accessible.
     *     A typical implementation will use ICMP ECHO REQUESTs if the privilege can be obtained, otherwise it will try
     *     to establish a TCP connection on port 7 (Echo) of the destination host.
     *
     *     The timeout value is 5000 milliseconds
     * </p>
     * @param ip is the string representation of the node ip address
     * @return boolean. True means node is online and false means node is offline
     * @throws IOException
     */
    @Override
    public boolean sendPingRequest(String ip) throws  IOException{
        var inetAddress = InetAddress.getByName(ip);
        if(inetAddress.isReachable(5000))
            return true;
        else
            return false;
    }

    /**
     * Returns the address of the local host. This is achieved by retrieving the name of the host from the system,
     * then resolving that name into an InetAddress.
     * @return InetAddress of the Local host
     * @throws IOException
     */
    @Override
    public InetAddress getLocalHostIp()throws IOException{
        return InetAddress.getLocalHost();
    }

    /**
     * Determines the IP address of a node
     * @param ip string literal of the node ip address
     * @return InetAddress of the node
     * @throws IOException
     */
    @Override
    public InetAddress getNodeIp(String ip) throws IOException{
        return InetAddress.getByName(ip);
    }

}
