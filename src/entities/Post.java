package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date mooment;
	private String title;
	private String content;
	private Integer like;
	
	private List<Comment> coments = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date mooment, String title, String content, Integer like) {
		
		this.mooment = mooment;
		this.title = title;
		this.content = content;
		this.like = like;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getMooment() {
		return mooment;
	}

	public Integer getLike() {
		return like;
	}

	public List<Comment> getComents() {
		return coments;
	}
	
	public void addComent(Comment comment) {
		
		coments.add(comment);
		
	}//Adiciona o comentario a lista
	
	@Override
	public String toString() {
		
		return "Moment: "+sdf.format(mooment)
		+"\nTitle: "+title
		+"\nContent: "+content
		+"\nLikes: "+like
		+"\nComents: "+coments.toString();
		
	}
//Essa classe vai retornar os dados do Post
	
	
}
