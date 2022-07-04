package com.scci.nested;

public class StaticInner {
	// 클래스 선언, static, 외부 클래스의 인스턴스 변수, 인스턴스 함수 사용 불가 
	// private 선언하면, 선언된 클래스 외부에서 접근 불가
	static class Data {
		double totalScore;
		String id;
		double[] scores;
		public Data(String id, int size) {
			this.id = id;
			scores = new double[size];
		}
	}
	Data data;
	public StaticInner(Data data) {
		this.data = data;
	}
	public void showData() {
		for(double d : data.scores ) {
			System.out.println(d);
		}
	}
}

class StaticDemo {
	public static void main(String[] args) {
		StaticInner.Data data = new StaticInner.Data("12345", 10);
		for(int i=0; i < data.scores.length; i++) {
			data.scores[i] = i;
		}
		StaticInner staticInner = new StaticInner(data);
		staticInner.showData();
	}
}
