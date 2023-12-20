package org.com.FeedbackSystem.Repository;

import java.util.List;

import org.com.FeedbackSystem.model.Submodel;

public interface SubRepository 
{
	
public boolean addsub(Submodel model);
public List<Submodel> viewSub(Submodel m);
public boolean updatesub(Submodel m);
public boolean Disablesub(Submodel m);
public List<Submodel> SearchSub(String m);
public boolean EnableSubject(Submodel m);
public boolean IsAvailableSub(String sub);
public List<Submodel> Viewallsub(Submodel m);

}
