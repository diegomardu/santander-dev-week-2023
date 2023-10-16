package br.com.diegomardu.santanderdevwee.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import br.com.diegomardu.santanderdevwee.domain.model.User;
import br.com.diegomardu.santanderdevwee.domain.repository.UserRepository;
import br.com.diegomardu.santanderdevwee.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository repository;
	
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public User findById(Long id) {		
		return repository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User user) {
		if(repository.existsByAccountNumber(user.getAccount().getNumber())) {
			throw new IllegalArgumentException("This Account Number already exists.");
		}
		return repository.save(user);
	}

}
