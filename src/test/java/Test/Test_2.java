package Test;

import Utility.Library;

public class Test_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String data=Library.getExcelData("location","Sheet2", 0, 0);

		System.out.println(data);
	}

}
