package com.newsPrac1_28;

// parsing�� ����� ������ vo
public class News {
	private String title;
	private String pubDate;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public News(String title, String pubDate) {
		super();
		this.title = title;
		this.pubDate = pubDate;
	}
	public News() {
		super();
	}
	
	@Override
	public String toString() {
		return title + "-" + pubDate;
	}
	
}
