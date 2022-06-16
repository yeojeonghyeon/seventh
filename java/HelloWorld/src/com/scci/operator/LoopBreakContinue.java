package com.scci.operator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoopBreakContinue {
	public static void main(String[] args) {
		LoopBreakContinue.loopTest();
		LoopBreakContinue.sortTutorial();
	}
	public static void loopTest() {
		int result = 0;
		for(int i=1; i<101; i++) {
			if ( i%2 == 0 ) {
				//result = result + i;
				result += i;
			}else {
				// 반복문에서 continue를 만나면 루프문의 나머지 명령 행들은 무시되고 다음 루프로 진입한다.
				continue;
			}
			System.out.println(i);
		}
		System.out.println(result);
		
		for(int j=0; j<4; j++) {
			for(int k=0; k<5; k++) {
				if ( k > 1 ) break; // 반복문에서 break를 만나면 해당 반복문을 벗어나고 반복문 이후 코드를 실행 한다
			}
			if ( j > 1 ) break;
		}
	}
	
	public static void sortTutorial() {
		List<Point> pointList = new ArrayList<>();
		pointList.add(new Point(1, 2));
		pointList.add(new Point(2, 2));
		Collections.sort(pointList);
		
		pointList.forEach(ele->System.out.println(ele.x));
	}
}

class Point implements Comparable<Point> {
    int x, y;
    public Point(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
    @Override
    public int compareTo(Point p) {
        if(this.x > p.x) {
            return 1; // x에 대해서는 오름차순
        }
        else if(this.x == p.x) {
            if(this.y < p.y) { // y에 대해서는 내림차순
                return 1;
            }
        }
        return -1;
    }
}
