package com.ncvt.domain;

/**
 * 话题类别表
 * @author wu
 *
 */

public class TopicType {
	public int topic_type_id;
	public String topic_type;
	public TopicType() {
		super();
	}
	public TopicType(String topic_type) {
		super();
		this.topic_type = topic_type;
	}
	public int getTopic_type_id() {
		return topic_type_id;
	}
	public void setTopic_type_id(int topic_type_id) {
		this.topic_type_id = topic_type_id;
	}
	public String getTopic_type() {
		return topic_type;
	}
	public void setTopic_type(String topic_type) {
		this.topic_type = topic_type;
	}
	@Override
	public String toString() {
		return "TopicType [topic_type_id=" + topic_type_id + ", topic_type=" + topic_type + "]";
	}
	
	

}
