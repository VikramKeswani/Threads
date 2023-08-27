package mergesort;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SorterMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort = List.of(
                4, 2, 6, 1, 9, 3, 4, 2
        );
        ExecutorService executorService = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(arrayToSort);
        Future<List<Integer>> sortedArray = executorService.submit(sorter);
        List<Integer> sortedArrayAns = sortedArray.get();
        System.out.println("Sorted Array:");
        for(Integer val:sortedArrayAns){
            System.out.print(val+", ");
        }
    }
}
