package az.ingress.kubernetesdeployment.service;

import az.ingress.kubernetesdeployment.dto.request.UserRequest;
import az.ingress.kubernetesdeployment.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse createUser(UserRequest userRequest);

    UserResponse getUserById(Long id);

    List<UserResponse> getAllUser();
}
