/**
 * @Author Hamzat Habibllahi Adewale
 */
package com.hicmikrolab.hotelManagementSystem.Utility;

/**
 * <p>
 *     This class as enum is to specify all room in the hotel as Constants and associate a constant ip address to every room.
 * </p>
 */
public enum Apartment {
    ROOM_1("192.168.43.170","spark5-HB");
    private final String ip;
    private final String hostName;
    public String getIp(){
        return this.ip;
    }
    public String getHostName(){return this.hostName;}

    Apartment(String ip, String hostName){
        this.ip=ip;
        this.hostName = hostName;
    }
}
