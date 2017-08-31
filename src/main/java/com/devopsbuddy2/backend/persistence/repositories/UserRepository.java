package com.devopsbuddy2.backend.persistence.repositories;

/**
 * Created by Sheryl Dreyer on 2017/08/24.
 */
import com.devopsbuddy2.backend.persistence.domain.backend.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tedonema on 29/03/2016.
 */
@Repository
@Transactional(readOnly = true)
public interface UserRepository extends CrudRepository<User, Long> {


}