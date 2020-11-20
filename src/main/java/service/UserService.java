package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepo;
import com.example.model.User;

@Service
public class UserService {

	
	@Autowired UserRepo repo;
	
	public String save(User user) {
		try {
			repo.save(user);
			return "inserted successfully";
			}
			catch(Exception e){
				return e.toString();
			}
			
	}
	
	public List<User> getUser() {
		try {
			return (List<User>) repo.findAll();
		
			}
			catch(Exception e){
				System.out.println(e.toString());
				return null;
			}
			
	}
}
