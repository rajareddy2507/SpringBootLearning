package com.CoursesRunner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {

	@Autowired 
	public static CoursesBusiness coursesBusiness;
	@RequestMapping("/welcome")
	public String sayHi(){
		return "Hello";
	}
	
	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		return coursesBusiness.getallTopics();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic){
		coursesBusiness.addnewTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/topics/{topicId}")
	public void getTopicById(@PathVariable String topicId){
		coursesBusiness.getTopicById(topicId);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}")
	public void updateTopicById(@RequestBody Topic topic, @PathVariable String topicId){
		coursesBusiness.updateTopicById(topic, topicId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}")
	public void deleteTopicById(@PathVariable String topicId){
		coursesBusiness.deleteTopicById(topicId);
	}
}
