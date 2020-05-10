import java.util.*;
class LinearPractice{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String[] lastBenchers = {"Ganesh" , "Maha" , "Sam" , "JP" , "Baskar"};
        System.out.println("Search Any Name from Last Benchers : "+ "\t");  // type any name 
        String person = ip.nextLine();

        int result = gotoSearching(lastBenchers , person);
        if(result == -1)
            System.out.println("Invalid Name....Try Again....");
        else
            System.err.println("He is Sitting in " + result + " Place");
    } 

    public static int gotoSearching(String lastBenchGuys[] , String person){
            int findHowManyGuys = lastBenchGuys.length;
            for(int i = 0 ; i < findHowManyGuys ; i++){
                if((lastBenchGuys[i].equals(person)) || (lastBenchGuys[i].equalsIgnoreCase(person)) )
                    return i;
            }
            return -1;
    }
}


/*
Notes:
    The time complexity of above algorithm is O(n).

    Linear search is rarely used practically because other search algorithms such as the binary search algorithm and hash tables allow significantly faster searching comparison to Linear search.

*/