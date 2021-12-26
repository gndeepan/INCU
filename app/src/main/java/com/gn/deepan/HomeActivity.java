package com.gn.deepan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.app.Activity;
import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import android.view.View;
import android.graphics.Typeface;
import com.getkeepsafe.taptargetview.*;
import com.cyberalpha.iOSDialog.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class HomeActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private boolean miss_you_error_404 = false;
	private String version = "";
	private String update_link = "";
	private String app_version = "";
	private HashMap<String, Object> mm = new HashMap<>();
	
	private LinearLayout bgbg;
	private LinearLayout linear41;
	private LinearLayout bg;
	private LinearLayout linear42;
	private LinearLayout linear51;
	private LinearLayout linear43;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private ImageView imageview7;
	private TextView textview3;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private LinearLayout linear53;
	private LinearLayout linear52;
	private ImageView imageview8;
	private TextView textview4;
	private ImageView imageview9;
	private TextView textview5;
	private ImageView imageview10;
	private TextView textview6;
	private ImageView imageview11;
	private TextView textview7;
	private ImageView imageview14;
	private TextView textview11;
	private ImageView imageview13;
	private TextView textview10;
	private LinearLayout linear50;
	private TextView textview9;
	private LinearLayout top;
	private LinearLayout mid;
	private LinearLayout down;
	private LinearLayout linear54;
	private ImageView drawer;
	private TextView textview1;
	private TextView textview2;
	private LinearLayout linear1;
	private EditText edittext1;
	private LinearLayout linear2;
	private ImageView imageview2;
	private LinearLayout left;
	private LinearLayout linear4;
	private LinearLayout bg_one;
	private LinearLayout linear27;
	private LinearLayout img_one;
	private LinearLayout linear8;
	private ImageView one;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private ImageView imageview5;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private LinearLayout linear20;
	private LinearLayout linear34;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private ImageView imageview4;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private LinearLayout linear35;
	private LinearLayout linear36;
	private ImageView imageview6;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private LinearLayout linear39;
	private LinearLayout linear40;
	private TextView textview12;
	
	private Intent blocks = new Intent();
	private Intent ti = new Intent();
	private TimerTask time;
	private TimerTask t;
	private TimerTask tsj;
	private ObjectAnimator anim = new ObjectAnimator();
	private FirebaseAuth auth;
	private OnCompleteListener<AuthResult> _auth_create_user_listener;
	private OnCompleteListener<AuthResult> _auth_sign_in_listener;
	private OnCompleteListener<Void> _auth_reset_password_listener;
	private OnCompleteListener<Void> auth_updateEmailListener;
	private OnCompleteListener<Void> auth_updatePasswordListener;
	private OnCompleteListener<Void> auth_emailVerificationSentListener;
	private OnCompleteListener<Void> auth_deleteUserListener;
	private OnCompleteListener<Void> auth_updateProfileListener;
	private OnCompleteListener<AuthResult> auth_phoneAuthListener;
	private OnCompleteListener<AuthResult> auth_googleSignInListener;
	
	private SharedPreferences shar;
	
	private OnCompleteListener message_onCompleteListener;
	private DatabaseReference db = _firebase.getReference("db");
	private ChildEventListener _db_child_listener;
	private TimerTask tt;
	private Intent it = new Intent();
	private Intent returnn = new Intent();
	private Intent stuchat = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		bgbg = findViewById(R.id.bgbg);
		linear41 = findViewById(R.id.linear41);
		bg = findViewById(R.id.bg);
		linear42 = findViewById(R.id.linear42);
		linear51 = findViewById(R.id.linear51);
		linear43 = findViewById(R.id.linear43);
		linear48 = findViewById(R.id.linear48);
		linear49 = findViewById(R.id.linear49);
		imageview7 = findViewById(R.id.imageview7);
		textview3 = findViewById(R.id.textview3);
		linear44 = findViewById(R.id.linear44);
		linear45 = findViewById(R.id.linear45);
		linear46 = findViewById(R.id.linear46);
		linear47 = findViewById(R.id.linear47);
		linear53 = findViewById(R.id.linear53);
		linear52 = findViewById(R.id.linear52);
		imageview8 = findViewById(R.id.imageview8);
		textview4 = findViewById(R.id.textview4);
		imageview9 = findViewById(R.id.imageview9);
		textview5 = findViewById(R.id.textview5);
		imageview10 = findViewById(R.id.imageview10);
		textview6 = findViewById(R.id.textview6);
		imageview11 = findViewById(R.id.imageview11);
		textview7 = findViewById(R.id.textview7);
		imageview14 = findViewById(R.id.imageview14);
		textview11 = findViewById(R.id.textview11);
		imageview13 = findViewById(R.id.imageview13);
		textview10 = findViewById(R.id.textview10);
		linear50 = findViewById(R.id.linear50);
		textview9 = findViewById(R.id.textview9);
		top = findViewById(R.id.top);
		mid = findViewById(R.id.mid);
		down = findViewById(R.id.down);
		linear54 = findViewById(R.id.linear54);
		drawer = findViewById(R.id.drawer);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		linear1 = findViewById(R.id.linear1);
		edittext1 = findViewById(R.id.edittext1);
		linear2 = findViewById(R.id.linear2);
		imageview2 = findViewById(R.id.imageview2);
		left = findViewById(R.id.left);
		linear4 = findViewById(R.id.linear4);
		bg_one = findViewById(R.id.bg_one);
		linear27 = findViewById(R.id.linear27);
		img_one = findViewById(R.id.img_one);
		linear8 = findViewById(R.id.linear8);
		one = findViewById(R.id.one);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear28 = findViewById(R.id.linear28);
		linear29 = findViewById(R.id.linear29);
		imageview5 = findViewById(R.id.imageview5);
		linear30 = findViewById(R.id.linear30);
		linear31 = findViewById(R.id.linear31);
		linear32 = findViewById(R.id.linear32);
		linear33 = findViewById(R.id.linear33);
		linear20 = findViewById(R.id.linear20);
		linear34 = findViewById(R.id.linear34);
		linear21 = findViewById(R.id.linear21);
		linear22 = findViewById(R.id.linear22);
		imageview4 = findViewById(R.id.imageview4);
		linear23 = findViewById(R.id.linear23);
		linear24 = findViewById(R.id.linear24);
		linear25 = findViewById(R.id.linear25);
		linear26 = findViewById(R.id.linear26);
		linear35 = findViewById(R.id.linear35);
		linear36 = findViewById(R.id.linear36);
		imageview6 = findViewById(R.id.imageview6);
		linear37 = findViewById(R.id.linear37);
		linear38 = findViewById(R.id.linear38);
		linear39 = findViewById(R.id.linear39);
		linear40 = findViewById(R.id.linear40);
		textview12 = findViewById(R.id.textview12);
		auth = FirebaseAuth.getInstance();
		shar = getSharedPreferences("shar", Activity.MODE_PRIVATE);
		
		linear44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				blocks.setClass(getApplicationContext(), BookblockActivity.class);
				startActivity(blocks);
			}
		});
		
		linear45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				stuchat.setClass(getApplicationContext(), StudentchatActivity.class);
				startActivity(stuchat);
			}
		});
		
		linear52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				FirebaseAuth.getInstance().signOut();
				returnn.setClass(getApplicationContext(), MainActivity.class);
				startActivity(returnn);
				finish();
			}
		});
		
		drawer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (miss_you_error_404) {
					miss_you_error_404 = false;
					_TransitionManager(bgbg, 300);
					linear41.setVisibility(View.GONE);
					_Animator(bg, "translationX", 0, 300);
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									_Animator(bg, "scaleX", 1, 300);
									_Animator(bg, "scaleY", 1, 300);
									_Animator(bg, "translationY", 0, 300);
								}
							});
						}
					};
					_timer.schedule(time, (int)(200));
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									_shape(0, 0, 0, 0, "#f4f4fa", "#ffffff", 0, bg);
								}
							});
						}
					};
					_timer.schedule(time, (int)(400));
					anim.setTarget(drawer);
					anim.setPropertyName("rotation");
					anim.setDuration((int)(175));
					anim.setFloatValues((float)(0));
					anim.setInterpolator(new LinearInterpolator());
					anim.start();
					drawer.setImageResource(R.drawable.menu);
					tsj = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									bgbg.setBackgroundColor(0xFFF4F4FA);
								}
							});
						}
					};
					_timer.schedule(tsj, (int)(660));
					bg.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.MATCH_PARENT));
				}
				else {
					miss_you_error_404 = true;
					_TransitionManager(bgbg, 300);
					linear41.setVisibility(View.VISIBLE);
					_shape(SketchwareUtil.getDip(getApplicationContext(), (int)(25)), SketchwareUtil.getDip(getApplicationContext(), (int)(25)), SketchwareUtil.getDip(getApplicationContext(), (int)(25)), SketchwareUtil.getDip(getApplicationContext(), (int)(25)), "#f4f4fa", "#ffffff", 0, bg);
					_Animator(bg, "scaleX", 0.7d, 300);
					_Animator(bg, "scaleY", 0.7d, 300);
					_Animator(bg, "translationY", SketchwareUtil.getDip(getApplicationContext(), (int)(-5)), 300);
					_Animator(bg, "translationX", SketchwareUtil.getDip(getApplicationContext(), (int)(-50)), 300);
					anim.setTarget(drawer);
					anim.setPropertyName("rotation");
					anim.setDuration((int)(175));
					anim.setFloatValues((float)(360));
					anim.setInterpolator(new LinearInterpolator());
					anim.start();
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									drawer.setImageResource(R.drawable.ic_clear_white);
								}
							});
						}
					};
					_timer.schedule(time, (int)(100));
					_UI_GradientLR(bgbg, "#580e8c", "#0b0538", 0, 0, 0, 0, 0, "#000000", 0, "#bdbdbd");
					_setHeight(bg, SketchwareUtil.getDip(getApplicationContext(), (int)(900)), SketchwareUtil.getDip(getApplicationContext(), (int)(400)));
				}
			}
		});
		
		message_onCompleteListener = new OnCompleteListener<InstanceIdResult>() {
			@Override
			public void onComplete(Task<InstanceIdResult> task) {
				final boolean _success = task.isSuccessful();
				final String _token = task.getResult().getToken();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_db_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals("version update")) {
					version = _childValue.get("version").toString();
					update_link = _childValue.get("link").toString();
					if (version.equals(app_version)) {
						
					}
					else {
						if (!version.equals(app_version)) {
							final AlertDialog sucess = new AlertDialog.Builder(HomeActivity.this).create();
							LayoutInflater inflater = getLayoutInflater();
							
							View convertView = (View) inflater.inflate(R.layout.dialog, null);
							sucess.setView(convertView);
							
							sucess.requestWindowFeature(Window.FEATURE_NO_TITLE);  sucess.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
							
							LinearLayout lin1 = (LinearLayout) convertView.findViewById(R.id.linear1);
							
							TextView txt2 = (TextView) convertView.findViewById(R.id.textview2);
							
							TextView txt3 = (TextView) convertView.findViewById(R.id.textview3);
							
							ImageView b_img = (ImageView) convertView.findViewById(R.id.imageview1);
							
							android.graphics.drawable.GradientDrawable a = new android.graphics.drawable.GradientDrawable();
							a.setColor(Color.parseColor("#000000"));
							a.setCornerRadius(50);
							lin1.setBackground(a);
							
							b_img.setElevation(5);
							
							sucess.show();
							
							txt2.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									sucess.dismiss();
								}});
							
							txt3.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									
									it.setAction(Intent.ACTION_VIEW);
									it.setData(Uri.parse(update_link));
									startActivity(it);
								}});
							
						}
					}
				}
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		db.addChildEventListener(_db_child_listener);
		
		auth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		auth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_auth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { 
			Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(0xFF008375); w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); }
		linear1.setElevation(10);
		drawer.setColorFilter(0xFFFF0869, PorterDuff.Mode.MULTIPLY);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		edittext1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		_shape(SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), "#ff0869", "#000000", 0, linear2);
		_shape(SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), "#ffffff", "#000000", 0, linear1);
		_shape(1000, 1000, 1000, 1000, "#580e8c", "#ffffff", 0, linear9);
		_shape(20, 20, 20, 20, "#ff73ab", "#ffffff", 0, linear11);
		_shape(20, 20, 20, 20, "#ff73ab", "#ffffff", 0, linear12);
		_shape(0, 0, SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), "#ffffff", "#ffffff", 0, linear8);
		_shape(SketchwareUtil.getDip(getApplicationContext(), (int)(24)), SketchwareUtil.getDip(getApplicationContext(), (int)(24)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), "#ffffff", "#ffffff", 0, bg_one);
		bg_one.setElevation(4);
		_shape(1000, 1000, 1000, 1000, "#580e8c", "#ffffff", 0, linear23);
		_shape(20, 20, 20, 20, "#ff73ab", "#ffffff", 0, linear25);
		_shape(20, 20, 20, 20, "#ff73ab", "#ffffff", 0, linear26);
		_shape(0, 0, SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), "#ffffff", "#ffffff", 0, linear22);
		_shape(SketchwareUtil.getDip(getApplicationContext(), (int)(24)), SketchwareUtil.getDip(getApplicationContext(), (int)(24)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), "#ffffff", "#ffffff", 0, linear20);
		linear20.setElevation(4);
		_shape(1000, 1000, 1000, 1000, "#580e8c", "#ffffff", 0, linear30);
		_shape(20, 20, 20, 20, "#ff73ab", "#ffffff", 0, linear32);
		_shape(20, 20, 20, 20, "#ff73ab", "#ffffff", 0, linear33);
		_shape(0, 0, SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), "#ffffff", "#ffffff", 0, linear29);
		_shape(SketchwareUtil.getDip(getApplicationContext(), (int)(24)), SketchwareUtil.getDip(getApplicationContext(), (int)(24)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), "#ffffff", "#ffffff", 0, linear27);
		linear27.setElevation(4);
		_shape(1000, 1000, 1000, 1000, "#580e8c", "#ffffff", 0, linear37);
		_shape(20, 20, 20, 20, "#ff73ab", "#ffffff", 0, linear39);
		_shape(20, 20, 20, 20, "#ff73ab", "#ffffff", 0, linear40);
		_shape(0, 0, SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), "#ffffff", "#ffffff", 0, linear36);
		_shape(SketchwareUtil.getDip(getApplicationContext(), (int)(24)), SketchwareUtil.getDip(getApplicationContext(), (int)(24)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), SketchwareUtil.getDip(getApplicationContext(), (int)(20)), "#ffffff", "#ffffff", 0, linear34);
		linear34.setElevation(4);
		_bgbgbg();
		linear41.setVisibility(View.GONE);
		bgbg.setBackgroundColor(0xFFF4F4FA);
		if (shar.getString("tab1_showed", "").equals("")) {
			final SpannableString spannedDesc = new SpannableString("Menu Drawer");
			TapTargetView.showFor(HomeActivity.this, TapTarget.forView(findViewById(R.id.drawer), "Click here", spannedDesc)
			        .cancelable(true)
			        .drawShadow(true)
			        .titleTextDimen(R.dimen.title_text_size)
			        .tintTarget(false), new TapTargetView.Listener() {
				            @Override
				      public void onTargetClick(TapTargetView view) {
					        super.onTargetClick(view);
					        // .. which evidently starts the sequence we defined earlier
					        if (shar.getString("tab2_showed", "").equals("")) {
						final SpannableString spannedDesc = new SpannableString("All book's available");
						TapTargetView.showFor(HomeActivity.this, TapTarget.forView(findViewById(R.id.one), "Click here", spannedDesc)
						        .cancelable(true)
						        .drawShadow(true)
						        .titleTextDimen(R.dimen.title_text_size)
						        .tintTarget(false), new TapTargetView.Listener() {
							            @Override
							      public void onTargetClick(TapTargetView view) {
								        super.onTargetClick(view);
								        // .. which evidently starts the sequence we defined earlier
								        shar.edit().putString("tab1_showed", "ok").commit();
								shar.edit().putString("tab2_showed", "ok").commit();
								        
								      }
						});
					}
					        
					      }
			});
		}
		String urc = "com.gn.deepan";
		
		android.content.pm.PackageManager pm = getPackageManager(); 
		try { android.content.pm.PackageInfo pInfo = pm.getPackageInfo(urc, android.content.pm.PackageManager.GET_ACTIVITIES); 
			String version = pInfo.versionName;
			app_version = version;
		} catch (android.content.pm.PackageManager.NameNotFoundException e) { }
		db.addChildEventListener(_db_child_listener);
	}
	
	@Override
	public void onBackPressed() {
		finish();
	}
	public void _shape(final double _top1, final double _top2, final double _bottom2, final double _bottom1, final String _inside_color, final String _side_color, final double _side_size, final View _view) {
		Double tlr = _top1;
		Double trr = _top2;
		Double blr = _bottom2;
		Double brr = _bottom1;
		Double sw = _side_size;
		android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable();
		s.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		s.setCornerRadii(new float[] {tlr.floatValue(),tlr.floatValue(), trr.floatValue(),trr.floatValue(), blr.floatValue(),blr.floatValue(), brr.floatValue(),brr.floatValue()}); 
		
		s.setColor(Color.parseColor(_inside_color));
		s.setStroke(sw.intValue(), Color.parseColor(_side_color));
		_view.setBackground(s);
	}
	
	
	public void _bgbgbg() {
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppins.ttf"), 1);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 1);
		textview11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
		textview10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sofiapro_regular.ttf"), 0);
	}
	
	
	public void _UI_GradientLR(final View _view, final String _left, final String _right, final double _lt, final double _rt, final double _lb, final double _rb, final double _str, final String _str_color, final double _ele, final String _ripple) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		int clrs[] = new int[]{
			Color.parseColor(_left), Color.parseColor(_right)
		};
		gd.setColors(clrs);
		gd.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.TL_BR);
		gd.setStroke((int)_str, Color.parseColor(_str_color));
		gd.setCornerRadii(new float[] {(float)_lt, (float)_lt, (float)_rt, (float)_rt, (float)_rb, (float)_rb, (float)_lb, (float)_lb});
		_view.setElevation((int)_ele);
		android.content.res.ColorStateList clrbs = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor(_ripple)});
		android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrbs , gd, null);
		_view.setBackground(ripdrb);
	}
	
	
	public void _Animator(final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
		anim.start();
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
	}
	
	
	public void _setHeight(final View _view, final double _heightValue, final double _widthValue) {
		_view.getLayoutParams().height = (int)_heightValue;
		_view.requestLayout();
		_view.getLayoutParams().width = (int)_widthValue;
		_view.requestLayout();
	}
	
	
	public void _FadeOut(final View _view, final double _duration) {
		_Animator(_view, "scaleX", 0, 200);
		_Animator(_view, "scaleY", 0, 200);
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_Animator(_view, "scaleX", 1, 200);
						_Animator(_view, "scaleY", 1, 200);
					}
				});
			}
		};
		_timer.schedule(t, (int)(_duration));
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}