package dev.nord.springdemo.domain.test;

import java.io.Serializable;

// Domain object, will be used as SessionAttribute
public class VisitorCount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8118137621407259663L;

	private int count;

	public VisitorCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
