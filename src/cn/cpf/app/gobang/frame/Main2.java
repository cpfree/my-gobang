package cn.cpf.app.gobang.frame;

import cn.cpf.app.gobang.entity.Place;
import cn.cpf.app.gobang.entity.SortedPlaces;

public class Main2 {

	public static void main(String[] args) {
		SortedPlaces so = new SortedPlaces();
		so.addOrInit(Place.of(4, 1), 7);
		so.addOrInit(Place.of(4, 2), 6);
		so.addOrInit(Place.of(4, 3), 9);
		so.addOrInit(Place.of(4, 4), 57);
		so.addOrInit(Place.of(4, 5), 3);
		so.addOrInit(Place.of(4, 6), 7);
		System.out.println(so.getSortedPlaces());
		
	}

}
