package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.billing.myaccount.layout.j implements View$OnClickListener
{

    public final com.google.android.finsky.d.w a;
    public final Document b;
    public final com.google.android.finsky.billing.myaccount.layout.q c;
    public final SubscriptionRowView d;

    j(SubscriptionRowView p0, com.google.android.finsky.d.w p1, Document p2, com.google.android.finsky.billing.myaccount.layout.q p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void onClick(View p0) {
        this.a.b(new com.google.android.finsky.d.d(this.d).a(2646).a(this.b.a.D));
        this.c.a(this.d.q.cZ(), this.b.d());
    }

}
