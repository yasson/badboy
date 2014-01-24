/**
 * com.seny.badboy.ui.fragment
 * Function£º
 *
 *   ver     date      		author
 * ©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤
 *   		 2014-1-23        YangSen
 *
 * Copyright (c) 2014, Inteview All Rights Reserved.
 */

package com.seny.badboy.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seny.badboy.R;
import com.seny.badboy.ui.BaseFragment;

/**
 * Function:
 * 
 * @author YangSen
 * @version
 * @since Ver 1.0
 * @Date 2014 2014-1-23 ÏÂÎç4:50:13
 * 
 */

public class LeftFragment extends BaseFragment {

	@Override
	public void onCreate( Bundle savedInstanceState ) {

		super.onCreate( savedInstanceState );
	}


	@Override
	public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {

		View view = inflater.inflate( R.layout.ui_left_fragment_navigation, null );
		return view;
	}
}
