// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.graphics.Bitmap;

// Referenced classes of package o:
//            ph, pq

final class po
    implements Runnable
{

    private ph NX;
    private Bitmap Oa;

    po(ph ph1, Bitmap bitmap)
    {
        NX = ph1;
        Oa = bitmap;
        super();
    }

    public final void run()
    {
        ph._mth02CB(NX).clear();
        Oa.recycle();
    }
}
