package org.com.FeedbackSystem.Service;

import java.util.List;

import org.com.FeedbackSystem.Repository.SubRepository;
import org.com.FeedbackSystem.model.Submodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("subserv")
public class SubServiceImp implements SubService {
	@Autowired
	SubRepository Subrepo;
	@Override
	public boolean AddSubject(Submodel model) {

		return Subrepo.addsub(model);
	}
	@Override
	public List<Submodel> viewSub(Submodel m) {
		return Subrepo.viewSub(m);
	}
	@Override
	public boolean updSub(Submodel m) {
		// TODO Auto-generated method stub
		return Subrepo.updatesub(m);
	}
	@Override
	public boolean Disablesub(Submodel m) {
		// TODO Auto-generated method stub
		return Subrepo.Disablesub(m);
	}
	@Override
	public List<Submodel> Search(String m) {
		
		// TODO Auto-generated method stub
		return Subrepo.SearchSub(m);
	}
	@Override
	public boolean EnableSubject(Submodel m) {
		// TODO Auto-generated method stub
		return Subrepo.EnableSubject(m);
	}
	@Override
	public boolean IsAvailableSub(String sub) {
		// TODO Auto-generated method stub
		return Subrepo.IsAvailableSub(sub);
	}
	@Override
	public List<Submodel> viewallsub(Submodel m) {
		// TODO Auto-generated method stub
		return Subrepo.Viewallsub(m);
	}
}
