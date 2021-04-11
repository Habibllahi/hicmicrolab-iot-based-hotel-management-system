package com.hicmikrolab.hotelManagementSystem.Entity;

import com.hicmikrolab.hotelManagementSystem.Utility.NodeStatus;
import lombok.Data;
import javax.persistence.*;

/**
 * This class by ORM technology represent a table in the database with each of its field serving as Column.
 * An instance of it represent a row in the database
 */
@Entity
@Data
@Table(name = "node",schema = "hicmikrolab")
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "node_name")
    String nodeName;

    @Column(name = "ip_address",unique = true)
    String ipAddress;

    @Column(name = "socket_port")
    String socketPort;

    @Column(name = "node_status")
    @Enumerated(value = EnumType.STRING)
    NodeStatus nodeStatus;
}
