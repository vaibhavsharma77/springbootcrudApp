package com.spring.learning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.learning.DAO.TopicDAO;
import com.spring.learning.model.TopicDTO;
@Service
public class TopicService {
	@Autowired
	private TopicDAO topicDao;
	
	public List<TopicDTO> alltopics(){
		return topicDao.getAllTopics();
	}

	public TopicDTO getonlyTopic(long id){
		return topicDao.getTopic(id);
	}

	public void addTopic(TopicDTO topicDTO) {
		// TODO Auto-generated method stub
		topicDao.topicadd(topicDTO);
	}

	public void editTopic(TopicDTO topicDTO, long id) {
		topicDao.topicUpdate(topicDTO,id);
		
	}

	public void removeTopic(long id) {
		topicDao.releasetopic(id);
		
	}
}
