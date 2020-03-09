package cn.cpf.app.gobang.frame;

import cn.cpf.app.gobang.entity.Place;
import cn.cpf.app.gobang.entity.SortedPlaces;

public class Main2 {

	public static void main(String[] args) {
		SortedPlaces so = new SortedPlaces();
		so.addOrInit(new Place(4, 1), 7);
		so.addOrInit(new Place(4, 2), 6);
		so.addOrInit(new Place(4, 3), 9);
		so.addOrInit(new Place(4, 4), 57);
		so.addOrInit(new Place(4, 5), 3);
		so.addOrInit(new Place(4, 6), 7);
		System.out.println(so.getSortedPlaces());
		
	}

}
