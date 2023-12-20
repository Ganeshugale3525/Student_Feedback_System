package org.com.FeedbackSystem.Service;

import java.util.List;


import org.com.FeedbackSystem.Repository.AdminRepo;
import org.com.FeedbackSystem.model.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serv")
public class AdminServ {
	@Autowired
	AdminRepo repo;

public List chackAdmin(admin a) {

	return repo.chackAdmin(a);
}
}
