package mc.saqua.app.domain.service;

import mc.saqua.app.domain.model.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User findByid(Long id);

    User creat(User userToCreate);

}
