public class Funktsioonid1{
	 public static double taksoSoit(double i){
            return i*0.8+3;
    }
	public static String temperatuuriHinnang(int t){
		if(t<18) {return "külm";}
		return "soe";
	}
	public static double ringiPindala(double r){
		return Math.PI*r*r;
	}
	public static void main(String[] arg){
		System.out.println(ringiPindala(5));
		if(arg.length==1){
			System.out.println(temperatuuriHinnang(Integer.parseInt(arg[0])));
		}
		System.out.println(taksoSoit(2));
	}
}