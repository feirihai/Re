package com;

public class AddCommend implements Commend{
    @Override
    public void process(int[] target) {
        int sum = 0;
        for (int c:target){
            sum = sum + c;
        }
        System.out.println(sum);
    }
}
