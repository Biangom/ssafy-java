

// parsing한 결과를 저장할 vo
public class News {
	private String title;
	private String desc;
	private String link;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public News(String title, String desc, String link) {
		super();
		this.title = title;
		this.desc = desc;
		this.link = link;
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return title + " - " + link;
	}
	
	
	
	
}
