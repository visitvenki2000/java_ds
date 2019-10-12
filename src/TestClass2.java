import java.util.*;


public class TestClass2 {

	public static void main(String[] args) {
		
        Scanner br = new Scanner(System.in);
        String temp = br.nextLine();                // Reading input from STDIN

        int testCases =Integer.parseInt(temp); 
        
     
        
        ArrayList<String> listItmes = new ArrayList<String>();
        int [] sizeArray= new int[testCases];
        for(int i=0;i<testCases;i++) {

        	   temp = br.nextLine(); 
               int inner =Integer.parseInt(temp); 
        	String inputTemp = br.nextLine();
        	
        	sizeArray[i]=inner;
        	listItmes.add(inputTemp);
        	
        }
        
        for(int i=0;i<testCases;i++) {

        	String input2 = listItmes.get(i);
				
				String[] inputList = input2.split(" ");
				int[] array = new int[inputList.length];
				int count = 0;
				int missedElement = 0;
				for (String s : inputList) {

					array[count] = Integer.parseInt(s);
					if (count != 0 && (array[count - 1] + 1) != array[count]) {
						missedElement = array[count - 1] + 1;

						System.out.println("" + missedElement);
					}

					count++;

				}
				System.out.println(" missed " + missedElement);
				if(missedElement==0) {
					String s = inputList[0];
					int singleValue = Integer.parseInt(s);
					if(sizeArray[i]>inputList.length && sizeArray[i]!=singleValue )
						System.out.println("if " +sizeArray[i]);
					else 
						System.out.println("else "+(singleValue-1));
				}

		

		}
        
	}

}
