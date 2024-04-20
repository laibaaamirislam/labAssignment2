import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pc> list = new ArrayList<>();

        list.add(new Pc(23, "AMD Ry-zen 7", "16GB DDR4", "1TB HDD", "LG", true));
        list.add(new Pc(14, "Intel Core i5", "8GB DDR4", "512GB SSD", "Samsung", true));
        list.add(new Pc(7, "Intel Core i7", "32GB DDR4", "256GB SSD", "Dell", false));
        list.add(new Pc(8, "AMD Ry zen 5", "8GB DDR4", "512GB SSD", "HP", false));
        list.add(new Pc(28, "Intel Core i9", "64GB DDR4", "2TB HDD", "Asus", true));
        list.add(new Pc(31, "Intel Core i9", "64GB DDR4", "2TB HDD", "Asus", true));
        list.add(new Pc(16, "AMD Ry-zen 9", "16GB DDR4", "1TB SSD", "Acer", true));
        list.add(new Pc(26, "Intel Core i3", "4GB DDR4", "128GB SSD", "Lenovo", false));
        list.add(new Pc(6, "AMD Ry-zen 3", "8GB DDR4", "256GB SSD", "MSI", false));
        list.add(new Pc(96, "Intel Core i5", "16GB DDR4", "512GB SSD", "Apple", true));

        List<Pc> list2 = new ArrayList<>();
        list2.add(new Pc(10, "AMD Ry-zen 7", "32GB DDR4", "1TB SSD", "Sony", true));
        list2.add(new Pc(19, "Intel Core i5", "8GB DDR4", "512GB SSD", "Samsung", true));

        list.addAll(list2);
        list.addAll(9, list2);

        System.out.println("initial size " + list.size());

        list.remove(new Pc(96, "Intel Core i5", "16GB DDR4", "512GB SSD", "Apple", true));
        list.remove(2);


        //list.clear();

        System.out.println("list contains Pc? : "+list.contains(new Pc(19, "Intel Core i5", "8GB DDR4", "512GB SSD", "Samsung", true)));
        //System.out.println(list.containsAll(list2));

        list.addLast(new Pc(9, "Intel Core i5", "16GB DDR4", "512GB SSD", "Apple", true));

        System.out.println("size after removing 2 Pcs and adding 1... " + list.size());

        list.set(2,new Pc(45,"updated cpu","updated ram","updated storage","updated lcdMaker",true));
        System.out.println("updated pc on index 2\n" +list.get(2));


        System.out.println("before incrementing Id by 2...");
        for(Pc temp: list)
            System.out.println(temp.getId());

        for (Pc temp : list) {
            temp.setId((temp.getId()+2));
        }

        System.out.println("after incrementing Id by 2...");
        for(Pc temp: list)
            System.out.println(temp.getId());

        //for(int i=0;i<list.size();i++)
            //list.get(i).setId(list.get(i).getId()+2); //get(i) gives obj

        System.out.println("if the lists are equal: "+ list.equals(list2));

        Collections.sort(list); //comparator interface
        list.sort(Pc::compareTo); //comparable interface

        System.out.println("after being sorted...");
       for(Pc temp: list){
           System.out.println(temp.getId());
       }

        System.out.println("after being reversed...");
       Collections.reverse(list);
        for(Pc temp: list){
            System.out.println(temp.getId());
        }

    }

}