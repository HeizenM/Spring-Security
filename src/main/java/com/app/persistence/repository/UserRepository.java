package com.app.persistence.repository;

import com.app.persistence.entity.UserEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>{
    
    Optional<UserEntity> findUserEntityByUsername(String username);
    
//    @Query("SELECT u FROM UserEntity u WHERE  u.username = ?")
//    Optional<UserEntity> findUser(String username);
    
}
