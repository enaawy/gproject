package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class by implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte b = (byte) 0;
        int a = C5129a.m23814a(parcel);
        String str = null;
        byte b2 = (byte) 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    b2 = C5129a.m23823d(parcel, readInt);
                    break;
                case 3:
                    b = C5129a.m23823d(parcel, readInt);
                    break;
                case 4:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzl(b2, b, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
