package aig.hackerrank.java_skills_certification_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    A computer has a certain number of cores and a list of files that need to be executed. If a file is
    executed by a single core, the execution time equals the number of lines of code in the file. If
    the files of code can be divided by the number of cores, another option is to execute the file in
    parallel using all he cores, in which case the execution time is divided by the number of cores.
    However, there is a limit as to how many files can be executed in parallel. Given the lengths of
    the code files, the number of cores, and the limit, what is the minimum amount of time needed
    to execute all the files ?

    For example, let's say that there are n = 5 files, where the files = [4,1,3,2,8] (indicating the number
    of lines of code in each file), numCores = 4, and the limit = 1, Even though both the first and the fifth
    files can be executed in parallel, you must choose only one of them because the limit is 1. The
    optimal way is to parallelize the last file, so the minimum execution time required is 4+1+3+2+8/4=12.
    Therefore the answer is 12.
*/
public class ParallelProcessing {

    public long minTime(List<Integer> files, int numCores, int limit) {
        long time = 0;
        List<Integer> filesByCores = new ArrayList<>();
        for (Integer file : files) {
            if (file % numCores == 0) {
                filesByCores.add(file);
            } else {
                time += file;
            }
        }
        filesByCores.sort(Integer::compareTo);
        int idx = filesByCores.size() - 1;
        while (limit > 0 && idx >= 0) {
            time += (filesByCores.get(idx) / numCores);
            idx--;
            limit--;
        }
        while (idx >= 0) {
            time += (filesByCores.get(idx));
            idx--;
        }
        return time;

    }

}
