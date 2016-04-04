package com.naver.pattern.composite;

public class File extends Component {
	private Object data;

	public File(String name) {
		super(name);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
