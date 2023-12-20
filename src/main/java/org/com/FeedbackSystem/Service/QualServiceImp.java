package org.com.FeedbackSystem.Service;

import org.com.FeedbackSystem.Repository.QualRepo;
import org.com.FeedbackSystem.model.Qualification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Serv")
public class QualServiceImp implements QualService {
	@Autowired
	QualRepo repo;

	@Override
	public boolean AddQual(Qualification q) {
		// TODO Auto-generated method stub
		return repo.AddQual(q);
	}
}
