package com.develoware.vape;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MenuActivity extends Activity {

    Boolean isLogined = Boolean.FALSE;

    ProgressBar menu_progress;

    // Menu Function Define
    ImageButton menu_function_setting, menu_function_close;

    // Menu NotLogin Define
    ConstraintLayout menu_notlogin_layout;
    ImageButton menu_notlogin_layout_loginbtn;

    // Menu Login Define
    ConstraintLayout menu_login_layout;
    TextView menu_login_username_tv;
    String user_name = "Guest";

    // Menu Login Function Define
    ConstraintLayout menu_login_function_alert_layout, menu_login_function_notice_layout, menu_login_function_lens_layout;

    // Menu V Apps Define
    ConstraintLayout menu_login_app_layout;


    // Sub Menu Title Define
    ScrollView menu_submenu_scrollview;
    ConstraintLayout menu_submenu_title_my_layout, menu_submenu_title_guide_layout, menu_submenu_title_mem_layout, menu_submenu_title_service_layout, menu_submenu_title_shop_layout;


    // Sub Menu MY Define
    LinearLayout menu_submenu_content_my_layout;

    ConstraintLayout menu_submenu_content_my_usage_layout, menu_submenu_content_my_pay_layout, menu_submenu_content_my_mem_layout;
    ImageView menu_submenu_content_my_usage_img, menu_submenu_content_my_pay_img, menu_submenu_content_my_mem_img;

    // Sub Menu MY_Usage Define
    ImageView menu_submenu_content_my_usage_border;
    ConstraintLayout menu_submenu_my_usage_infor_layout, menu_submenu_my_usage_name_layout;

    // Sub Menu MY_Pay Define
    ImageView menu_submenu_content_my_pay_border;
    ConstraintLayout menu_submenu_my_pay_state_layout, menu_submenu_my_pay_once_layout, menu_submenu_my_pay_payment_layout;

    // Sub Menu MY_Mem Define
    ImageView menu_submenu_content_my_mem_border;
    ConstraintLayout menu_submenu_my_mem_membership_layout, menu_submenu_my_mem_point_layout, menu_submenu_my_mem_coupon_layout;

    // Sub Menu MY isClicked
    Boolean my_usage_isClicked = Boolean.FALSE;
    Boolean my_pay_isClicked = Boolean.FALSE;
    Boolean my_mem_isClicked = Boolean.FALSE;


    // Sub Menu GUIDE Define
    LinearLayout menu_submenu_content_guide_layout;

    ConstraintLayout menu_submenu_content_guide_device_layout, menu_submenu_content_guide_atomizer_layout, menu_submenu_content_guide_devicemanage_layout,
            menu_submenu_content_guide_atomizermanage_layout, menu_submenu_content_guide_rebuildmanage_layout;


    // Sub Menu MEM Define
    LinearLayout menu_submenu_content_mem_layout;

    ConstraintLayout menu_submenu_content_mem_guide_layout, menu_submenu_content_mem_discount_layout,
            menu_submenu_content_mem_event_layout;
    ImageView menu_submenu_content_mem_guide_img, menu_submenu_content_mem_discount_img,
            menu_submenu_content_mem_event_img;

    // Sub Menu MEM_Guide Define
    ImageView menu_submenu_content_mem_guide_border;
    ConstraintLayout menu_submenu_mem_guide_my_layout, menu_submenu_mem_guide_grade_layout;

    // Sub Menu MEM_Discount Define
    ImageView menu_submenu_content_mem_discount_border;
    ConstraintLayout menu_submenu_mem_discount_shop_layout;

    // Sub Menu MEM_Event Define
    ImageView menu_submenu_content_mem_event_border;
    ConstraintLayout menu_submenu_mem_event_ongoing_layout, menu_submenu_mem_event_winner_layout, menu_submenu_mem_event_end_layout;

    // Sub Menu MEM isClicked
    Boolean mem_guide_isClicked = Boolean.FALSE;
    Boolean mem_discount_isClicked = Boolean.FALSE;
    Boolean mem_event_isClicked = Boolean.FALSE;


    // Sub Menu SERVICE Define
    LinearLayout menu_submenu_content_service_layout;

    ConstraintLayout menu_submenu_content_service_support_layout, menu_submenu_content_service_store_layout,
            menu_submenu_content_service_inquire_layout, menu_submenu_content_service_as_layout, menu_submenu_content_service_guide_layout,
            menu_submenu_content_service_news_layout;
    ImageView menu_submenu_content_service_store_img, menu_submenu_content_service_inquire_img, menu_submenu_content_service_as_img,
            menu_submenu_content_service_guide_img, menu_submenu_content_service_news_img;

    // Sub Menu SERVICE_Store Define
    ImageView menu_submenu_content_service_store_border;
    ConstraintLayout menu_submenu_service_store_find_layout, menu_submenu_service_store_cs_layout, menu_submenu_service_store_as_layout;

    // Sub Menu SERVICE_Inquire Define
    ImageView menu_submenu_content_service_inquire_border;
    ConstraintLayout menu_submenu_service_inquire_faq_layout, menu_submenu_service_inquire_call_layout, menu_submenu_service_inquire_kakaotalk_layout;

    // Sub Menu SERVICE_As Define
    ImageView menu_submenu_content_service_as_border;
    ConstraintLayout menu_submenu_service_as_self_layout, menu_submenu_service_as_request_layout;

    // Sub Menu SERVICE_Guide Define
    ImageView menu_submenu_content_service_guide_border;
    ConstraintLayout menu_submenu_service_guide_service_layout, menu_submenu_service_guide_shop_layout, menu_submenu_service_guide_damage_layout;

    // Sub Menu SERVICE_News Define
    ImageView menu_submenu_content_service_news_border;
    ConstraintLayout menu_submenu_service_news_notice_layout;

    // Sub Menu SERVICE isClicked
    Boolean service_store_isClicked = Boolean.FALSE;
    Boolean service_inquire_isClicked = Boolean.FALSE;
    Boolean service_as_isClicked = Boolean.FALSE;
    Boolean service_guide_isClicked = Boolean.FALSE;
    Boolean service_news_isClicked = Boolean.FALSE;


    // Sub Menu SHOP Define
    LinearLayout menu_submenu_content_shop_layout;

    ConstraintLayout menu_submenu_content_shop_home_layout, menu_submenu_content_shop_device_layout,
            menu_submenu_content_shop_atomizer_layout, menu_submenu_content_shop_liquid_layout, menu_submenu_content_shop_nicofree_layout,
            menu_submenu_content_shop_accessory_layout, menu_submenu_content_shop_order_layout, menu_submenu_content_shop_basket_layout;

    // Menu Log Define
    ImageView menu_log_border;
    ConstraintLayout menu_log_logout_layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menu_progress = findViewById(R.id.menu_progress);

        // Menu Function Declare
        menu_function_setting = findViewById(R.id.menu_function_setting);
        menu_function_close = findViewById(R.id.menu_function_close);

        // Menu NotLogin Declare
        menu_notlogin_layout = findViewById(R.id.menu_notlogin_layout);
        menu_notlogin_layout_loginbtn = findViewById(R.id.menu_notlogin_layout_loginbtn);

        // Menu Login Declare
        menu_login_layout = findViewById(R.id.menu_login_layout);
        menu_login_username_tv = findViewById(R.id.menu_login_username_tv);

        // Menu Login Function Declare
        menu_login_function_alert_layout = findViewById(R.id.menu_login_function_alert_layout);
        menu_login_function_notice_layout = findViewById(R.id.menu_login_function_notice_layout);
        menu_login_function_lens_layout = findViewById(R.id.menu_login_function_lens_layout);

        // Menu V Apps Declare
        menu_login_app_layout = findViewById(R.id.menu_login_app_layout);


        // Sub Menu Declare
        menu_submenu_scrollview = findViewById(R.id.menu_submenu_scrollview);

        // Sub Menu Title Declare
        menu_submenu_title_my_layout = findViewById(R.id.menu_submenu_title_my_layout);
        menu_submenu_title_guide_layout = findViewById(R.id.menu_submenu_title_guide_layout);
        menu_submenu_title_mem_layout = findViewById(R.id.menu_submenu_title_mem_layout);
        menu_submenu_title_service_layout = findViewById(R.id.menu_submenu_title_service_layout);
        menu_submenu_title_shop_layout = findViewById(R.id.menu_submenu_title_shop_layout);

        // Sub Menu MY Declare
        menu_submenu_content_my_layout = findViewById(R.id.menu_submenu_content_my_layout);

        menu_submenu_content_my_usage_layout = findViewById(R.id.menu_submenu_content_my_usage_layout);
        menu_submenu_content_my_usage_img = findViewById(R.id.menu_submenu_content_my_usage_img);

        menu_submenu_content_my_pay_layout = findViewById(R.id.menu_submenu_content_my_pay_layout);
        menu_submenu_content_my_pay_img = findViewById(R.id.menu_submenu_content_my_pay_img);

        menu_submenu_content_my_mem_layout = findViewById(R.id.menu_submenu_content_my_mem_layout);
        menu_submenu_content_my_mem_img = findViewById(R.id.menu_submenu_content_my_mem_img);

        // Sub Menu MY_Usage Declare
        menu_submenu_content_my_usage_border = findViewById(R.id.menu_submenu_content_my_usage_border);
        menu_submenu_my_usage_infor_layout = findViewById(R.id.menu_submenu_my_usage_infor_layout);
        menu_submenu_my_usage_name_layout = findViewById(R.id.menu_submenu_my_usage_name_layout);

        // Sub Menu MY_Pay Declare
        menu_submenu_content_my_pay_border = findViewById(R.id.menu_submenu_content_my_pay_border);
        menu_submenu_my_pay_state_layout = findViewById(R.id.menu_submenu_my_pay_state_layout);
        menu_submenu_my_pay_once_layout = findViewById(R.id.menu_submenu_my_pay_once_layout);
        menu_submenu_my_pay_payment_layout = findViewById(R.id.menu_submenu_my_pay_payment_layout);

        // Sub Menu MY_Mem Declare
        menu_submenu_content_my_mem_border = findViewById(R.id.menu_submenu_content_my_mem_border);
        menu_submenu_my_mem_membership_layout = findViewById(R.id.menu_submenu_my_mem_membership_layout);
        menu_submenu_my_mem_point_layout = findViewById(R.id.menu_submenu_my_mem_point_layout);
        menu_submenu_my_mem_coupon_layout = findViewById(R.id.menu_submenu_my_mem_coupon_layout);


        // Sub Menu GUIDE Declare
        menu_submenu_content_guide_layout = findViewById(R.id.menu_submenu_content_guide_layout);

        menu_submenu_content_guide_device_layout = findViewById(R.id.menu_submenu_content_guide_device_layout);
        menu_submenu_content_guide_atomizer_layout = findViewById(R.id.menu_submenu_content_guide_atomizer_layout);
        menu_submenu_content_guide_devicemanage_layout = findViewById(R.id.menu_submenu_content_guide_devicemanage_layout);
        menu_submenu_content_guide_atomizermanage_layout = findViewById(R.id.menu_submenu_content_guide_atomizermanage_layout);
        menu_submenu_content_guide_rebuildmanage_layout = findViewById(R.id.menu_submenu_content_guide_rebuildmanage_layout);


        // Sub Menu MEM Declare
        menu_submenu_content_mem_layout = findViewById(R.id.menu_submenu_content_mem_layout);

        menu_submenu_content_mem_guide_layout = findViewById(R.id.menu_submenu_content_mem_guide_layout);
        menu_submenu_content_mem_guide_img = findViewById(R.id.menu_submenu_content_mem_guide_img);

        menu_submenu_content_mem_discount_layout = findViewById(R.id.menu_submenu_content_mem_discount_layout);
        menu_submenu_content_mem_discount_img = findViewById(R.id.menu_submenu_content_mem_discount_img);

        menu_submenu_content_mem_event_layout = findViewById(R.id.menu_submenu_content_mem_event_layout);
        menu_submenu_content_mem_event_img = findViewById(R.id.menu_submenu_content_mem_event_img);

        // Sub Menu MEM_Guide Declare
        menu_submenu_content_mem_guide_border = findViewById(R.id.menu_submenu_content_mem_guide_border);
        menu_submenu_mem_guide_my_layout = findViewById(R.id.menu_submenu_mem_guide_my_layout);
        menu_submenu_mem_guide_grade_layout = findViewById(R.id.menu_submenu_mem_guide_grade_layout);

        // Sub Menu MEM_Discount Declare
        menu_submenu_content_mem_discount_border = findViewById(R.id.menu_submenu_content_mem_discount_border);
        menu_submenu_mem_discount_shop_layout = findViewById(R.id.menu_submenu_mem_discount_shop_layout);

        // Sub Menu MEM_Event Declare
        menu_submenu_content_mem_event_border = findViewById(R.id.menu_submenu_content_mem_event_border);
        menu_submenu_mem_event_ongoing_layout = findViewById(R.id.menu_submenu_mem_event_ongoing_layout);
        menu_submenu_mem_event_winner_layout = findViewById(R.id.menu_submenu_mem_event_winner_layout);
        menu_submenu_mem_event_end_layout = findViewById(R.id.menu_submenu_mem_event_end_layout);


        // Sub Menu SERVICE Declare
        menu_submenu_content_service_layout = findViewById(R.id.menu_submenu_content_service_layout);

        menu_submenu_content_service_support_layout = findViewById(R.id.menu_submenu_content_service_support_layout);

        menu_submenu_content_service_store_layout = findViewById(R.id.menu_submenu_content_service_store_layout);
        menu_submenu_content_service_store_img = findViewById(R.id.menu_submenu_content_service_store_img);

        menu_submenu_content_service_inquire_layout = findViewById(R.id.menu_submenu_content_service_inquire_layout);
        menu_submenu_content_service_inquire_img = findViewById(R.id.menu_submenu_content_service_inquire_img);

        menu_submenu_content_service_as_layout = findViewById(R.id.menu_submenu_content_service_as_layout);
        menu_submenu_content_service_as_img = findViewById(R.id.menu_submenu_content_service_as_img);

        menu_submenu_content_service_guide_layout = findViewById(R.id.menu_submenu_content_service_guide_layout);
        menu_submenu_content_service_guide_img = findViewById(R.id.menu_submenu_content_service_guide_img);

        menu_submenu_content_service_news_layout = findViewById(R.id.menu_submenu_content_service_news_layout);
        menu_submenu_content_service_news_img = findViewById(R.id.menu_submenu_content_service_news_img);

        // Sub Menu SERVICE_Store Declare
        menu_submenu_content_service_store_border = findViewById(R.id.menu_submenu_content_service_store_border);
        menu_submenu_service_store_find_layout = findViewById(R.id.menu_submenu_service_store_find_layout);
        menu_submenu_service_store_cs_layout = findViewById(R.id.menu_submenu_service_store_cs_layout);
        menu_submenu_service_store_as_layout = findViewById(R.id.menu_submenu_service_store_as_layout);

        // Sub Menu SERVICE_Inquire Declare
        menu_submenu_content_service_inquire_border = findViewById(R.id.menu_submenu_content_service_inquire_border);
        menu_submenu_service_inquire_faq_layout = findViewById(R.id.menu_submenu_service_inquire_faq_layout);
        menu_submenu_service_inquire_call_layout = findViewById(R.id.menu_submenu_service_inquire_call_layout);
        menu_submenu_service_inquire_kakaotalk_layout = findViewById(R.id.menu_submenu_service_inquire_kakaotalk_layout);

        // Sub Menu SERVICE_As Declare
        menu_submenu_content_service_as_border = findViewById(R.id.menu_submenu_content_service_as_border);
        menu_submenu_service_as_self_layout = findViewById(R.id.menu_submenu_service_as_self_layout);
        menu_submenu_service_as_request_layout = findViewById(R.id.menu_submenu_service_as_request_layout);

        // Sub Menu SERVICE_Guide Declare
        menu_submenu_content_service_guide_border = findViewById(R.id.menu_submenu_content_service_guide_border);
        menu_submenu_service_guide_service_layout = findViewById(R.id.menu_submenu_service_guide_service_layout);
        menu_submenu_service_guide_shop_layout = findViewById(R.id.menu_submenu_service_guide_shop_layout);
        menu_submenu_service_guide_damage_layout = findViewById(R.id.menu_submenu_service_guide_damage_layout);

        // Sub Menu SERVICE_News Declare
        menu_submenu_content_service_news_border = findViewById(R.id.menu_submenu_content_service_news_border);
        menu_submenu_service_news_notice_layout = findViewById(R.id.menu_submenu_service_news_notice_layout);


        // Sub Menu SHOP Declare
        menu_submenu_content_shop_layout = findViewById(R.id.menu_submenu_content_shop_layout);

        menu_submenu_content_shop_home_layout = findViewById(R.id.menu_submenu_content_shop_home_layout);

        menu_submenu_content_shop_device_layout = findViewById(R.id.menu_submenu_content_shop_device_layout);

        menu_submenu_content_shop_atomizer_layout = findViewById(R.id.menu_submenu_content_shop_atomizer_layout);

        menu_submenu_content_shop_liquid_layout = findViewById(R.id.menu_submenu_content_shop_liquid_layout);

        menu_submenu_content_shop_nicofree_layout = findViewById(R.id.menu_submenu_content_shop_nicofree_layout);

        menu_submenu_content_shop_accessory_layout = findViewById(R.id.menu_submenu_content_shop_accessory_layout);

        menu_submenu_content_shop_order_layout = findViewById(R.id.menu_submenu_content_shop_order_layout);

        menu_submenu_content_shop_basket_layout = findViewById(R.id.menu_submenu_content_shop_basket_layout);

        // Menu Log Declare
        menu_log_border = findViewById(R.id.menu_log_border);
        menu_log_logout_layout = findViewById(R.id.menu_log_logout_layout);

        // IF
        if (isLogined == Boolean.FALSE) {
            // NotLogin
            menu_notlogin_layout.setVisibility(View.VISIBLE);

            // Login
            menu_login_layout.setVisibility(View.GONE);
            menu_login_username_tv.setText(user_name);

            // Log
            menu_log_border.setVisibility(View.GONE);
            menu_log_logout_layout.setVisibility(View.GONE);
        } else {
            // NotLogin
            menu_notlogin_layout.setVisibility(View.GONE);

            // Login
            menu_login_layout.setVisibility(View.VISIBLE);
            menu_login_username_tv.setText(user_name);

            // Log
            menu_log_border.setVisibility(View.VISIBLE);
            menu_log_logout_layout.setVisibility(View.VISIBLE);
        }

        /* OnClick */
        // Menu Function OnClick
        menu_function_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });

        menu_function_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // Menu NotLogin OnClick
        menu_notlogin_layout_loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        // Menu Login Function OnClick
        menu_login_function_alert_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, AlertActivity.class);
                startActivity(intent);
            }
        });

        menu_login_function_notice_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, NoticeActivity.class);
                startActivity(intent);
            }
        });

        menu_login_function_lens_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, LensActivity.class);
                startActivity(intent);
            }
        });

        // Menu V Apps OnClick
        menu_login_app_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, VAppsActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu MY OnClick
        menu_submenu_title_my_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu_submenu_scrollview.fullScroll(ScrollView.FOCUS_UP);
                menu_submenu_title_my_layout.setBackgroundResource(R.drawable.base_menu_active_btn);
                menu_submenu_title_guide_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_mem_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_service_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_shop_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);

                Invisible_Content();
                menu_submenu_content_my_layout.setVisibility(View.VISIBLE);

                Fold_MY();
            }
        });

        // Sub Menu GUIDE OnClick
        menu_submenu_title_guide_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu_submenu_scrollview.fullScroll(ScrollView.FOCUS_UP);
                menu_submenu_title_my_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_guide_layout.setBackgroundResource(R.drawable.base_menu_active_btn);
                menu_submenu_title_mem_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_service_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_shop_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);

                Invisible_Content();
                menu_submenu_content_guide_layout.setVisibility(View.VISIBLE);
            }
        });

        // Sub Menu MEM OnClick
        menu_submenu_title_mem_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu_submenu_scrollview.fullScroll(ScrollView.FOCUS_UP);
                menu_submenu_title_my_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_guide_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_mem_layout.setBackgroundResource(R.drawable.base_menu_active_btn);
                menu_submenu_title_service_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_shop_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);

                Invisible_Content();
                menu_submenu_content_mem_layout.setVisibility(View.VISIBLE);

                Fold_MEM();
            }
        });

        // Sub Menu SERVICE OnClick
        menu_submenu_title_service_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu_submenu_scrollview.fullScroll(ScrollView.FOCUS_UP);
                menu_submenu_title_my_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_guide_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_mem_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_service_layout.setBackgroundResource(R.drawable.base_menu_active_btn);
                menu_submenu_title_shop_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);

                Invisible_Content();
                menu_submenu_content_service_layout.setVisibility(View.VISIBLE);

                Fold_SERVICE();
            }
        });

        // Sub Menu SHOP OnClick
        menu_submenu_title_shop_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu_submenu_scrollview.fullScroll(ScrollView.FOCUS_UP);
                menu_submenu_title_my_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_guide_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_mem_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_service_layout.setBackgroundResource(R.drawable.base_menu_deactive_btn);
                menu_submenu_title_shop_layout.setBackgroundResource(R.drawable.base_menu_active_btn);

                Invisible_Content();
                menu_submenu_content_shop_layout.setVisibility(View.VISIBLE);
            }
        });

        /* MY */
        // Sub Menu MY_Usage OnClick
        menu_submenu_content_my_usage_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (my_usage_isClicked == Boolean.FALSE) {
                    Fold_MY();
                    menu_submenu_content_my_usage_border.setVisibility(View.VISIBLE);
                    menu_submenu_my_usage_infor_layout.setVisibility(View.VISIBLE);
                    menu_submenu_my_usage_name_layout.setVisibility(View.VISIBLE);
                    my_usage_isClicked = Boolean.TRUE;
                    menu_submenu_content_my_usage_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                } else {
                    Fold_MY();
                }
            }
        });

        /* MY_Usage */
        // Sub Menu MY_Usage_Infor OnClick
        menu_submenu_my_usage_infor_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MyUsageInforActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu MY_Usage_Name OnClick
        menu_submenu_my_usage_name_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MyUsageNameActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu MY_Pay OnClick
        menu_submenu_content_my_pay_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (my_pay_isClicked == Boolean.FALSE) {
                    Fold_MY();
                    menu_submenu_content_my_pay_border.setVisibility(View.VISIBLE);
                    menu_submenu_my_pay_state_layout.setVisibility(View.VISIBLE);
                    menu_submenu_my_pay_once_layout.setVisibility(View.VISIBLE);
                    menu_submenu_my_pay_payment_layout.setVisibility(View.VISIBLE);
                    my_pay_isClicked = Boolean.TRUE;
                    menu_submenu_content_my_pay_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                } else {
                    Fold_MY();
                }
            }
        });

        /* MY_Pay */
        // Sub Menu MY_Pay_State OnClick
        menu_submenu_my_pay_state_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MyPayStateActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu MY_Pay_Once OnClick
        menu_submenu_my_pay_once_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MyPayOnceActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu MY_Pay_Payment OnClick
        menu_submenu_my_pay_payment_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MyPayPaymentActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu MY_Mem OnClick
        menu_submenu_content_my_mem_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (my_mem_isClicked == Boolean.FALSE) {
                    Fold_MY();
                    menu_submenu_content_my_mem_border.setVisibility(View.VISIBLE);
                    menu_submenu_my_mem_membership_layout.setVisibility(View.VISIBLE);
                    menu_submenu_my_mem_point_layout.setVisibility(View.VISIBLE);
                    menu_submenu_my_mem_coupon_layout.setVisibility(View.VISIBLE);
                    my_mem_isClicked = Boolean.TRUE;
                    menu_submenu_content_my_mem_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                } else {
                    Fold_MY();
                }
            }
        });

        /* MY_Mem */
        // Sub Menu MY_Mem_Membership OnClick
        menu_submenu_my_mem_membership_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MyMemMembershipActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu MY_Mem_Point OnClick
        menu_submenu_my_mem_point_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MyMemPointActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu MY_Mem_Coupon OnClick
        menu_submenu_my_mem_coupon_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MyMemCouponActivity.class);
                startActivity(intent);
            }
        });


        /* GUIDE */
        // Sub Menu GUIDE_Device OnClick
        menu_submenu_content_guide_device_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, GuideDeviceActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu GUIDE_Atomizer OnClick
        menu_submenu_content_guide_atomizer_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, GuideAtomizerActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu GUIDE_Devicemanage OnClick
        menu_submenu_content_guide_devicemanage_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, GuideDeviceManageActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu GUIDE_Atomizermanage OnClick
        menu_submenu_content_guide_atomizermanage_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, GuideAtomizerManageActivity.class);
                startActivity(intent);
            }
        });


        // Sub Menu GUIDE_Rebuildmanage OnClick
        menu_submenu_content_guide_rebuildmanage_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, GuideRebuildManageActivity.class);
                startActivity(intent);
            }
        });


        /* MEM */
        // Sub Menu MEM_Guide OnClick
        menu_submenu_content_mem_guide_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mem_guide_isClicked == Boolean.FALSE) {
                    Fold_MEM();
                    menu_submenu_content_mem_guide_border.setVisibility(View.VISIBLE);
                    menu_submenu_mem_guide_my_layout.setVisibility(View.VISIBLE);
                    menu_submenu_mem_guide_grade_layout.setVisibility(View.VISIBLE);
                    mem_guide_isClicked = Boolean.TRUE;
                    menu_submenu_content_mem_guide_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                } else {
                    Fold_MEM();
                }
            }
        });

        /* MEM_Guide */
        // Sub Menu MEM_Guide_My OnClick
        menu_submenu_mem_guide_my_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MemGuideMyActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu MEM_Guide_Grade OnClick
        menu_submenu_mem_guide_grade_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MemGuideGradeActivity.class);
                startActivity(intent);
            }
        });


        // Sub Menu MEM_Discount OnClick
        menu_submenu_content_mem_discount_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mem_discount_isClicked == Boolean.FALSE) {
                    Fold_MEM();
                    menu_submenu_content_mem_discount_border.setVisibility(View.VISIBLE);
                    menu_submenu_mem_discount_shop_layout.setVisibility(View.VISIBLE);
                    mem_discount_isClicked = Boolean.TRUE;
                    menu_submenu_content_mem_discount_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                } else {
                    Fold_MEM();
                }
            }
        });

        /* MEM_Discount */
        // Sub Menu MEM_Discount_Shop OnClick
        menu_submenu_mem_discount_shop_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MemDiscountShopActivity.class);
                startActivity(intent);
            }
        });


        // Sub Menu MEM_Event OnClick
        menu_submenu_content_mem_event_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mem_event_isClicked == Boolean.FALSE) {
                    Fold_MEM();
                    menu_submenu_content_mem_event_border.setVisibility(View.VISIBLE);
                    menu_submenu_mem_event_ongoing_layout.setVisibility(View.VISIBLE);
                    menu_submenu_mem_event_winner_layout.setVisibility(View.VISIBLE);
                    menu_submenu_mem_event_end_layout.setVisibility(View.VISIBLE);
                    mem_event_isClicked = Boolean.TRUE;
                    menu_submenu_content_mem_event_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                } else {
                    Fold_MEM();
                }
            }
        });

        /* MEM_Event */
        // Sub Menu MEM_Event_Ongoing OnClick
        menu_submenu_mem_event_ongoing_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MemEventOngoingActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu MEM_Event_Winner OnClick
        menu_submenu_mem_event_winner_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MemEventWinnerActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu MEM_Event_End OnClick
        menu_submenu_mem_event_end_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, MemEventEndActivity.class);
                startActivity(intent);
            }
        });


        /* SERVICE */
        // Sub Menu SERVICE_Support OnClick
        menu_submenu_content_service_support_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ServiceSupportActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu SERVICE_Store OnClick
        menu_submenu_content_service_store_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (service_store_isClicked == Boolean.FALSE) {
                    Fold_SERVICE();
                    menu_submenu_content_service_store_border.setVisibility(View.VISIBLE);
                    menu_submenu_service_store_find_layout.setVisibility(View.VISIBLE);
                    menu_submenu_service_store_cs_layout.setVisibility(View.VISIBLE);
                    menu_submenu_service_store_as_layout.setVisibility(View.VISIBLE);
                    service_store_isClicked = Boolean.TRUE;
                    menu_submenu_content_service_store_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                } else {
                    Fold_SERVICE();
                }
            }
        });

        /* SERVICE_Store */
        // Sub Menu SERVICE_Store_Find OnClick
        menu_submenu_service_store_find_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ServiceStoreFindActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu SERVICE_Store_Cs OnClick
        menu_submenu_service_store_cs_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ServiceStoreCsActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu SERVICE_Store_As OnClick
        menu_submenu_service_store_as_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ServiceStoreAsActivity.class);
                startActivity(intent);
            }
        });


        // Sub Menu SERVICE_Inquire OnClick
        menu_submenu_content_service_inquire_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (service_inquire_isClicked == Boolean.FALSE) {
                    Fold_SERVICE();
                    menu_submenu_content_service_inquire_border.setVisibility(View.VISIBLE);
                    menu_submenu_service_inquire_faq_layout.setVisibility(View.VISIBLE);
                    menu_submenu_service_inquire_call_layout.setVisibility(View.VISIBLE);
                    menu_submenu_service_inquire_kakaotalk_layout.setVisibility(View.VISIBLE);
                    service_inquire_isClicked = Boolean.TRUE;
                    menu_submenu_content_service_inquire_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                } else {
                    Fold_SERVICE();
                }
            }
        });

        /* SERVICE_Inquire */
        // Sub Menu SERVICE_Inquire_Faq OnClick
        menu_submenu_service_inquire_faq_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ServiceInquireFaqActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu SERVICE_Inquire_Call OnClick
        menu_submenu_service_inquire_call_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:01068941916"));
                startActivity(intent);
            }
        });

        // Sub Menu SERVICE_Inquire_Kakaotalk OnClick
        menu_submenu_service_inquire_kakaotalk_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pf.kakao.com/_hKITxj/chat"));
                startActivity(intent);
            }
        });


        // Sub Menu SERVICE_As OnClick
        menu_submenu_content_service_as_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (service_as_isClicked == Boolean.FALSE) {
                    Fold_SERVICE();
                    menu_submenu_content_service_as_border.setVisibility(View.VISIBLE);
                    menu_submenu_service_as_self_layout.setVisibility(View.VISIBLE);
                    menu_submenu_service_as_request_layout.setVisibility(View.VISIBLE);
                    service_as_isClicked = Boolean.TRUE;
                    menu_submenu_content_service_as_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                } else {
                    Fold_SERVICE();
                }
            }
        });

        /* SERVICE_As */
        // Sub Menu SERVICE_As_Self OnClick
        menu_submenu_service_as_self_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ServiceAsSelfActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu SERVICE_As_Request OnClick
        menu_submenu_service_as_request_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ServiceAsRequestActivity.class);
                startActivity(intent);
            }
        });


        // Sub Menu SERVICE_Guide OnClick
        menu_submenu_content_service_guide_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (service_guide_isClicked == Boolean.FALSE) {
                    Fold_SERVICE();
                    menu_submenu_content_service_guide_border.setVisibility(View.VISIBLE);
                    menu_submenu_service_guide_service_layout.setVisibility(View.VISIBLE);
                    menu_submenu_service_guide_shop_layout.setVisibility(View.VISIBLE);
                    menu_submenu_service_guide_damage_layout.setVisibility(View.VISIBLE);
                    service_guide_isClicked = Boolean.TRUE;
                    menu_submenu_content_service_guide_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                } else {
                    Fold_SERVICE();
                }
            }
        });

        /* SERVICE_Guide */
        // Sub Menu SERVICE_Guide_Service OnClick
        menu_submenu_service_guide_service_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ServiceGuideServiceActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu SERVICE_Guide_Shop OnClick
        menu_submenu_service_guide_shop_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ServiceGuideShopActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu SERVICE_Guide_Damage OnClick
        menu_submenu_service_guide_damage_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ServiceGuideDamageActivity.class);
                startActivity(intent);
            }
        });


        // Sub Menu SERVICE_News OnClick
        menu_submenu_content_service_news_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (service_news_isClicked == Boolean.FALSE) {
                    Fold_SERVICE();
                    menu_submenu_content_service_news_border.setVisibility(View.VISIBLE);
                    menu_submenu_service_news_notice_layout.setVisibility(View.VISIBLE);
                    service_news_isClicked = Boolean.TRUE;
                    menu_submenu_content_service_news_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                } else {
                    Fold_SERVICE();
                }
            }
        });

        /* SERVICE_News */
        // Sub Menu SERVICE_News_Notice OnClick
        menu_submenu_service_news_notice_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ServiceNewsNoticeActivity.class);
                startActivity(intent);
            }
        });


        /* SHOP */
        // Sub Menu SHOP_Home OnClick
        menu_submenu_content_shop_home_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ShopHomeActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu SHOP_Device OnClick
        menu_submenu_content_shop_device_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        // Sub Menu SHOP_Atomizer OnClick
        menu_submenu_content_shop_atomizer_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        // Sub Menu SHOP_Liquid OnClick
        menu_submenu_content_shop_liquid_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // Sub Menu SHOP_Nicofree OnClick
        menu_submenu_content_shop_nicofree_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // Sub Menu SHOP_Accessory OnClick
        menu_submenu_content_shop_accessory_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // Sub Menu SHOP_Order OnClick
        menu_submenu_content_shop_order_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ShopOrderActivity.class);
                startActivity(intent);
            }
        });

        // Sub Menu SHOP_Basket OnClick
        menu_submenu_content_shop_basket_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu_progress.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MenuActivity.this, ShopBasketActivity.class);
                startActivity(intent);
            }
        });


        /* Menu Log */
        // Menu_Log_Logout OnClick
        menu_log_logout_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "로그아웃!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Invisible_Content() {
        menu_submenu_content_my_layout.setVisibility(View.GONE);
        menu_submenu_content_guide_layout.setVisibility(View.GONE);
        menu_submenu_content_mem_layout.setVisibility(View.GONE);
        menu_submenu_content_service_layout.setVisibility(View.GONE);
        menu_submenu_content_shop_layout.setVisibility(View.GONE);
    }

    public void Fold_MY() {
        // MY_Usage
        menu_submenu_content_my_usage_border.setVisibility(View.GONE);
        menu_submenu_my_usage_infor_layout.setVisibility(View.GONE);
        menu_submenu_my_usage_name_layout.setVisibility(View.GONE);
        my_usage_isClicked = Boolean.FALSE;
        menu_submenu_content_my_usage_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);

        // MY_Pay
        menu_submenu_content_my_pay_border.setVisibility(View.GONE);
        menu_submenu_my_pay_state_layout.setVisibility(View.GONE);
        menu_submenu_my_pay_once_layout.setVisibility(View.GONE);
        menu_submenu_my_pay_payment_layout.setVisibility(View.GONE);
        my_pay_isClicked = Boolean.FALSE;
        menu_submenu_content_my_pay_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);

        // MY_Mem
        menu_submenu_content_my_mem_border.setVisibility(View.GONE);
        menu_submenu_my_mem_membership_layout.setVisibility(View.GONE);
        menu_submenu_my_mem_point_layout.setVisibility(View.GONE);
        menu_submenu_my_mem_coupon_layout.setVisibility(View.GONE);
        my_mem_isClicked = Boolean.FALSE;
        menu_submenu_content_my_mem_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);
    }

    public void Fold_MEM() {
        // MEM_Guide
        menu_submenu_content_mem_guide_border.setVisibility(View.GONE);
        menu_submenu_mem_guide_my_layout.setVisibility(View.GONE);
        menu_submenu_mem_guide_grade_layout.setVisibility(View.GONE);
        mem_guide_isClicked = Boolean.FALSE;
        menu_submenu_content_mem_guide_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);

        // MEM_Discount
        menu_submenu_content_mem_discount_border.setVisibility(View.GONE);
        menu_submenu_mem_discount_shop_layout.setVisibility(View.GONE);
        mem_discount_isClicked = Boolean.FALSE;
        menu_submenu_content_mem_discount_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);

        // MEM_Event
        menu_submenu_content_mem_event_border.setVisibility(View.GONE);
        menu_submenu_mem_event_ongoing_layout.setVisibility(View.GONE);
        menu_submenu_mem_event_winner_layout.setVisibility(View.GONE);
        menu_submenu_mem_event_end_layout.setVisibility(View.GONE);
        mem_event_isClicked = Boolean.FALSE;
        menu_submenu_content_mem_event_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);
    }

    public void Fold_SERVICE() {
        // SERVICE_Store
        menu_submenu_content_service_store_border.setVisibility(View.GONE);
        menu_submenu_service_store_find_layout.setVisibility(View.GONE);
        menu_submenu_service_store_cs_layout.setVisibility(View.GONE);
        menu_submenu_service_store_as_layout.setVisibility(View.GONE);
        service_store_isClicked = Boolean.FALSE;
        menu_submenu_content_service_store_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);

        // SERVICE_Inquire
        menu_submenu_content_service_inquire_border.setVisibility(View.GONE);
        menu_submenu_service_inquire_faq_layout.setVisibility(View.GONE);
        menu_submenu_service_inquire_call_layout.setVisibility(View.GONE);
        menu_submenu_service_inquire_kakaotalk_layout.setVisibility(View.GONE);
        service_inquire_isClicked = Boolean.FALSE;
        menu_submenu_content_service_inquire_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);

        // SERVICE_As
        menu_submenu_content_service_as_border.setVisibility(View.GONE);
        menu_submenu_service_as_self_layout.setVisibility(View.GONE);
        menu_submenu_service_as_request_layout.setVisibility(View.GONE);
        service_as_isClicked = Boolean.FALSE;
        menu_submenu_content_service_as_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);

        // SERVICE_Guide
        menu_submenu_content_service_guide_border.setVisibility(View.GONE);
        menu_submenu_service_guide_service_layout.setVisibility(View.GONE);
        menu_submenu_service_guide_shop_layout.setVisibility(View.GONE);
        menu_submenu_service_guide_damage_layout.setVisibility(View.GONE);
        service_guide_isClicked = Boolean.FALSE;
        menu_submenu_content_service_guide_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);

        // SERVICE_News
        menu_submenu_content_service_news_border.setVisibility(View.GONE);
        menu_submenu_service_news_notice_layout.setVisibility(View.GONE);
        service_news_isClicked = Boolean.FALSE;
        menu_submenu_content_service_news_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);
    }

    @Override
    protected void onResume() {
        super.onResume();
        menu_progress.setVisibility(View.GONE);
        Fold_MY();
        Fold_MEM();
        Fold_SERVICE();
    }
}
