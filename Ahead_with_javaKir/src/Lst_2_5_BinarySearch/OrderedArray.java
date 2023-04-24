package Lst_2_5_BinarySearch;

public class OrderedArray {
    private long[] a;                                   //declare array named "a"
    private int nElems;                                 //declare variable for number of elements in array

    public OrderedArray(int max) {                      //array constructor
        a = new long[max];                              //create the array
        nElems = 0;                                     //0 items at start
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {                   //"Find" interface description
        int lowerBound = 0;                             //declare and assign variable for lower boundary
        int upperBound = nElems - 1;                    //declare and assign variable for upper boundary
        int curIn;                                      //declare variable for search index
        while (true) {
            curIn = (lowerBound + upperBound) / 2;      //assign first search index
            if (a[curIn] == searchKey)
                return curIn;                           //element found in current array at index curIn
            else if (lowerBound > upperBound)
                return nElems;                          //element not found in current array
            else                                        //search range splitting
            {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;              //continue search to upper half of array
                else
                    upperBound = curIn - 1;              //continue search to lower half of array
            }
        }
    }

    public void insert(long value) {                    //"insert" method description

        int lowerBound = 0;                             //declare and assign variable for lower boundary
        int upperBound = nElems - 1;                    //declare and assign variable for upper boundary
        int j = 0;                                      //declare variable for search index

        while (true) {
            j = (lowerBound + upperBound) / 2;
            if (a[j] == value)
                break;                                  //exit loop if duplicate is found
            else if (lowerBound > upperBound) {
                break;                                  //exit loop if inserting element is out of array
            } else {                                    //search range splitting
                if (a[j] > value) {
                    upperBound = j - 1;                 //continue search in lower half of array

                } else {
                    lowerBound = j + 1;                 //continue search in upper half of array
                }
            }
        }

        if (a[j] == value) {                            //reassign element in case of duplicate
            a[j] = value;
        } else if (upperBound < 0) {                    //insert element at the beginning of array
            for (int k = nElems; k > j; k--) {
                a[k] = a[k - 1];                        //shift all the existing elements to the right
            }
            a[j] = value;                               //insert new element into array

            nElems++;                                   //increase the visible part of the array
        } else {                                        //insert element at any place of array besides the beginning
            for (int k = nElems; k > j; k--) {
                a[k] = a[k - 1];                        //shift all the existing elements more than inserting element to the right
            }
            a[j + 1] = value;                           //insert new element into array
            nElems++;                                   //increase the visible part of the array
        }
    }

    public boolean delete(long value) {                 //"delete" method description
        int j = find(value);
        if (j == nElems) {
            return false;                               //can't find
        } else {
            for (int k = j; k < nElems; k++)            //shift all the existing elements more than deleting element to the left
                a[k] = a[k + 1];
            nElems--;                                   //decrease the visible part of the array
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }


}