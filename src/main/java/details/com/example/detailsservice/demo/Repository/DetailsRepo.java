package details.com.example.detailsservice.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import details.com.example.detailsservice.demo.entity.Details;
@Repository
public interface DetailsRepo extends JpaRepository<Details, Long>{

	Details save(Details details);

}
