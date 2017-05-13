package mavenspringresteasypkg.SpringRestEasyAPI.service;

import java.util.*;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component can also be used. Here we have used @Service which is more generic
@Service
public class CardDesignService {

	public List <String> getBizCardDesigns() {
		List <String> bizDesigns = new ArrayList<String>();
		bizDesigns.add("Design1");
		bizDesigns.add("Design2");
		bizDesigns.add("Design3");
		bizDesigns.add("Design4");
		return bizDesigns;
	}
}
