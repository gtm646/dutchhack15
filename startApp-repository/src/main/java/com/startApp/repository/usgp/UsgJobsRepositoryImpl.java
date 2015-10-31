
package com.startApp.repository.usgp;

import java.util.List;

import com.startApp.domain.usg.Example;
import com.startApp.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Repository;

import com.startApp.domain.Company;
import org.springframework.web.client.RestTemplate;

/**
 * @author x085982
 *
 */
@Repository
public class UsgJobsRepositoryImpl implements UsgJobsRepository {


    @Autowired
    private AuthorisedRestTemplate authorisedRestTemplate;

    @Override
	public Example getAllAvailableJobs(String query) {
		//Company[] companies = authorisedRestTemplate.getRestTemplate().getForObject(Constants.KVK_API_BASE_NAME + "/companies/city/" + city,
        RestTemplate restTemplate = authorisedRestTemplate.getRestTemplate();
        Example example = restTemplate.getForObject(Constants.USG_API_BASE_NAME + "collection=usglami&q=" + query,
                        Example.class);
        System.out.println("Example : " + example.getSnippetFormat());

		return example;
	}


	
}
