package com.hicmikrolab.hotelManagementSystem.repository;

import com.hicmikrolab.hotelManagementSystem.entity.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NodeRepo extends JpaRepository<Node, UUID> {

}
