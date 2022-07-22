package OtherProblems.RoughWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        inner.add(2);
        outer.add(inner);
        inner = new ArrayList<Integer>(inner);
        inner.add(3);
        inner.add(4);
        outer.add(inner);
        inner = new ArrayList<Integer>(inner);

        inner.add(6);
        inner.add(5);
        inner.add(7);
        outer.add(inner);
        inner = new ArrayList<Integer>(inner);
        inner.add(4);
        inner.add(1);
        inner.add(8);
        inner.add(3);
        outer.add(inner);
//[[2],[3,4],[6,5,7],[4,1,8,3]]
        System.out.println(outer);
    }
}
