package test;

import org.testng.annotations.Test;

public class C23_ParallelTestParameter {
    // bir methodu birden fazla kostrmak icin kac thread calisacagini threadPoolSize ile belirliyoruz.
    //Test metodunun kac defa kosacagini invocationCount ile belirliyoruz.
    //timetout bir kosuma ayrilmis maximim süreyi belirtir.
    @Test(invocationCount = 8,timeOut = 1000)
    public void test1(){
        System.out.println("thread id: "+Thread.currentThread().getId());
    }
}
