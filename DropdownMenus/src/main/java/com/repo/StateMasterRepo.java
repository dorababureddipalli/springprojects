package com.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.StatesMaster;

@Repository
public class StateMasterRepo {
	private List<StatesMaster> statelist = new ArrayList<>();

	public StatesMaster saveState(StatesMaster sm) {
		boolean add = statelist.add(sm);
		if (add)
			return sm;
		else
			return null;
	}

	public List<StatesMaster> getAllStates() {

		return statelist;
	}

//	public void dataForStatesMaster() {
//		statelist.add(new StatesMaster(1,"India","+91"));
//		statelist.add(new StatesMaster(2,"Newzland","+813"));
//	}
}
