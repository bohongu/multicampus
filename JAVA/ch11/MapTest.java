package ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("aa",111);
		map.put("bb",222);
		map.put("cc",333);
		map.put("dd", new Employee(333, "이름", 123.55).hashCode());


		//aa, dd의 암호 출력
		System.out.println(map.get("aa"));
		System.out.println(map.get("dd"));
		System.out.println("map저장데이터갯수=" + map.size());
		
		if(map.containsKey("ee")) {
			System.out.println(map.get("ee"));
		} else {
			System.out.println("ee 아이디는 가입한 적이 없습니다.");
		}
		
		//모든 회원의 아이디와 암호 조회
		//아이디 - map 모든 key값 
		//암호 - map 해당 key에 대한 value값
		Set<String> ids = map.keySet();
		for(String oneid :ids) {
			System.out.println(oneid+" : "+ map.get(oneid));
		}
		
		HashMap<Integer, Employee> map2 = new HashMap();
		map2.put(1, new Employee(1, "사원1", 12300.0));
		
		
		HashMap<String, String[]> map3 = new HashMap();
		//"친구" - {폰번호, 집번호, 사무실번호, 이메일}
		map3.put("친구", new String[]{"010-111-2222", "02-456-7890", "031-999-1234", "a@gmail.com"});
		map3.put("엄마", new String[]{"010-211-2422", "02-9199-1734", });
		map3.put("동료", new String[]{"010-189-2022", "031-123-1234", "bb@gmail.com"});
		//명령행 매개변수 직장동료 입력시
		if(map3.containsKey(args[0])) {
			String[] phone = map3.get(args[0]);
			for(String p : phone) {
				System.out.println(p);
			}
		} else {
			System.out.println("폰정보는 없습니다.");
		}
		
		//폰정보 리스트 관리
		ArrayList<HashMap<String, String[]>> mapList = new ArrayList();
	
	
	
	}
}
