package com.spring.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learning.model.TopicDTO;
import com.spring.learning.services.TopicService;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;

	@RequestMapping(method=RequestMethod.GET,value="/topics")
	public List<TopicDTO> listOfTopics(){
		return topicService.alltopics();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/topics/{id}")
	public TopicDTO topicDetail(@PathVariable long id){
		return topicService.getonlyTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void newTopic(@RequestBody TopicDTO topicDTO){
		topicService.addTopic(topicDTO);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody TopicDTO topicDTO,@PathVariable long id){
		topicService.editTopic(topicDTO,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable long id){
		topicService.removeTopic(id);
	}
}
