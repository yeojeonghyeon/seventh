package com.scci.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/GsonServlet")
public class GsonServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Fruit> list = MakingDataUtil.getFruits();
		Gson gson = new Gson();
		String jsonStr = gson.toJson(list);
		response.getWriter().print(jsonStr);
	}
}

class MakingDataUtil {
	public static List<Fruit> getFruits(){
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("pear", "autumn"));
		list.add(new Fruit("strawberry", "summer"));
		list.add(new Fruit("watermellon", "summer"));
		return list;
	}
}
class Fruit {
	private String name;
	private String season;
	public Fruit(String name, String season) {
		super();
		this.name = name;
		this.season = season;
	}
}