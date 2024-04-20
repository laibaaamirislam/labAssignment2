import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pc> list = new ArrayList<>();
        list.add(new Pc(1, "cpu1", "ram1", "storage1", "hp1", false));
        list.add(new Pc(78, "cpu2", "ram2", "storage2", "lenovo", false));
        list.add(new Pc(3, "cpu3", "ram3", "storage3", "toshiba1", false));
        list.add(new Pc(89, "cpu4", "ram4", "storage4", "lcd4", false));
        list.add(new Pc(54, "cpu5", "ram5", "storage5", "lcd5", false));
        list.add(new Pc(70, "cpu6", "ram6", "storage6", "lcd6", false));
        list.add(new Pc(33, "cpu7", "ram7", "storage7", "lcd7", false));
        list.add(new Pc(22, "cpu8", "ram8", "storage8", "lcd8", false));
        list.add(8, new Pc(9, "cpu2", "ram2", "storage9", "lcd9", false));

        List<Pc> list2 = new ArrayList<>();
        list2.add(new Pc(55, "l2cpu1", "l2ram1", "l2str1", "l2lcd1", false));

        list.addAll(list2);
        list.addAll(9, list2);


//        for (Pc temp:list)
//            System.out.println(temp);

       // System.out.println(list.size());

        // list.remove(new Pc(3,"cpu3","ram3","storage3","lcd3",false));
        // list.remove(2);
        //list.clear();
        //boolean b = list.contains(new Pc(78,"cpu7","ram7","storage7","lcd7",false));
        //System.out.println(b);

        //boolean b2 = list.containsAll(list2);
        //System.out.println(b2);

         //list.addLast(new Pc(11,"cpu11","ram11","s11","l11",true));
        //System.out.println(list.size());
        //list.set(2,new Pc(23,"update","u","u","u",true));

//
//        for (Pc temp : list) {
//            //System.out.println(temp.getId());
//            int newId = temp.getId();
//            newId += 2;
//            temp.setId(newId);
//          //  System.out.println(temp.getId());
//        }

//        for(int i=0;i<list.size();i++)
//                 list.get(i).setId(list.get(i).getId()+2); get() gives obj

//        for (Pc temp : list) {
//            temp.setId((temp.getId()+2));
//        }
//
//        for(Pc temp: list)
//            System.out.println(temp.getId());
//

//        System.out.println(list.equals(list2));

       Collections.sort(list);


       for(Pc temp: list){
           System.out.println(temp.getId());
       }



    }

}