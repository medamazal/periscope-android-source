// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;


// Referenced classes of package com.google.android.exoplayer.upstream:
//            DataSpec

public interface DataSource
{

    public abstract void close();

    public abstract long open(DataSpec dataspec);

    public abstract int read(byte abyte0[], int i, int j);
}