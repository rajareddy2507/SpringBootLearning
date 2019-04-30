package com.CoursesRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
	
@Service
public class CoursesBusiness {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getallTopics() {
		List<Topic> topics_DB = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics_DB::add);
		return topics_DB;
	}

	public void addnewTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public Optional<Topic> getTopicById(String topicId) {
		return topicRepository.findById(topicId);
	}
	
	public void updateTopicById(Topic topic, String topicId){
		topicRepository.save(topic);
	}
	
	public void deleteTopicById(String topicId){
		topicRepository.deleteById(topicId);
	}
}
