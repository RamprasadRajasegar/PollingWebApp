package com.project.PollingWebApp.Repository;

import com.project.PollingWebApp.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);

    @Query("select u from User u where u.username=:username")
    Optional<User> findByUsername(String username);
    Optional<User> findByEmailOrUsername(String email,String username);
    Boolean existsByEmail(String email);

    Boolean existsByUsername(String username);

    Optional<User> findById(Long id);
}
