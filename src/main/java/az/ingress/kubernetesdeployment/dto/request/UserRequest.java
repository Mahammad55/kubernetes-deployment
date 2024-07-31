package az.ingress.kubernetesdeployment.dto.request;

import lombok.Data;

@Data
public class UserRequest {
    private String name;

    private String surname;
}
