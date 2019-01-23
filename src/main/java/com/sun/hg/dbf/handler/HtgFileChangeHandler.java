package com.sun.hg.dbf.handler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.time.LocalDateTime;
import java.util.Properties;

import com.sun.hg.dbf.impl.RowDealer;
import com.sun.hg.log.GLog;

public class HtgFileChangeHandler extends SsBaseFileChangeHandler implements RowDealer{
	/**
	 * 
	 * 成员变量
	 * 
	 * 
	 */
	
	private OpenPriceMonitor monitor = null;
	private Properties openPriceMap = null;
	private boolean shutDown=false;
	public HtgFileChangeHandler() {
		GLog.info("init HtgFileChangeHandler........"+LocalDateTime.now().toString(),null);
		targetFileName = "mmm.txt";
		monitor = new OpenPriceMonitor();
		monitor.start();
		openPriceMap = new Properties();
	}
	@Override
	public void processRows(int fromRow, int toRow) {
		// TODO Auto-generated method stub
		/**
		 * 具体实现
		 */
	}

	@Override
	public void changed(long lastModified, ByteBuffer buffer) {
		// TODO Auto-generated method stub
		/**
		 * 具体实现
		 */
	}
	private class OpenPriceMonitor extends Thread{
		
		final private long checkInterval = 6000L;
		long lastUpdDate = 0;
		final long startTime = 928;
		
		public OpenPriceMonitor() {
			Reader inStream = null;
			/**
			 * 初始化一些业务数据
			 */
			try {
				openPriceMap.load(inStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			
			while(!shutDown) {
				/**
				 * 业务处理
				 */
				try {
					openPriceMap.store(new FileOutputStream(targetFile), "");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
