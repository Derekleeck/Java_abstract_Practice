package _abstract;

import java.util.Scanner;

abstract class ShapeTest{
	protected double area; 
	protected Scanner scn = new Scanner(System.in);
	
	public ShapeTest() {
		System.out.println("Shape 기본 생성자");
	}
	public abstract void calcArea(); //{}열고 닫으면 메모리먹으니까 이름만 사용. 추상클래스화 시킴
	public abstract void dispArea(); 
	
	
}

//-----------------------------
class SamTest extends ShapeTest{
	protected int base, height;
	
	public SamTest() {
		System.out.println("SamTest 기본생성자");
		System.out.println("밑변 : ");
		base = scn.nextInt();
		System.out.println("높이 : ");
		height = scn.nextInt();
	}
	@Override
	public void calcArea() {
			area = base*height / 2.0;
	}
	@Override
	public void dispArea() {
			System.out.println("삼각형 넓이 = " + area);
	}
	
}

//-----------------------------
class SaTest extends ShapeTest{
	protected int vert, horiz;
	
	public SaTest() {
		System.out.println("SaTest 기본생성자");
		System.out.println("가로 : ");
		vert = scn.nextInt();
		System.out.println("세로 : ");
		horiz = scn.nextInt();
		
	}
	@Override
	public void calcArea() {
		area = vert*horiz;
	}
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = " + area);
	}
	
}
//-----------------------------
class SadariTest extends ShapeTest{
	protected int top, bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest 기본생성자");
		System.out.println("윗변 : ");
		top = scn.nextInt();
		System.out.println("밑변 : ");
		bottom = scn.nextInt();
		System.out.println("높이 : ");
		height = scn.nextInt();
	}
	@Override
	public void calcArea() {
		area = (top+bottom)*height;
	}
	@Override
	public void dispArea() {
		System.out.println("사다리 넓이 = " + area);
	}
	
}
//-----------------------------

public class ShapeMain { //class에 퍼블릭 붙인애가 주가 되는거임. 상속에선 메서드에는 퍼블릭 못붙임.)
	
	public static void main(String[] args) {
		/* (1)
		SamTest sam = new SamTest(); //1:1 관계
		sam.calcArea();
		sam.dispArea();
		System.out.println();
		
		SamTest sa = new SamTest();
		sa.calcArea();
		sa.dispArea();
		System.out.println();
		
		SamTest sadari = new SamTest();
		sadari.calcArea();
		sadari.dispArea();
		System.out.println();*/
	
		//결합도 낮추기 - 다형성
		
		//ShapeTest shape = new ShapeTest();
		ShapeTest shape; //리모컨. 주소만 갖고있겠다.
		shape = new SamTest(); // 부모는 자식을 참조할 수 있다
		shape.calcArea();
		shape.dispArea();
		System.out.println();
				 
		shape = new SaTest(); 
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest(); //리모컨. 주소만 갖고있겠다.
		shape = new SamTest(); // 부모는 자식을 참조할 수 있다
		shape.calcArea();
		shape.dispArea();
		System.out.println();
	}

}
