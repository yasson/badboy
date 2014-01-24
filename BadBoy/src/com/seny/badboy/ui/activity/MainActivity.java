package com.seny.badboy.ui.activity;

import com.seny.badboy.R;
import com.seny.badboy.ui.fragment.LeftFragment;
import com.seny.badboy.ui.fragment.RightFragment;
import com.jeremyfeinstein.slidingmenu.lib.*;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends SlidingFragmentActivity { 

	private SlidingMenu slidingMenu;


	@Override
	public void onCreate( Bundle savedInstanceState ) {

		super.onCreate( savedInstanceState );
		initSlidingMenu();
		setContentView( R.layout.ui_main );
	}


	/**
	 * @param
	 * @return void
	 */

	private void initSlidingMenu() {

		setBehindContentView( R.layout.ui_left_fragment_navigation );//设置左菜单
		FragmentTransaction mFragmentTransaction=getSupportFragmentManager().beginTransaction();
		Fragment mFragment =new LeftFragment();
		mFragmentTransaction.replace( R.id.main_left_fragment, mFragment );
		mFragmentTransaction.commit();
		
		slidingMenu.setSecondaryMenu( R.layout.ui_right_fragment_settings );
		Fragment mRightFragment=new RightFragment();
		mFragmentTransaction.replace( R.id.main_right_fragment, mRightFragment );
		mFragmentTransaction.commit();
		
		slidingMenu = getSlidingMenu();
		slidingMenu.setMode( SlidingMenu.LEFT_RIGHT );
		slidingMenu.setTouchModeAbove( SlidingMenu.TOUCHMODE_MARGIN );
		slidingMenu.setShadowWidth( 20 );
		slidingMenu.setShadowDrawable( R.drawable.slidingmenu_shadow );
		slidingMenu.setSecondaryShadowDrawable( R.drawable.slidingmenu_shadow );
		slidingMenu.setBehindOffset( 20 );
		slidingMenu.setBehindScrollScale( 0.3f );// 设置滑动时候拖拽效果
		slidingMenu.setFadeEnabled( true );// 设置滑动时菜单是否淡入淡出
		slidingMenu.setFadeDegree( 0.3f );// 设置淡入淡出比例
		
		
		
	}

}
