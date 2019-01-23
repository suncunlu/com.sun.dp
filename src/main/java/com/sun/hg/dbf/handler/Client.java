package com.sun.hg.dbf.handler;

import java.nio.ByteBuffer;

public class Client {
public static void main(String[] args) {
	HtgFileChangeHandler htgFileChangeHandler = new HtgFileChangeHandler();
	ByteBuffer buffer = null;
	htgFileChangeHandler.changed(333, buffer);
}
}
