package aig.hackerrank.java_skills_certification_test;

import java.util.List;

    /*
    The directory structure of the system disk partition is represented as a tree. Its n directories are
    numbered from 0 to n-1, where the root directory has the number 0. The structure of the tree is
    defined by the parent, where parent[i] = j means that the directory i is a direct subdirectory
    of j. Since the root directory does not have a parent, it will be represented as parent[0] = -1. the
    value of filesSize[i] denotes the sum of the sizes in kilobytes of the files located in the directory i.
    Partition the tree into two smaller ones by cutting one branch so that the sizes of the
    resulting subtrees are as close as possible.

    Example
    parent = [-1, 0, 0, 1, 1, 2]
    fileSize = [1, 2, 2, 1, 1, 1]

    The partition {0,2,5} has size fileSize[0]+fileSize[2]+fileSize[5] = 1+2+1 = 4
    The partition {1,3,4} has size fileSize[1]+fileSize[3]+fileSize[4] = 2+1+1 = 4
    the absolute difference between the sizes of the two new trees is 4-4 = 0
     */

public class BalancedSystemFilePartition {

    public int absoluteDifference(List<Integer> parent, List<Integer> filesSize) {
        // calculate entire tree & subTree sums
        final int[] subTreeSum = new int[filesSize.size()];
        for (int i = filesSize.size() - 1; i >= 0; i--) {
            subTreeSum[i] += filesSize.get(i);
            if (parent.get(i) >= 0) {
                subTreeSum[parent.get(i)] += subTreeSum[i];
            }
        }
        // the subTreeSum[0] will have the entire sum
        int sum = subTreeSum[0];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < subTreeSum.length; i++) {
            // always subTree1 + subTree2 = sum
            int diff = Math.abs(sum - 2 * subTreeSum[i]);
            if (diff < min) {
                min = diff;
            }
        }
        return min;
    }
}
