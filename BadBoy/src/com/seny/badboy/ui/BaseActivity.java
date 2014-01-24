/**
 * BaseActivity.java
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

import com.seny.badboy.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Function:
 * 
 * @author YangSen
 * @version
 * @since Ver 1.0
 * @Date 2014 2014-1-23 ÏÂÎç4:52:02
 * 
 */

public class BaseActivity extends Activity {

	@Override
	protected void onCreate( Bundle savedInstanceState ) {

		super.onCreate( savedInstanceState );
	}


	protected void openActivity( Class<?> activity ) {

		openActivity( activity, null );

	}


	protected void openActivity( Class<?> activity, Bundle bundle ) {

		Intent intent = new Intent();
		if( bundle != null ) {
			intent.putExtras( bundle );
		}
		intent.setClass( getApplicationContext(), activity );
		startActivity( intent );
		overridePendingTransition( R.anim.slide_right_in, R.anim.slide_left_out );
	}

}
