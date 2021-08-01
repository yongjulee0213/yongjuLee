package chapter4;

public class TV {
	
		String company;
		int year;
		int size;
	
		public TV(String company, int year, int size) {
			this.company=company;
			this.year=year;
			this.size=size;
		}
		
		public void show() {
			System.out.println(company+"에서 만든 "+year+"년형 "+size+"인치 TV");
		}
}

