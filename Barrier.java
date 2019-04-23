//package BarrierS;
import java.util.concurrent.Semaphore;

public class Barrier {
	
	// add missing variables
   int c;
Semaphore s0,s1;
   int thread_num;
   int sizze;
	
	Barrier(int n) {
		// complete this constructor
      sizze= n;
      s0 = new Semaphore(0);
      s1= new Semaphore(1);
      c= 0;
	}
	
	public void b_wait() throws InterruptedException{
		// this is the only additional method you will need to complete
      s1.acquire();
      c+= 1;
      s1.release();
      
      if(sizze==c){
         s0.release();
         
      }
      s0.acquire();
      s0.release();
	}
}
