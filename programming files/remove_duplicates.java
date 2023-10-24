import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates {

    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {

        //initialize new list
        List<Integer> uniqueArr = new ArrayList<>()

        //loop through the list and check for duplicates, remove duplicates
        for (int i = 0; i < arr.size(); i++) {
            if (!uniqueArr.contains(arr.get(i)) {
                uniqueArr.add(arr.get(i));
            } else {
                removedElements.add(arr.get(i))
            }
        }
        return uniqueArr;
    }

    //main
    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removedElements = new ArrayList<>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);

        //display new lists after duplicate removal
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}
