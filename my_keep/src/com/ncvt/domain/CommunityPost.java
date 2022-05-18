package com.ncvt.domain;

import java.util.Date;

/**
 * 社区帖子表
 * @author wu
 *
 */

public class CommunityPost {
	
	public int poster;
	public int community_post_id;
	public int main_post_id;
	public int topic_id;
	public Date posting_date;
	public String posting_title;
	public String posting_content;
	public int like_nums;
	public String location;
	public CommunityPost() {
		super();
	}
	public CommunityPost(int poster, int community_post_id, int main_post_id, int topic_id, Date posting_date,
			String posting_title, String posting_content, int like_nums, String location) {
		super();
		this.poster = poster;
		this.community_post_id = community_post_id;
		this.main_post_id = main_post_id;
		this.topic_id = topic_id;
		this.posting_date = posting_date;
		this.posting_title = posting_title;
		this.posting_content = posting_content;
		this.like_nums = like_nums;
		this.location = location;
	}
	public int getPoster() {
		return poster;
	}
	public void setPoster(int poster) {
		this.poster = poster;
	}
	public int getCommunity_post_id() {
		return community_post_id;
	}
	public void setCommunity_post_id(int community_post_id) {
		this.community_post_id = community_post_id;
	}
	public int getMain_post_id() {
		return main_post_id;
	}
	public void setMain_post_id(int main_post_id) {
		this.main_post_id = main_post_id;
	}
	public int getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
	public Date getPosting_date() {
		return posting_date;
	}
	public void setPosting_date(Date posting_date) {
		this.posting_date = posting_date;
	}
	public String getPosting_title() {
		return posting_title;
	}
	public void setPosting_title(String posting_title) {
		this.posting_title = posting_title;
	}
	public String getPosting_content() {
		return posting_content;
	}
	public void setPosting_content(String posting_content) {
		this.posting_content = posting_content;
	}
	public int getLike_nums() {
		return like_nums;
	}
	public void setLike_nums(int like_nums) {
		this.like_nums = like_nums;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "CommunityPost [poster=" + poster + ", community_post_id=" + community_post_id + ", main_post_id="
				+ main_post_id + ", topic_id=" + topic_id + ", posting_date=" + posting_date + ", posting_title="
				+ posting_title + ", posting_content=" + posting_content + ", like_nums=" + like_nums + ", location="
				+ location + "]";
	}

	
	
	
	
}
