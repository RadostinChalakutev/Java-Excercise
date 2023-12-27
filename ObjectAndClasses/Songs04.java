package ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs04 {
    static class Song {
        private String typeList;
        private String name;
        private String time;

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;

        }

        public String getTime() {
            return time;

        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < numSongs; i++) {
            String[]token=scanner.nextLine().split("_");
            String type=token[0];
            String name=token[1];
            String time=token[2];
            Song song =new Song();
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);
            songList.add(song);
        }
        String typeList=scanner.nextLine();
        if(typeList.equals("all")){
            for (Song song:songList){
                System.out.println(song.getName());
            }

        }else{
            for (Song song:songList){
                if (song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }

        }



    }
}
