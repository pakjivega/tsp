package com.pakjivega.tsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.pakjivega.tsp.bean.City;

public interface Resolver {
	public ArrayList<City> resolve(Set<City> cities);
}
