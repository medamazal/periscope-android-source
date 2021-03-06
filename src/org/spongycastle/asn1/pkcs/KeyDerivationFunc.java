// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.spongycastle.asn1.pkcs:
//            PBKDF2Params

public class KeyDerivationFunc extends ASN1Object
{

    public AlgorithmIdentifier aaK;

    public KeyDerivationFunc(ASN1ObjectIdentifier asn1objectidentifier, PBKDF2Params pbkdf2params)
    {
        aaK = new AlgorithmIdentifier(asn1objectidentifier, pbkdf2params);
    }

    private KeyDerivationFunc(ASN1Sequence asn1sequence)
    {
        aaK = AlgorithmIdentifier._mth01C3(asn1sequence);
    }

    public static KeyDerivationFunc _mth02CB(ASN1Sequence asn1sequence)
    {
        if (asn1sequence != null)
        {
            return new KeyDerivationFunc(ASN1Sequence._mth141F(asn1sequence));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive _mth0427()
    {
        return aaK._mth0427();
    }
}
