package org.example;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(10);
        myList.add(15);
        myList.add(20);
        myList.add(22);
        myList.add(44);
        System.out.println("Dizideki eleman sayısı: " + myList.size());
        System.out.println("Dizinin kapasitesi: " + myList.getCapacity());
        myList.add(33);
        myList.add(10);
        myList.add(15);
        myList.add(20);
        myList.add(22);
        System.out.println("Dizideki eleman sayısı: " + myList.size());
        System.out.println("Dizinin kapasitesi: " + myList.getCapacity());
        myList.add(44);
        System.out.println("Dizideki eleman sayısı: " + myList.size());
        System.out.println("Dizinin kapasitesi: " + myList.getCapacity());
        
    }
}