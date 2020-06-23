/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathquiz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 459258562
 */
public class SortingAlgorithms {
    
    public static void SelectionSort(ArrayList<Question> array, String order)
    {
        int swapCounter = 0;

        for (int i = 0; i < array.size() - 1; i++)
        {
            //int selectedIndex = i;

            for (int j = i + 1; j < array.size(); j++)
            {
                if (order == "asc")
                {
                    if (array.get(j).compareTo(array.get(i)) < 0)
                    {
                        Question temp = array.get(j);
                        array.set(j, array.get(i));
                        array.set(i, temp);
                        swapCounter++;
                    }
                }
                else if (order == "desc")
                {
                    if (array.get(j).compareTo(array.get(i)) > 0)
                    {
                        Question temp = array.get(j);
                        array.set(j, array.get(i));
                        array.set(i, temp);
                        swapCounter++;
                    }
                }

            }
        }

        System.out.println("Number of swaps (Selection Sort): " + swapCounter);
    }
    
    public static void InsertionSort(ArrayList<Question> array, String order)
    {
        int swapCounter = 0;
        for (int i = 1; i < array.size(); i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (order == "asc")
                {
                    if (array.get(j).compareTo(array.get(j - 1)) < 0)
                    {
                        Question temp = array.get(j);
                        array.set(j, array.get(j - 1));
                        array.set(j - 1, temp);
                        swapCounter++;
                    }
                }
                else if (order == "desc")
                {
                    if (array.get(j).compareTo(array.get(j - 1)) > 0)
                    {
                        Question temp = array.get(j);
                        array.set(j, array.get(j - 1));
                        array.set(j - 1, temp);
                        swapCounter++;
                    }
                }
            }

        }

        System.out.println("Number of swaps (Insertion Sort): " + swapCounter);
    }
    
    public static void QuickSort(ArrayList<Question> array, int start, int end)
    {
        // start index
        int i = start;
        // end index
        int j = end;
        
        Question middleValue = array.get((i + j) / 2); // pivot is half-way

        while (true)
        {
            while (array.get(i).compareTo(middleValue) < 0)
            {
                i++;
            }

            while (middleValue.compareTo(array.get(j)) < 0)
            {
                j--;
            }

            if (i <= j)
            {
                Question temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
                
            }

            if (i > j)
            {
                break;
            }

        }

        if (start < j)
        {
            QuickSort(array, start, j);
        }

        if (i < end)
        {
            QuickSort(array, i, end);
        }
    }
}
