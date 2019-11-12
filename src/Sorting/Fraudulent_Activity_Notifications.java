package Sorting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Fraudulent_Activity_Notifications
{
    static int activityNotifications(int[] expenditure, int d)
    {
        int i=0, j=0, len = expenditure.length, notify=0;
        double median;
        boolean flag;
        if(d%2==0)
            flag = true;
        else
            flag = false;
        for(i=i+d; i<len && j+d<len; i=i++,j++)
        {
            int temp[] = Arrays.copyOf(expenditure,len);
            Arrays.sort(temp);
            generateMedians(temp,flag);
            if(flag)
                median = temp[d/2]+temp[(d/2)-1];//(expenditure[i+(d/2)]+expenditure[i+(d/2)-1])/2;
            else
                median = temp[d/2];//expenditure[i+(d/2)];
            if(expenditure[i]>=2*median)
                notify++;

        }
        return notify;

    }
    static void generateMedians(int[] temp, boolean flag)
    {
        int i;
        if(flag)
        {

        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] expenditure = new int[n];
        String[] expenditureItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }
        int result = activityNotifications(expenditure, d);
        System.out.println(result);
        scanner.close();
    }
}
