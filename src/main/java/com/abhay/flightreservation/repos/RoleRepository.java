package com.abhay.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhay.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
