/**
 * AppStartActivity.java
 * com.seny.badboy.ui
 * Function£º
 *
 *   ver     date      		author
 * ©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤
 *   		 2014-1-23        YangSen
 *
 * Copyright (c) 2014, Inteview All Rights Reserved.
 */

package com.seny.badboy.ui;

import com.seny.badboy.ui.activity.MainActivity;

import android.os.Bundle;

/**
 * Function:
 * 
 * @author YangSen
 * @version
 * @since Ver 1.0
 * @Date 2014 2014-1-23 ÏÂÎç4:54:25
 * 
 */

public class AppStartActivity extends BaseActivity {

	@Override
	protected void onCreate( Bundle savedInstanceState ) {

		super.onCreate( savedInstanceState );
		try {
			Thread.sleep( 2 * 1000 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		} finally {
			openActivity( MainActivity.class );
		}
	}
}
