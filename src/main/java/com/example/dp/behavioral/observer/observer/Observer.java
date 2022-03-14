package com.example.dp.behavioral.observer.observer;

import com.example.dp.behavioral.observer.subject.Subject;

public interface Observer {
	
	//method to update the observer, used by subject
	public void update();
	
	//attach with subject to observe
	public void setSubject(Subject sub);
}
