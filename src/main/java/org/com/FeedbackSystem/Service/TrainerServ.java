package org.com.FeedbackSystem.Service;

import java.util.List;

import org.com.FeedbackSystem.Repository.AdminRepo;
import org.com.FeedbackSystem.Repository.TrainerRepo;
import org.com.FeedbackSystem.model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Trianer1")
public class TrainerServ implements TrainerService
{
	
//	@SuppressWarnings("unused")
//	private final TrainerRepo Tr;
	@Autowired
	TrainerRepo Trianer;
	@Override
	public boolean AddTrainer(Trainer T) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTrainer(Trainer m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DisableTrainer(Trainer m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean EnableTrainer(Trainer m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean IsAvailableTrainer(String sub) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Trainer> ViewalTrainer(Trainer m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trainer> searchTrainer(String m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trainer> viewTrainer() {
		// TODO Auto-generated method stub
		return null;
	}

}
