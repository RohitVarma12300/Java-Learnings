import java.util.*;

public class Collection{
    public static void main(){
        int age=25;
        int age1=40;
        int age3=18;

        //array -store multiple values at once
        int [] ages_of_family={25,40,18,37,5};

        //ages_of_family[0] --> 25
        //ages_of_family[3]-->37
        System.out.println(ages_of_family[3]);

        //ages_of_family[3]=38;
        System.out.println(ages_of_family[3]);

        int [] number=new int[6];
        for(int i=0;i<5;i++){
            ages_of_family[i]++;
            System.out.println(ages_of_family[i]);
        }

        // problem of the array is -> fixed size
        //Collections in java (List, set, map)

        //ArrayList
        List<String> fruits =new ArrayList<>();
        fruits.add("Apple");
        fruits.add("MAngo");
        fruits.add("banana");
        fruits.add("Apple");

        System.out.println(fruits);

        fruits.remove(1);
        for(int i=0;i<fruits.size() ;i++){
            //System.out.println(fruits.get(i));
        }
        //operations in Arraylist
        //1 add
        //2 size
        //3 get

        //set -> becoz we want only unique elements
        // most common implementation of set is HashSet

        Set<String> songs =new HashSet<>();
        songs.add("abc");
        songs.add("pop");
        songs.add("xyz");
        songs.add("pop");
        System.out.println(songs);

//        List <String> songlist = new ArrayList<>(songs);
//        for(int i=0;i<songlist.size() ;i++){
//            System.out.println(songlist.get(i));
//        }


        //map
        //ram->75
        //anand->98
        //rohit ->99

        Map<String,Integer> marks_table = new HashMap<>();
        marks_table.put("Ram",75);
        marks_table.put("Anand",98);
        marks_table.put("Rohit" ,99);

        int ram_mark=marks_table.get("Ram");

        System.out.println(ram_mark);

    }
}

