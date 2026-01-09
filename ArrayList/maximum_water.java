import java.util.ArrayList;

public class maximum_water {

    public static int maxArea(ArrayList<Integer> height) {
        int maxArea = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {

                int width = j - i;
                int minHeight = Math.min(height.get(i), height.get(j));
                int area = width * minHeight;
                maxArea = Math.max(maxArea, area);
            }

        }
        return maxArea;

    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("maximum water that can be contained:" + maxArea(height));
    }
}
