package ObjectAndClasses.excercise;

import java.util.Scanner;

public class P02Article {
   public static  class Article{
        String title;
        String content;
        String author;

        public Article(String title,String content,String author){
            this.title=title;
            this.content=content;
            this.author=author;
        }

        public String getContent() {
            return content;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
    public static  void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String title=input.split(", ")[0];
        String content=input.split(", ")[1];
        String author=input.split(", ")[2];
        int n=Integer.parseInt(scanner.nextLine());
        Article article=new Article(title,content,author);

        for (int i = 0; i <n ; i++) {
            String command=scanner.nextLine();
            if (command.contains("Edit")){
                String newContent=command.split(": ")[1];
                article.setContent(newContent);

            }else if(command.contains("ChangeAuthor")){
                String newAuthor=command.split(": ")[1];
                article.setAuthor(newAuthor);

            }else if(command.contains("Rename")) {
                String newTitle = command.split(": ")[1];
                article.setTitle(newTitle);

            }
        }
        System.out.printf("%s - %s: %s",article.getTitle(),article.getContent(),article.getAuthor());
    }
}
