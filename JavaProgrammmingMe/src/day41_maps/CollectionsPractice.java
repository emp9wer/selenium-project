package src.day41_maps;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,0,5,6,7,8));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,100,5,6,7,8));

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        //[[1, 2, 3, 0, 5, 6, 7, 8], [1, 2, 3, 100, 5, 6, 7, 8]]
        System.out.println(lists);

        System.out.println(lists.get(1).get(3));//100

        for(List<Integer> eachList : lists){

        }

        List<Set<Integer>> listOfSets = new ArrayList<>();

        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());

        System.out.println(listOfSets);//[[], [], [], []]

        // {10,5,20}
        listOfSets.get(0).addAll(Arrays.asList(1,2,1,2,3));
        listOfSets.get(1).addAll(Arrays.asList(1,2,1,2,3));
        listOfSets.get(2).addAll(Arrays.asList(1,2,1,2,3));
        listOfSets.get(3).addAll(Arrays.asList(1,2,1,2,3));

        System.out.println(listOfSets); //[[1, 2, 3], [1, 2, 3], [1, 2, 3], [1, 2, 3]]

        System.out.println("-------------------");





    }


}
