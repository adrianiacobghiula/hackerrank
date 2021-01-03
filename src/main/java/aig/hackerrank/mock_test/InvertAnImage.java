package aig.hackerrank.mock_test;

import java.util.List;

public class InvertAnImage {

    /*
    In any digital system, images are represented as a 2D array of integers. Given the 2D array of an
    original image, your task is to invert (reverse) the image, first column-wise and then row-wise.
     */

    public List<List<Integer>> invertImage(List<List<Integer>> image) {

        for (List<Integer> lines : image) {
            int m = lines.size();
            for (int j = 0; j < m / 2; j++) {
                Integer first = lines.get(m - j - 1);
                Integer second = lines.get(j);
                lines.set(m - j - 1, second);
                lines.set(j, first);
            }
        }
        int n = image.size();
        for (int i = 0; i < image.size() / 2; i++) {
            List<Integer> first = image.get(i);
            List<Integer> second = image.get(n - i - 1);
            image.set(i, second);
            image.set(n - i - 1, first);
        }

        return image;
    }


}
