package idu.cs.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import idu.cs.domain.User;

public interface UserRepository 
	extends JpaRepository<User, Long> {
	public List<User> findByName(String name);
	public List<User> findBycompany(String company);
	User findByUserid(String Userid);
}
