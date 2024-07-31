package az.ingress.kubernetesdeployment.service.impl;

import az.ingress.kubernetesdeployment.dto.request.UserRequest;
import az.ingress.kubernetesdeployment.dto.response.UserResponse;
import az.ingress.kubernetesdeployment.entity.User;
import az.ingress.kubernetesdeployment.repoitory.UserRepository;
import az.ingress.kubernetesdeployment.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    private final ModelMapper mapper;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        return mapper.map(userRepository.save(mapper.map(userRequest, User.class)), UserResponse.class);
    }

    @Override
    public UserResponse getUserById(Long id) {
        return mapper.map(userRepository.findById(id).get(), UserResponse.class);
    }

    @Override
    public List<UserResponse> getAllUser() {
        return userRepository.findAll().stream().map(user -> mapper.map(user, UserResponse.class)).toList();
    }
}
