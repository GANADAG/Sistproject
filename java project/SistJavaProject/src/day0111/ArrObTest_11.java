package day0111;

class Shop{
	private String sangpum;
	private int price;
	private String sangColor;
	
	public Shop(String s,int p,String c)
	{
		sangpum=s;
		price=p;
		sangColor=c;
	}
	
	//제목
	public static void showTitle()
	{
		System.out.println("상품명\t가격\t색상");
		System.out.println("====================");
	}
	//생성한 갯수만큼 출력
	public void showShop()
	{
		System.out.println(sangpum+"\t"+price+"원\t+sangColor");
	}
}

public class ArrObTest_11 {

	public static void main(String[] args) 
	{
		// 4개 생성해서 출력할것
		Shop [] shp=new Shop[4];
		
		shp[0]=new Shop("책상",5000000,"화이트");
		shp[1]=new Shop("의자",4000000,"블랙");
		shp[2]=new Shop("컴퓨터",1000000,"블랙");
		shp[3]=new Shop("마우스",10000,"블랙");
		
		System.out.println("========================");
		for (Shop s1:shp)
		{
			s1.showShop();
			System.out.println("-------------------");
		}
	}

}
