import java.util.Random;

class MyUtils{
     MyUtils(){
     
    }
    public static float ucgenCevre(float a,float b,float c){
         return a+b+c;
     }
     public static float ucgenAlan(float a,float b,float c){
         flaot a = 0;
         float s = (a + b +c )/2;
         return Math.sqrt(s*((s-a)*(s-b)*(s-c)));
     }
     private static int Random_NextInt(int min,int max){
        Random rnd=new Random();
        return rnd.nextInt((max-min)+1)-min;
    }
    public static double[] make(double[] arr){
        double[] result = new double[arr.length];
        for (int i =0;i<arr.length;i++){
            result[i] = this.Random_NextInt(-100, 100);
        }
        
        

        return result;
    }
    private static double f1(x){
        
        return 3*x - 2 * Math.exp(x) + Math.sqrt(dox);
    }
    
    private static double f2(x){
        
        return 1 / 1+ Math.exp(x);
    }
    
    
}
    


public class Main
{
	public static void main(String[] args) {
		MyUtils var = new MyUtils();
		float ucgenCevre= var.ucgenCevre(1,2,3);
		
		
	}
}
