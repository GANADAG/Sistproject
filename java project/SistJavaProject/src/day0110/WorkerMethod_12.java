package day0110;

class Info //인스턴스
{
	private String stuName;
	private int stuAge;
	
	//setter메서드 
	//1.데이터를 수정할목적-set변수명
	//2.저장용도이므로 결과값return값이 없다
	//3.리턴값이 없으므로 void라고 지정해야 한다
	public void setName(String stuName)
	{
		this.stuName=stuName;     //이름이 같을경우엔 this (this = 자기자신을 의미)
	}                             //이름이 다를경우엔 this 생략가능
	
	public void setAge(int stuAge)
	{
		this.stuAge=stuAge;
	}
	
	//getter메소드
	//2-1 데이터를 조회할 목적_get변수명
	//2-2 데이터를 얻는목적이므로 인자값이 없다(인자값: 넘겨주는값)
	//2-3 실행결과값을 돌려주므로 'return'결과값으로 지정
	public String getName()
	{
		return stuName;
	}
}
///////////////////////////
public class WorkerMethod_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Info in1=new Info();
		//in1.stuName="홍길동"; 인스턴스변수에 private이 붙으면 변수접근이 안된다(생성을 하더라도)
		//in1.stuAge="33";
		
		//setter메서드 이용해서 값 수정
		in1.setName("최민영");
		in1.setAge(22);
		
		//getter메서드 이용해서 값얻기
		String name=in1.getName();
		
	//	int age=in1.getAge();
		
	//	System.out.println(name+","+age);
		
	}

}
