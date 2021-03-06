package com.sist.dao;
/*
 *   NO       NOT NULL NUMBER        
	CATENO            NUMBER        
	TITLE    NOT NULL VARCHAR2(200) 
	POSTER   NOT NULL VARCHAR2(300) 
	REGDATE           VARCHAR2(200) 
	GENRE    NOT NULL VARCHAR2(100) 
	GRADE    NOT NULL VARCHAR2(100) 
	ACTOR             VARCHAR2(100) 
	SCORE             VARCHAR2(20)  
	DIRECTOR NOT NULL VARCHAR2(100) 
	STORY             CLOB          
	KEY               VARCHAR2(50)  
	HIT               NUMBER        

 */
public class MovieVO {
    private String poster;
    private String title;
    private String regdate;
    private String grade;
    private String genre;
    private String actor;
    private String score;
    private String director;
    private String story,key;
    private int hit,no,cateno;
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCateno() {
		return cateno;
	}
	public void setCateno(int cateno) {
		this.cateno = cateno;
	}
	  
}
