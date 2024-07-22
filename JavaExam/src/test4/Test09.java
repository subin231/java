package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Orange {
    private String country;
    private int price;

    public Orange(String country, int price) {
        this.country = country;
        this.price = price;
    }

    public void show() {
    	System.out.println("원산지 : " + country);
    	System.out.println("가격 : " + price);
    }
}

public class Test09 {
    public static void main(String[] args) {
        List<Orange> list1 = new ArrayList<>();
        list1.add(new Orange("청주", 3000));
        list1.add(new Orange("인천", 3000));
        list1.add(new Orange("수원", 3000));

        List<Orange> list2 = new ArrayList<>();
        list2.add(new Orange("광주", 3000));
        list2.add(new Orange("전주", 3000));
        list2.add(new Orange("대구", 3000));

        List<Orange> list3 = new ArrayList<>();
        list3.add(new Orange("밀양", 3000));
        list3.add(new Orange("함평", 3000));
        list3.add(new Orange("합천", 3000));

        Map<String, List<Orange>> map = new HashMap<>();
        map.put("gyeonggi", list1);
        map.put("chungbuk", list2);
        map.put("gyungnam", list3);

        List<Orange> list = map.get("gyeonggi");
        Orange orange = list.get(0);
        orange.show();

        list = map.get("chungbuk");
        orange = list.get(1);
        orange.show();

        list = map.get("gyungnam");
        orange = list.get(2);
        orange.show();
    }
}
