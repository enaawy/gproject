package com.google.android.finsky.activities.myapps;

import android.content.Context;
import com.google.android.finsky.headerlistlayout.C1047f;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.squareup.leakcanary.C7582R;

final class C1121u extends C1047f {
    C1121u(Context context) {
        super(context);
    }

    protected final int mo1305a() {
        return C7582R.layout.header_list_pager;
    }

    protected final int mo1440t() {
        return FinskyHeaderListLayout.m16068a(this.f, 0, 0);
    }

    protected final boolean mo1398f() {
        return true;
    }

    protected final int m6853g() {
        return C7582R.id.viewpager;
    }

    protected final int mo1441u() {
        return 0;
    }

    protected final int m6854h() {
        return 1;
    }

    protected final int mo1399i() {
        return 1;
    }

    protected final int m6851b() {
        return C7582R.id.my_apps_recycler_view;
    }
}
