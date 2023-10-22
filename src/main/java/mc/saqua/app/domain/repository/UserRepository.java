package mc.saqua.app.domain.repository;

import mc.saqua.app.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
    boolean existsByIdNumber(Long IdNumber);
}
