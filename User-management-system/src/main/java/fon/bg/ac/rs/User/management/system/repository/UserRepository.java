package fon.bg.ac.rs.User.management.system.repository;

import fon.bg.ac.rs.User.management.system.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
