package com.scci.inheritance;

public class Citizen {
   private String residentId;
   public String name;
   public int gender;
   
   protected Citizen(String name, int gender) {
      this.name = name;
      this.gender = gender;
      makeResidentId();
   }
   private void makeResidentId() {
      residentId = name+gender;
   }
   protected String getResidentId() {
      return residentId;
   }
}

class SuncheonCitizen extends Citizen{
   protected SuncheonCitizen(String name, int gender) {
      super(name, gender);
   }
   public void accessPrivateMember() {
      // private 멤버 접근 불가
	  // System.out.println(residentId);
      // private 멤버에 접근하는 public, protected 메서드가 있으면 접근 가능
      System.out.println(getResidentId());
   }
}

class Demo{
	public static void main(String[] args) {
		Citizen c = new SuncheonCitizen("pal-ma", 1);
		System.out.println(c.name);
		System.out.println(c.gender);
		System.out.println(c.getResidentId());
		// 상위 클래스 변수가 하위 클래스 객체의 레퍼런스를 담고 있지만
		// 상위 클래스 타입의 변수로는 하위 클래스에만 존재하는 인스턴스변수,인스턴스함수 호출(접근) 불가
		// 선언된 변수에 존재하는 인스턴스 변수, 인스턴스 함수만 접근 가능
		// c.accessPrivateMember();
	}
}
