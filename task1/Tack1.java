package task1;

public class Tack1 {
    public static void main(String[] args) {
        System.out.println(numberOfDifferentElements(new int[]{1, 4, 5, 1, 1, 3}));
    }

    public static int numberOfDifferentElements(int[] massOfElements) {
        int count = 0;
        for (int i = 0; i < massOfElements.length-1; i++) {
            if(massOfElements[i]!=massOfElements[i+1])
                count++;
        }
        return count;
    }
}
