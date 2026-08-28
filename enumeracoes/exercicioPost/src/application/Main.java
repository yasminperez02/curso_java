package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    void main() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


        LocalDateTime p1Data = LocalDateTime.parse("2026-08-28T12:23:44");
        String title = "Traveling to New Zealand";
        String content = "I'm going to visit this wonderful country!";
        int likes = 12;

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(p1Data, title, content, likes);
        p1.addComment(c1);
        p1.addComment(c2);

        LocalDateTime p2Data = LocalDateTime.parse("2026-08-27T21:25:03");
        Post p2 = new Post(p2Data, "Good night guys", "See you tomorrow", 5);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        p2.addComment(c3);
        p2.addComment(c4);

        IO.println(p1);
        IO.println(p2);
    }
}
