package com.tom.bhxhsqa.service.impl;

import com.tom.bhxhsqa.dto.UserDTO;
import com.tom.bhxhsqa.entity.User;
import com.tom.bhxhsqa.repository.UserRepository;
import com.tom.bhxhsqa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository injectedBean) {
        this.userRepository = injectedBean;
    }

    @Override
    public UserDTO getCurrentUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        UserDTO dto = new UserDTO(user.get());
        return dto;
    }

    @Override
    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean login(String username, String password) {
        User user = userRepository.findOneByUsername(username);
        if(user.getId() != null){
            return Objects.equals(password, user.getPassword());
        }
        return false;
    }

	@Override
	public User getUserByName(String name) {
		User user = userRepository.findOneByUsername(name);
        if(user.getId() != null){
            return user;
        }
        return null;
	}
}
