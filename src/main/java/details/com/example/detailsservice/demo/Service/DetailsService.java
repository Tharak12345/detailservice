package details.com.example.detailsservice.demo.Service;

import java.util.List;

import details.com.example.detailsservice.demo.entity.Details;

public interface DetailsService {

	Details saveDetails(Details details);

	List<Details> getAllDetails();

	Details getByDetailsId(long id);

	Details updateByDetailsId(long id, Details details);

	Details DeleteByDetailsId(long id);

}
