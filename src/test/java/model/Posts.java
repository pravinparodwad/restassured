package model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Posts {
    public class Builder {

		public String build() {
			// TODO Auto-generated method stub
			return null;
		}

	}
	private int id;
    private String title;
    private String author;
    
    public Posts getBody() {
    	return this;
    }
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
