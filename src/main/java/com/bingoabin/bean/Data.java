package com.bingoabin.bean;

import java.util.List;

public class Data {

	@Override
	public String toString() {
		return "Data{" +
				"links=" + links +
				", type='" + type + '\'' +
				'}';
	}

	private List<Link> links;
	private String type;

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}