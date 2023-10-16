package br.com.diegomardu.santanderdevwee.service;

import br.com.diegomardu.santanderdevwee.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User user);

}
