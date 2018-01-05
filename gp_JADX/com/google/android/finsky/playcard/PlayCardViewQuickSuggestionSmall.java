package com.google.android.finsky.playcard;

import android.content.Context;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.finsky.bg.C1621v;
import com.google.android.play.layout.PlayCardViewSmall;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlayCardViewQuickSuggestionSmall extends PlayCardViewSmall implements AnimationListener, C3899y {
    public final int F_;
    public boolean f19514a;
    public View f19515b;

    public PlayCardViewQuickSuggestionSmall(Context context) {
        this(context, null);
    }

    public PlayCardViewQuickSuggestionSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19514a = true;
        this.F_ = context.getResources().getDimensionPixelSize(C7582R.dimen.play_card_inset);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19515b = findViewById(C7582R.id.pending_overlay);
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        this.f19515b.setVisibility(this.f19514a ? 0 : 8);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19515b.setVisibility(0);
        this.f19514a = true;
    }

    protected void onDetachedFromWindow() {
        this.f19515b.setVisibility(8);
        this.f19514a = false;
        super.onDetachedFromWindow();
    }

    public final void mo3859a(boolean z) {
        this.al.setVisibility(8);
        if (!this.f19514a) {
            this.f19514a = true;
            if (z) {
                Animation a = C1621v.m9304a(getContext(), 300, (AnimationListener) this);
                this.f19515b.setVisibility(0);
                this.f19515b.startAnimation(a);
                return;
            }
            this.f19515b.setVisibility(0);
        }
    }

    public final void mo3860b(boolean z) {
        if (this.f19514a) {
            this.f19514a = false;
            if (z) {
                this.f19515b.startAnimation(C1621v.m9307b(getContext(), 300, this));
                return;
            }
            this.f19515b.setVisibility(8);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f19515b.getVisibility() != 8) {
            this.f19515b.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth() - (this.F_ * 2), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(getMeasuredHeight() - (this.F_ * 2), MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f19515b.getVisibility() != 8) {
            boolean z2 = ai.f1848a.mo400k(this) == 0;
            int width = getWidth();
            int measuredWidth = this.f19515b.getMeasuredWidth();
            int a = k.a(width, measuredWidth, z2, this.F_);
            width = this.U.getTop();
            this.f19515b.layout(a, width, measuredWidth + a, this.f19515b.getMeasuredHeight() + width);
        }
    }
}
