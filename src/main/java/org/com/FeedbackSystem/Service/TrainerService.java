package org.com.FeedbackSystem.Service;

import java.util.List;

import org.com.FeedbackSystem.model.Submodel;
import org.com.FeedbackSystem.model.Trainer;

public interface TrainerService
{
	public boolean AddTrainer(Trainer T);
	//public List<Trainer> viewTrainer(Trainer m);
	public boolean updateTrainer(Trainer m);
	public boolean DisableTrainer(Trainer m);
	//public List<Trainer> SearcTrainer(String m);
	public boolean EnableTrainer(Trainer m);
	public boolean IsAvailableTrainer(String sub);
	public List<Trainer> ViewalTrainer(Trainer m);
	//public List<Trainer> SearchTrainer(String m);
	public List<Trainer> searchTrainer(String m);
	public List<Trainer> viewTrainer();
	//public boolean updSub(Submodel s);
}
