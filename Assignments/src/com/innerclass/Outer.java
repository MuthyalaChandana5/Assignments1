package com.innerclass;

public class Outer {

	public String s = "stay";
		public void m1() {
			
			class LocalInner{
				void m2() {
					System.out.println(s);
				}
				
			}
			   LocalInner i = new LocalInner();
			   i.m2();
		}
	
public static void main(String args[]) {
		 Outer o = new Outer();
		 o.m1();
		

}
}
