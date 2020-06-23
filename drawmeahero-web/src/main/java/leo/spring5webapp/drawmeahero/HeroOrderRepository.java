package leo.spring5webapp.drawmeahero;

import leo.spring5webapp.drawmeahero.model.HeroOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface HeroOrderRepository extends MongoRepository<HeroOrder, Long> {

    Optional<HeroOrder> findByRequesterEmail(String email);

    Optional<HeroOrder> findByRequesteeName(String name);
}
