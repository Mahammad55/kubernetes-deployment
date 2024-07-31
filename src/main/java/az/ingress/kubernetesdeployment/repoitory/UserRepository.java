package az.ingress.kubernetesdeployment.repoitory;

import az.ingress.kubernetesdeployment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
