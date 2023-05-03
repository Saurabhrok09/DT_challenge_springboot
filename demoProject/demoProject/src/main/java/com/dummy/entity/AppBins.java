package com.dummy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AppBins {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;   //user id
	private String type;   //event type
	private String name;	//Name of the event
	 private String tagline;		//: A proper tag-line for the event
	// private Date schedule;			//: (Date + time) Timestamp
	 private String description;			//: String
	 private String files;//[image]//: Image file (File upload)
	 private String moderator;//: A user who is going to host
	 private String category;//: Category of the event
	 private String sub_category;//: Sub category
	 private int  rigor_rank;//: Integer value
	 private int attendees;//: Array of user Id's who is attending the event
	 
	 
	 
		@Override
		public String toString() {
			return "AppBins [uid=" + uid + ", type=" + type + ", name=" + name + ", tagline=" + tagline + ", description="
					+ description + ", files=" + files + ", moderator=" + moderator + ", category=" + category
					+ ", sub_category=" + sub_category + ", rigor_rank=" + rigor_rank + ", attendees=" + attendees + "]";
		}



		public int getUid() {
			return uid;
		}



		public void setUid(int uid) {
			this.uid = uid;
		}



		public String getType() {
			return type;
		}



		public void setType(String type) {
			this.type = type;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getTagline() {
			return tagline;
		}



		public void setTagline(String tagline) {
			this.tagline = tagline;
		}



		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}



		public String getFiles() {
			return files;
		}



		public void setFiles(String files) {
			this.files = files;
		}



		public String getModerator() {
			return moderator;
		}



		public void setModerator(String moderator) {
			this.moderator = moderator;
		}



		public String getCategory() {
			return category;
		}



		public void setCategory(String category) {
			this.category = category;
		}



		public String getSub_category() {
			return sub_category;
		}



		public void setSub_category(String sub_category) {
			this.sub_category = sub_category;
		}



		public int getRigor_rank() {
			return rigor_rank;
		}



		public void setRigor_rank(int rigor_rank) {
			this.rigor_rank = rigor_rank;
		}



		public int getAttendees() {
			return attendees;
		}



		public void setAttendees(int attendees) {
			this.attendees = attendees;
		}

//get

		public AppBins get() {
			// TODO Auto-generated method stub
			return null;
		}
		
		

}



//{
//    "uid": 3,
//    "type": "bday",
//    "name":"sauabh",
//    "tagline":"happy bdya",
//    "description": "on hi sbday",
//    "files": "x/y/z",
//    "moderator":"aaba",
//    "category": "celebration",
//    "sub_category":"bdayCele",
//    "rigor_rank":1005,
//    "attendees": 99
//}
