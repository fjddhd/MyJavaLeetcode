import java.util.Arrays;

public class Solution885 {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        if (people.length==1)
            return 1;
        int weight=people[people.length-1],boat=1,beg=0,end=people.length-2,num=1;
        while (end>=beg){
            while (end>=beg && weight+people[end]<=limit && num<2) {
                weight+=people[end];
                num++;
                end--;
            }
            while (beg<=end && weight+people[beg]<=limit && num<2) {
                weight+=people[beg];
                num++;
                beg++;
            }
            if(end>=beg){
                boat++;
                weight=0;
                num=0;
            }
        }
        return boat;
    }
}
