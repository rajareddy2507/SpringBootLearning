package com.CoursesRunner;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	@Id
	private String topic_Id;
	private String topic_Name;
	
	
	public Topic() {
		super();
	}
	public Topic(String topic_Id, String topic_Name) {
		super();
		this.topic_Id = topic_Id;
		this.topic_Name = topic_Name;
	}
	public String getTopic_Id() {
		return topic_Id;
	}
	public void setTopic_Id(String topic_Id) {
		this.topic_Id = topic_Id;
	}
	public String getTopic_Name() {
		return topic_Name;
	}
	public void setTopic_Name(String topic_Name) {
		this.topic_Name = topic_Name;
	}

	public String toString() {
		return "Topic [topic_Id=" + topic_Id + ", topic_Name=" + topic_Name + "]";
	}
	
}
