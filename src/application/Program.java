package application;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws HeadlessException, ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date moment = sdf.parse(JOptionPane.showInputDialog("Date and hour of post! dd/MM/yyyy HH:mm:ss"));
		String title = JOptionPane.showInputDialog("Enter the title of post!");
		String content = JOptionPane.showInputDialog("Enter the content of post!");
		int likes = Integer.parseInt(JOptionPane.showInputDialog("How many likes post?"));
		Post post = new Post(moment, title, content, likes);
		//Vai receber todos o dados para passar para a classe Post
		int n = Integer.parseInt(JOptionPane.showInputDialog("How Many coments"));
		
		for (int i = 1; i <=n; i++) {
			
			String text = JOptionPane.showInputDialog("Coment: ");
			Comment coment = new Comment(text);
			post.addComent(coment);
		}
		
		System.out.println(post);
		//Esta retornando os dados de uma forma estranha
		
	}

}
