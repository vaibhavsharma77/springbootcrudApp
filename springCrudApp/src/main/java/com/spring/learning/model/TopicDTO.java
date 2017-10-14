package com.spring.learning.model;

public class TopicDTO {
	private long topicId;
	private String topicName;
	private long partion;
	private long replication;

	public long getTopicId() {
		return topicId;
	}

	public void setTopicId(long topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public long getPartion() {
		return partion;
	}

	public void setPartion(long partion) {
		this.partion = partion;
	}

	public long getReplication() {
		return replication;
	}

	public void setReplication(long replication) {
		this.replication = replication;
	}

	public TopicDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TopicDTO(long topicId, String topicName, long partion,
			long replication) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.partion = partion;
		this.replication = replication;
	}

}
