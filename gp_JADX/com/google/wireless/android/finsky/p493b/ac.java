package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ac extends b {
    public int f36691a;
    public boolean f36692b;

    public ac() {
        this.f36691a = 0;
        this.f36692b = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34809a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36691a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f36692b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34810b() {
        int b = super.b();
        if ((this.f36691a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(1) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34808a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36692b = c7213a.m33563e();
                    this.f36691a |= 1;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
