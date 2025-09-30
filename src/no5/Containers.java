package no5;

public class Containers {

    public int maxArea(int[] height) {
        int max = 0, area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int min = Math.min(height[i], height[j]);
                area = (j - i) * min;
                if (area > max) {
                    max = area;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Containers c = new Containers();
        System.out.println(c.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
