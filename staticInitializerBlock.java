import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class staticInitializerBlock {

static int B;
static int H;
static boolean flag = false;
static {
    Scanner s = new Scanner(System.in);
    B = H = 0;
    B = s.nextInt();
    H = s.nextInt();
    s.close();
    if(B<=0 || H<=0) {
        System.out.print("java.lang.Exception: Breadth and height must be positive");
    }
    else {
        flag = true;
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class