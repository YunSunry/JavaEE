package com.ncvt.domain;

/**
 * ª∞Ã‚±Ì
 * @author wu
 *
 */

public class Topic {
	public int topic_id;
	public int initiator_id;
	public int topic_type_id;
	public Double topic_title;
	public String topic_content;
	public String topic_pic;
	public int gather_watch;
	public int discussions;
	public Topic() {
		super();
	}
	public Topic(int initiator_id, int topic_type_id, Double topic_title, String topic_content, String topic_pic,
			int gather_watch, int discussions) {
		super();
		this.initiator_id = initiator_id;
		this.topic_type_id = topic_type_id;
		this.topic_title = topic_title;
		this.topic_content = topic_content;
		this.topic_pic = topic_pic;
		this.gather_watch = gather_watch;
		this.discussions = discussions;
	}
	public int getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
	public int getInitiator_id() {
		return initiator_id;
	}
	public void setInitiator_id(int initiator_id) {
		this.initiator_id = initiator_id;
	}
	public int getTopic_type_id() {
		return topic_type_id;
	}
	public void setTopic_type_id(int topic_type_id) {
		this.topic_type_id = topic_type_id;
	}
	public Double getTopic_title() {
		return topic_title;
	}
	public void setTopic_title(Double topic_title) {
		this.topic_title = topic_title;
	}
	public String getTopic_content() {
		return topic_content;
	}
	public void setTopic_content(String topic_content) {
		this.topic_content = topic_content;
	}
	public String getTopic_pic() {
		return topic_pic;
	}
	public void setTopic_pic(String topic_pic) {
		this.topic_pic = topic_pic;
	}
	public int getGather_watch() {
		return gather_watch;
	}
	public void setGather_watch(int gather_watch) {
		this.gather_watch = gather_watch;
	}
	public int getDiscussions() {
		return discussions;
	}
	public void setDiscussions(int discussions) {
		this.discussions = discussions;
	}
	@Override
	public String toString() {
		return "Topic [topic_id=" + topic_id + ", initiator_id=" + initiator_id + ", topic_type_id=" + topic_type_id
				+ ", topic_title=" + topic_title + ", topic_content=" + topic_content + ", topic_pic=" + topic_pic
				+ ", gather_watch=" + gather_watch + ", discussions=" + discussions + "]";
	}
	
	

	
	

}
