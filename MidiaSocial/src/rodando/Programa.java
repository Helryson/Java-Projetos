package rodando;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Programa {
 public static void main(String[] args) throws ParseException {
	 
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	 
	 Scanner sc = new Scanner(System.in);
	 
	 Comment c1 = new Comment("Have a nice trip!");
	 Comment c2 = new Comment("Wow that's awesone!");
	 
	 Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to Brazil", "I'm going to visit  this wonderful country!", 12);
	 p1.addComentario(c1);
	 p1.addComentario(c2);
	 
	 System.out.println(p1);
	 
 }
}
