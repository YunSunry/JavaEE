package com.ncvt.domain;

import java.util.Date;

/**
 * »î¶¯±í
 * @author wu
 *
 */

public class Activity {
	public int acitivity_id;
	public int event_sponsor;
	public int activity_type_id;
	public String activity_name;
	public String activity_content;
	public Date activity_date;
	public String registration_period;
	public int active_state;
	public int participants;
	
	
	public Activity() {
		super();
	}


	public Activity(int event_sponsor, int activity_type_id, String activity_name, String activity_content,
			Date activity_date, String registration_period, int active_state, int participants) {
		super();
		this.event_sponsor = event_sponsor;
		this.activity_type_id = activity_type_id;
		this.activity_name = activity_name;
		this.activity_content = activity_content;
		this.activity_date = activity_date;
		this.registration_period = registration_period;
		this.active_state = active_state;
		this.participants = participants;
	}


	public int getAcitivity_id() {
		return acitivity_id;
	}


	public void setAcitivity_id(int acitivity_id) {
		this.acitivity_id = acitivity_id;
	}


	public int getEvent_sponsor() {
		return event_sponsor;
	}


	public void setEvent_sponsor(int event_sponsor) {
		this.event_sponsor = event_sponsor;
	}


	public int getActivity_type_id() {
		return activity_type_id;
	}


	public void setActivity_type_id(int activity_type_id) {
		this.activity_type_id = activity_type_id;
	}


	public String getActivity_name() {
		return activity_name;
	}


	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}


	public String getActivity_content() {
		return activity_content;
	}


	public void setActivity_content(String activity_content) {
		this.activity_content = activity_content;
	}


	public Date getActivity_date() {
		return activity_date;
	}


	public void setActivity_date(Date activity_date) {
		this.activity_date = activity_date;
	}


	public String getRegistration_period() {
		return registration_period;
	}


	public void setRegistration_period(String registration_period) {
		this.registration_period = registration_period;
	}


	public int getActive_state() {
		return active_state;
	}


	public void setActive_state(int active_state) {
		this.active_state = active_state;
	}


	public int getParticipants() {
		return participants;
	}


	public void setParticipants(int participants) {
		this.participants = participants;
	}


	@Override
	public String toString() {
		return "activity [acitivity_id=" + acitivity_id + ", event_sponsor=" + event_sponsor + ", activity_type_id="
				+ activity_type_id + ", activity_name=" + activity_name + ", activity_content=" + activity_content
				+ ", activity_date=" + activity_date + ", registration_period=" + registration_period
				+ ", active_state=" + active_state + ", participants=" + participants + "]";
	}
	
	
	
	
	
	
	
	
	
}
