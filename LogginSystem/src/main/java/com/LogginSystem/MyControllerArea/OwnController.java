package com.LogginSystem.MyControllerArea;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.LogginSystem.MyEntityArea.Users;

@RestController

public class OwnController {
	
	
	
	
	 @CrossOrigin(origins = "http://127.0.0.1:5500")
	    @PostMapping("/usercheck")
	    public Users checkDetails(@RequestBody Users users) {
	        System.out.println("username and password is " + users);
	        return users;
	    }

}
	