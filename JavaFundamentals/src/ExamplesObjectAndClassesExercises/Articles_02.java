package ExamplesObjectAndClassesExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles_02 {

    static class Article{
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
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

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString(){
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");
        String title = data[0];
        String content = data[1];
        String author = data[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split(": ");
            String command = commands[0];
            String commandProperty = commands[1];

            switch (command){
                case "Edit":
                    article.setContent(commandProperty);
                    break;

                case "ChangeAuthor":
                    article.setAuthor(commandProperty);
                    break;

                case "Rename":
                    article.setTitle(commandProperty);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
