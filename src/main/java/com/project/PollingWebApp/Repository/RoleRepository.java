package com.project.PollingWebApp.Repository;

import com.project.PollingWebApp.Enum.RoleName;
import com.project.PollingWebApp.POJO.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByRole(RoleName roleName);


}
