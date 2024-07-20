package tourism;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for UserInteraction entity.
 */
@Repository
public interface UserInteractionRepository extends JpaRepository<UserInteraction, Long> {
}
