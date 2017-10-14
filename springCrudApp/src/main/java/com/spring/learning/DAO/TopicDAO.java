package com.spring.learning.DAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.learning.model.TopicDTO;

@Repository
public class TopicDAO {
	List<TopicDTO> topics = new ArrayList<TopicDTO>(Arrays.asList(new TopicDTO(
			1, "chillertopic", 2, 2), new TopicDTO(2, "AcTopic", 1, 2),
			new TopicDTO(3, "sensorTopic", 1, 2)));

	public List<TopicDTO> getAllTopics() {
		return topics;
	}

	public TopicDTO getTopic(long id) {
		for (int i = 0; i < topics.size(); i++) {
			TopicDTO topic = topics.get(i);
			if (topic.getTopicId() == id) {
				return topic;
			}

		}
		return null;
	}

	public void topicadd(TopicDTO topicDTO) {
		topics.add(topicDTO);

	}

	public void topicUpdate(TopicDTO topicDTO, long id) {
		for (int i = 0; i < topics.size(); i++) {
			TopicDTO tp = topics.get(i);
			if (tp.getTopicId() == id) {
				topics.set(i, topicDTO);
			}
		}

	}

	public void releasetopic(long id) {
		for (int i = 0; i < topics.size(); i++) {
			TopicDTO tp = topics.get(i);
			if (tp.getTopicId() == id) {
				topics.remove(i);
			}

		}

	}
}
