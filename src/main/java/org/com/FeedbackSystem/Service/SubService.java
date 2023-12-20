package org.com.FeedbackSystem.Service;

import java.util.List;

import org.com.FeedbackSystem.model.Submodel;

public interface SubService {
public boolean AddSubject(Submodel model);
public List<Submodel> viewSub(Submodel m);
public boolean updSub(Submodel m);
public boolean Disablesub(Submodel m);
public List<Submodel> Search(String m);
public boolean EnableSubject(Submodel m);
public boolean IsAvailableSub(String sub);
public List<Submodel> viewallsub(Submodel m);

}
