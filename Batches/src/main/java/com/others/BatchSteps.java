package com.others;

public class BatchSteps {

	public void preProcess() {

	}

	private void postProcess() {

	}

	private void process() {

	}

	private void start() {

	}

	public static void main(String[] args) {
		BatchSteps bs = new BatchSteps();
		bs.preProcess();
		bs.start();
		bs.process();
		bs.postProcess();
	}
}
