package com.devopsbuddy2.backend.persistence.repositories;

/**
 * Created by Sheryl Dreyer on 2017/08/24.
 */
import com.devopsbuddy2.backend.persistence.domain.backend.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tedonema on 29/03/2016.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}