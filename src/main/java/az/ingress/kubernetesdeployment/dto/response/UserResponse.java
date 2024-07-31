package az.ingress.kubernetesdeployment.dto.response;

import lombok.Data;

@Data
public class UserResponse {
    private Long id;

    private String name;

    private String surname;
}
