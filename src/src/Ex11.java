import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intChoixConso;
		double dblConso1=3.00,dblConso2=3.00,dblConso3=2.80,dblConso4=2.90,dblConsoF=0,dblPx=0;
		boolean blHappyHour=false,nextHF=false;
		
		
		final double dblHappyHour=0.5;
		char HfTrue='o';
		String HfTrue1="Y";
		String strName="";//strChar="";

		
		DecimalFormat d2f=new DecimalFormat("#.##");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("N° Consommation : ");

		intChoixConso=sc.nextInt();
		
		switch (intChoixConso){
		case 1:
			dblConsoF=dblConso1;
			strName="Eau ";
			nextHF=true;
			break;
		case 2:
			dblConsoF=dblConso2;
			strName="Coca cola ";
			nextHF=true;
			break;
		case 3:
			dblConsoF=dblConso3;
			strName="Biere ";
			nextHF=true;
			break;
		case 4:
			dblConsoF=dblConso4;
			strName="Café ";
			nextHF=true;
			break;
		default :
			System.out.println("N° non référencé.");
		}											//fin switch
		
		
		
		if(nextHF){
		System.out.println("Happy Hour: Y/N");
		HfTrue=sc.next().charAt(0);
		
		
		if (HfTrue=='y' || HfTrue=='Y'){
			dblPx=dblConsoF*dblHappyHour;
		}
		else if (HfTrue=='n' || HfTrue=='N'){
			dblPx=dblConsoF;
			}
		System.out.println(strName+dblPx+"€.");
	//	else if(HfTrue!='n'&& HfTrue!='N'&& HfTrue!='Y'&& HfTrue!='y'){
		//	System.out.println("Mauvaise référence.");
	//	}

	}

}
}
